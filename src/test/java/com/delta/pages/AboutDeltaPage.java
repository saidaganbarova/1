package com.delta.pages;


import java.util.List;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.delta.utilities.Driver;

public class AboutDeltaPage {


	public AboutDeltaPage () {
		
	PageFactory.initElements(Driver.getDriver(), this);
	
	}
	//a[.='']
	@FindBy(xpath = "//ngc-search[@class='d-none d-lg-block ng-tns-c0-0 ng-star-inserted']//img")
	public WebElement search;
	
	@FindBy(xpath = "//input[@class='form-control mb-2 mb-sm-0 custom-search-color']")
	public WebElement enter;
	//div[@class='search-results d-none pl-1 d-block']//li[2]//a[1]
	

	@FindBy(xpath = "//div[@class='search-results d-none pl-1 d-block']//li[2]//a[1]")
	public WebElement about;
	

	@FindBy(xpath = "//body[@class='fresh-air ng-tns-0-1 mac-pr-0']")
	public WebElement playAgain;
	
	@FindBy(xpath = "//div[@class='play']")
	public WebElement play;
	
	@FindBy(xpath = "//div[@class='ytp-scrubber-container']")
	public WebElement scroll;
	
	

	@FindBy(xpath = "//button[@class='ytp-mute-button ytp-button']")
	public WebElement sound;

	@FindBy(xpath = "//div[@class='youtube-player']//iframe")
	public WebElement iframe;

	@FindBy(xpath= "//button[@class='ytp-button ytp-settings-button ytp-hd-quality-badge']")
	public WebElement settings;
	

	@FindBy(xpath = "//button[@class='ytp-fullscreen-button ytp-button']")
	public WebElement fullScreen;
	

	@FindBy(xpath = "//button[@aria-label='Subtitles/closed captions (c)']")
	public WebElement subtitles;
	
	
	
	@FindBy(xpath = "//a[@class='ytp-youtube-button ytp-button yt-uix-sessionlink']")
	public WebElement youtube;
	
	@FindBy(xpath = "//video[@class='video-stream html5-main-video']")
	public WebElement click;
	//div[@class='search-results d-none pl-1 d-block']//li
	
	@FindBy(xpath = "//div[@class='search-results d-none pl-1 d-block']//li")
	public List <WebElement> about1;
	

	
	
	
	
	public void aboutDelta() {
		for (int i = 0; i < about1.size(); i++) {
			String date = about1.get(i).getText();
			if (date.equalsIgnoreCase("About Delta")) {
				about1.get(i).click();
				break;
			}
			
			
	
}
}
	
	
}