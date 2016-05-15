package com.carwale.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class CarLandingPage {
	//object declaration //select by budget objects
	@FindBy(xpath="//*[@id='leadpopup']/div[3]/div[2]/a")
	public WebElement maybelater;
	@FindBy(xpath="//input[@id='searchNewCarByBudget']")
	public WebElement searchByBudget_RadioButton;
	@FindBy(xpath="//select[@id='newCarBudgetSelect']")
	public WebElement selectBudget_Dropdown;
	@FindBy(xpath="//select[@id='newCarVehicleTypeSelect']")
	public WebElement allVehicleTypes_dropdown;
	// Select by brand
	@FindBy(xpath="//input[@id='searchNewCarByBrand']")
	public WebElement searchByBrand_RadioButton;
	@FindBy(xpath="//select[@id='newCarBrandSelect']")
	public WebElement selectBrand_Dropdown;
	@FindBy(xpath="//select[@id='newCarModelSelect']")
	public WebElement selectModel_Dropdown;
	
	
	
	
	public void searchByBrand( String Brand, String Model) throws InterruptedException{
		Thread.sleep(10);
		maybelater.click();
		if(searchByBrand_RadioButton.isSelected()){
			System.out.println("yes it is selected");
		}
		else{
			System.out.println("no its not selected");
			searchByBrand_RadioButton.click();
		}
//		WebDriverWait wait = new WebDriverWait(driver, 20);
//		wait.until(ExpectedConditions.visibilityOf(selectBrand_Dropdown));
		Thread.sleep(20);
		selectBrand_Dropdown.sendKeys(Brand);
		selectModel_Dropdown.sendKeys(Model);
		
	}
	
	public void searchByBudget(){
		
	}
	
	//search new car by brand 
	//check by brand radio
	//pass brand and mode to it
	//click on search
	
	
	//search new car by budget //check by budget radio

}
