package com.course.testng;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;


public class BasicAnnotation {
	@Test
	public void testCase1(){
		System.out.println("���ǲ�������һ");
	}
	@Test
	public void testCase2(){
		System.out.println("���ǲ���������");
	}
	@BeforeMethod
	public void beforeMethod(){
		System.out.println("���ǲ��Է���֮ǰ���е�");
	}
	@AfterMethod
	public void afterethod(){
		System.out.println("���ǲ��Է���֮�����е�");
	}
	@BeforeClass
	public void beforeClass(){
		System.out.println("������������֮ǰ���е�");
	}
	@AfterClass
    public void afterClass(){
		System.out.println("������������֮�����е�");
	}
	
}
