package org.step;

import org.Base.Base_Class;

import io.cucumber.java.After;
import io.cucumber.java.Before;



public class Hooks_Class extends Base_Class {
	@Before
	public void beforeexecution() {
		loadpage();
		
	}
	@Before("@unit")
	public void beforeexecution1() {
		System.out.println("@unit");
		
	}
	@Before("@sanity")
	public void beforeexecution2() {
		System.out.println("saniy");
		
	}
	@After
	public void afterexecution() {
		quite();
	}

}
