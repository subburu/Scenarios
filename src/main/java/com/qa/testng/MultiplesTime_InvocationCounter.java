package com.qa.testng;

import org.testng.annotations.Test;

public class MultiplesTime_InvocationCounter {
	
	@Test(invocationCount=6,threadPoolSize=6)
	public void multipleexcution()
	{
		System.out.println("Im testing"+"Thread"+" "+Thread.currentThread().getId());
	}

}
