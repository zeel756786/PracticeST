package web.object_repository.login;

import io.unity.autoweb.*;
import io.unity.framework.readers.locator_reader;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class login_test_steps {

    WebDriver driver = null;
    Element element = null;
    Verify verify = null;
    Browser browser = null;
    Window window = null;
    locator_reader reader = new locator_reader();
    Wait wait = null;

    public login_test_steps(WebDriver driver) {
        this.driver = driver;
        element = new Element(driver);
        window = new Window(driver);
        verify = new Verify(driver);
        wait = new Wait(driver);
    }



    public void verify_homepage_title_is_displayed() {
        wait.wait_for_second(5);
        verify.element_is_present("homepage_title");

    }
    public void verify_error_message_is_displayed() {
        wait.wait_for_second(2);
        verify.element_is_present("invalid_error_message");

    }

    public void verify_homepage_title_text_is_equal_to(String button_text) {
        wait.wait_for_second(5);
        verify.element_text_is_equal_to("homepage_title", button_text);
    }

    public void enter_text_at_password(String text_to_enter) {
        wait.wait_for_second(2);
        element.enter_text("password", text_to_enter);
    }

    public void clear_text_from_password() {
        element.clear_text_field("password");
    }

    public void verify_password_is_present_on_page() {
        verify.element_is_present("password");
    }

    public void clear_text_and_enter_text_in_password(String text_to_enter) {
        element.clear_and_enter_in_text_field("password", text_to_enter);
    }

    public void verify_sign_in_button_is_present_on_page() {
        verify.element_is_present("sign_in_button");
    }

    public void click_on_sign_in_button() {
        element.click("sign_in_button");
    }

    public void verify_sign_in_button_is_clickable() {
        verify.element_is_enable("sign_in_button");
    }

    public void click_on_sign_in_button(String button_text) {
        verify.element_text_is_equal_to("sign_in_button", button_text);
    }

    public void enter_text_at_email(String text_to_enter) {
        wait.wait_for_second(5);
        element.enter_text("email", text_to_enter);
    }

    public void clear_text_from_email() {
        element.clear_text_field("email");
    }

    public void verify_email_is_present_on_page() {
        verify.element_is_present("email");
    }

    public void clear_text_and_enter_text_in_email(String text_to_enter) {
        element.clear_and_enter_in_text_field("email", text_to_enter);
    }


    public void click_on_tour_welcome_screen_close_button() {
        String closeButton = "//button[@class='uf-close-button']";
        wait.wait_for_second(5);
        try {
            if (driver.findElement(By.xpath(closeButton)).isDisplayed()) {
                driver.findElement(By.xpath(closeButton)).click();

            } else {
                System.out.println("Tour popup not displayed");
            }
        }
        catch (Exception e) {
            System.out.println("Tour popup not displayed.");
        }
    }
    public void verify_login_with_google_is_present_on_page() {
        wait.wait_for_second(3);
        verify.element_is_present("login_with_google");
    }
    public void click_on_user_name() {
        wait.wait_for_second(3);
        element.click("user_name");
    }
    public void click_on_sign_out_button() {
        wait.wait_for_second(2);
        element.click("sign_out_button");
    }
    public void click_on_yes_button() {
        element.click("sign_out_yes_button");
    }


    //----------------------------------------------------------------------------------------------------------

    public void login_on_app()
    {
        window.maximize_window();
        enter_text_at_email("info@qable.io");
        enter_text_at_password("QAble@2020");
        click_on_sign_in_button();
        click_on_tour_welcome_screen_close_button();

    }

    public void logout()
    {
        click_on_user_name();
        click_on_sign_out_button();
        click_on_yes_button();
        verify_login_with_google_is_present_on_page();

    }


}