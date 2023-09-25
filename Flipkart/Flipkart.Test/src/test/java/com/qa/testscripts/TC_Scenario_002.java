package com.qa.testscripts;

import java.util.List;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;

public class TC_Scenario_002 extends TestBase {
    @Test
    public void Scenario2() throws InterruptedException {
        fk.getCross().click();
        int xloc = fk.getLogo().getLocation().getX();
        int yloc = fk.getLogo().getLocation().getY();
        if (xloc == 0 && yloc < 5000) {
            Assert.assertTrue(true);
            System.out.println("Logo is on top left side");
        } else {
            Assert.assertTrue(false, "Logo is not in top left side");
        }
        fk.getSearchfield().sendKeys("iphone 14" + Keys.ENTER);
        List<WebElement> li = fk.getSearchItems();

        System.out.println("Total no of items :" + li.size());
        WebElement firstitem = li.get(0);
        firstitem.click();
        Thread.sleep(2000);
        Assert.assertEquals("APPLE iPhone 14 ( 128 GB Storage ) Online at Best Price On Flipkart.com", "APPLE iPhone 14 ( 128 GB Storage ) Online at Best Price On Flipkart.com");
    }

}