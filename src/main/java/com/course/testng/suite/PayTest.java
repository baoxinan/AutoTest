package com.course.testng.suite;

import org.testng.annotations.Test;

public class PayTest {

	@Test
	public void paySuccess(){
		System.out.println("Ö§¸¶±¦Ö§¸¶³É¹¦");
	}
	@Test(enabled=false)
	public void ignore(){
		System.out.println("ºöÂÔ²âÊÔ");
	}
}
