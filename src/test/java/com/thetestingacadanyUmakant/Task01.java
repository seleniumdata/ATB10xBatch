package com.thetestingacadanyUmakant;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class Task01 {
    public static void main(String[] args) {
        WebDriver driver=new EdgeDriver();
        driver.get("https://www.facebook.com/");
        driver.findElement(By.xpath("//input[@name='email']")).sendKeys("Hello");
        driver.close();


    }


}
