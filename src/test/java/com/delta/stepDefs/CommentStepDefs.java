package com.delta.stepDefs;

import org.openqa.selenium.JavascriptExecutor;

import com.delta.pages.CommentPage;
import com.delta.utilities.BrowserUtilities;
import com.delta.utilities.Driver;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;

public class CommentStepDefs {

	@Given("click on need help button")
	public void clickOnNeedHelpButton() {
		CommentPage cp = new CommentPage();

		JavascriptExecutor js = (JavascriptExecutor) Driver.getDriver();

		// BrowserUtilities.waitForPageToLoad(5);
		js.executeScript("window.scrollBy(0,1300)");
		js.executeScript("arguments[0].click();", cp.needHelpButton);
		// lc.needHelpButton.click();
		BrowserUtilities.waitFor(1);
		js.executeScript("window.scrollBy(0,800)");

	}

	@Then("I click on Give feedback")
	public void iClickOnGiveFeedback() {
		CommentPage cp = new CommentPage();

		BrowserUtilities.waitFor(1);
		cp.CommentComplainButton.click();

	}

	@Then("click on Did you find the information you were looking for on this page?")
	public void clickOnDidYouFindTheInformationYouWereLookingForOnThisPage() {

		CommentPage cp = new CommentPage();

		BrowserUtilities.waitFor(6);
		cp.labelButton.click();

	}

	@Then("click on yes")
	public void clickOnYes() {

		CommentPage cp = new CommentPage();

		BrowserUtilities.waitFor(5);
		cp.chooseButton.click();

	}

	@Then("fill out feedback form")
	public void fillOutFeedbackForm() {

		CommentPage cp = new CommentPage();

		BrowserUtilities.waitFor(5);
		cp.messageButton.sendKeys(
				"Very dynamic site was hard to locate elements.I have to use helper classes to interact with elements");

	}

	@Then("click submit")
	public void clickSubmit() {
		CommentPage cp = new CommentPage();

		BrowserUtilities.waitFor(3);
		cp.submitButton.click();
	}
}
