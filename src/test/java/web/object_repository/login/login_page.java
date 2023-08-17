package web.object_repository.login;

import io.unity.framework.generators.methodsgenerator.methods.MethodsData;
import io.unity.performaction.autoweb.Element;
import io.unity.performaction.autoweb.Verify;
import io.unity.performaction.autoweb.Wait;
import org.openqa.selenium.By;
import org.openqa.selenium.StaleElementReferenceException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class login_page {

    WebDriver driver=null;
    Element element=null;
    Verify verify = null;
    Wait wait = null;

    public login_page(WebDriver driver) {
        this.driver = driver;
        element = new Element(driver);
        verify = new Verify(driver);
        wait = new Wait(driver);
    }

    @MethodsData(method_id = "button_1")
    public void verify_login_with_email_link_is_present_on_page() {
        verify.element_is_present("login_with_email_link");
        element.click("login_with_email_link");
    }
    @MethodsData(method_id = "button_1")
    public void verify_email_text_box_is_present_on_page() {
        verify.element_is_present("email_text_box");
    }

    @MethodsData(method_id = "button_1")
    public void verify_password_text_box_is_present_on_page() {
        verify.element_is_present("password_text_box");
    }

    @MethodsData(method_id = "button_1")
    public void verify_sign_in_button_is_present_on_page() {
        verify.element_is_present("sign_in_button");
    }

    public void performLogin(String userName, String password) {
        wait.wait_for_second(1);
        driver.manage().window().maximize();
        verify_email_text_box_is_present_on_page();
        enter_text_at_email_text_box(userName);
        enter_text_at_password(password);
        click_on_sign_in_button();
    }

    @MethodsData(method_id = "button_1")
    public void enter_text_at_email_text_box(String text_to_enter) {
        verify.element_is_present("email_text_box");
        element.click("email_text_box");
        element.enter_text("email_text_box",text_to_enter);
    }

    @MethodsData(method_id = "button_1")
    public void enter_text_at_password(String text_to_enter) {
        verify.element_is_present("password_text_box");
        element.click("password_text_box");
        element.enter_text("password_text_box",text_to_enter);
    }

    @MethodsData(method_id = "button_1")
    public void click_on_sign_in_button() {
        element.click("sign_in_button");
    }

    @MethodsData(method_id = "button_1")
    public void verify_submit_button_is_present_on_page() {
        verify.element_is_present("submit_button");
    }

    @MethodsData(method_id = "button_1")
    public void verify_invalid_user_cred_pop_up() {
        wait.wait_until_element_is_visible("invalid_user_cred_pop_up");
    }

    @MethodsData(method_id = "button_1")
    public void enter_static_otp(String text_to_enter) {
//        element.enter_text("otp_text_box",text_to_enter);
        element.enter_text("otp_first",text_to_enter);
        element.enter_text("otp_second",text_to_enter);
        element.enter_text("otp_third",text_to_enter);
        element.enter_text("otp_fourth",text_to_enter);
        element.enter_text("otp_fifth",text_to_enter);
        element.enter_text("otp_sixth",text_to_enter);
    }

    @MethodsData(method_id = "button_1")
    public void click_on_submit_button() {
        wait.wait_for_second(5);
        element.click("submit_button");
        wait.wait_for_second(5);
    }
    @MethodsData(method_id = "button_1")
    public void verify_welcome_text_is_present_on_page() {
        wait.wait_until_element_is_visible("welcome_text");
        verify.element_is_present("welcome_text");
        wait.wait_for_second(5);
    }

    @MethodsData(method_id = "button_1")
    public void verify_forget_password_link_is_present_on_page() {
        wait.wait_until_element_is_visible("forgot_pass_link");
        verify.element_is_present("forgot_pass_link");
    }

    @MethodsData(method_id = "button_1")
    public void click_on_forget_password_link() {
        element.click("forgot_pass_link");
    }
    @MethodsData(method_id = "button_1")
    public void verify_user_is_on_forgot_password_page() {
        verify.element_is_present("forget_pass_page_text");
    }
    @MethodsData(method_id = "button_1")
    public void click_on_via_email_button() {
        element.click("via_email_button");
    }
    @MethodsData(method_id = "button_1")
    public void click_on_email_text_box_of_forget_password_page(String text_to_enter) {
        wait.wait_until_element_is_visible("email_text_box_forgot_password");
        element.click("email_text_box_forgot_password");
        element.enter_text("email_text_box_forgot_password",text_to_enter);
    }
    @MethodsData(method_id = "button_1")
    public void click_on_send_otp_button() {
        element.click("send_otp_button");
    }
    @MethodsData(method_id = "button_1")
    public void verify_user_is_on_reset_password_page() {
        verify.element_is_present("reset_password_page");
    }

}
