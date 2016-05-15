package testPack;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import com.PomModel.facebook.pages.inbox.FriendsList;
import com.PomModel.facebook.pages.inbox.LandingPage;
import com.PomModel.facebook.pages.inbox.MyProfilePage;
import com.PomModel.facebook.pages.login.LoginPage;

public class LoginTest {

	public static void main(String[] args) {

		LoginPage loginpage = new LoginPage();
		LandingPage landingpage = loginpage.doLogin("bhuimahak", "I20@123");
		MyProfilePage profilepage = landingpage.gotoProfile();
		//profilepage.changePicture("D:\\Study\\me.jpg");
		FriendsList friendListpage = profilepage.loadFriendList();
		boolean isFriendPresent =friendListpage.searchFriend("Vikram Jeet");
		System.out.println("Is Friend Present? "+isFriendPresent);
		

	}

}


