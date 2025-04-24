package Mainfunctions;

import org.testng.annotations.Test;

public class test_Registration extends Base_test {
    private static String username_Registration = "input[id='sign-username']";
    private static String password_Registration = "input[id='sign-password']";
    private static String register_Button = "button[onclick='register()']";

    @Test(priority = 1)
    public void test_Registration() {
        page.navigate("https://www.demoblaze.com/index.html");
        page.click("a#signin2");
        page.fill(username_Registration, "TGabal");
        page.fill(password_Registration, "1234567");
        page.click(register_Button);
        //registration.register_Function("TGabal", "1234567");
    }
}
