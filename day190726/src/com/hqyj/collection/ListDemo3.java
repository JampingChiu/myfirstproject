package com.hqyj.collection;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/**
 *List  集合特点：
 *   特有方法：
 *    void add(int index,E element)
	E remove(int index)
	E get(int index)
	E set(int index,E element)

 * @author zj
 *
 */
public class ListDemo3 {

	public static void main(String[] args) {
		List list = new ArrayList();
		list.add("hello");
		list.add("hello2");
		list.add("hello");
		//遍历
//		Iterator it = list.iterator();
//		while(it.hasNext()) {
//			Object obj = it.next();
//			//想看字符串长度
//			//向下转型
//			String s = (String)  obj;
//			System.out.println(s+"--"+s.length());
//		}
//		
		// List特有遍历方式  有get方法和size组合完成
//		System.out.println(list.get(0));
//		System.out.println(list.get(1));
//		System.out.println(list.get(2));
		 
		//for 循环来写         和数组遍历思想完全一样
		for(int i = 0;i<list.size(); i++) {
			System.out.println(list.get(i));
		}


	}
	
}
