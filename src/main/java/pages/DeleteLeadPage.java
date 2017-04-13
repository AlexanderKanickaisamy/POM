package pages;

import org.openqa.selenium.remote.RemoteWebDriver;

import com.relevantcodes.extentreports.ExtentTest;

import wrappers.LeaftapsWrappers;

public class DeleteLeadPage extends LeaftapsWrappers {

	public DeleteLeadPage(RemoteWebDriver driver, ExtentTest test){
		this.driver = driver; 
		this.test = test;
		if(!verifyTitle("My Leads | opentaps CRM")){
			reportStep("This is not My Lead Page. Look at the SnapShot", "FAIL");
		}
		
	}
	public MyLeadsPage delete()
	{
		return new MyLeadsPage(driver,test);
	}
}
