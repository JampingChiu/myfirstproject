package com.hqyj.object2;
import com.hqyj.listson.Book;
/**
 * 泛型类的测试类
 * @author zj
 *
 */
public class ObjectTest {
	public static void main(String[] args) {
//		ObjectTool obj = new ObjectTool();
//		obj.show("hello");
//		obj.show(100);
		
//		ObjectTool<String> obj = new ObjectTool<String>();
//		obj.show("hello");
//		ObjectTool<Integer> obj2 = new ObjectTool<Integer>();
//		obj2.show(10);
	
		Book book = new Book();
		// 谁说我的方法的参数必须和定义的类的参数一样
		ObjectTool obj = new ObjectTool();
		// 集合里的add方法其实就是一个泛型方法
		obj.show("hello");
		obj.show(12);
		obj.show(12);
		obj.show(book);
	}
}
