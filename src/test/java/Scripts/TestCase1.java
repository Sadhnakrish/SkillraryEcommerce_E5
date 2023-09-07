package Scripts;

//import org.openqa.selenium.WebDriver;
//import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

import genericLibrary.BaseClass;
import pomPages.AddtocartPage;
import pomPages.SkillraryDemoLoginPage;
import pomPages.SkillraryLoginPage;

public class TestCase1 extends BaseClass{

@Test
public void tc1() {
	SkillraryLoginPage s= new SkillraryLoginPage(driver);
	s.gearsbutton();
	s.skillrarydemoapplication();
	utilities.switchingtabs(driver);
	SkillraryDemoLoginPage sd = new SkillraryDemoLoginPage(driver);
	utilities.mouseHover(driver,sd.getCoursetab()) ;
	sd.seleniumtrainingtab();
	AddtocartPage d=new AddtocartPage(driver);
	utilities.doubleClick(driver,d.getAddbtn());
	d.addtocartbutton();
	utilities.alterPopup(driver);

	}

}
