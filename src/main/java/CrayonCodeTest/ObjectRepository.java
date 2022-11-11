package CrayonCodeTest;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

//Class containing generic variables to be used within the framework
public class ObjectRepository{
	
	//Class level generic variables
	public static String TestCaseID = "";
	public static WebDriver driver=new ChromeDriver();
	
	//Customer Information variables
	public static String CustomerName = "";
	public static String LegalID = "";
	public static String AddressLine1 = "";
	public static String AddressLine2 = "";
	public static String AddressLine3;
	public static String City;
	public static String State;
	public static String Country;
	public static String PostCode;
	public static String Phone;
	public static String Fax;
	public static String Website;
	public static String Email;
	public static String SourceQuestion;
	public static String Industry;
	public static String UseDifferentBillingAddress;
	
	//Billing address fields
	public static String BillingLine1;
	public static String BillingLine2;
	public static String BillingLine3;
	public static String BillingCity;
	public static String BillingState;
	public static String BillingCountry;
	public static String BillingPostCode;
	
	//Authorized Signatory variables
	public static String AuthoriserFirstName;
	public static String AuthoriserLastName;
	public static String AuthoriserPhone;
	public static String AuthoriserJobTitle;
	public static String AuthoriserEmail;
	public static String OtherContactCheckBox;
	
	//Usage report contact fields
	public static String UsageFirstName;
	public static String UsageLastName;
	public static String UsagePhone;
	public static String UsageJobTitle;
	public static String UsageEmail;
	
	//Sales contact fields
	public static String SalesFirstName;
	public static String SalesLastName;
	public static String SalesPhone;
	public static String SalesJobTitle;
	public static String SalesEmail;
	
	//Accounts contact fields
	public static String AccountsFirstName;
	public static String AccountsLastName;
	public static String AccountsPhone;
	public static String AccountsJobTitle;
	public static String AccountsEmail;
	
	//Statement contact fields
	public static String StatementFirstName;
	public static String StatementLastName;
	public static String StatementPhone;
	public static String StatementJobTitle;
	public static String StatementEmail;
	
	//Technical contact fields
	public static String TechnicalFirstName;
	public static String TechnicalLastName;
	public static String TechnicalPhone;
	public static String TechnicalJobTitle;
	public static String TechnicalEmail;
	
}
