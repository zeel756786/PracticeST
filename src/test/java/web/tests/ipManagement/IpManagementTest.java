package web.tests.ipManagement;

import io.unity.framework.data.TestData;
import io.unity.framework.init.base;
import io.unity.framework.readers.DataReader;
import io.unity.framework.readers.json_file_reader;
import io.unity.performaction.autoweb.Window;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;
import web.object_repository.RandomPan;
import web.object_repository.ip_management.ip_management;
import web.object_repository.login.login_page;

public class IpManagementTest extends base {

    login_page login = null;

    ip_management ipManagement = null;
    Window window = null;

    @DataProvider(name = "login_credentials")
    public Object[][] data_provider() {
        json_file_reader config = new json_file_reader();
        DataReader reader = new DataReader();
        Object[][] data = null;
        if (config.getEnvFromCurrentConfig().contains("uat") || config.getEnvFromCurrentConfig().contains("uim")) {
            data = reader.getExcelDataForDataProvider("Samhita_onboarding.xlsx", 0);
        }
        return data;
    }

    @Test(dataProvider = "login_credentials")
    public void verify_when_click_on_ip_management_button(String userName, String password) {

        login_page login = new login_page(driver);

        ip_management ipManagement = new ip_management(driver);

        window = new Window(driver);

        login.verify_login_with_email_link_is_present_on_page();
        login.performLogin(userName, password);
        login.enter_static_otp("123456");
        login.click_on_submit_button();
        ipManagement.click_on_ip_management_tab();
        ipManagement.click_on_list_of_ip();
        ipManagement.click_on_add_ip_button();
        ipManagement.verify_add_implementation_partner_pop_up();
        ipManagement.click_on_company_name_text_box(TestData.random_alphabetic_string(6));
        ipManagement.click_on_registered_office_state_drop_down();
        ipManagement.click_on_year_of_registration();
        ipManagement.click_on_address_line_1("Akshya Nagar 1st Block 1st Cross");
        ipManagement.click_on_address_line_2("Rammurthy nagar");
        ipManagement.select_state_form_drop_down();
        ipManagement.select_disctrict_from_drop_down();
        ipManagement.enter_city_name("Ahmedabad");
        ipManagement.enter_pincode("380005");
        ipManagement.click_company_Pan();
        String pan = RandomPan.generateRandomPAN();
        ipManagement.enter_pan(pan);
        ipManagement.click_on_primary_area_focus();
        ipManagement.verify_add_implementation_partner_pop_up();
      //  ipManagement.click_on_cross_icon_of_pop_up();
        ipManagement.click_on_primary_participants();
        ipManagement.click_on_continue_button();
//      //ipManagement.click_on_continue_button();
//        ipManagement.click_on_First_name_text_box_of_cop_details("Zeel");
//        ipManagement.click_on_Last_name_text_box_of_cop_details("Patel");
//        ipManagement.click_on_mobile_no_of_cop_details(TestData.random_numeric_string(10));
//        ipManagement.click_on_Date_Of_Birth_of_cop_details();
//        ipManagement.click_on_Gender_of_cop_details();
//        ipManagement.click_on_Marital_status_of_cop_details();
//        ipManagement.click_on_Email_id_text_box_of_cop_details();
//        ipManagement.click_on_designation_text_box_of_cop_details();
    }
}