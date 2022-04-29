package com.cydeo.EU8;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class exercise1 {

    public static void main(String[] args) throws InterruptedException {

        WebDriverManager.chromedriver().setup();

        WebDriver driver=new ChromeDriver();

        String CurrentTitle1;
        String CurrentTitle2;


        driver.get("https://www.cydeo.com");
        Thread.sleep(2000);
        CurrentTitle1=driver.getTitle();
        System.out.println("CurrentTitle = " + CurrentTitle1);

        driver.manage().window().maximize();
        Thread.sleep(2000);

        driver.navigate().to("https://www.github.com");
        Thread.sleep(2000);
        CurrentTitle2=driver.getTitle();
        System.out.println("CurrentTitle = " + CurrentTitle2);


        driver.navigate().back();
        Thread.sleep(2000);

        driver.navigate().forward();
        Thread.sleep(2000);

        driver.navigate().refresh();
        Thread.sleep(2000);


        if(CurrentTitle1.equals("Cydeo")&& CurrentTitle2.equals("GitHub: Where the world builds software · GitHub")){
            System.out.println("Passed");
            driver.close();
        }else {
            System.out.println("Failed");
            System.out.println("please check it manually");

        }






    }
}

