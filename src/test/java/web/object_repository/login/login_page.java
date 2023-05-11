package web.object_repository.login;

import io.unity.framework.generators.methodsgenerator.methods.MethodsData;
import io.unity.performaction.autoweb.Element;
import io.unity.performaction.autoweb.Verify;
import io.unity.performaction.autoweb.Wait;
import org.openqa.selenium.WebDriver;

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
        verify.element_is_present("login_with_email");
    }


}
