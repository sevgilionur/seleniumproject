package com.cydeo.tests.day1_selenium_intro;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class BasicNavigations{

    public static void main(String[] args){

        WebDriverManager.chromedriver().setup();

        WebDriver driver = new ChromeDriver();

        driver.manage().window().maximize();  //this line maximize the browser size

        driver.get("https://www.tesla.com");

        System.out.println("Title name: " +driver.getTitle());
        System.out.println("currentURL: "+ driver.getCurrentUrl());

        try {
            Thread.sleep(3000);
        }catch (InterruptedException e){
            e.printStackTrace();
        }

        driver.navigate().back();

        try {
            Thread.sleep(3000);
        }catch (InterruptedException e){
            e.printStackTrace();
        }

        driver.navigate().forward();

        try {
            Thread.sleep(3000);
        }catch (InterruptedException e){
            e.printStackTrace();
        }

        driver.navigate().refresh();

        try {
            Thread.sleep(3000);
        }catch (InterruptedException e){
            e.printStackTrace();
        }

        driver.navigate().to("https://www.google.com");

        System.out.println("Title name: " +driver.getTitle());

        System.out.println("currentURL: "+driver.getCurrentUrl());

        driver.close();  //it will close only the currently opened browser

        driver.quit();



    }

}
