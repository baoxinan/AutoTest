package com.course.testng;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;


public class BasicAnnotation {
	@Test
	public void testCase1(){
		System.out.println("这是测试用例一");
	}
	@Test
	public void testCase2(){
		System.out.println("这是测试用例二");
	}
	@BeforeMethod
	public void beforeMethod(){
		System.out.println("这是测试方法之前运行的");
	}
	@AfterMethod
	public void afterethod(){
		System.out.println("这是测试方法之后运行的");
	}
	@BeforeClass
	public void beforeClass(){
		System.out.println("这是在类运行之前运行的");
	}
	@AfterClass
    public void afterClass(){
		System.out.println("这是在类运行之后运行的");
	}
	
}
