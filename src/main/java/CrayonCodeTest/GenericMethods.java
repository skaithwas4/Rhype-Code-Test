package CrayonCodeTest;

import com.codoid.products.fillo.Connection;
import com.codoid.products.fillo.Fillo;
import com.codoid.products.fillo.Recordset;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

//Class containing all generic functions that will be utilized by different test cases
public class GenericMethods extends ObjectRepository{
	
	//Method to Launch URL
	  public void LaunchUrl() throws InterruptedException {
		  //Launch Sign up page URL  
		  driver.navigate().to("https://dev-rhipe-signup.azurewebsites.net"); 
		  //Wait until the page loads completely
		  WebDriverWait wait = new WebDriverWait(driver, 20);
		  WebElement element = wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("submitbutton")));
		  driver.manage().window().maximize(); 
		  Thread.sleep(1000);
	  }
	  
	  //Method to read data from excel sheet
		public void ReadExcelData(String TestID) {
			try{
			Fillo fillo = new Fillo();
			Connection connection = fillo.getConnection("TestData.xlsx");
			Recordset recordset = connection.executeQuery("SELECT * FROM Sheet1");
			//TestCaseID = TestID;
			while (recordset.next() && TestCaseID.equalsIgnoreCase(TestID)) {
				CustomerName = recordset.getField("Name");
				LegalID = recordset.getField("ResgistrationID");
				AddressLine1 = recordset.getField("AddressLine1");
				AddressLine2 = recordset.getField("AddressLine2");
				AddressLine3 = recordset.getField("AddressLine3");
				City = recordset.getField("City");
				State = recordset.getField("State");
				Country = recordset.getField("Country");
				PostCode = recordset.getField("PostCode");
				Phone = recordset.getField("Phone");
				Fax = recordset.getField("Fax");
				Website = recordset.getField("Website");
				Email = recordset.getField("Email");
				SourceQuestion = recordset.getField("Source");
				Industry = recordset.getField("Industry");
				
				//Billing address fields
				 //UseDifferentBillingAddress = recordset.getField("UseDifferentBillingAddress");
				 BillingLine1 = recordset.getField("BillingLine1");
				 BillingLine2 = recordset.getField("BillingLine2");
				 BillingLine3 = recordset.getField("BillingLine3");
				 BillingCity = recordset.getField("BillingCity");
				 BillingState = recordset.getField("BillingState");
				 BillingCountry = recordset.getField("BillingCountry");
				 BillingPostCode = recordset.getField("BillingPostCode");
				
				//Authorized Signatory variables
				 AuthoriserFirstName = recordset.getField("AuthoriserFirstName");
				 AuthoriserLastName = recordset.getField("AuthoriserLastName");
				 AuthoriserPhone = recordset.getField("AuthoriserPhone");
				 AuthoriserJobTitle = recordset.getField("AuthoriserJobTitle");
				 AuthoriserEmail = recordset.getField("AuthoriserEmail");
				 //OtherContactCheckBox = recordset.getField("OtherContactCheckBox");
				
				//Usage report contact fields
				 UsageFirstName = recordset.getField("UsageFirstName");
				 UsageLastName = recordset.getField("UsageLastName");
				 UsagePhone = recordset.getField("UsagePhone");
				 UsageJobTitle = recordset.getField("UsageJobTitle");
				 UsageEmail = recordset.getField("UsageEmail");
				
				//Sales contact fields
				 SalesFirstName = recordset.getField("SalesFirstName");
				 SalesLastName = recordset.getField("SalesLastName");
				 SalesPhone = recordset.getField("SalesPhone");
				 SalesJobTitle = recordset.getField("SalesJobTitle");
				 SalesEmail = recordset.getField("SalesEmail");
				
				//Accounts contact fields
				 AccountsFirstName = recordset.getField("AccountsFirstName");
				 AccountsLastName = recordset.getField("AccountsLastName");
				 AccountsPhone = recordset.getField("AccountsPhone");
				 AccountsJobTitle = recordset.getField("AccountsJobTitle");
				 AccountsEmail = recordset.getField("AccountsEmail");
				
				//Statement contact fields
				 StatementFirstName = recordset.getField("StatementFirstName");
				 StatementLastName = recordset.getField("StatementLastName");
				 StatementPhone = recordset.getField("StatementPhone");
				 StatementJobTitle = recordset.getField("StatementJobTitle");
				 StatementEmail = recordset.getField("StatementEmail");
				
				//Technical contact fields
				 TechnicalFirstName = recordset.getField("TechnicalFirstName");
				 TechnicalLastName = recordset.getField("TechnicalLastName");
				 TechnicalPhone = recordset.getField("TechnicalPhone");
				 TechnicalJobTitle = recordset.getField("TechnicalJobTitle");
				 TechnicalEmail = recordset.getField("TechnicalEmail");		
			}
			recordset.close();
			connection.close();
			}
			catch(Exception e){
				System.out.print("Exception occurred while reading excel data :" + e);
			}
			finally {
				
			}
		}
		
		// Method to Fill Form data  
		public static void FillCustomerForm() throws InterruptedException{
		  driver.findElement(By.id("CustomerName")).clear();
		  driver.findElement(By.id("CustomerName")).sendKeys(CustomerName);  
		  Thread.sleep(200);
		  driver.findElement(By.id("RegistrationNumber")).clear();
		  driver.findElement(By.id("RegistrationNumber")).sendKeys(LegalID); 
		  Thread.sleep(200);
		  driver.findElement(By.id("Street1")).clear();
		  driver.findElement(By.id("Street1")).sendKeys(AddressLine1); 
		  Thread.sleep(200);
		  driver.findElement(By.id("Street2")).clear();
		  driver.findElement(By.id("Street2")).sendKeys(AddressLine2);
		  Thread.sleep(200);
		  driver.findElement(By.id("Street3")).clear();
		  driver.findElement(By.id("Street3")).sendKeys(AddressLine3); 
		  Thread.sleep(200);
		  driver.findElement(By.id("City")).clear();
		  driver.findElement(By.id("City")).sendKeys(City); 
		  Thread.sleep(200);
		  driver.findElement(By.id("State")).clear();
		  driver.findElement(By.id("State")).sendKeys(State); 
		  Thread.sleep(200);
		  driver.findElement(By.id("Country")).sendKeys(Country); 
		  driver.findElement(By.id("Country")).sendKeys("Tab");
		  driver.findElement(By.id("Postcode")).clear();
		  driver.findElement(By.id("Postcode")).sendKeys(PostCode); 
		  Thread.sleep(200);
		  driver.findElement(By.id("MainPhone")).clear();
		  driver.findElement(By.id("MainPhone")).sendKeys(Phone); 
		  Thread.sleep(200);
		  driver.findElement(By.id("Fax")).clear();
		  driver.findElement(By.id("Fax")).sendKeys(Fax); 
		  Thread.sleep(200);
		  driver.findElement(By.id("WebUrl")).clear();
		  driver.findElement(By.id("WebUrl")).sendKeys(Website); 
		  Thread.sleep(200);
		  driver.findElement(By.id("Email")).clear();
		  driver.findElement(By.id("Email")).sendKeys(Email); 
		  Thread.sleep(200);
		  driver.findElement(By.id("Source")).sendKeys(SourceQuestion); 
		  driver.findElement(By.id("Country")).sendKeys("Tab");
		  driver.findElement(By.id("IndustryType")).sendKeys(Industry);   
		  driver.findElement(By.id("Country")).sendKeys("Tab");
		  
		  //Enter Billing address information if Use another address checkbox is checked
		  if (UseDifferentBillingAddress.equalsIgnoreCase("true")) {
			  driver.findElement(By.id("useanotheraddress")).click();
			  
			  Thread.sleep(200);
			  driver.findElement(By.id("BillingAddressLine1")).clear();
			  driver.findElement(By.id("BillingAddressLine1")).sendKeys(BillingLine1); 
			  Thread.sleep(200);
			  driver.findElement(By.id("BillingAddressLine2")).clear();
			  driver.findElement(By.id("BillingAddressLine2")).sendKeys(BillingLine2); 
			  Thread.sleep(200);
			  driver.findElement(By.id("BillingAddressLine3")).clear();
			  driver.findElement(By.id("BillingAddressLine3")).sendKeys(BillingLine3); 
			  Thread.sleep(200);
			  driver.findElement(By.id("BillingCity")).clear();
			  driver.findElement(By.id("BillingCity")).sendKeys(BillingCity); 
			  Thread.sleep(200);
			  driver.findElement(By.id("BillingState")).clear();
			  driver.findElement(By.id("BillingState")).sendKeys(BillingState); 
			  Thread.sleep(200);
			  driver.findElement(By.id("BillingCountry")).sendKeys(BillingCountry); 
			  driver.findElement(By.id("Country")).sendKeys("Tab");
			  driver.findElement(By.id("BillingPostcode")).clear();
			  driver.findElement(By.id("BillingPostcode")).sendKeys(BillingPostCode); 
		  } 
		  
		  //Enter Authorized Signatory Contact details
		  Thread.sleep(200);
		  driver.findElement(By.id("PrimaryContactFirstName")).clear();
		  driver.findElement(By.id("PrimaryContactFirstName")).sendKeys(AuthoriserFirstName);  
		  Thread.sleep(200);
		  driver.findElement(By.id("PrimaryContactLastName")).clear();
		  driver.findElement(By.id("PrimaryContactLastName")).sendKeys(AuthoriserLastName); 
		  Thread.sleep(200);
		  driver.findElement(By.id("PrimaryContactPhone")).clear();
		  driver.findElement(By.id("PrimaryContactPhone")).sendKeys(AuthoriserPhone); 
		  Thread.sleep(200);
		  driver.findElement(By.id("PrimaryContactJobTitle")).clear();
		  driver.findElement(By.id("PrimaryContactJobTitle")).sendKeys(AuthoriserJobTitle); 
		  Thread.sleep(200);
		  driver.findElement(By.id("PrimaryContactEmail")).clear();
		  driver.findElement(By.id("PrimaryContactEmail")).sendKeys(AuthoriserEmail);  
		  
		  if (OtherContactCheckBox.equalsIgnoreCase("true")) {
			  //Enter additional information if Use Authorised signatory only checkbox is unchecked
			  
			  WebElement usesamecontactcheckbox = driver.findElement(By.id("usesamecontact"));
			  JavascriptExecutor js = (JavascriptExecutor) driver;
			  js.executeScript("arguments[0].scrollIntoView();", usesamecontactcheckbox);
			  Thread.sleep(500);
			  usesamecontactcheckbox.click();
			  Thread.sleep(200);
			  
			  //Enter Usage Report Contact details

			  driver.findElement(By.id("UsageContactFirstName")).clear();
			  driver.findElement(By.id("UsageContactFirstName")).sendKeys(UsageFirstName);
			  Thread.sleep(200);
			  driver.findElement(By.id("UsageContactLastName")).clear();
			  driver.findElement(By.id("UsageContactLastName")).sendKeys(UsageLastName); 
			  Thread.sleep(200);
			  driver.findElement(By.id("UsageContactPhone")).clear();
			  driver.findElement(By.id("UsageContactPhone")).sendKeys(UsagePhone); 
			  Thread.sleep(200);
			  driver.findElement(By.id("UsageContactJobTitle")).clear();
			  driver.findElement(By.id("UsageContactJobTitle")).sendKeys(UsageJobTitle); 
			  Thread.sleep(200);
			  driver.findElement(By.id("UsageContactEmail")).clear();
			  driver.findElement(By.id("UsageContactEmail")).sendKeys(UsageEmail); 
			  Thread.sleep(200);
			  
			  //Enter Sales Contact details

			  driver.findElement(By.id("SalesContactFirstName")).clear();
			  driver.findElement(By.id("SalesContactFirstName")).sendKeys(SalesFirstName); 
			  Thread.sleep(200);
			  driver.findElement(By.id("SalesContactLastName")).clear();
			  driver.findElement(By.id("SalesContactLastName")).sendKeys(SalesLastName); 
			  Thread.sleep(200);
			  driver.findElement(By.id("SalesContactPhone")).clear();
			  driver.findElement(By.id("SalesContactPhone")).sendKeys(SalesPhone); 
			  Thread.sleep(200);
			  driver.findElement(By.id("SalesContactJobTitle")).clear();
			  driver.findElement(By.id("SalesContactJobTitle")).sendKeys(SalesJobTitle); 
			  Thread.sleep(200);
			  driver.findElement(By.id("SalesContactEmail")).clear();
			  driver.findElement(By.id("SalesContactEmail")).sendKeys(SalesEmail); 
			  Thread.sleep(200);
			  
			  //Enter Accounts Contact details
			  
			  driver.findElement(By.id("AccountsContactFirstName")).clear();
			  driver.findElement(By.id("AccountsContactFirstName")).sendKeys(AccountsFirstName); 
			  Thread.sleep(200);
			  driver.findElement(By.id("AccountsContactLastName")).clear();
			  driver.findElement(By.id("AccountsContactLastName")).sendKeys(AccountsLastName); 
			  Thread.sleep(200);
			  driver.findElement(By.id("AccountsContactPhone")).clear();
			  driver.findElement(By.id("AccountsContactPhone")).sendKeys(AccountsPhone); 
			  Thread.sleep(200);
			  driver.findElement(By.id("AccountsContactJobTitle")).clear();
			  driver.findElement(By.id("AccountsContactJobTitle")).sendKeys(AccountsJobTitle); 
			  Thread.sleep(200);
			  driver.findElement(By.id("AccountsContactEmail")).clear();
			  driver.findElement(By.id("AccountsContactEmail")).sendKeys(AccountsEmail); 
			  Thread.sleep(200);
			  
			  //Enter Statement Contact details
			  
			  driver.findElement(By.id("StatementContactFirstName")).clear();
			  driver.findElement(By.id("StatementContactFirstName")).sendKeys(StatementFirstName);  
			  Thread.sleep(200);
			  driver.findElement(By.id("StatementContactLastName")).clear();
			  driver.findElement(By.id("StatementContactLastName")).sendKeys(StatementLastName); 
			  Thread.sleep(200);
			  driver.findElement(By.id("StatementContactPhone")).clear();
			  driver.findElement(By.id("StatementContactPhone")).sendKeys(StatementPhone); 
			  Thread.sleep(200);
			  driver.findElement(By.id("StatementContactJobTitle")).clear();
			  driver.findElement(By.id("StatementContactJobTitle")).sendKeys(StatementJobTitle); 
			  Thread.sleep(200);
			  driver.findElement(By.id("StatementContactEmail")).clear();
			  driver.findElement(By.id("StatementContactEmail")).sendKeys(StatementEmail); 
			  Thread.sleep(200);
			  
			  //Enter Technical Contact details
			  
			  driver.findElement(By.id("TechnicalContactFirstName")).clear();
			  driver.findElement(By.id("TechnicalContactFirstName")).sendKeys(TechnicalFirstName);  
			  Thread.sleep(200);
			  driver.findElement(By.id("TechnicalContactLastName")).clear();
			  driver.findElement(By.id("TechnicalContactLastName")).sendKeys(TechnicalLastName); 
			  Thread.sleep(200);
			  driver.findElement(By.id("TechnicalContactPhone")).clear();
			  driver.findElement(By.id("TechnicalContactPhone")).sendKeys(TechnicalPhone); 
			  Thread.sleep(200);
			  driver.findElement(By.id("TechnicalContactJobTitle")).clear();
			  driver.findElement(By.id("TechnicalContactJobTitle")).sendKeys(TechnicalJobTitle); 
			  Thread.sleep(200);
			  driver.findElement(By.id("TechnicalContactEmail")).clear();
			  driver.findElement(By.id("TechnicalContactEmail")).sendKeys(TechnicalEmail); 
			  Thread.sleep(200);    
		  }
}
	  
}
