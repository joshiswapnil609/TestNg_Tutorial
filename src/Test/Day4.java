package Test;



import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;


public class Day4 {

	
	@Test(dataProvider = "getData")
	public void webHomeLoan(String uname,String pass) {
		
		System.out.println("webHomeLoan");
		System.out.println(uname);
		System.out.println(pass);
	}
    public void webHomeLoan1() {
		
		System.out.println("webHomeLoan");
		
	}
	@Test(enabled=true)
	public void mobileHomeLoan() {
		
		System.out.println("mobileHomeLoan");
	}
	
	@Test(dependsOnMethods= {"mobileHomeLoan"})
	public void apiHomeLoan() {
		
		System.out.println("apiHomeLoan");
	}
	@DataProvider
	public String[][] getData() {
		
		String[][] obj=new String[2][2];
		
		//1st set of data
		obj[0][0] = "u1";
		obj[0][1] = "p1";
		
		//2nd set of data
		obj[1][0] = "u2";
		obj[1][1] = "p2";
		
		return obj;
		
		
	}
	
	
}
