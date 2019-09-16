package com.hqyj.setson;

import java.util.HashSet;
import java.util.Set;

/**
 *HashSet 集合的特点：
 *  元素唯一 且无序
 * 
 * HashSet集合的底层数据结构是哈希表
 * 它能够保证元素存储唯一是add依赖于hashCode 和equals方法
 * @author zj
 *
 */
public class HashSetDemo {
	public static void main(String[] args) {
		HashSet<String> set = new HashSet<String>();
		 //
		 set.add("hello3");
		 set.add("hello");
		 set.add("hello1");
		 set.add("hello1");
		 set.add("hello2");
		 
		 //遍历
		 for(String s:set) {
			 System.out.println(s);
		 }
		 
		
	}

}
