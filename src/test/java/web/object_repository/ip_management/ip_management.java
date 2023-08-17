package web.object_repository.ip_management;

import io.unity.framework.generators.methodsgenerator.methods.MethodsData;
import io.unity.performaction.autoweb.Element;
import io.unity.performaction.autoweb.Verify;
import io.unity.performaction.autoweb.Wait;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.interactions.Actions;
import web.object_repository.RandomPan;

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
    }

    @MethodsData(method_id = "button_1")
    public void click_on_year_of_registration() {
        Actions action = new Actions(driver);
        action.doubleClick(element.find("year_of_registration")).perform();
        element.click("select_any_year");
        element.click("company_name_text_box");
    }

    @MethodsData(method_id = "button_1")
    public void click_on_primary_area_focus() {
        element.click("primary_area_of_focus");
        element.click("select_skill_building");

        wait.wait_for_second(5);
        /*try {
            element.click_using_js(element.find("blank_space"));
        } catch (Exception e) {
            e.printStackTrace();
        }*/
//        Actions action = new Actions(driver);
//        action.sendKeys(Keys.ESCAPE);

    }


    @MethodsData(method_id = "button_1")
    public void click_on_primary_participants() {
        element.click("primary_participants");
        element.click("select_first_participant");
    }

    @MethodsData(method_id = "button_1")
    public void click_on_address_line_1(String text_to_enter) {
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
    public void enter_city_name(String text_to_enter) {
        element.click("city");
        element.enter_text("city", text_to_enter);
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
        wait.wait_for_second(10);
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
}

