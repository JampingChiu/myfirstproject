package com.hqyj.setson;

import java.util.HashSet;
import java.util.Set;

/**
   HashSet集合再add 的时候就已经过滤元素了  让重复的不能进集合 
    add 依赖于hashCode 和equals方法
    之前写String类的时候  能够存储正常（元素唯一）String重写了这两个方法
    
    自定义的类 不能实现想要的效果：
     是因为自定义类没有 hashCode 和equals方法  这个时候，add 就找Object里的hashCode 和equals方法
     又因为Object里的hashCode 一般不一样 ，add就认为不是一个元素 就往集合存，
     即使碰见一样的 比较equals，这个时候不一样， 又存入集合
     
     add 再添加的时候：
        	首先先走HashCode值
        	  如果一样   再比较 equals值，
        	      equals如果一样：证明内容一样   说明元素重复    ，不添加进集合
        	            不一样  ：   说明元素不重复    ，添加进集合
        	
        	不一样： 直接存入集合
        	
     解决方案 必须重写hashCode 和equals方法
     
 * @author zj
 *
 */
public class HashSetDemo3 {
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
