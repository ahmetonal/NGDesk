package com.NGDesk.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.NGDesk.utilities.Driver;

public class HomePage {

	
	public HomePage() {
		PageFactory.initElements(Driver.getDriver(), this);
	}
	
	@FindBy(xpath="//i[@class='fa fa-universal-access  icon-color']")
	public WebElement hoverOver;
	
	@FindBy(linkText="Premade Responses")
	public WebElement premadeResponses;
	
	
	
}
