package org.iosif.test.testpackage.hotwire;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

@Test
public class HotWireTest {
    public WebDriver driver = new ChromeDriver();

    private final HotWireObjects hotWireObjects;
    public HotWireTest(){this.hotWireObjects = new HotWireObjects();}

    public void addDetailsOnBundleForm(){
        driver.get("http://hotwire.com");
        driver.findElement(hotWireObjects.getBundleButton()).click();
        driver.findElement(hotWireObjects.getCarButton()).click();
        driver.findElement(hotWireObjects.getFlyFrom()).sendKeys("SFO");
        driver.findElement(hotWireObjects.getFlyTo()).sendKeys("LAX");


        Select selectDep = new Select(driver.findElement(hotWireObjects.getDepartingTime()));
        selectDep.selectByValue("Evening");
        Select selectRet = new Select(driver.findElement(hotWireObjects.getDepartingTime()));
        selectRet.selectByValue("Morning");
    }
    public void submitAndCheckResults(){
        int n = 1;
        driver.findElement(hotWireObjects.getSubmitButton()).click();
        if (hotWireObjects.getConfirmResults() >= n){
            System.out.println("The page has at least 1 result!");
        }
        driver.quit();
    }
}
