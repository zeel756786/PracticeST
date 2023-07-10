package web.tests.participants;

import io.unity.framework.data.TestData;
import io.unity.framework.init.base;
import io.unity.framework.readers.DataReader;
import io.unity.framework.readers.json_file_reader;
import kotlin.random.URandomKt;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;
import web.object_repository.login.login_page;
import web.object_repository.participants.participants;
import web.object_repository.projectBuilder.project_builder;

import java.awt.*;

public class participantsTests extends base {

    login_page login = null;
    project_builder project_builder = null;
    participants participants = null;

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
    public void verify_participant_bulk_on_boarding_scenario(String userName, String password) throws AWTException {

        login_page login = new login_page(driver);
        project_builder = new project_builder(driver);
        participants = new participants(driver);

        login.verify_login_with_email_link_is_present_on_page();
        login.performLogin(userName, password);
        login.click_on_submit_button();
        participants.verify_participants_module_is_present_on_page();
        participants.click_on_onboard_participant();
        participants.click_on_bulk_onboard_participant();
        participants.click_on_browse_button();
        participants.FileUpload();
        participants.verify_status_should_display_as_true();
    }

    @Test(dataProvider = "login_credentials")
    public void verify_participant_single_on_boarding_scenario(String userName, String password) {

        login_page login = new login_page(driver);
        project_builder = new project_builder(driver);
        participants = new participants(driver);

        login.verify_login_with_email_link_is_present_on_page();
        login.performLogin(userName, password);
        login.click_on_submit_button();
        participants.verify_participants_module_is_present_on_page();
        participants.click_on_onboard_participant();
        participants.click_on_board_paricipant_button();
        participants.click_on_first_name_text_box("AutoCreated");
        participants.click_on_last_name_text_box("User");
        participants.click_on_ip_id_text_box(TestData.random_alpha_numeric_string(5));
        participants.click_on_onboarding_date("19/05/2024");
        participants.click_on_continue_button();
        participants.click_on_submit_button();
        participants.click_on_confirm_button();
        participants.click_on_OTP_consent_button();
        participants.enter_otp_value("1");
        participants.click_on_authenticate();
        participants.click_on_cancel_button();
    }
}