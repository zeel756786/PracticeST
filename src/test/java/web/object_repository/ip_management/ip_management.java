package web.object_repository.ip_management;

import io.unity.framework.generators.methodsgenerator.methods.MethodsData;
import io.unity.performaction.autoweb.Element;
import io.unity.performaction.autoweb.Verify;
import io.unity.performaction.autoweb.Wait;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.interactions.Actions;
import web.object_repository.RandomPan;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Random;
import java.util.UUID;

public class ip_management {
    WebDriver driver = null;
    Element element = null;
    Verify verify = null;
    Wait wait = null;

    public ip_management(WebDriver driver) {
        this.driver = driver;
        element = new Element(driver);
        verify = new Verify(driver);
        wait = new Wait(driver);
    }

    @MethodsData(method_id = "button_1")
    public void click_on_ip_management_tab() {
        element.click("ip_management_tab");
    }

    @MethodsData(method_id = "button_1")
    public void click_on_list_of_ip() {
        element.click("list_of_ip");
    }

    @MethodsData(method_id = "button_1")
    public void click_on_add_ip_button() {
        element.click("add_ip");
    }

    @MethodsData(method_id = "button_1")
    public void verify_add_implementation_partner_pop_up() {
        verify.element_is_present("add_ip_pop_up");
        element.click("add_ip_pop_up");
    }

    @MethodsData(method_id = "button_1")
    public void click_on_company_name_text_box(String text_to_enter) {
        element.click("company_name_text_box");
        element.enter_text("company_name_text_box", text_to_enter);
    }

    @MethodsData(method_id = "button_1")
    public void click_on_registered_office_state_drop_down() {
        element.click("registered_office_state");
        element.click("first_state");
        JavascriptExecutor jsExecutor = (JavascriptExecutor) driver;

        String script = "document.elementFromPoint(" + 100 + ", " + 200 + ").click();";
        jsExecutor.executeScript(script);
    }

    @MethodsData(method_id = "button_1")
    public void click_on_year_of_registration() {
        Actions action = new Actions(driver);
        action.doubleClick(element.find("year_of_registration")).perform();
    }

    @MethodsData(method_id = "button_1")
    public void click_on_primary_area_focus() {
        element.click("primary_area_of_focus");
        element.click("select_skill_building");
//        JavascriptExecutor jsExecutor = (JavascriptExecutor) driver;
//
//        // Use JavaScript to click the element
//        String script = "document.elementFromPoint(" + 200 + ", " + 100 + ").click();";
//        jsExecutor.executeScript(script);
    }


    @MethodsData(method_id = "button_1")
    public void click_on_primary_participants() {
        element.click("primary_participants");
        element.click("select_first_participant");
//        JavascriptExecutor jsExecutor = (JavascriptExecutor) driver;
//
//        // Use JavaScript to click the element
//        String script = "document.elementFromPoint(" + 100 + ", " + 200 + ").click();";
//        jsExecutor.executeScript(script);
    }

    @MethodsData(method_id = "button_1")
    public void click_on_address_line_1(String text_to_enter) {
        wait.wait_for_second(2);
        element.click("address_line_1");
        element.enter_text("address_line_1", text_to_enter);
        wait.wait_for_second(2);
    }

    @MethodsData(method_id = "button_1")
    public void click_on_address_line_2(String text_to_enter) {
        element.click("address_line_2");
        element.enter_text("address_line_2", text_to_enter);
    }

    @MethodsData(method_id = "button_1")
    public void select_state_form_drop_down() {
        element.click("select_state");
        element.click("first_state");
    }

    @MethodsData(method_id = "button_1")
    public void select_disctrict_from_drop_down() {
        element.click("select_district");
        element.click("mp_district");
    }

    @MethodsData(method_id = "button_1")
    public void enter_city_name() {
        element.click("city");
        element.click("amethi_city");
    }

    @MethodsData(method_id = "button_1")
    public void enter_pincode(String text_to_enter) {
        element.click("pin_agent");
        element.enter_text("pin_agent", text_to_enter);
    }

    @MethodsData(method_id = "button_1")
    public void click_company_Pan() {
        element.click("company_pan");
    }

    @MethodsData(method_id = "button_1")
    public void enter_pan(String text_to_enter) {
        element.enter_text("company_pan", text_to_enter);
    }

    @MethodsData(method_id = "button_1")
    public void click_on_continue_button() {
        element.click("continue_button");
        wait.wait_for_second(5);
    }

    @MethodsData(method_id = "button_1")
    public void click_on_First_name_text_box_of_cop_details(String text_to_enter) {
        element.click("fn_of_cpd");
        element.enter_text("fn_of_cpd", text_to_enter);
    }

    @MethodsData(method_id = "button_1")
    public void click_on_Last_name_text_box_of_cop_details(String text_to_enter) {
        element.click("ln_of_cpd");
        element.enter_text("ln_of_cpd", text_to_enter);
    }

    @MethodsData(method_id = "button_1")
    public void click_on_mobile_no_of_cop_details(String text_to_enter) {
        element.click("ln_of_cpd");
        element.enter_text("ln_of_cpd", text_to_enter);
    }

    @MethodsData(method_id = "button_1")
    public void click_on_cross_icon_of_pop_up() {
        element.click("cross_button");
    }

    @MethodsData(method_id = "button_1")
    public void click_on_add_agent_button() {
        element.click("add_agent_button");
    }

    @MethodsData(method_id = "button_1")
    public void verify_add_agent_pop_up() {
        verify.element_is_present("add_agent_pop_up");
    }

    @MethodsData(method_id = "button_1")
    public void click_on_first_name_and_enter_fn(String text_to_enter) {
        element.click("fn_of_cpd");
        element.enter_text("fn_of_cpd", text_to_enter);
    }

    @MethodsData(method_id = "button_1")
    public void click_on_last_name_and_enter_ln(String text_to_enter) {
        element.click("ln_of_cpd");
        element.enter_text("ln_of_cpd", text_to_enter);
    }

    @MethodsData(method_id = "button_1")
    public void click_on_mobile_no_and_enter_no(String text_to_enter) {
        element.click("mobile_num_of_cpd");
        element.enter_text("mobile_num_of_cpd", text_to_enter);
    }

    @MethodsData(method_id = "button_1")
    public void click_on_mobile_no_and_enter_existing_no(String text_to_enter) {
        element.click("mobile_num_of_cpd");
        element.enter_text("mobile_num_of_cpd", text_to_enter);
    }

    @MethodsData(method_id = "button_1")
    public void select_dob_for_agent() {
        element.click("dob_cpd");
        element.click("select_date_nine");
    }

    @MethodsData(method_id = "button_1")
    public void select_gender_for_agent() {
        element.click("gender_cpd");
        element.click("female");
    }

    @MethodsData(method_id = "button_1")
    public void select_maritial_status_for_agent() {
        element.click("martial_status");
        element.click("single_option");
    }

    @MethodsData(method_id = "button_1")
    public void click_on_email_and_enter_mail() {
        element.click("email_id_of_cpd");

        Random rand = new Random();
        int randomNumber = rand.nextInt(10000);  // Change the range as needed

        // Create a random email using the random number
        String randomEmail = "Testzeelauto" + randomNumber + "@yopmail.com";
       driver.findElement(By.xpath("//input[@formcontrolname=\"email\"]")).sendKeys(randomEmail);
        //element.enter_text("email_id_of_cpd", text_to_enter);
    }

    @MethodsData(method_id = "button_1")
    public void click_on__already_exist_email_and_enter_mail(String text_to_enter) {
        element.click("email_id_of_cpd");
        element.enter_text("email_id_of_cpd", text_to_enter);
    }

    @MethodsData(method_id = "button_1")
    public void select_ip_for_that_agent() {
        element.click("select_ip");
        element.click("pw_ip");
    }

    @MethodsData(method_id = "button_1")
    public void click_on_continue_button_agent() {
        element.click("continue_button_agent");
    }

    @MethodsData(method_id = "button_1")
    public void verify_agent_created_success_fully_pop_up() {
        verify.element_is_present("agent_created_successfully_pop_up");
    }

    @MethodsData(method_id = "button_1")
    public void verify_mobile_number_already_exist_pop_up() {
        wait.wait_until_element_is_visible("mobile_number_already_exist_pop_up");
        verify.element_is_present("mobile_number_already_exist_pop_up");
    }

    @MethodsData(method_id = "button_1")
    public void verify_email_already_exist_pop_up() {
        wait.wait_until_element_is_visible("email_already_exist_pop_up");
        verify.element_is_present("email_already_exist_pop_up");
    }
}



