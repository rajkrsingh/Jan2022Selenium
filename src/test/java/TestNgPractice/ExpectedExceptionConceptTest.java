package TestNgPractice;

import org.testng.annotations.Test;

public class ExpectedExceptionConceptTest {
	
	int age=10;
	
	@Test(expectedExceptions= {NullPointerException.class,ArithmeticException.class})  //we can use Exception.class for all types of exception
	public void a_Test() {
		
		System.out.println("A-->Test");
		
		//int sum=age/0;
		
		ExpectedExceptionConceptTest  obj=new ExpectedExceptionConceptTest ();
		obj=null;
		System.out.println(obj.age);
	}

}
