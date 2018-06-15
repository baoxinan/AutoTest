package com.course.testng.param;

import java.lang.reflect.Method;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class DataProviderTest {
    @Test(dataProvider="data")
	public void testDataProvider(String name,int age){
		System.out.println("name = " + name + "; age = " + age);
	}
    @DataProvider(name="data")
    public Object[][] provideData(){
    	
    	Object[][] objects = new Object[][]{
    		{"zhangsan",10},
    		{"lisi",15},
    		{"wangwu",21}
    	};
		return objects;
    	
    }
    
    
    @Test(dataProvider="methodData")
   	public void test1(String name,int age){
   		System.out.println("test11111方法     name = " + name + "; age = " + age);
   	}
    @Test(dataProvider="methodData")
   	public void test2(String name,int age){
   		System.out.println("test222222方法     name = " + name + "; age = " + age);
   	}
    @DataProvider(name="methodData")
    public Object[][]  methodDataTest(Method method){
    	Object[][] result = null;
    	if(method.getName().equals("test1")){
    		result = new Object[][]{
    			{"zhangsan",20},
    			{"baoxinan",25}
    		};
    	}else if(method.getName().equals("test2")){
    		result = new Object[][]{
    			{"wangcheng",22},
    			{"shabi",26}
    		};	
    	}
    		
		return result;
    	
    }
}
