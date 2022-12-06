package com.maven.TestNG;

import org.testng.annotations.Test;

public class Groups {
    @Test(groups = {"Even"},priority = 1)
	public void cm1() {
		System.out.println("Even1");

	}
    @Test(groups = {"odd"})
	public void hm2() {
		System.out.println("Odd1");
	}
    @Test(groups = {"Even"},priority = -1)
	public void qm3() {
		System.out.println("Even2");
	}
    @Test(groups = {"odd"})
	public void am4() {
		System.out.println("Odd2");
	}
    @Test(groups = {"odd"})
	public void sm5() {
		System.out.println("Odd3");
	}
    @Test(groups = {"Even"},priority = 2)
	public void m6() {
		System.out.println("Even3");
	}

}
