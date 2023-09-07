package pomPages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class TestingPage {
	        //declaration
			//address of selenium training
			@FindBy(xpath="(//a[text()='Selenium Training'])[2]")
			private WebElement seleniumtraining;
			
			//address of mycart
			@FindBy(id="mycart")
			private WebElement carttab;
			
			//address of facebook
			@FindBy(xpath="(//i[@class='fa fa-facebook'])[2]")
			private WebElement facebook;
			
			//initialization
			public TestingPage(WebDriver driver)
			{
				PageFactory.initElements(driver, this);
			}

			
			//utilization

			public WebElement getSeleniumtraining() { //drag and drop
				return seleniumtraining;
			}


			public WebElement getCarttab() {     //drag and drop
				return carttab;
			}

			public void facebookicon() {
				facebook.click();
			}
			
			
}
