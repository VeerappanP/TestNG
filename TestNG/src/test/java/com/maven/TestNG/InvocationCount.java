package com.maven.TestNG;

import org.testng.annotations.Ignore;
import org.testng.annotations.Test;

public class InvocationCount {
	
	@Test(invocationCount = 3)
	public void m1() {
       System.out.println("count");
		
	}
	@Test(invocationCount = 2,priority = -1)
	public void m2() {
		System.out.println("out");
	}
	@Test(invocationCount = 3,priority = 2,enabled = false)
	public void m3() {
		System.out.println("hi");
	}
	@Ignore
	@Test()
	public void m4() {
		System.out.println("ma");
	}

}

