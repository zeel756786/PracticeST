package web.tests.login;

import io.unity.framework.init.base;
import org.testng.annotations.Test;
import web.object_repository.login.login_page;

public class loginTests extends base {
    login_page login = null;

    @Test
    public void Verify_login_with_valid_credentials(){
        login_page login=new login_page(driver);

        login.verify_login_with_email_link_is_present_on_page();


    }



}
