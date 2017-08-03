package org.HotelAdactinReg;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HotelLoginPage {
		static WebDriver driver;
		@FindBy(xpath=".//*[@id='username']")
		private WebElement txtUserName;
		@FindBy(id="password")
		private WebElement txtUserPassword;
		@FindBy(id="login")
		private WebElement btnLoginButton;
		public static WebDriver getDriver() {
			return driver;
		}
		public static void setDriver(WebDriver driver) {
			HotelLoginPage.driver = driver;
		}
		public WebElement getTxtUserName() {
			return txtUserName;
		}
		public void setTxtUserName(WebElement txtUserName) {
			this.txtUserName = txtUserName;
		}
		public WebElement getTxtUserPassword() {
			return txtUserPassword;
		}
		public void setTxtUserPassword(WebElement txtUserPassword) {
			this.txtUserPassword = txtUserPassword;
		}
		public WebElement getBtnLoginButton() {
			return btnLoginButton;
		}
		public void setBtnLoginButton(WebElement btnLoginButton) {
			this.btnLoginButton = btnLoginButton;
		}
		public HotelLoginPage(WebDriver ldriver) {
			   this.driver=ldriver;
			PageFactory.initElements(driver, this);
		
}
}

