package Inheritance;

public class Utility extends  Utility2{

	int a;
	
	public Utility(int a) {
     super(a);
    this.a=a;
		
	}
	public int increment() {
		 
		a=a+1;
		return a;
	}
	public int decrement() {
		 
		a=a-1;
		return a;
	}
}
