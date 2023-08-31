package web.object_repository.projectBuilder;

import io.unity.framework.generators.methodsgenerator.methods.MethodsData;
import io.unity.performaction.autoweb.Element;
import io.unity.performaction.autoweb.Verify;
import io.unity.performaction.autoweb.Wait;
import org.openqa.selenium.*;
import org.openqa.selenium.interactions.Actions;

import javax.swing.*;

public class project_builder {

    WebDriver driver=null;
    Element element=null;
    Verify verify = null;
    Wait wait = null;

    public project_builder(WebDriver driver) {
        this.driver = driver;
        element = new Element(driver);
        verify = new Verify(driver);
        wait = new Wait(driver);
    }
    @MethodsData(method_id = "button_1")
    public void verify_project_builder_module_is_present_on_page() {
        wait.wait_until_element_is_visible("project_builder");
        verify.element_is_present("project_builder");
        element.click("project_builder");
    }

    @MethodsData(method_id = "button_1")
    public void click_on_create_new_project_button() {
        wait.wait_for_second(8);
        element.click("create_new_project");
    }

    @MethodsData(method_id = "button_1")
    public void verify_user_is_on_project_list_page() {
       verify.element_is_present("program_list");
    }

    @MethodsData(method_id = "button_1")
    public void verify_program_list_fetched_success_fully_toast_msg() {
        verify.element_is_present("project_list_fetched_success_fully");
    }

    @MethodsData(method_id = "button_1")
    public void click_on_create_project_button() {
      //  wait.wait_until_element_is_disappear("project_list_fetched_success_fully");
        wait.wait_for_second(10);
        element.click("create_project_button");
    }

    @MethodsData(method_id = "button_1")
    public void verify_user_is_on_create_project_page() {
        verify.element_is_present("samhita_logo");
    }

    @MethodsData(method_id = "button_1")
    public void enter_project_name_in_project_name_field(String text_to_enter) {
        verify.element_is_present("project_name_text_box");
        element.click("project_name_text_box");
        element.enter_text("project_name_text_box",text_to_enter);
    }

    @MethodsData(method_id = "button_1")
    public void click_on_entity_details_section() {
//         Actions action = new Actions(driver);
//         action.moveToElement(element.find("entity_details")).perform();
//         thread.sleep();

        // Find the element to scroll to
        WebElement elementToScrollTo = driver.findElement(By.xpath("(//button[normalize-space()='Entity Details'])[1]")); // Replace with your own locator

        // Create an instance of JavascriptExecutor
        JavascriptExecutor jsExecutor = (JavascriptExecutor) driver;

        // Scroll to the element
        jsExecutor.executeScript("arguments[0].scrollIntoView(true);", elementToScrollTo);
        wait.wait_for_second(5);
        verify.element_is_present("entity_details");
        element.click("entity_details");
    }

    @MethodsData(method_id = "button_1")
    public void click_on_select_funder() {
        element.click("select_funder");
        element.click("first_funder");
        wait.wait_for_second(2);
    }

    @MethodsData(method_id = "button_1")
    public void click_on_add_entity_type_button() {
        element.click("add_entity_type_button");
    }

    @MethodsData(method_id = "button_1")
    public void change_to_ip_in_entity_type() {
        element.click("entity_as_funder");
        element.click("entity_as_ip");

    }

    @MethodsData(method_id = "button_1")
    public void click_on_select_ip() {
        wait.wait_for_second(2);
        element.click("select_ip");
        WebElement inputField = driver.findElement(By.xpath("(//input[@aria-autocomplete='list'])[7]"));
        inputField.sendKeys("Zeel UAT IP");
        inputField.sendKeys(Keys.ENTER);
        wait.wait_for_second(5);
    }

}
