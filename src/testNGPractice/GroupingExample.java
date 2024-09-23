package testNGPractice;

import org.testng.annotations.Test;

public class GroupingExample {
	
	/*
	 Scenario: A big Basket is having a different kind of Mobiles.
	 Let us say they are apple phones, Moto, vivo, and Lenovo..
	 I want to run tests only for vivo and moto phones.Write a program for that
	 */
     
	 @Test(groups= {"Apple"})
	 public void apple1() {
		 System.out.println("Apple testing");
	 }
	 @Test(groups= {"Apple"})
	 public void apple2() {
		 System.out.println("Apple testing");
	 }
	 @Test(groups= {"Vivo"})
	 public void vivo1() {
		 System.out.println("Vivo testing");
	 }
	 @Test(groups= {"Vivo"})
	 public void vivo2() {
		 System.out.println("Vivo testing");
	 }
	 @Test(groups= {"Moto"})
	 public void moto1() {
		 System.out.println("Moto testing");
	 }
	 @Test(groups= {"Moto"})
	 public void moto2() {
		 System.out.println("Moto testing");
	 }
	 
	 @Test(groups= {"Lenovo"})
	 public void lenovo1() {
		 System.out.println("Lenovo testing");
	 }
	 @Test(groups= {"Lenovo"})
	 public void lenovo2() {
		 System.out.println("Lenovo testing");
	 }
}
