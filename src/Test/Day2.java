package Test;

import org.testng.annotations.AfterTest;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class Day2 {

	
	@Test
	public void webLoginPersonalLoan() {
		
		System.out.println("webLoginPersonalLoan");
	}
	
	@Test(groups= {"smoke"})
	public void mobileAndroidLoginPersonalLoan() {
		
		System.out.println("mobileAndroidLoginPersonalLoan");
	}
	@Parameters({"url"})
	@Test
	public void mobileIosLoginPersonalLoan(String url) {
		
		System.out.println("mobileIosLoginPersonalLoan");
		System.out.println(url);
	}
	@AfterTest
	public void afterTest() {
		System.out.println("AfterTest");
	}
	@Test
	public void apiLoginPersonalLoan() {
		
		System.out.println("apiLoginPersonalLoan");
	}
	
	
}
