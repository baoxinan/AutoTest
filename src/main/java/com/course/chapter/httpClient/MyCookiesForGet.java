package com.course.chapter.httpClient;

import java.io.IOException;
import java.util.Locale;
import java.util.ResourceBundle;

import org.apache.http.HttpResponse;
import org.apache.http.client.HttpClient;
import org.apache.http.client.methods.HttpGet;
import org.apache.http.impl.client.DefaultHttpClient;
import org.apache.http.util.EntityUtils;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;


public class MyCookiesForGet {

	private String url;
	//ResourceBundle读取配置文件
	private ResourceBundle bundle;
	@BeforeTest
	public void beforeTest(){
		bundle = ResourceBundle.getBundle("application", Locale.CHINA);
		url = bundle.getString("test.url");
	}
	@Test
	public void TestGetCookies() throws IOException{
		String result;
		//从配置文件中 拼接测试的url
		String uri = bundle.getString("getCookies.uri");
		String testUrl = this.url + uri;
		//测试逻辑代码书写
		HttpGet get = new HttpGet(testUrl);
		HttpClient client = new DefaultHttpClient();
		HttpResponse response = client.execute(get);
		result = EntityUtils.toString(response.getEntity(),"utf-8");
        System.out.println(result);
	}
}
