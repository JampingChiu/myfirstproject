package com.hqyj.collection;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
/**
 *  List自定义对象存储并遍历     
 *  步骤：
 *   1创建集合对象
 *   2：创建自定义对象
 *   3：添加进集合
 *   4：遍历
 * @author zj
 */
public class ListDemo2 {
	public static void main(String[] args) {
//		 1创建集合对象
		List c = new ArrayList();
		Book b = new Book("java","1007",40.0);
		Book b2 = new Book("c","1002",50.0);
		Book b3 = new Book("故事会","1003",20.0);
		Book b4 = new Book("读者","1004",5.0);
		//		 *   3：添加进集合
		c.add(b);
		c.add(b2);
		c.add(b3);
		c.add(b4);
//		 *   4：遍历
		Iterator it = c.iterator();
		while(it.hasNext()) {
			// 这个时候是多态  多态的特点 不能访问子类特有方法
			Object obj = it.next();
			// 非要访问  向下转型
			Book book = (Book) obj;
			System.out.println(book.getBid()+"--"+book.getName());
			
		}
		
		}

	}


