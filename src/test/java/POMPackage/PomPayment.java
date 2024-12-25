package POMPackage;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

import basePackage.baseClass;

public class PomPayment extends baseClass {
	@FindBy(xpath = "/html/body/div[5]/div[2]/div/div/div[1]/div[1]/div/div[4]/div/div[3]/div[2]/div[2]/div/div[2]/div/div/div/div/div/div/div/form/fieldset/div[3]/span/div/label/i") WebElement skip;
	@FindBy(xpath ="/html/body/div[5]/div[2]/div/div/div[1]/div[1]/div/div[4]/div/div[3]/div[2]/div[2]/div/div[2]/div/div/div/div/div/div/div/form/div/span/span/span/input") WebElement continuebtn;
	@FindBy(xpath = "//*[@id=\"pp-XyIvfm-107\"]") WebElement cardOption;
	@FindBy(xpath = "//*[@id=\"apx-add-credit-card-action-test-id\"]/div/img[1]") WebElement addCard;
	@FindBy(xpath = "//*[@id=\"pp-I1OiPe-16\"]") WebElement cardNumber;
	@FindBy(xpath = "//*[@id=\"pp-I1OiPe-22\"]/span/span/span") WebElement expirymonth;
	@FindBy(xpath = "//*[@id=\"a-popover-2\"]/div/div") WebElement expirymonthDropdown;
	@FindBy(xpath = "//*[@id=\"pp-I1OiPe-23\"]/span/span") WebElement expiryYear;
	@FindBy(xpath = "//*[@id=\"a-popover-3\"]/div/div") WebElement expiryYearDropdown;
	@FindBy(xpath = "//*[@id=\"pp-I1OiPe-26\"]/span/input") WebElement saveCard;
	@FindBy(xpath = "//*[@id=\"secureFieldsCVV-0h_PU_CUS_469fbb88-ca1d-4f2c-b98e-a422fe00d0cb\"]/input") WebElement cvv;
	@FindBy(xpath = "//*[@id=\"pp-T9WC13-275\"]/span/input") WebElement pay;
	Select se;
	JavascriptExecutor js;
	public PomPayment() {
		PageFactory.initElements(driver, this);
		js = (JavascriptExecutor) driver;
	}
	
	public void cardOption() throws InterruptedException {
		
		js.executeScript("arguments[0].scrollIntoView();", skip);
		Thread.sleep(10000);
		skip.click();
		Thread.sleep(15000);
		js.executeScript("arguments[0].click();", continuebtn);
		continuebtn.click();
		//cardOption.click();
	}
	public void addCard() {
		js.executeScript("arguments[0].scrollIntoView();", addCard);
		addCard.click();
	}
	public void cardNumber(String num) {
		cardNumber.sendKeys(num);
	}
	public void selectExpiryMonth() {
		expirymonth.click();
		se = new Select(expirymonthDropdown);
		se.selectByIndex(7);
	}
	public void selectExpiryYear() {
		expiryYear.click();
		se = new Select(expiryYearDropdown);
		se.selectByIndex(4);
		
	}
	public void saveCard() {
		saveCard.click();
	}
	public void cvv(String num) {
		cvv.sendKeys(num);
	}
	public void pay() {
		pay.click();
	}
	

}
