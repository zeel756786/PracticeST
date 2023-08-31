package web.tests.funderManagement;

import io.unity.framework.data.TestData;
import io.unity.framework.init.base;
import io.unity.framework.readers.DataReader;
import io.unity.framework.readers.json_file_reader;
import io.unity.performaction.autoweb.Window;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;
import web.object_repository.RandomPan;
import web.object_repository.funder_management.funder_management;
import web.object_repository.login.login_page;

public class funderManagementTest extends base {

    login_page login = null;

    funder_management funderManagement = null;
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
    public void verify_when_click_on_funder_management_button(String userName, String password) {

        login_page login = new login_page(driver);

        funder_management funderManagement = new funder_management(driver);

        window = new Window(driver);

        login.verify_login_with_email_link_is_present_on_page();
        login.performLogin(userName, password);
        login.enter_static_otp("123456");
        login.click_on_submit_button();
        funderManagement.click_on_funder_management_tab();
        funderManagement.click_on_list_of_funders();
        funderManagement.click_on_add_funder_button();
        funderManagement.verify_add_funder_pop_up();
        funderManagement.click_on_company_name_text_box(TestData.random_alphabetic_string(6));
        funderManagement.click_on_registered_office_state_drop_down();
        funderManagement.click_on_org_description_and_enter_description("Manufacturer of Ear Clamps, Low Profile Clamps, Multi Crimp Rings & V Profile Clamps");
        funderManagement.click_on_year_of_registration();
        funderManagement.click_on_sector_and_select_sector();
        funderManagement.click_on_state_in_which_csr_projects_conducted();
        funderManagement.click_on_primary_area_of_focus();
        funderManagement.click_on_primary_participants();
        funderManagement.click_on_address_line_1("Akshya Nagar 1st Block 1st Cross");
        funderManagement.click_on_address_line_2("Rammurthy nagar");
        funderManagement.select_state_form_drop_down();
        funderManagement.select_disctrict_from_drop_down();
        funderManagement.enter_city_name();
        funderManagement.enter_pincode("380005");
        funderManagement.click_company_Pan();
        String pan = RandomPan.generateRandomPAN();
        funderManagement.enter_pan(pan);
        funderManagement.click_on_continue_button();
        funderManagement.verify_funder_details_successfully_added_pop_up();
        funderManagement.click_on_First_name_text_box_of_cop_details("Zeel");
        funderManagement.click_on_Last_name_text_box_of_cop_details("Patel");
        funderManagement.click_on_mobile_no_of_cop_details(TestData.random_numeric_string(10));
        funderManagement.click_on_Date_Of_Birth_of_cop_details();
        funderManagement.click_on_Gender_of_cop_details();
        funderManagement.click_on_Marital_status_of_cop_details();
        funderManagement.click_on_Email_id_text_box_of_cop_details();
        funderManagement.click_on_designation_text_box_of_cop_details("QA");
        funderManagement.click_on_address_line_1_of_cpd("Akshya Nagar 1st Block 1st Cross");
        funderManagement.click_on_address_line_2_of_cpd("Rammurthy nagar");
        funderManagement.select_state_form_drop_down_of_cpd();
        funderManagement.select_disctrict_from_drop_down_of_cpd();
        funderManagement.enter_city_name_of_cpd();
        funderManagement.enter_pincode_of_cpd("380005");
        funderManagement.click_on_continue_button_of_cpd();
       // funderManagement.verify_user_created_pop_up();
    }

    @Test(dataProvider = "login_credentials")
    public void verify_when_click_on_delete_button_from_action_meat_ball_menu_of_funder_should_get_deleted(String userName, String password) {

        login_page login = new login_page(driver);

        funder_management funderManagement = new funder_management(driver);

        window = new Window(driver);

        login.verify_login_with_email_link_is_present_on_page();
        login.performLogin(userName, password);
        login.enter_static_otp("123456");
        login.click_on_submit_button();
        funderManagement.click_on_funder_management_tab();
        funderManagement.click_on_list_of_funders();
        funderManagement.click_on_action_meatball_menu();
        funderManagement.verify_edit_option_is_available();
        funderManagement.verify_delete_option_is_available();
        funderManagement.click_on_delete();
        funderManagement.verify_delete_pop_up_should_get_open();
        funderManagement.click_on_delete_button_of_the_pop_up();
        funderManagement.verify_funder_deleted_successfully_toast_msg();
    }

    @Test(dataProvider = "login_credentials")
    public void verify_when_click_on_edit_button_from_action_meatball_menu_funder_details_should_get_edited(String userName, String password) {

        login_page login = new login_page(driver);

        funder_management funderManagement = new funder_management(driver);

        window = new Window(driver);

        login.verify_login_with_email_link_is_present_on_page();
        login.performLogin(userName, password);
        login.enter_static_otp("123456");
        login.click_on_submit_button();
        funderManagement.click_on_funder_management_tab();
        funderManagement.click_on_list_of_funders();
        funderManagement.click_on_action_meatball_menu();
        funderManagement.verify_edit_option_is_available();
        funderManagement.verify_delete_option_is_available();
        funderManagement.click_on_edit();
        funderManagement.verify_edit_funder_pop_up_should_open();
      //  funderManagement.edit_company_details();
        funderManagement.click_on_continue_button();
        funderManagement.verify_company_details_edited_toast_msg();
      //  funderManagement.edit_cpd_of_funder();
        funderManagement.click_on_continue_button_of_cpd();
        funderManagement.verify_funder_edited_successfully_toast_msg();
    }
}