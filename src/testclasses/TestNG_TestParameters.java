package testclasses;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class TestNG_TestParameters {
	
	//Firstly create Parameters annotation {"browser"} and {"platform"}
	//Then create String as a parameter to the method as a parameter. 
	
	
	
	
	@BeforeClass
	public void setUp() {
		System.out.println("TestNG_Parameters -> Setup");
	//	System.out.println("1. Parameter value from xml file: " + browser);
	//	System.out.println("2. Parameter value from xml file: " + platform);
	}
	
	
	// We can give the more than one value 
	// We need to add values with comma and split them in to the array. 
	
	// SO Create one parameters annotation with {"response"} 
	// Create String parameter and inside method split the parameter with comma and print them out. 
	
	
	@Test
	public void testMethod1(String response) throws InterruptedException {
		String[] stringArray = response.split(",");
		System.out.println("TestNG_Parameters -> testMethod1");
		System.out.println("Response from xml file: " + response);
		System.out.println("stringArray[0] from xml file: " + stringArray[0]);
		System.out.println("stringArray[1] from xml file: " + stringArray[1]);
	}

}
