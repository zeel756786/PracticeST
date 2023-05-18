package web.object_repository.projectBuilder;

import io.unity.framework.generators.methodsgenerator.methods.MethodsData;
import io.unity.performaction.autoweb.Element;
import io.unity.performaction.autoweb.Verify;
import io.unity.performaction.autoweb.Wait;
import org.openqa.selenium.WebDriver;

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
    public void click_on_enter_project_name_text_box(String text_to_enter) {
        element.click("create_new_project");
        element.enter_text("create_new_project",text_to_enter);
        wait.wait_for_second(10);
    }

    @MethodsData(method_id = "button_1")
    public void verify_program_list_fecthed_successfully_pop_up() {
       verify.element_is_present("program_list_fecthed_successfully");
    }


}
