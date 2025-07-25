package com.testNG.basics;

import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;

public class FourthExercise {

	@BeforeTest
	public void BT() {
		System.out.println("user data-BT");
	}
	@BeforeSuite
	public void ST() {
		System.out.println("cache and code pre-requisite-ST");
	}
	@BeforeMethod
	public void MT() {
		System.out.println("Tool-MT");
	}
	@AfterSuite
	public void AS() {
		System.out.println("close Application");
	}
	
}
