package com.delta.stepDefs;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.By.ByXPath;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
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
	//System.out.println(ppp.DOB.getText());
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

	Actions a = new Actions(Driver.getDriver());
	JavascriptExecutor js = (JavascriptExecutor) Driver.getDriver();
	js.executeScript("window.scrollBy(0,500)");
	
	
	PersonalProfilePage ppp = new PersonalProfilePage();
	ppp.addPassport.click();
	BrowserUtilities.waitForPageToLoad(5);
	ppp.firstNameInput.sendKeys(ConfigReader.getProperty("firstName"));
	ppp.lastName.sendKeys(ConfigReader.getProperty("lastName"));
	ppp.gender.click();
	ppp.femaleGender.click();
	
	
	ppp.month.click();
	ppp.feb.click();
	ppp.date.click();
	ppp.fifthDate.click();
	ppp.year.click();
	
	ppp.pickedAyear.click();
	ppp.passportNum.sendKeys("AB123123");
	
	
	a.moveToElement(ppp.nationality).click().build().perform();
	a.moveToElement(ppp.canada).click().build().perform();
	Thread.sleep(5000);
	
	ppp.expMonth.click();
	ppp.expMay.click();
	ppp.expYear.click();
	ppp.expYearPick.click();
	BrowserUtilities.waitFor(5);
	
	ppp.expDate.click();
	ppp.expFive.click();
	
	
	
	
	
	BrowserUtilities.waitFor(5);
	ppp.countryOfResidence.click();
	ppp.french.click();
	ppp.save.click();
}
	
	
	@Then("Confirm allert present")
	public void confirmAllertPresent() {
		PersonalProfilePage ppp = new PersonalProfilePage();
		Assert.assertTrue(ppp.alert.isEnabled());
		
		
		
	}
	
	@Then("I clicked on passport and deleted info")
	public void iClickedOnPassportAndDeletedInfo() {
		PersonalProfilePage ppp = new PersonalProfilePage();
		ppp.details.click();
		BrowserUtilities.waitFor(2);
		ppp.deleteInfo.click();
		BrowserUtilities.waitFor(2);
		ppp.yesButton.click();
	}
	
	
	
	
	

	@Then("Passport info is deleted")
	public void passportInfoIsDeleted() {
	   
		PersonalProfilePage ppp = new PersonalProfilePage();
		Assert.assertTrue(ppp.addPassport.isEnabled());
		
		
	}

	
	
	@Then("Try to add passport info")
	public void tryToAddPassportInfo() {
		PersonalProfilePage ppp = new PersonalProfilePage();
		ppp.addPassport.click();
		ppp.lastName.sendKeys("Young");
		
		
		
		
	}

	@Then("confirm error is displayed")
	public void confirmErrorIsDisplayed() {
		Boolean ans = Driver.getDriver().findElement(By.xpath("//div[@id='passportInfofirstName-error']")).isEnabled();
		Assert.assertTrue(ans);
		
	}

	
	
	
	
	

   
}



	
	


