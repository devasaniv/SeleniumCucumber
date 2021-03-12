package com.qa.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class CitiPages {
	WebDriver Driver;
	
	 @FindBy(linkText="CITIGROUP.COM")
	    @CacheLookup
	    WebElement CitiGroupLink;
	 
	 public void CitiGroupLinkClick() {
		 CitiGroupLink.click();
	    }
	
	 @FindBy(linkText="TERMS AND CONDITIONS")
	    @CacheLookup
	    WebElement TermNCondLink;
	 
	 public void TermLinkClick() {
		 TermNCondLink.click();
	    }
	 
    public CitiPages(WebDriver Driver) {
        this.Driver = Driver;
        PageFactory.initElements(Driver, this);
    }

    
}
