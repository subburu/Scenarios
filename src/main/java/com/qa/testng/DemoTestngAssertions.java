package com.qa.testng;

import org.testng.Assert;
import org.testng.annotations.Test;

public class DemoTestngAssertions {
	
	@Test
	public void sampleMethod(){
		
		Assert.assertEquals("Hello", "Bye");
		
	}
   
	@Test
	public void sampleMethod1(){
		
		Assert.assertEquals("Hello", "Bye");
		
	}
	
	@Test
	public void sampleMethod2(){
	
		Assert.assertTrue(3>5);
	}
	
	@Test
	public void sampleMethod3(){
	
		Assert.assertTrue(6>5);
	}

	@Test
	public void sampleMethod4(){
	
		Assert.assertFalse(3>5);
	}
	
	@Test
	public void sampleMethod5(){
	
		Assert.assertFalse(6>5);
	}
	
	@Test
	public void sampleMethod6(){
		
		Assert.fail("Intentially failed the test method sampleMethod using TestNG's fail method");
		
	}

	
}
