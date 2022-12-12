package org.iosif.test.testpackage.hotwire;

import org.openqa.selenium.By;

public class HotWireObjects {

    private By bundleButton = By.xpath("//*[@class = 'farefinder-option inactive']/span[text() = 'Bundles']");
    private By carButton = By.xpath("//*[@id='root']/div[2]/div[1]/div[1]/div/div/div[1]/div/div[3]/form/div[1]/div[2]/button[3]");
    private By flyFrom = By.xpath("//*[@id='root']/div[2]/div[1]/div[1]/div/div/div[1]/div/div[3]/form/div[2]/div/div/input");
    private By flyTo = By.xpath("//*[@id='root']/div[2]/div[1]/div[1]/div/div/div[1]/div/div[3]/form/div[3]/div/div/input");
    private By departing = By.xpath("//*[@id='input1-farefinder-package-date']");
    private By returning = By.xpath("//*[@id='input2-farefinder-package-date']");
    private By departingTime = By.xpath("//div[@class='hw-input-group']/select[@name='carPickupTime']");
    private By returningTime = By.xpath("//div[@class='hw-input-group']/select[@name='carDropoffTime']");
    private By submitButton = By.xpath("//div[@class='submit-button']/button");
    private By confirmResults = By.xpath("///div[@class= 'uitk-text uitk-type-start uitk-type-200 uitk-type-medium uitk-text-default-theme uitk-spacing uitk-spacing-padding-blockend-one'][contains(text(), 'properties')]");

    public By getBundleButton() {
        return bundleButton;
    }

    public By getCarButton() {
        return carButton;
    }

    public By getFlyFrom() {
        return flyFrom;
    }

    public By getFlyTo() {
        return flyTo;
    }

    public By getDeparting() {
        return departing;
    }

    public By getReturning() {
        return returning;
    }

    public By getDepartingTime() {
        return departingTime;
    }

    public By getReturningTime() {
        return returningTime;
    }

    public By getSubmitButton() {
        return submitButton;
    }
    public int getConfirmResults(){
        int result = convertStringToInt(confirmResults.toString());
        return result;
    }
    public int convertStringToInt(String element){
        return Integer.parseInt(element.replaceAll(" properties",""));
    }
}
