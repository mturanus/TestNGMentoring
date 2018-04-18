package testclasses;

import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import ObjectClass.MethodClass;

public class TestNgDependentTests {
	
MethodClass  obj;
	
	@BeforeClass
	public void setUp() {
		obj = new MethodClass();
		System.out.println("before class");
	}
	
	@AfterClass
	public void cleanUp() {
		System.out.println("after class");
	}
	
	//create depends on Methods and give the "testMethod2"
	
	@Test
	public void testMethod1() {
		System.out.println("testMethod1");
	}
	
	@Test
	public void testMethod2() {
		System.out.println("testMethod2");
		int result = obj.sumResult(1, 2);
		Assert.assertEquals(result, 2);
	}
	
	
	//create depends on Methods and give the "testMethod2"

	@Test
	public void testMethod3() {
		System.out.println("testMethod3");
	}
	
	@Test
	public void testMethod4() {
		System.out.println("testMethod4");
	}

}
