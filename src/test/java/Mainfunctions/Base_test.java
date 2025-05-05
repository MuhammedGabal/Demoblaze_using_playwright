package Mainfunctions;

import com.microsoft.playwright.*;
import org.example.Login_Page;
import org.example.Logout_Page;
import org.example.Order_Item;
import org.example.Registration;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;

public class Base_test {

    protected static Playwright playwright;
    protected static Page page;
    protected static Browser browser;
    protected Login_Page login;
    protected static Logout_Page logout_page;
    protected Order_Item order_item;
    protected Registration registration;
    @BeforeClass
    public static void setup_firefox_browser() {
        playwright = Playwright.create();
        browser = playwright.firefox().launch(new BrowserType.LaunchOptions().setHeadless(false));
        page = browser.newPage();
    }

    @AfterClass
    public static void close_browser() {
        browser.close();
        playwright.close();
    }
}
