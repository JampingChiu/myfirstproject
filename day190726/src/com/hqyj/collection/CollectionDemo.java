package com.hqyj.collection;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/**
 * Collection 遍历
 * 
 * 		Iterator iterator()
		迭代器，集合的专用遍历方式
 * @author zj
 *
 */
public class CollectionDemo {

	public static void main(String[] args) {
		//创建对象
		List c = new ArrayList();
		c.add("hello1");
		c.add("hello2");
		c.add("hello3");
		c.add("hello4");
		//遍历
//		Object[] arr = c.toArray();
//		for (int i = 0; i < arr.length; i++) {
//			System.out.println(arr[i]);
//		}
		
		//增强for循环  主要是遍历集合或数组的
		// 目前虽然我自己知道 存储的是String 但是集合目前不知道 所以我在使用for的时候必须使用Object 接收
		// 后面学习了另一个知识点后就好了
//		for(Object s:c) {
//			System.out.println(s);
//		}
		// 迭代器对象
		Iterator it = c.iterator();
		//Object next = it.next();
//		System.out.println(it.hasNext());
//		System.out.println(it.next());
//		System.out.println(it.hasNext());
//		System.out.println(it.next());
//		System.out.println(it.hasNext());
//		System.out.println(it.next());
//		System.out.println(it.hasNext());
//		System.out.println(it.next());
//		System.out.println(it.hasNext());
		
		while(it.hasNext()) {  // 判断后面是否还有元素
			System.out.println(it.next()); //有的话先取下一个元素  再 后移
		}
//		System.out.println(it.next());
//		System.out.println(it.next());
		


	}
	
}
