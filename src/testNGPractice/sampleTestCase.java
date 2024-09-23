package testNGPractice;

import org.testng.annotations.Test;

public class sampleTestCase {
	
	@Test
	public void firstTestCase() {
		System.out.println("The is the first testcase");
	}
	@Test
	public void secondTestCase() {
		System.out.println("The is the second testcase");
	}
	@Test
	public void thirdTestCase() {
		System.out.println("The is the third testcase");
	}
	@Test
	public void fourthTestCase() {
		System.out.println("The is the fourth testcase");
	}
	//Why we use this?==Real time business requirements are more we are able to solve by the only use of testng
	
	//@Test............. IS also in junit but we usend in TestNG....
	
	//Changing the Function to test case=Put@test at the top of each method

}
