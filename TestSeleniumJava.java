package org.openqa.selenium.example;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.htmlunit.HtmlUnitDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class TestSeleniumJava   {
    public static void main(String[] args)  {

        WebDriver test = new HtmlUnitDriver();
//      WebDriver driver = new FirefoxDriver();

        test.get("http://www.google.com");
    }
}
