package TestNgPractice;

import org.testng.annotations.Test;

public class PriorityConceptTest {
	
	//None priority based test cases will be executed first
	//First -99,-98 and then None priority based test cases will be executed and then maintain the sequence
	
	@Test(priority=1)
	public void a_Test() {
		System.out.println("A test");
	}
	
	@Test(priority=-98)
	public void b_Test() {
		System.out.println("B test");
	}
	@Test
	public void c_Test() {
		System.out.println("C test");
	}
	@Test(priority=-99)
	public void d_Test() {
		System.out.println("D test");
	}
	@Test
	public void e_Test() {
		System.out.println("E test");
	}
	@Test(priority=4)
	public void f_Test() {
		System.out.println("F test");
	}
	
	

}
