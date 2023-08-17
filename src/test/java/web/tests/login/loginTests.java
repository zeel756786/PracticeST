package web.tests.login;

import io.unity.framework.init.base;
import io.unity.framework.readers.DataReader;
import io.unity.framework.readers.json_file_reader;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;
import web.object_repository.login.login_page;

import static org.bouncycastle.cms.RecipientId.password;

public class loginTests extends base {
    login_page login = null;

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
    public void Verify_login_with_valid_credentials(String userName, String password) {
        login_page login = new login_page(driver);

        login.verify_login_with_email_link_is_present_on_page();
        login.verify_email_text_box_is_present_on_page();
        login.verify_password_text_box_is_present_on_page();
        login.verify_sign_in_button_is_present_on_page();
        login.performLogin(userName, password);
        login.verify_submit_button_is_present_on_page();
        login.enter_static_otp("123456");
        login.click_on_submit_button();
        login.verify_welcome_text_is_present_on_page();
    }

    @DataProvider(name = "invalid_login_credentials")
    public Object[][] data_provider_login() {
        json_file_reader config = new json_file_reader();
        DataReader reader = new DataReader();
        Object[][] data = null;
        if (config.getEnvFromCurrentConfig().contains("uat") || config.getEnvFromCurrentConfig().contains("uim")) {
            data = reader.getExcelDataForDataProvider("Samhita_onboarding.xlsx", 1);
        }
        return data;
    }

    @Test(dataProvider = "invalid_login_credentials")
    public void Verify_login_with_invalid_credentials(String userName, String password) {
        login_page login = new login_page(driver);

        login.verify_login_with_email_link_is_present_on_page();
        login.verify_email_text_box_is_present_on_page();
        login.verify_password_text_box_is_present_on_page();
        login.verify_sign_in_button_is_present_on_page();
        login.performLogin(userName, password);
        login.verify_invalid_user_cred_pop_up();
    }


    @Test(dataProvider = "login_credentials")
    public void Verify_when_click_on_forget_password_link(String userName, String password) {
        login_page login = new login_page(driver);

        login.verify_forget_password_link_is_present_on_page();
        login.click_on_forget_password_link();
        login.verify_user_is_on_forgot_password_page();
        login.click_on_via_email_button();
        login.click_on_email_text_box_of_forget_password_page("zeelautomation@yopmail.com");
        login.click_on_send_otp_button();
        login.verify_submit_button_is_present_on_page();
        login.click_on_submit_button();
        login.verify_user_is_on_reset_password_page();
    }
}
