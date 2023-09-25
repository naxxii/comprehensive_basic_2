package com.qa.pages;

import java.util.List;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindAll;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class FlipkartPages {
    WebDriver driver;
    @FindBy(xpath = "//button[contains(text(),'✕')]")
    WebElement cross;
    @FindBy(xpath = "(//div[@class='_2Sn47c'])[1]")
    WebElement logo;
    @FindBy(name = "q")
    WebElement searchfield;
    @FindAll(@FindBy(xpath = "//div[@class='_4rR01T']"))
    List<WebElement> searchitems;

    public FlipkartPages(WebDriver rDriver) {
        this.driver = rDriver;
        PageFactory.initElements(rDriver, this);
    }

    public WebElement getCross() {
        return cross;
    }

    public WebElement getLogo() {
        return logo;
    }

    public WebElement getSearchfield() {
        return searchfield;
    }

    public List<WebElement> getSearchItems() {
        return searchitems;
    }
}

