package Mainfunctions;

import org.testng.annotations.Test;


public class Logout extends Base_test{
    private static String logoutButton = "a#logout2";
    private static Login login = new Login();

    @Test(priority = 4)
    public static  void test_Logout_Function() {
        login.test_login_function();
        page.click(logoutButton);
        //logout_page.logout_Function();
    }
}
