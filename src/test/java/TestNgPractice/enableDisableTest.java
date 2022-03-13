package TestNgPractice;

import org.testng.annotations.Test;

public class enableDisableTest {

	
	@Test(enabled=true)
	public void homepageSearches1Test() {
		System.out.println("Searching on home page test1");
	}

	@Test(enabled=true)
	public void homepageSearches2Test() {
		System.out.println("Searching on home page test2");
	}

	@Test(enabled=false)
	public void homepageSearches3Test() {
		System.out.println("Searching on home page test3");
	}

	@Test(enabled=false)
	public void homepageSearches4Test() {
		System.out.println("Searching on home page test4");
	}

	@Test(enabled=true)
	public void homepageSearches5Test() {
		System.out.println("Searching on home page test5");
	}

}
