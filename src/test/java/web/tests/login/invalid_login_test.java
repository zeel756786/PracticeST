package web.tests.login;

import io.unity.framework.init.base;
import org.testng.annotations.Test;
import web.object_repository.login.login_test_steps;

public class invalid_login_test extends base {

    login_test_steps login_steps;

    @Test
    public void perform_invalid_login() {
        login_steps = new login_test_steps(driver);
        login_steps.enter_text_at_email("ankit@qable.io");
        login_steps.enter_text_at_password("QAble@2020");
        login_steps.click_on_sign_in_button();
        login_steps.verify_error_message_is_displayed();
    }

}
