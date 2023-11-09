package Test;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class Day1 {

	@Test(groups= {"smoke"})
	public void webEduLoan() {
		
		System.out.println("webEduLoan");
	}
	@BeforeTest
	public void beforeTest() {
		
		System.out.println("BeforeTest");
	}
	@Parameters({"url","pass"})
	@Test
	public void mobileEduLoan(String url,String pass) {
		
		System.out.println("mobileEduLoan");
		System.out.println(url);
		System.out.println(pass);
	}
	
	@Test
	public void apiEduLoan() {
		
		System.out.println("apiEduLoan");
	}
	@BeforeMethod
	public void beforeMethod() {
		System.out.println("BeforeMethod");
	}
	@AfterMethod
	public void afterMethod() {
		System.out.println("AfterMethod");
	}
	
}
