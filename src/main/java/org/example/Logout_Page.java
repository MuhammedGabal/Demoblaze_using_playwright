package org.example;

import com.microsoft.playwright.Page;

public class Logout_Page {
    private final Page page;
    private static final String logoutButton = "a#logout2";

    public Logout_Page(Page page) {
        this.page = page;
    }

    public void logout_Function() {
        page.click(logoutButton);
    }
}
