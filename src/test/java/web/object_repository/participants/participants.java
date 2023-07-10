package web.object_repository.participants;

import io.unity.framework.data.TestData;
import io.unity.framework.generators.methodsgenerator.methods.MethodsData;
import io.unity.performaction.autoweb.Element;
import io.unity.performaction.autoweb.Verify;
import io.unity.performaction.autoweb.Wait;
import org.openqa.selenium.WebDriver;

import java.awt.*;
import java.awt.datatransfer.StringSelection;
import java.awt.event.KeyEvent;

public class participants {

    WebDriver driver=null;
    Element element=null;
    Verify verify = null;
    Wait wait = null;

    public participants(WebDriver driver) {
        this.driver = driver;
        element = new Element(driver);
        verify = new Verify(driver);
        wait = new Wait(driver);
    }
    @MethodsData(method_id = "button_1")
    public void verify_participants_module_is_present_on_page() {
        wait.wait_until_element_is_visible("participant_module");
        verify.element_is_present("participant_module");
        element.click("participant_module");
    }
    @MethodsData(method_id = "button_1")
    public void click_on_onboard_participant() {
        verify.element_is_present("onboard_participant_module");
        element.click("onboard_participant_module");
    }

    @MethodsData(method_id = "button_1")
    public void click_on_bulk_onboard_participant() {
        verify.element_is_present("bulk_onboard_participant");
        element.click("bulk_onboard_participant");
        wait.wait_for_second(2);
    }
    @MethodsData(method_id = "button_1")
    public void click_on_browse_button() {
        verify.element_is_present("browse_button");
        element.click("browse_button");
        wait.wait_for_second(2);
    }

    public void FileUpload() throws AWTException {
        String filePath = "C:\\Users\\Unity_0075\\PracticeLogin\\SamhitaFiles\\new_UAT_data.xlsx";
        StringSelection stringSelection = new StringSelection(filePath);
        Toolkit.getDefaultToolkit().getSystemClipboard().setContents(stringSelection, null);
        Robot robot = new Robot();
        robot.keyPress(KeyEvent.VK_CONTROL);
        robot.keyPress(KeyEvent.VK_V);
        robot.keyRelease(KeyEvent.VK_V);
        robot.keyRelease(KeyEvent.VK_CONTROL);
        robot.keyPress(KeyEvent.VK_ENTER);
        robot.keyRelease(KeyEvent.VK_ENTER);
        wait.wait_for_second(20);
    }
    @MethodsData(method_id = "button_1")
    public void verify_status_should_display_as_true() {
        wait.wait_until_element_is_visible("true_status");
        verify.element_is_present("true_status");
    }
    @MethodsData(method_id = "button_1")
    public void click_on_board_paricipant_button() {
        verify.element_is_present("single_on_board_participant");
        element.click("single_on_board_participant");
        wait.wait_for_second(2);
    }
    @MethodsData(method_id = "button_1")
    public void click_on_first_name_text_box(String text_to_enter) {
        verify.element_is_present("first_name_check_box");
        element.enter_text("first_name_check_box",text_to_enter);
        wait.wait_for_second(2);
    }
    @MethodsData(method_id = "button_1")
    public void click_on_last_name_text_box(String text_to_enter) {
        verify.element_is_present("last_name_check_box");
        element.click("last_name_check_box");
        element.enter_text("last_name_check_box",text_to_enter);
        wait.wait_for_second(2);
    }
    @MethodsData(method_id = "button_1")
    public void click_on_ip_id_text_box(String text_to_enter) {
        verify.element_is_present("ip_id_text_box");
        element.click("ip_id_text_box");
        element.enter_text("ip_id_text_box",text_to_enter);
        wait.wait_for_second(2);
    }

    @MethodsData(method_id = "button_1")
    public void click_on_onboarding_date(String text_to_enter) {
        verify.element_is_present("onboarding_text_box");
        element.click("onboarding_text_box");
        element.enter_text("onboarding_text_box",text_to_enter);
        wait.wait_for_second(2);
    }

    @MethodsData(method_id = "button_1")
    public void click_on_continue_button() {
        verify.element_is_present("continue_button");
        element.click("continue_button");
    }

    @MethodsData(method_id = "button_1")
    public void click_on_submit_button() {
        wait.wait_until_element_is_visible("submit_button_on_second_page");
        element.click("submit_button_on_second_page");
    }

    @MethodsData(method_id = "button_1")
    public void click_on_confirm_button() {
        wait.wait_until_element_is_visible("confirm_button");
        element.click("confirm_button");
    }

    @MethodsData(method_id = "button_1")
    public void click_on_OTP_consent_button() {
        wait.wait_until_element_is_visible("otp_consent_button");
        element.click("otp_consent_button");
    }

    @MethodsData(method_id = "button_1")
    public void enter_otp_value(String text_to_enter) {
        element.enter_text("otp_first",text_to_enter);
        element.enter_text("otp_second",text_to_enter);
        element.enter_text("otp_third",text_to_enter);
        element.enter_text("otp_fourth",text_to_enter);
        element.enter_text("otp_fifth",text_to_enter);
        element.enter_text("otp_sixth",text_to_enter);
    }

    @MethodsData(method_id = "button_1")
    public void click_on_authenticate() {
        wait.wait_until_element_is_visible("authenticate_button");
        element.click("authenticate_button");
    }

    @MethodsData(method_id = "button_1")
    public void click_on_cancel_button() {
        wait.wait_until_element_is_visible("cancel_button");
        element.click("cancel_button");
    }

    }



