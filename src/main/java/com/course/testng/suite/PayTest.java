package com.course.testng.suite;

import org.testng.annotations.Test;

public class PayTest {

	@Test
	public void paySuccess(){
		System.out.println("֧����֧���ɹ�");
	}
	@Test(enabled=false)
	public void ignore(){
		System.out.println("���Բ���");
	}
}
