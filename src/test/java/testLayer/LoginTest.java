package testLayer;

import java.util.Set;

import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import POMPackage.PomAddToCart;
import POMPackage.PomLogin;
import POMPackage.PomPayment;
import POMPackage.PomScrollToElement;
import POMPackage.PomSearch;
import basePackage.baseClass;
import testDataPackage.excelSheet;

public class LoginTest extends baseClass{
	PomLogin log;
	PomSearch search;
	PomScrollToElement scroll;
	PomAddToCart add;
	PomPayment pay;
	public LoginTest() {
		super();
	}
	@BeforeMethod
	public void initSetup() {
		initiation();
		screenshot("Login");
		
		log = new PomLogin();
		search = new PomSearch();
		scroll = new PomScrollToElement();
		add =new PomAddToCart();
		pay = new PomPayment();
	}
	
	@Test(priority = 1)
	public void Title() {
		String actual=log.verify();
		System.out.println(actual);
		Assert.assertEquals(actual,"Amazon.com. Spend less. Smile more.");
	}
	@DataProvider
	public Object[][] Details(){
		Object result[][]=excelSheet.readData("Sheet1");
		return result;
	}
	@Test(priority = 0, dataProvider = "Details")
	public void loginUsingExcelData(String name, String password) throws InterruptedException {
		log.signInHover();
		log.signinPage();
		log.typeUsername(name);
		log.continuebtn();
		log.typePassword(password);
		log.clickBtn();
		Thread.sleep(20000);
		search.search("moto g5");
		search.searchBtn();
		Thread.sleep(5000);
		scroll.scroll();
		scroll.clickOnPhone();
		Thread.sleep(15000);
		add.addToCart();
		Thread.sleep(5000);
		add.checkout();
	
		
	}
	@Test(priority = 2)
	public void loginAndOrder() throws InterruptedException {
		log.signinPage();
		log.typeUsername(prop.getProperty("username"));
		log.continuebtn();
		Thread.sleep(3000);
		log.typePassword(prop.getProperty("passowrd"));
		log.clickBtn();
		Thread.sleep(9000);
		search.search("iphone 14");
		search.searchBtn();
		scroll.scroll();
		scroll.clickOnPhone();
		Thread.sleep(5000);
		add.addToCart();
		Thread.sleep(5000);
		add.checkout();
		pay.cardOption();
		pay.addCard();
		Thread.sleep(5000);
		pay.cardNumber("5239667329301137");
		pay.selectExpiryMonth();
		pay.selectExpiryYear();
		pay.saveCard();
		pay.cvv("159");
		pay.pay();
		
	}
	
	
	@AfterMethod
	public void close() {
		driver.close();
	}
	
	
	

}
