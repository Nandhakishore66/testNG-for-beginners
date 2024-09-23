package testNGPractice;

import org.testng.annotations.Test;

public class driveACar {    //TestCase=How to drive a Car?
	
	@Test(priority=0)
	public void startTheCar() {
		System.out.println("The Car is started");
	}
	@Test(priority=1)
	public void putFirstGear() {
		System.out.println("First Gear");
	}
	@Test(priority=2)
	public void putSecondGear() {
		System.out.println("Second Gear");
	}
	@Test(priority=3)
	public void putThirdGear() {
		System.out.println("Third Gear");
	}
	@Test(priority=4)
	public void putFourthGear() {
		System.out.println("Fourth Gear");
	}

}

//1......If we run only with @Test it executes the result with the alphabetical order of the method name...
//2......So that we need to give the (Priority)which is a keyword near the @Test(Annotation)..like which is 1st 2nd 3rd...