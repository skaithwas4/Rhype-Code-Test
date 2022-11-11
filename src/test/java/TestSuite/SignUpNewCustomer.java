package TestSuite;

import org.testng.annotations.AfterClass;
import org.testng.annotations.Test;
import CrayonCodeTest.GenericMethods;
import org.testng.Assert;

//Test class containing all test scenarios and cases
public class SignUpNewCustomer extends GenericMethods{

	@AfterClass
	public void CloseBrowser() {
		driver.quit();
	}
	
  @Test (priority = 1, enabled = true)
  public void CustomerWithSameBillingAddressAndAuthContactOnly() throws Exception {
	  TestCaseID = "TC01";
	  UseDifferentBillingAddress = "false";
	  OtherContactCheckBox = "false";
	  ReadExcelData(TestCaseID);
	  LaunchUrl();
	  FillCustomerForm();
	  
	  //Just used a random assertion to show test results
	  //This would be more appropriate to verify after hitting submit for some confirmation on customer creation
	  Assert.assertEquals(Email, "shikha.1288@gmail.com");
	  
	  /*Commented code for handling captcha and submitting the form
	  
	  driver.findElement(By.xpath("//span[@id='recaptcha-anchor']/div")).click();  
	  (More lines to handle image captcha....)

	  //Clicking on Sign up button after filling in all details. Commented for now
	 	driver.findElement(By.id("submitbutton")).click();  
	  */
	  
  }
 
  @Test (priority = 2, enabled = true)
  public void CustomerWithDifferentBillingAddressAndOtherContacts() throws Exception {
	  TestCaseID = "TC02";
	  UseDifferentBillingAddress = "true";
	  OtherContactCheckBox = "true";
	  ReadExcelData(TestCaseID);
	  LaunchUrl();
	  FillCustomerForm();
	  
	  //Just used a random assertion to show test results
	  //This would be more appropriate to verify after hitting submit for some confirmation on customer creation
	  Assert.assertEquals(TechnicalJobTitle, "Technical associate");
	  
	  /*Commented code for handling captcha and submitting the form
	  //Code for handling reCaptcha
	  //driver.findElement(By.xpath("//span[@id='recaptcha-anchor']/div")).click();  
	  (More lines to handle image captcha....)

	  //Clicking on Sign up button after filling in all details. Commented for now
	  driver.findElement(By.id("submitbutton")).click();  
	  */
  }
  
  
}
