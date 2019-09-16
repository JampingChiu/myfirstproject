package com.hqyj.collection;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/**
 *List  集合特点：
 *  元素有序 可以重复
 *  
 *  存储字符串并遍历  因为List 是一个接口
 *   使用实现类创建对象  ArrayList
 * @author zj
 *
 */
public class ListDemo {

	public static void main(String[] args) {
		List list = new ArrayList();
		list.add("hello");
		list.add("hello2");
		list.add("hello");
		//遍历
		Iterator it = list.iterator();
		while(it.hasNext()) {
			Object obj = it.next();
			//想看字符串长度
			//向下转型
			String s = (String)  obj;
			System.out.println(s+"--"+s.length());
		}
		
		


	}
	
}
