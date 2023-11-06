package org.example;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.JavascriptExecutor;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.apache.commons.io.FileUtils;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\Admin\\IdeaProjects\\pts-2023-2024\\chromedriver-win64\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();


        driver.get("https://google.com");

        try {
            WebElement cookiesButton = driver.findElement(By.xpath("/html/body/div[2]/div[3]/div[3]/span/div/div/div/div[3]/div[1]/button[2]/div"));
            cookiesButton.click();
            // Nájdeme vyhľadávací box a zadáme do neho text
            WebElement searchBox = driver.findElement(By.name("q"));
            searchBox.sendKeys("UKF je najlepsia");
            searchBox.submit();
            File screenshot = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);

            // Uloženie súboru
            FileUtils.copyFile(screenshot, new File("screenshot.png"));
            // Otvoríme nový tab pomocou JavaScriptu
            ((JavascriptExecutor)driver).executeScript("window.open()");

            // Získame handle na všetky otvorené okná/taby
            List<String> tabs = new ArrayList<>(driver.getWindowHandles());

            // Prepneme sa na nový tab, ktorý bude druhý v zozname
            driver.switchTo().window(tabs.get(1));

            // Otvoríme URL v novom tabe
            driver.get("https://ais2.ukf.sk");
            Thread.sleep(5000);

            // Ak chcete zatvoriť aktuálny tab
            driver.close();

            // Prepnite sa späť na pôvodný tab, ak je to potrebné
            driver.switchTo().window(tabs.get(0));
            Thread.sleep(5000);  // Pozastaviť vykonávanie na 5 sekúnd
        }  catch (InterruptedException | IOException e) {
            e.printStackTrace();
        }

        driver.quit();


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

        /*
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
         */

        //Vyhľadávanie na základe ID HTML tagu
        //WebElement usernameID = driver.findElement(By.id("login_field"));
        //Vyhľadávanie na základe mena HTML tagu
        //WebElement usernameName = driver.findElement(By.name("login_field"));
        //Vyhľadávanie na základe css class name
        //WebElement usernameClassName = driver.findElement(By.className("login_field"));
        //Vyhľadávanie na základe HTML tagu podla typu
        //WebElement usernameTagName = driver.findElement(By.tagName("input"));
        //Vyhľadávanie na základe obsahu linku
        //<a href="fdsafdsa">A href je nasa hviezda</a>
        //WebElement usernameLinkText = driver.findElement(By.linkText("A href je nasa hviezda"));
        //Vyhľadávanie na základe časti obsahu linku
        //WebElement usernameParcialLinkText = driver.findElement(By.partialLinkText("A href"));
        //Vyhľadávanie na základe CSS selectorov
        //WebElement usernameCss = driver.findElement(By.cssSelector("input[class=login_field]"));
        //Vyhľadávanie na základe XPath
        //WebElement usernameXpath = driver.findElement(By.xpath("/html/body/div[2]/div[3]/div[3]/span/div/div/div/div[3]/div[1]/button[2]/div"));

        /*driver.get("https://www.alza.sk/mobily/18843445.htm");
        try {

            //WebElement selectBox = driver.findElement(By.id("cpcm_cpc_parametrization_rptHierarchicParameterGroups_hierarchicParameterGroup_0_rptParameters_0_ddlParameterValues_0"));
            //Select dropdown = new Select(selectBox);
            //dropdown.selectByIndex(5);
            //Thread.sleep(50000);
            //dropdown.selectByValue("239896778");
            //Thread.sleep(5000);
            //dropdown.selectByVisibleText("Apple");
            //Thread.sleep(10000);  // Pozastaviť vykonávanie na 5 sekúnd

            /*
            WebElement image = driver.findElement(By.xpath("/html/body/div[3]/div/div/div[1]/div[3]/div/div/div[1]/div/header/div[2]/a/img"));
            WebElement input = driver.findElement(By.xpath("/html/body/div[3]/div/div/div[1]/div[3]/div/div/div[1]/div/header/div[5]/div/div[1]/div/input"));

            Actions act = new Actions(driver);
            act.dragAndDrop(image,input).build().perform();

            Thread.sleep(1000);


            JavascriptExecutor js = (JavascriptExecutor)driver;


            js.executeScript("confirm('Potvrd ale vyvrat')");
            Thread.sleep(1000);
            driver.switchTo().alert().dismiss();
            Thread.sleep(5000);

            js.executeScript("alert(22)");
            Thread.sleep(5000);
            driver.switchTo().alert().accept();
            */
            /*
            js.executeScript("alert('Ahoj ja som tu')");
            Thread.sleep(5000);
            System.out.println(driver.switchTo().alert().getText());
            driver.switchTo().alert().accept();

            By elementLocator = By.id("categoryUpperDescription");
            js.executeScript("arguments[0].style.color = 'red'", driver.findElement(elementLocator));
            Thread.sleep(5000);


        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        driver.quit();
        */
    }
}