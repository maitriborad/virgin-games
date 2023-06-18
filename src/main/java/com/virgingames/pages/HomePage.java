package com.virgingames.pages;

import com.virgingames.utility.Utility;
import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.util.List;

public class HomePage extends Utility {
    private static final Logger log = LogManager.getLogger(HomePage.class.getName());

    public HomePage() {
        PageFactory.initElements(driver, this);
    }

    @CacheLookup
    @FindBy(xpath = "//li[@class='StyledNavigationMenuListItem-sc-v46bks-2 bQLgET']")
    List<WebElement> options;

    @CacheLookup
    @FindBy(xpath = "//label[@data-qa='accept-cookie-policy']")
    WebElement cookies;

    @CacheLookup
    @FindBy(linkText = "Online Slots")
    WebElement onlineSlots;

    @CacheLookup
    @FindBy(linkText = "Live Casino")
    WebElement liveCasino;

    @CacheLookup
    @FindBy(linkText = "Casino")
    WebElement casino;

    @CacheLookup
    @FindBy(xpath = "//h1")
    WebElement verifyText;

    public void clickOnAcceptCookies(){
        clickOnElement(cookies);
        log.info("Accept cookies" + cookies.toString());
    }
    public boolean isOptionsInTopMenu(String option){
        boolean isDisplayed = false;
            for (WebElement e : options) {
                if (e.getText().equalsIgnoreCase(option)) {
                    isDisplayed = true;
                    break;
                }
        }
        return isDisplayed;
    }
    public void clickOnOnlineSlots(){
        clickOnElement(onlineSlots);
        log.info("Clicking on online slots" + onlineSlots.toString());
    }
    public void clickOnLiveCasino(){
        clickOnElement(liveCasino);
        log.info("Clicking on Live Casino" + liveCasino.toString());
    }
    public void clickOnCasino(){
        clickOnElement(casino);
        log.info("Clicking on Casino" + casino.toString());
    }
    public String verifyOnlineSlotsText(){
        log.info("Getting text" + verifyText.toString());
        return getTextFromElement(verifyText);
    }
}
