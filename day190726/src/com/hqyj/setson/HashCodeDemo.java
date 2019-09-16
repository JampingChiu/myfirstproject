package com.hqyj.setson;
/**
 * HashCode 方法： 同一个对象的HashCode必须一样
 *  不同对象一般不一样
 *  二般  情况一样
 * @author zj
 *
 */
public class HashCodeDemo {

	public static void main(String[] args) {

		String str = "hello";
		String str2 = "hello";
		System.out.println(str.hashCode());
		System.out.println(str2.hashCode());
		System.out.println(str.equals(str2));
		
	System.out.println("----------------");	
//		String str = "通话";
//		String str2 = "重地";

//		System.out.println(str.hashCode());
//		System.out.println(str2.hashCode());
//		System.out.println(str == str2);
	}

}
