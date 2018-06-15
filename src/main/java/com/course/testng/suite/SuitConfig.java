package com.course.testng.suite;

import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;

public class SuitConfig {
    @BeforeSuite
	public void beforeSuit(){
		System.out.println("before suit����");
	}
    @AfterSuite
    public void afterSuit(){
    	System.out.println("after suit����");
	}
}
