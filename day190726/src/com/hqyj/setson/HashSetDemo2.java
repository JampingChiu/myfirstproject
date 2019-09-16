package com.hqyj.setson;

import java.util.HashSet;
import java.util.Set;



/**
 *HashSet 集合的特点：
 *  元素唯一 且无序
 * 
 * HashSet集合的底层数据结构是哈希表
 * 它能够保证元素存储唯一是add依赖于hashCode 和equals方法
 *
 *add 底层最终是这样实现的：
 *   先比较Hashcode值
 *      一样
 *         		再走equals方法
 *           		一样   同一个对象 不添加
 *           		 不一样  就添加进集合
 *      不一样      直接添加进集合
 *      
 *    之前存储的String为什么能正常存储呢？ 因为String自己重写了hashCode 和 equals
 *    
 *    Book里面没有HashCode 和 equals方法 这个时候add依赖的就是Object里的方法
 *    又因为Object里的HashCode方法的值一般不一样，就会存进集合
 *     即使碰见了一样的 它会去比较equals（比较的是地址值） 所以都会存进集合
 *     
 *     解决方案：
 *      重写hashCode 和equals方法  快捷键生成
 *    
 * @author zj
 *
 */
public class HashSetDemo2 {
	public static void main(String[] args) {
		HashSet<Book> set = new HashSet<Book>();
		 //
//		 *   2：创建自定义对象
		Book b = new Book("java","1007",40.0);
		Book b2 = new Book("c","1002",50.0);
		Book b3 = new Book("故事会","1003",20.0);
		Book b4 = new Book("读者","1004",5.0);
		Book b5 = new Book("读者","1004",5.0);
		//		 *   3：添加进集合
		 set.add(b);
		 set.add(b2);
		 set.add(b3);
		 set.add(b4);
		 set.add(b5);
		
		 
		 //遍历
		 for(Book s:set) {
			 System.out.println(s);
		 }
		 
		
	}

}
