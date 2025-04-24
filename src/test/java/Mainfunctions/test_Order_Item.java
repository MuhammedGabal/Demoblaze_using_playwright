package Mainfunctions;

import org.testng.annotations.Test;



public class test_Order_Item extends Base_test {

    private static final String mentor_Item = "a:has-text(\"Monitors\")";
    private static final String apple_Mentor_24 = "a:has-text(\"Apple monitor 24\")";
    private static final String add_To_Cart_Button = "a:has-text(\"Add to cart\")";
    private static final String cart_Button = "a#cartur";
    private static final String place_Order_Button = "//*[@id=\"page-wrapper\"]/div/div[2]/button";
    private static Login login = new Login();

    @Test(priority = 3)
    public void create_mentor_apple_order() {
        login.test_login_function();
        page.click(mentor_Item);
        page.click(apple_Mentor_24);
        page.click(add_To_Cart_Button);
        page.click(cart_Button);
        page.setDefaultTimeout(5000);
        page.click(place_Order_Button);

    }
}
