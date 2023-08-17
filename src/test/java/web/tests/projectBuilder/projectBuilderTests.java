package web.tests.projectBuilder;

import io.unity.framework.init.base;
import io.unity.framework.readers.DataReader;
import io.unity.framework.readers.json_file_reader;
import io.unity.performaction.autoweb.Window;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.UsernameAndPassword;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;
import org.testng.annotations.DataProvider;
import web.object_repository.login.login_page;
import web.object_repository.projectBuilder.project_builder;

public class projectBuilderTests extends base {

   login_page login = null;
   project_builder project_builder = null;
   Window window = null;

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
   public void verify_when_click_on_project_builder(String userName, String password) throws InterruptedException {

      login_page login = new login_page(driver);
      project_builder = new project_builder(driver);
      window = new Window(driver);

      login.verify_login_with_email_link_is_present_on_page();
      login.performLogin(userName, password);
      login.enter_static_otp("123456");
      login.click_on_submit_button();
      String currentWindow = window.get_current_window_handle("aa");
      project_builder.verify_project_builder_module_is_present_on_page();
      window.find_new_window_and_switch(currentWindow);
      project_builder.click_on_create_project_button();
      project_builder.verify_user_is_on_create_project_page();
      project_builder.enter_project_name_in_project_name_field("Test Automation project");
      project_builder.click_on_entity_details_section();
      project_builder.click_on_select_funder();
      project_builder.click_on_add_entity_type_button();
      project_builder.change_to_ip_in_entity_type();
      project_builder.click_on_select_ip();
   }

}
