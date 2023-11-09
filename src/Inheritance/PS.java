package Inheritance;


import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

public class PS{

	@BeforeMethod
	public void before() {
		
		System.out.println("I am the before method");
	}
	@AfterMethod
	public void after() {
		System.out.println("i am the after method");
	}
	
	public void doThis() {
		System.out.println(" I am dothis");
	}
	
}
