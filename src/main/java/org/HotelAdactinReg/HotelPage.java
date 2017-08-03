package org.HotelAdactinReg;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HotelPage {
		WebDriver driver;
		@FindBy(xpath="//*[text()='Logout']")
		private WebElement txtLogout;
		@FindBy(id="location")
		private WebElement drpLocation;
		@FindBy(id="hotels")
		private WebElement DrpHotel;
		
		public WebDriver getDriver() {
			return driver;
		}
		public void setDriver(WebDriver driver) {
			this.driver = driver;
		}
		public WebElement getTxtLogout() {
			return txtLogout;
		}
		public void setTxtLogout(WebElement txtLogout) {
			this.txtLogout = txtLogout;
		}
		public WebElement getDrpLocation() {
			return drpLocation;
		}
		public void setDrpLocation(WebElement drpLocation) {
			this.drpLocation = drpLocation;
		}
		public WebElement getDrpHotel() {
			return DrpHotel;
		}
		public void setDrpHotel(WebElement drpHotel) {
			DrpHotel = drpHotel;
		}
		public WebElement getDrpRoomType() {
			return drpRoomType;
		}
		public void setDrpRoomType(WebElement drpRoomType) {
			this.drpRoomType = drpRoomType;
		}
		public WebElement getDrpRoom() {
			return drpRoom;
		}
		public void setDrpRoom(WebElement drpRoom) {
			this.drpRoom = drpRoom;
		}
		public WebElement getTxtCheckinDate() {
			return txtCheckinDate;
		}
		public void setTxtCheckinDate(WebElement txtCheckinDate) {
			this.txtCheckinDate = txtCheckinDate;
		}
		public WebElement getTxtCheckOutDate() {
			return txtCheckOutDate;
		}
		public void setTxtCheckOutDate(WebElement txtCheckOutDate) {
			this.txtCheckOutDate = txtCheckOutDate;
		}
		public WebElement getDrpAdult() {
			return drpAdult;
		}
		public void setDrpAdult(WebElement drpAdult) {
			this.drpAdult = drpAdult;
		}
		public WebElement getDrpChild() {
			return drpChild;
		}
		public void setDrpChild(WebElement drpChild) {
			this.drpChild = drpChild;
		}
		public WebElement getBtnSearch() {
			return btnSearch;
		}
		public void setBtnSearch(WebElement btnSearch) {
			this.btnSearch = btnSearch;
		}
		@FindBy(id="room_type")
		private WebElement drpRoomType;
		@FindBy(id="room_nos")
		private WebElement drpRoom;
		@FindBy(id="datepick_in")
		private WebElement txtCheckinDate;
		@FindBy(id="datepick_out")
		private WebElement txtCheckOutDate;
		@FindBy(id="adult_room")
		private WebElement drpAdult;
		@FindBy(id="child_room")
		private WebElement drpChild;
		@FindBy(id="Submit")
		private WebElement btnSearch;
		
		public HotelPage(WebDriver ldriver) {
			   this.driver=ldriver;
			PageFactory.initElements(driver, this);
		}


}
