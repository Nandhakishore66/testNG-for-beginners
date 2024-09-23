package testNGPractice;

import org.testng.annotations.Test;

public class DependiciesManagement {
	
	//Problem1:You have to admit a student to engineering
	//Ans:For that the student must finished the higher secondary
	
	//Problem2;You have admit a student to higher secondary..
	//Ans; For that the student must complete SSLC
	@Test(enabled=true)
	public void sslc() {
		System.out.println("SSLC");
	}
	@Test(dependsOnMethods="sslc")
	public void higherSecondary() {
		System.out.println("Higher Secondary");
	}
	@Test(dependsOnMethods="higherSecondary")
	public void engineering() {
		System.out.println("Engineering");
	}

}
//This is dependency method...
//Example:Children are depend to parents........ Like that one thing is depend to other thing