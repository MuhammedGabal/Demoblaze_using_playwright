package org.example;

import com.microsoft.playwright.Page;

public class Registration {
    private final Page page;

    // Locators for registration fields
    private static final String username_Registration = "input[id='sign-username']";
    private static final String password_Registration = "input[id='sign-password']";
    private static final String register_Button = "button[onclick='register()']";

    public Registration(Page page) {
        this.page = page;
    }

    public void register_Function(String username, String password) {
        page.fill(username_Registration, username);
        page.fill(password_Registration, password);
        page.click(register_Button);
    }
}
