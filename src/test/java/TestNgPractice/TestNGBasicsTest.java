package TestNgPractice;

import org.testng.annotations.Test;

public class TestNGBasicsTest{

	@Test
	public void add() {
		int a=10;
		int b=20;
		int sum=0;
		sum=a+b;
		System.out.println("Sum is:"+sum);
	}

	@Test
	public void substract() {
		int a=10;
		int b=20;
		int result=0;
		result=b-a;
		System.out.println("Substraction is:"+result);
		System.out.println("This print is to test ngrok feature...");
	}

	@Test
	public void multiply() {
		int a=10;
		int b=20;
		int multiply=0;
		multiply=a*b;
		System.out.println("Multiplication is:"+multiply);
	}

}
