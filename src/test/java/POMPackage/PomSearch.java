package POMPackage;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import basePackage.baseClass;

public class PomSearch extends baseClass {
	
	@FindBy(xpath = "//*[@id=\"twotabsearchtextbox\"]") WebElement search;
	
	@FindBy(xpath = "//*[@id=\"nav-search-submit-button\"]") WebElement searchbtn;
	
	public PomSearch() {
		PageFactory.initElements(driver, this);
	}
	
	public void search(String item) {
		search.sendKeys(item);
	}
	public void searchBtn() {
		searchbtn.click();
	}

}
