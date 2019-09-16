package com.hqyj.listson;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/**
 * 集合是存储同一种数据类型的容器
 *ArrayList  集合特点：
 *  
 *   使用实现类创建对象  ArrayList
 *   
 *   当我给集合中添加Integer类型的数据的时候  并没有报错  但是当我运行后报错了，感觉不好
 *   String[] arr = {"h","h",2};
 *   集合模拟数组  让我再创建集合对象的时候就限定未来需要存储的数据类型
 *   这个就是泛型
 *   泛型：他是一个把数据类型当作参数传递的类型
 *   格式：<数据类型>
 *   泛型的好处：
 *    1：不需要强制类型转换了
 *    2: 解决了黄色警告
 *    3：把运行时期异常提前到编译时期
 * @author zj
 */
public class ArrayListDemo {

	public static void main(String[] args) {
		
		ArrayList<String> list = new ArrayList<String>();
		list.add("hello");
		list.add("hello2");
		list.add("hello");
		//list.add(10);
		//遍历
		Iterator<String> it = list.iterator();
		while(it.hasNext()) {
			String s = it.next();
			//Object obj = it.next();
			//想看字符串长度
			//向下转型
			//String s = (String)  obj;
			System.out.println(s+"--"+s.length());
		}
		
		


	}
	
}
