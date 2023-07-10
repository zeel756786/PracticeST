package web.tests.projectBuilder;

import io.unity.framework.init.base;
import io.unity.framework.readers.DataReader;
import io.unity.framework.readers.json_file_reader;
import org.openqa.selenium.UsernameAndPassword;
import org.testng.annotations.Test;
import org.testng.annotations.DataProvider;
import web.object_repository.login.login_page;
import web.object_repository.projectBuilder.project_builder;

public class projectBuilderTests extends base {

   login_page login = null;
   project_builder project_builder = null;

   @DataProvider(name = "login_credentials")
   public Object[][] data_provider() {
      json_file_reader config = new json_file_reader();
      DataReader reader = new DataReader();
      Object[][] data = null;
      if (config.getEnvFromCurrentConfig().contains("uat") || config.getEnvFromCurrentConfig().contains("uim")) {
         data = reader.getExcelDataForDataProvider("Samhita_onboarding.xlsx", 0);
      }
      return data;
   }

   @Test(dataProvider = "login_credentials")
   public void verify_when_click_on_project_builder(String userName, String password){

      login_page login = new login_page(driver);
      project_builder = new project_builder(driver);

      login.verify_login_with_email_link_is_present_on_page();
      login.performLogin(userName, password);
      login.click_on_submit_button();
      project_builder.verify_project_builder_module_is_present_on_page();
      project_builder.verify_user_is_on_project_list_page();
      project_builder.click_on_project_name_filter("Test Automation project");

   }


}
