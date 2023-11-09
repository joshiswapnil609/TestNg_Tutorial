package Test;

import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class Day3 {

	@BeforeClass
	public void beforeClass() {
		System.out.println("BeforeClass");
	}
	@AfterClass
	public void afterClass() {
		System.out.println("AfterClass");
	}
	@Test
	public void webLoginCarLoan() {
		
		System.out.println("webLoginCarLoan");
		
		}
	@BeforeSuite
	public void beforeSuite() {
		System.out.println("BeforeSuite");
	}
	
	@Test(groups= {"smoke"})
	public void mobileLoginCarLoan() {
		
		System.out.println("mobileLoginCarLoan");
		Assert.assertTrue(false);
	}
	
	@Parameters({"url"})
	@Test()
	public void apiLoginCarLoan(String url) {
		
		System.out.println("apiLoginCarLoan");
		System.out.println(url);
	}
	@AfterSuite
	public void afterSuite() {
		System.out.println("i will execute very last");

	}
}
