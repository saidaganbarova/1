package com.delta.stepDefs;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.By.ByXPath;
import org.openqa.selenium.support.ui.Select;

import com.delta.pages.PersonalProfilePage;
import com.delta.utilities.BrowserUtilities;
import com.delta.utilities.ConfigReader;
import com.delta.utilities.Driver;

import io.cucumber.java.en.Then;
import junit.framework.Assert;

public class PersonalDetailsTest {
	
	





@Then("I click on my name and pick profile")
public void iClickOnMyNameAndPickProfile() throws InterruptedException {
    PersonalProfilePage ppp = new PersonalProfilePage();
    ppp.profNameMenu.click();
    Thread.sleep(5000);
    ppp.ProfileButton.click();
	BrowserUtilities.waitForPageToLoad(5);
	
	
}

@Then("I confirm my name and my DOB")
public void iConfirmMyNameAndMyDOB() {
	PersonalProfilePage ppp = new PersonalProfilePage();
	System.out.println(ppp.DOB.getText());
	String [] dob = ppp.DOB.getText().split(" ");
	String m = dob[0];
	String d = dob[1].replace(",", "");
	String y = dob[2];
	
	//System.out.print(d + m + y);
	Assert.assertEquals(d, "9");
	Assert.assertEquals(m, "Oct");
	Assert.assertEquals(y, "1986");
	Assert.assertEquals(ppp.name.getText() , "Iuliia Young");
}



@Then("Add Passport Info")
public void addPassportInfo() throws InterruptedException {
	PersonalProfilePage ppp = new PersonalProfilePage();
	ppp.addPassport.click();
	BrowserUtilities.waitForPageToLoad(5);
	ppp.firstNameInput.sendKeys(ConfigReader.getProperty("firstName"));
	ppp.lastName.sendKeys(ConfigReader.getProperty("lastName"));
	ppp.gender.click();
	ppp.femaleGender.click();
	
//	Select smonth= new Select(ppp.month);
//
//	ppp.month.click();
//	smonth.selectByValue("10");
//	
//	
//	Select sdate = new Select(ppp.date);
//	sdate.selectByVisibleText("9");
//	
//	Select syear = new Select (ppp.year);
//	syear.selectByVisibleText("1986");
	
	
	
	
	
	Actions a = new Actions(Driver.getDriver());
	a.moveToElement(ppp.month).click().build().perform();
	a.moveToElement(ppp.june).click().build().perform();
	
	
	
	
	
	
	a.moveToElement(ppp.nationality).click().build().perform();
	a.moveToElement(ppp.canada).click().build().perform();
	Thread.sleep(5000);
	
	
	
	//li[@id='ui-list-nationality39']    canada
	

   
}



	
	

}