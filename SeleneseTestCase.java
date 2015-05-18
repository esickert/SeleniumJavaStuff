package com.example.tests;

import com.thoughtworks.selenium.*;
import java.util.regex.Pattern;

public class temp script extends SeleneseTestCase {
    public void setUp() throws Exception {
        setUp("http://localhost:8080/", "*iexplore");
    }
    public void testTemp script() throws Exception {
        selenium.open("/BrewBizWeb/");
        selenium.click("link=Start The BrewBiz Example");
        selenium.waitForPageToLoad("30000");
        selenium.type("name=id", "bert");
        selenium.type("name=Password", "biz");
        selenium.click("name=dologin");
        selenium.waitForPageToLoad("30000");
    }
}
