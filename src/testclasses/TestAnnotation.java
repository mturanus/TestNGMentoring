package testclasses;

import org.testng.Assert;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import ObjectClass.MethodClass;

public class TestAnnotation {

	@Test
	public void test1() {
		
		//call MethodClass
		//implement the .sumResult(int, int) methods 
		//implement the assertion
		
		MethodClass obj=new MethodClass(); 
		
		int result=obj.sumResult(13, 15); 
		
		Assert.assertEquals(result, 28);
		
		System.out.println("Test1");
	}
	
	
	@Test
	public void test2() {
		// Create SoftAssertion
		//call the MethodClass
		//Create one String and call the .addStrins(String, String)
		// show hardAssertion and SoftAssertion differences
		// Show even if implementing the softAssertion to make it fail
		
		
		
		String expectedString="Hello World"; 
		
		String result;// obj.addStrings("Hello", "World1"); 
		
		String result1;//obj.addStrings("Hello", "World"); 

		
		
		System.out.println("after first assertion");
		
	
		
		System.out.println("after second assertion");

		System.out.println("Test2");
		
	}
	
	
	@Test
	public void test3() {
		
		//Call the MethodClass
		//call the getArray() method 
		//implement the assertion
		
		
		int [] expectedArray= {1, 2, 3}; 
		
	

		System.out.println("Test3");
	}
	
	

}
