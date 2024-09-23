package testNGPractice;

import org.testng.annotations.Test;

public class skipATestCase {   //How to skip a testcase..Setting up the @Test Attribute(Enabled)as false....default=True..

	@Test(priority=0)
	public void startTheCar() {
		System.out.println("The Car is started");
	}
	@Test(priority=5,enabled=false)//After putting False the testcase is skipped...
	public void turnOnMusic() {
		System.out.println("Music is turned on");
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
