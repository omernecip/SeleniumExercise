package com.cydeo.EU8;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class exercise2 {

    public static void main(String[] args) {

        WebDriverManager.chromedriver().setup();

        WebDriver driver = new ChromeDriver();

        driver.get("https://www.listelist.com/wp-content/uploads/2015/03/cinsiyetci-medyaya-nanik-cinsomedya-listelist_batch.jpg");

        driver.manage().window().maximize();

        System.out.println("Dear Onur, if you see this test please reach us!!! (sign : Omer/Gungor)");

    }
}
