package steps;

import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.DataProvider;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;
import pages.BasePage;
import pages.SearchBoxPage;


public class SearchSteps extends BasePage{
	SearchBoxPage sb;


@Given("user entering the item in the search box")
public void user_entering_the_item_in_the_search_box() {
	driver=new ChromeDriver();
    driver.manage().window().maximize();
	driver.get("https://www.bookswagon.com/");
	sb=PageFactory.initElements(driver, SearchBoxPage.class);
	
	sb.searchitem("Beyond The Story: 10-Year Record of BTS\\r\\n");
}

@Given("User click on search button")
public void user_click_on_search_button() throws InterruptedException {
	sb.searchbtn();
   
}

@When("User click on wishList")
public void user_click_on_wish_list() throws InterruptedException {
	sb.wishlistsearch();
	Thread.sleep(1500);
}

@When("User enter the login email and password")
public void user_enter_the_login_email_and_password(String email,String password) {
	sb.loginsearch(email,password);
	

    
}

@When("user click on login button")
public void user_click_on_login_button() {
	sb.loginbutton1();
}


}


