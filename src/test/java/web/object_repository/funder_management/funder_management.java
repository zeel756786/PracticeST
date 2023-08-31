package web.object_repository.funder_management;

import io.unity.framework.generators.methodsgenerator.methods.MethodsData;
import io.unity.performaction.autoweb.Element;
import io.unity.performaction.autoweb.Verify;
import io.unity.performaction.autoweb.Wait;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.interactions.Actions;

import java.util.Random;

public class funder_management{

    WebDriver driver = null;
    Element element = null;
    Verify verify = null;
    Wait wait = null;

    public funder_management(WebDriver driver) {

        this.driver = driver;

        element = new Element(driver);

        verify = new Verify(driver);

        wait = new Wait(driver);
    }

    @MethodsData(method_id = "button_1")
    public void click_on_funder_management_tab() {
        element.click("funder_management_tab");
    }

    @MethodsData(method_id = "button_1")
    public void click_on_list_of_funders() {
        element.click("list_of_funders");
    }

    @MethodsData(method_id = "button_1")
    public void click_on_add_funder_button() {
        wait.wait_for_second(5);
        element.click("add_funder");
    }

    @MethodsData(method_id = "button_1")
    public void verify_add_funder_pop_up() {
        wait.wait_until_element_is_visible("add_funder_text");
        verify.element_is_present("add_funder_text");
    }

    @MethodsData(method_id = "button_1")
    public void click_on_company_name_text_box(String text_to_enter) {
        element.click("company_name");
        element.enter_text("company_name",text_to_enter);
    }

    @MethodsData(method_id = "button_1")
    public void click_on_registered_office_state_drop_down() {
        element.click("registered_office_state");
        element.click("first_state");
        JavascriptExecutor jsExecutor = (JavascriptExecutor) driver;

        // Use JavaScript to click the element
        String script = "document.elementFromPoint(" + 100 + ", " + 200 + ").click();";
        jsExecutor.executeScript(script);
    }

    @MethodsData(method_id = "button_1")
    public void click_on_year_of_registration() {
        Actions action = new Actions(driver);
        action.doubleClick(element.find("year_of_registration")).perform();
       // element.click("select_any_year");
    }
    @MethodsData(method_id = "button_1")
    public void click_on_org_description_and_enter_description(String text_to_enter) {
        element.click("org_description");
        element.enter_text("org_description",text_to_enter);
    }

    @MethodsData(method_id = "button_1")
    public void click_on_sector_and_select_sector() {
        Actions action = new Actions(driver);
        action.doubleClick(element.find("select_sector")).perform();
    }

    @MethodsData(method_id = "button_1")
    public void click_on_state_in_which_csr_projects_conducted() {
        Actions action = new Actions(driver);
        action.doubleClick(element.find("select_state_in_which_csr_conducted")).perform();
        element.click("first_state");
//        Actions action1 = new Actions(driver);
//        action1.sendKeys(Keys.ESCAPE);

        JavascriptExecutor jsExecutor = (JavascriptExecutor) driver;

        // Use JavaScript to click the element
        String script = "document.elementFromPoint(" + 100 + ", " + 200 + ").click();";
        jsExecutor.executeScript(script);
    }

    @MethodsData(method_id = "button_1")
    public void click_on_primary_area_of_focus() {
        element.click("primary_area_of_focus");
        element.click("select_any_skill");

        JavascriptExecutor jsExecutor = (JavascriptExecutor) driver;

        // Use JavaScript to click the element
        String script = "document.elementFromPoint(" + 100 + ", " + 200 + ").click();";
        jsExecutor.executeScript(script);
    }

    @MethodsData(method_id = "button_1")
    public void click_on_primary_participants() {
        Actions action = new Actions(driver);
        action.doubleClick(element.find("primary_participants")).perform();
        element.click("select_any_primary_participants");
        JavascriptExecutor jsExecutor = (JavascriptExecutor) driver;
        // Use JavaScript to click the element
        String script = "document.elementFromPoint(" + 100 + ", " + 200 + ").click();";
        jsExecutor.executeScript(script);

    }
    @MethodsData(method_id = "button_1")
    public void click_on_address_line_1(String text_to_enter) {
        element.click("address_line_1");
        wait.wait_for_second(2);
        element.enter_text("address_line_1", text_to_enter);
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
        JavascriptExecutor jsExecutor = (JavascriptExecutor) driver;
        // Use JavaScript to click the element
        String script = "document.elementFromPoint(" + 100 + ", " + 200 + ").click();";
        jsExecutor.executeScript(script);
    }

    @MethodsData(method_id = "button_1")
    public void select_disctrict_from_drop_down() {
        element.click("select_district");
        element.click("mp_district");
    }

    @MethodsData(method_id = "button_1")
    public void enter_city_name() {
        element.click("city");
        element.click("select_city");
    }

    @MethodsData(method_id = "button_1")
    public void enter_pincode(String text_to_enter) {
        element.click("pincode");
        element.enter_text("pincode", text_to_enter);
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
        wait.wait_for_second(2);
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
        element.click("mobile_num_of_cpd");
        element.enter_text("mobile_num_of_cpd", text_to_enter);
    }

    @MethodsData(method_id = "button_1")
    public void click_on_Date_Of_Birth_of_cop_details() {
        element.click("dob_cpd");
        element.click("select_date_nine");
    }

    @MethodsData(method_id = "button_1")
    public void click_on_Gender_of_cop_details() {
        element.click("gender_cpd");
        element.click("female");
    }

    @MethodsData(method_id = "button_1")
    public void click_on_Marital_status_of_cop_details() {
        element.click("martial_status");
        element.click("single_option");
    }

    @MethodsData(method_id = "button_1")
    public void click_on_Email_id_text_box_of_cop_details() {
        element.click("email_id_of_cpd");

        Random rand = new Random();
        int randomNumber = rand.nextInt(10000);

        String randomEmail = "zeelfundertest" + randomNumber + "@yopmail.com";
        driver.findElement(By.xpath("//input[@formcontrolname=\"email\"]")).sendKeys(randomEmail);
    }

    @MethodsData(method_id = "button_1")
    public void click_on_designation_text_box_of_cop_details(String text_to_enter) {
        element.click("designation_of_cpd");
        element.enter_text("designation_of_cpd",text_to_enter);
    }

    @MethodsData(method_id = "button_1")
    public void click_on_address_line_1_of_cpd(String text_to_enter) {
        element.click("address_line_1_cpd");
        wait.wait_for_second(2);
        element.enter_text("address_line_1_cpd", text_to_enter);
    }
    @MethodsData(method_id = "button_1")
    public void click_on_address_line_2_of_cpd(String text_to_enter) {
        element.click("address_line_2_cpd");
        wait.wait_for_second(2);
        element.enter_text("address_line_2_cpd", text_to_enter);
    }
    @MethodsData(method_id = "button_1")
    public void select_state_form_drop_down_of_cpd() {
        element.click("select_state_cpd");
        element.click("first_state_cpd");
        JavascriptExecutor jsExecutor = (JavascriptExecutor) driver;
        // Use JavaScript to click the element
        String script = "document.elementFromPoint(" + 100 + ", " + 200 + ").click();";
        jsExecutor.executeScript(script);
    }

    @MethodsData(method_id = "button_1")
    public void select_disctrict_from_drop_down_of_cpd() {
        element.click("select_district_cpd");
        element.click("ahmd_district_cpd");
    }
    @MethodsData(method_id = "button_1")
    public void enter_city_name_of_cpd() {
        element.click("city_cpd");
        element.click("select_city_cpd");
    }
    @MethodsData(method_id = "button_1")
    public void enter_pincode_of_cpd(String text_to_enter) {
        element.click("pincode_cpd");
        element.enter_text("pincode_cpd", text_to_enter);
    }
    @MethodsData(method_id = "button_1")
    public void click_on_continue_button_of_cpd() {
        element.click("continue_button_cpd");
        wait.wait_for_second(2);
    }

    @MethodsData(method_id = "button_1")
    public void verify_funder_details_successfully_added_pop_up() {
        wait.wait_until_element_is_visible("funder_details_added_pop_up");
        verify.element_is_present("funder_details_added_pop_up");
    }
    @MethodsData(method_id = "button_1")
    public void verify_user_created_pop_up() {
        wait.wait_until_element_is_visible("funder_details_added_pop_up");
        verify.element_is_present("funder_details_added_pop_up");
    }

    @MethodsData(method_id = "button_1")
    public void click_on_action_meatball_menu() {
        element.click("action_meat_ball");
    }

    @MethodsData(method_id = "button_1")
    public void verify_edit_option_is_available() {
        wait.wait_until_element_is_visible("edit_option");
        verify.element_is_present("edit_option");
    }

    @MethodsData(method_id = "button_1")
    public void verify_delete_option_is_available() {
        wait.wait_until_element_is_visible("delete_option");
        verify.element_is_present("delete_option");
    }

    @MethodsData(method_id = "button_1")
    public void click_on_delete() {
        element.click("delete_option");
    }

    public void verify_delete_pop_up_should_get_open() {
        wait.wait_until_element_is_visible("delete_pop_up");
        verify.element_is_present("delete_pop_up");
    }

    @MethodsData(method_id = "button_1")
    public void click_on_delete_button_of_the_pop_up() {
        element.click("delete_button_of_pop_up");
    }
    public void verify_funder_deleted_successfully_toast_msg() {
        wait.wait_until_element_is_visible("funder_deleted_toast_msg");
        verify.element_is_present("funder_deleted_toast_msg");
    }
    @MethodsData(method_id = "button_1")
    public void click_on_edit() {
        element.click("edit_option");
    }

    public void verify_funder_edited_successfully_toast_msg() {
        wait.wait_until_element_is_visible("edit_funder_pop_up");
        verify.element_is_present("edit_funder_pop_up");
    }

    public void verify_edit_funder_pop_up_should_open() {
        wait.wait_until_element_is_visible("edit_funder_pop_up");
        verify.element_is_present("edit_funder_pop_up");
    }

    public void verify_company_details_edited_toast_msg() {
        wait.wait_until_element_is_visible("delete_pop_up");
        verify.element_is_present("delete_pop_up");
    }
}
