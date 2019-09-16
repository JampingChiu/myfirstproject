package com.hqyj.collection;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

/**
 * Collection 遍历
 * 
 * 		Iterator iterator()
		迭代器，集合的专用遍历方式
 * @author zj
 *
 */
public class CollectionDemo2 {

	public static void main(String[] args) {
		//创建对象
		Collection c = new ArrayList();
		c.add("hello1");
		c.add("hello2");
		c.add("hello3");
		c.add("hello4");
		//遍历
//		Object[] arr = c.toArray();
//		for (int i = 0; i < arr.length; i++) {
//			System.out.println(arr[i]);
//		}
		
		// 迭代器对象
		Iterator it = c.iterator();
		while(it.hasNext()) {  // 判断后面是否还有元素
			// 想看字符串长度
			Object obj = it.next();
			// 向下转型    前提有继承或实现关系
			String s = (String) obj;
			System.out.println(s+"==="+s.length()); //有的话先取下一个元素  再 后移
		}

		


	}
	
}
