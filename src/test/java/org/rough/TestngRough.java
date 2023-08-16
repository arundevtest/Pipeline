package org.rough;

import org.testng.annotations.Test;

public class TestngRough {
	
	
	@Test(priority= 1,groups ="A")
	public void tco1() {
		System.out.println("Test1 ");
	}
	
	@Test(priority=2, groups ="B")
	public void tco2() {
		System.out.println("Test2");
	}

	@Test(priority = 3, groups="A")
	public void tco3() {
		System.out.println("Test 3");

	}
	
	
	@Test(priority = 4, groups="B")
	public void tco4() {
		System.out.println("Test 4");

	}
	
	@Test(priority= 5, groups="B")
	public void tco5() {
		System.out.println("Test 5");

	}
	
}
