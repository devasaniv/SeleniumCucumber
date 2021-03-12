package com.qa.pages;


import java.util.List;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindAll;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class GooglePages {
    
	WebDriver Driver;
	
	@FindBy(xpath="//*[@id=\"tsf\"]/div[2]/div[1]/div[1]/div/div[2]/input")
    WebElement SearchText;
	
	  public boolean getSearchTextDisplayed() {
	        return SearchText.isDisplayed();
	    }
	    
	    
	  public void SetSearchText(String text) {  
		  	SearchText.clear();
	    	SearchText.sendKeys(text);
	    }
	  @FindBy(xpath="/html/body/div[2]/div[2]/form/div[2]/div[1]/div[3]/center/input[1]")
	    @CacheLookup
	    WebElement SearchBtn;
	    
	    public void clickSearchButton() {
	        //SearchBtn.click();
	    	SearchText.submit();
	    }
	    
	    
	    public String checkTitle() {
	        
	        return Driver.getTitle();
	    }
	    
	        
	    @FindAll(@FindBy(className = "sbtc"))
	    @CacheLookup
	    List<WebElement> AutoSuggestLinks;
	    
	    public List<WebElement> getAutoSuggestLinks() {
	        
	        return AutoSuggestLinks;
	    }
	    
	    
	  public GooglePages(WebDriver Driver) {
	        this.Driver = Driver;
	        PageFactory.initElements(Driver, this);
	    }
	  
	  
}

