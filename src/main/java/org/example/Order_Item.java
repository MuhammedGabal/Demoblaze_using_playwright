package org.example;

import com.microsoft.playwright.Page;

public class Order_Item {
    private Page page;

    private static final String mentor_Item = "#itemc";
    private static final String apple_Mentor_24 = "a[href='prod.html?idp_=14']";
    private static final String add_To_Cart_Button = "a[onclick='addToCart(10)']";
    private static final String cart_Button = "a#cartur";
    private static final String place_Order_Button = "button[onclick='addOrder()']";


    public Order_Item(Page page){
        this.page=page;
    }

    public void create_Mentor_Order(){

        page.click(mentor_Item);
        page.click(apple_Mentor_24);
        page.click(add_To_Cart_Button);
        page.click(cart_Button);
        page.click(place_Order_Button);
    }

}
