package web.tests.login;

import io.unity.framework.init.base;
import org.testng.annotations.Test;
import web.object_repository.login.login_test_steps;

public class login_test extends base {


    login_test_steps login_steps;

    @Test
    public void perform_login() {
        login_steps = new login_test_steps(driver);
        //login_steps.perform_login();
        login_steps.verify_login_with_google_is_present_on_page();
        login_steps.login_on_app();
        login_steps.verify_homepage_title_is_displayed();
        login_steps.logout();
    }
}
