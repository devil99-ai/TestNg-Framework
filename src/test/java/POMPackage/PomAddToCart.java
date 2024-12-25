package POMPackage;

import java.time.Duration;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import basePackage.baseClass;

public class PomAddToCart extends baseClass {
	@FindBy(xpath = "//*[@id=\"add-to-cart-button\"]") WebElement add;
	
	@FindBy(xpath = "//*[@id=\"sc-buy-box-ptc-button\"]/span/input") WebElement proceedCheckout;
	
	@FindBy(xpath = "//*[@id=\"buy-now-button\"]") WebElement buy;
	
	
	public PomAddToCart() {
	
		PageFactory.initElements(driver, this);
	}
	
	public void addToCart() {
		add.click();
	}
	public void checkout() {
		proceedCheckout.click();
	}
	public void buyNow() {
		buy.click();
	}

}
