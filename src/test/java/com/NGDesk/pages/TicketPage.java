package com.NGDesk.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.NGDesk.utilities.Driver;

public class TicketPage {

	public TicketPage() {
		
		PageFactory.initElements(Driver.getDriver(), this);
	}
	
	@FindBy(xpath="//button[@class='btn btn-primary ng-binding']")
	public WebElement newResponse;
	
	
	
	
}
