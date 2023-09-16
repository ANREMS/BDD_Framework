package StepDefinition;

import Excel.ReadExcel;
import Page.Page1;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;

public class Test2 {
   @And("As a user clicks on the login and registration button")
    public void as_a_user_clicks_on_the_login_and_registration_button() throws InterruptedException {
    Page1.popup();
    Page1.register();

    }
    @And("As a user tries to enter username {string}")
    public void as_a_user_tries_to_enter_username(String string)
    {
     Page1.username(ReadExcel.excel(1,0));

    }
    @And("As a user enters the emailid {string}")
    public void as_a_user_enters_the_emailid(String string) throws InterruptedException {
     Page1.email(ReadExcel.excel(1,1));
    }
    @And("As a user enters password  {string}")
    public void as_a_user_enters_password(String string) throws InterruptedException {
     Page1.password(ReadExcel.excel(1,2));
    }
    @And("As a user clicks on the register button")
    public void as_a_user_clicks_on_the_register_button() throws InterruptedException {
    Page1.regbutton();
    }
}
