package POMPackage;

import java.awt.Desktop.Action;
import java.time.Duration;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

import basePackage.baseClass;

public class PomLogin extends baseClass {
	//object repository
	@FindBy(xpath = "//*[@id=\"nav-link-accountList\"]") WebElement signInHover;
	@FindBy(xpath = "//*[@id=\"nav-flyout-ya-signin\"]/a/span") WebElement homepageSignin;
	
	@FindBy(xpath = "//*[@id=\"ap_email\"]") WebElement email;
	
	@FindBy(xpath = "//*[@id=\"continue\"]") WebElement continuebtn; 
	
	@FindBy(xpath = "//*[@id=\"ap_password\"]") WebElement password;
	
	@FindBy(xpath = "//*[@id=\"signInSubmit\"]") WebElement signin;
	
	@FindBy(xpath = "//*[@id=\"icp-nav-flyout\"]/span/span[2]/div") WebElement location;
	
	@FindBy(xpath = "//*[@id=\"icp-flyout-mkt-change\"]/span/div") WebElement changeCountry;

	@FindBy(xpath = "//*[@id=\"icp-dropdown\"]/span/span/span") WebElement Country;

	@FindBy(xpath = "//*[@id=\"a-popover-1\"]/div/div") WebElement CountryList;
	@FindBy(xpath = "//*[@id=\"icp-dropdown-item-8\"]") WebElement india;

	@FindBy(xpath = "//*[@id=\"icp-save-button\"]/span/input") WebElement goToSite;
	
	String parentHandle = driver.getWindowHandle();
	
	
	//initiate page elements
	public void signInHover() throws InterruptedException {
		Actions ac = new Actions(driver);
		ac.moveToElement(signInHover).perform();
		Thread.sleep(3000);
	}
	public PomLogin(){
		PageFactory.initElements(driver, this);
	}
	
	public void signinPage() {
		homepageSignin.click();
	}
	
	public void typeUsername(String name) {
		email.sendKeys(name);
	}
	public void continuebtn() {
		continuebtn.click();
	}
	public void typePassword(String pass) {
		password.sendKeys(pass);
	}
	public void clickBtn() {
		signin.click();
		
	}
	public String verify() {
		return driver.getTitle();
	}
	public void changeLocation() throws InterruptedException {
		Actions ac = new Actions(driver);
		ac.moveToElement(location).perform();
		Thread.sleep(3000);
		
		
	}
	public void selectCountryChange() throws InterruptedException {
		changeCountry.click();
		Thread.sleep(5000);
		Country.click();
	}
	public void selectCountry() {
//		Select se = new Select(CountryList);
//		se.selectByContainsVisibleText("India");
		india.click();
		goToSite.click();
		
	}
	public void switchNewTab() {
		System.out.print(parentHandle);
		Set<String> windows = driver.getWindowHandles();
		System.out.println(windows);
		
		
	}
	
	
	
	

}
