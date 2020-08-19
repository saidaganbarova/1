package com.delta.stepDefs;

import com.delta.pages.PersonalProfilePage;
import com.delta.utilities.BrowserUtilities;

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



	
	

}
