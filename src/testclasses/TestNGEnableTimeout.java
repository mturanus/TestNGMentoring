package testclasses;

import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class TestNGEnableTimeout {
	
	

	@BeforeClass()
	public void setUp() {
		System.out.println("\nTestNG_TestClass1 -> This runs once before class");
	}
	
	@AfterClass
	public void cleanUp() {
		System.out.println("\nTestNG_TestClass1 -> This runs once after class");
	}
	
	
  @Test(enabled=true)
  public void testMethod1() {
	  
	  System.out.println("TestMethod1");
	  
  }
  
  
  @Test(timeOut=100)
  public void testMethod2() throws InterruptedException {
	 
	  System.out.println("TestMethod2");
	  System.out.println("if this test case doesn't finish this amount of time this test case will fail");
	  System.out.println("10000 is ten seconds");
	  
	 // Thread.sleep(200);
	  
  }
}
