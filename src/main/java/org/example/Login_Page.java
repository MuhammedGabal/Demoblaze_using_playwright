package org.example;

import com.microsoft.playwright.Page;

public class Login_Page {

    private Page page;
    private static final String userName_Login = "input[id='loginusername']";
    private static final String password_Login = "input[id='loginpassword']";
    private static final String login_Button = "button[onclick='logIn()']";

    public Login_Page(Page page) {
        this.page = page;
    }

    public void login_Function(String username, String password) {
        page.fill(userName_Login, username);
        page.fill(password_Login, password);
        page.click(login_Button);
    }

}