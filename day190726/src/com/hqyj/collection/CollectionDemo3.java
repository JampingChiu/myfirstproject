package com.hqyj.collection;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
/**
 *  自定义对象存储并遍历     
 *  步骤：
 *   1创建集合对象
 *   2：创建自定义对象
 *   3：添加进集合
 *   4：遍历
 * @author zj
 */
public class CollectionDemo3 {
	public static void main(String[] args) {
//		 1创建集合对象
		Collection c = new ArrayList();
//		 *   2：创建自定义对象
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
			Object obj = it.next();
			// 想看每本书的价格  但是我不适应toString  怎么实现？
			// 向下转型  当想用子类的方法的时候  就必须向下转型 格式：目标数据类型   变量名  =（目标数据类型）值；
			// 现在向下转型难受没关系， 以后我们不会再转， 
			Book book = (Book) obj;
			System.out.println(book.getName()+"--"+book.getBid()+"--"+book.getPrice());
		}

	}

}
