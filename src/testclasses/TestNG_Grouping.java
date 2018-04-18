package testclasses;

import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class TestNG_Grouping {
	
	// How to always run the before class 
	@BeforeClass
	public void beforeClass() {
		System.out.println("Before Class");
	}
	
	//Add Grouping {car and suv}
	@Test
	public void testBMWX6() {
		System.out.println("Running Test - BMW X6");
	}
	
	
	//Add Groups {car and suv}

	@Test
	public void testAudiA6() {
		System.out.println("Running Test - Audi A6 ");
	}
	
	
	//Add Grouping {bikes}

	@Test
	public void testNinja() {
		System.out.println("Running Test - Kawasaki Ninja");
	}
	
	//Add Grouping {bikes}

	@Test
	public void testHondaCBR() {
		System.out.println("Running Test - Honda CBR");
	}

	// always run after class
	@AfterClass
	public void afterClass() {
		System.out.println("After Class");
	}

}
