package com.hqyj.setson;
/**
 * 通过观察Object 的api
 * 
 * HashCode 方法： 同一个对象的HashCode必须一样
 *  不同对象一般不一样
 *  二般  情况一样
 * 
 *  object里的equals 比较的是地址值  
 *  String 里的equals 比较的是内容 
 * @author zj
 *
 */
public class HashCodeDemo2 {

	public static void main(String[] args) {


		
	System.out.println("----------------");	
		String str = "通话";
		String str2 = "重地";

		System.out.println(str.hashCode()); // 一样的
		System.out.println(str2.hashCode());//一样的
		// 地址值 不一样
		System.out.println(str == str2);
	}

}
