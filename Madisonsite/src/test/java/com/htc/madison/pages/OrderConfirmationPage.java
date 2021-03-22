package com.htc.madison.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class OrderConfirmationPage extends BasePage {
	@FindBy(xpath="//div[@class='page-title']")
	private WebElement chechouttitle;
	

	public OrderConfirmationPage(WebDriver driver) {
		super(driver);
		this.driver = driver;
	}
	
	public String assert_chechouttitle() {
		return chechouttitle.getText();
	}
}