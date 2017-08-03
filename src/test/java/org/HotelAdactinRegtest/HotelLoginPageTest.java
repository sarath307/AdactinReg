package org.HotelAdactinRegtest;

import org.HotelAdactinReg.HotelLoginPage;
import org.HotelAdactinReg.HotelPage;
import org.adcantin.utility.Base;
import org.junit.AfterClass;
import org.junit.Assert;
import org.junit.BeforeClass;
import org.junit.Test;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;

// @FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class HotelLoginPageTest extends Base{
	static WebDriver driver;
	HotelLoginPage login;
	HotelPage next;
	
	@BeforeClass
	public static void launchBrowser() {
		driver=getDriver();

	}

	@Test
	public void verifyLoginDetails() {
		login = new HotelLoginPage(driver);
		getScreenShot("HotelLoginPage");
		setText(login.getTxtUserName(), readValueFromExcelSheet().get(1).get("Username"));
		setText(login.getTxtUserPassword(), readValueFromExcelSheet().get(1).get("Password"));
		String s = getText(login.getTxtUserPassword());
		System.out.println(s);
		login.getTxtUserPassword().sendKeys(Keys.ENTER);
		getScreenShot("Username");
		elementToBeVisible(driver, 20, login.getBtnLoginButton());
		clickBtn(login.getBtnLoginButton());
		System.out.println("Success");

	}
	@Test
	public void bsearchHotel1() {
		next = new HotelPage(driver);
//		Assert.assertTrue(elementFound(driver, 10, next.getTxtLogout()));
		dropDownSelect(next.getDrpLocation(), "Sydney");
		dropDownSelect(next.getDrpHotel(), "Hotel Hervey");
		dropDownSelect(next.getDrpRoomType(), "Deluxe");
		dropDownSelect(next.getDrpRoom(), "4");
		setText(next.getTxtCheckinDate(), readValueFromExcelSheet().get(1).get("check in date"));
		setText(next.getTxtCheckOutDate(), readValueFromExcelSheet().get(1).get("check out date"));
		dropDownSelect(next.getDrpAdult(), "4");
		dropDownSelect(next.getDrpChild(), "4");
		getScreenShot("Hotelsearch");
		clickBtn(next.getBtnSearch());

	}
	

	@AfterClass
	public static void closeBrowser() {
		driver.quit();

	}

}
