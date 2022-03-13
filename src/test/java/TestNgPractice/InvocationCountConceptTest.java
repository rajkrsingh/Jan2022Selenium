package TestNgPractice;

import org.testng.annotations.Test;

public class InvocationCountConceptTest {
	
	@Test(invocationCount=10)
	public void homepageSearches() {
		System.out.println("Searching on home page test");
	}

}
