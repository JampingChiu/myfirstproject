package com.hqyj.collection;
/**
 * String s = "hello";   创捷了一个对象
	String ss = new String("hello");  创建了两个对象
	
	String s = "a"+"b"+"c"+"d"  相当于  String s  ="abcd";
 * @author zj
 *
 */

public class StringDemo {

	public static void main(String[] args) {
//		String s = "hello";
//		String ss = new String("hello");
		String s = "hello";
		String s2 = "java";
		System.out.println("hellojava"== s+s2);// 变量相加先开空间 然后＋再一起
		System.out.println("hellojava".equals(s+s2));
		
		System.out.println("hellojava"=="hello"+"java");// 常量相加的时候是先相加 然后再区空间找是否存在
		System.out.println("hellojava".equals("hello"+"java"));
		

	}

}
