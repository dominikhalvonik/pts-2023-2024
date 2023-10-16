package org.example;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.By;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\Admin\\IdeaProjects\\pts-2023-2024\\chromedriver-win64\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();

        /*
        driver.get("https://google.com");

        try {
            WebElement cookiesButton = driver.findElement(By.xpath("/html/body/div[2]/div[3]/div[3]/span/div/div/div/div[3]/div[1]/button[2]/div"));
            cookiesButton.click();
            // Nájdeme vyhľadávací box a zadáme do neho text
            WebElement searchBox = driver.findElement(By.name("q"));
            searchBox.sendKeys("UKF je najlepsia");
            searchBox.submit();
            Thread.sleep(5000);  // Pozastaviť vykonávanie na 5 sekúnd
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
         */

        /*
        driver.get("https://ais2.ukf.sk/ais/start.do");
        try {
            WebElement username = driver.findElement(By.id("login"));
            username.sendKeys("dhalvonik");
            WebElement passowrd = driver.findElement(By.id("heslo"));
            passowrd.sendKeys("MOJE-HESLO");
            // Nájdeme vyhľadávací box a zadáme do neho text
            WebElement submit = driver.findElement(By.id("login-form-submit-btn"));
            submit.submit();
            Thread.sleep(10000);  // Pozastaviť vykonávanie na 5 sekúnd
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        */

        driver.get("https://github.com/login");
        try {
            WebElement username = driver.findElement(By.id("login_field"));
            username.sendKeys("MOJE-meno");
            WebElement passowrd = driver.findElement(By.id("password"));
            passowrd.sendKeys("MOJE-heslo");
            // Nájdeme vyhľadávací box a zadáme do neho text
            WebElement submit = driver.findElement(By.name("commit"));
            submit.submit();
            Thread.sleep(10000);  // Pozastaviť vykonávanie na 5 sekúnd
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        driver.quit();
    }
}