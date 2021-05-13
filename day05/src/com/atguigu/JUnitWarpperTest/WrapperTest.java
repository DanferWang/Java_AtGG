package com.atguigu.JUnitWarpperTest;

import org.junit.Test;

public class WrapperTest {
	
	@Test
	public void testInteger() {
		int int1 = 10;
		Integer in1 = new Integer(int1);
		System.out.println(in1.toString());
		
		Double dou1 = new Double("2.343");
		System.out.println(dou1.doubleValue()+0.009);
		
		Boolean boo1 = true;
		System.out.println(boo1.booleanValue());
		Boolean boo2 = new Boolean("true233");
		System.out.println(boo2.booleanValue());
	}
	
	
	@Test
	public void testStringTo() {
		int num1 = 10;
		String str1 = num1 + "";
		
		float f1 = 12.3f;
		String str2 = String.valueOf(f1);
		Double d1 = 12.4;
		String str3 = String.valueOf(d1);
		System.out.println(str1);
		System.out.println(str2);
		System.out.println(str3);
	}
	
	
	@Test
	public void testToString() {
		String str1 = "123";
		int num1 = Integer.parseInt(str1);
		System.out.println(num1 + 1);
		
		String str2 = "true";
		boolean boo1 = Boolean.parseBoolean(str2);
		System.out.println(boo1);
	}

}
