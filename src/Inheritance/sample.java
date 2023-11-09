package Inheritance;

import org.testng.annotations.Test;

public class sample extends PS {

	int a=2;
	@Test
	public void demo() {
		
		System.out.println("I am test method");
		Utility ul=new Utility(a);
		
		//to perform this operation we need to pass "a" to the methods but that is also redundant instead we will pass "a" directly through constuctor;
		System.out.println(ul.increment());
		System.out.println(ul.decrement());
		
//		Utility2 u2=new Utility2();
	    System.out.println(ul.multiplyThree());
	    System.out.println(ul.multiplyTwo());

		doThis();
		
	}

}
