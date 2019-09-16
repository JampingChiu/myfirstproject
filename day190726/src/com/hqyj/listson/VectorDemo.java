package com.hqyj.listson;

import java.util.Enumeration;
import java.util.Vector;

import com.hqyj.collection.Book;

/**
 * 
 * Vector类概述
	底层数据结构是数组，查询快，增删慢
	线程安全，效率低
	Vector类特有功能
	public void addElement(E obj)         --add
	public E elementAt(int index)         ---get()  
	public Enumeration elements()       --Iterator

存储自定义对象
 * @author zj
 *
 */
public class VectorDemo {
	public static void main(String[] args) {
		Vector<Book> v= new Vector<Book>();
		Book b = new Book("java","1007",40.0);
		Book b2 = new Book("c","1002",50.0);
		Book b3 = new Book("故事会","1003",20.0);
		Book b4 = new Book("读者","1004",5.0);
		v.addElement(b);
		v.addElement(b2);
		v.addElement(b3);
		v.addElement(b4);
		//遍历
		Enumeration<Book> em = v.elements();
		while(em.hasMoreElements()) {
			Book book = em.nextElement();
//			Object obj = em.nextElement();
//			//为了使用book里的方法向下转型
//			Book book = (Book) obj;
			System.out.println(book.getBid());
		}
		
	}

}
