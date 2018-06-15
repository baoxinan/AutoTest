package com.course.testng;

import org.testng.annotations.Test;

public class DependTest {
    @Test
	public void Test1(){
		System.out.println("test1 run");
	}
    @Test(dependsOnMethods={"Test1"})
   	public void Test2(){
   		System.out.println("test2 run");
   	}
}
