package Mainfunctions;
import org.testng.annotations.Test;


public class Login extends Base_test {
    private static String userName_Login = "input[id='loginusername']";
    private static String password_Login = "input[id='loginpassword']";
    private static String login_Button = "button[onclick='logIn()']";

    @Test(priority = 2)
    public void test_login_function() {
        page.navigate("https://www.demoblaze.com/index.html");
        page.click("#login2");
        page.fill(userName_Login, "muhammedgabal");
        page.fill(password_Login, "123456");
        page.click(login_Button);
       //login.login_Function("muhammedgabal","123456");
    }
}
