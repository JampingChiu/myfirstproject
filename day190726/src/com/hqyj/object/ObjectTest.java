package com.hqyj.object;
/**
 * 泛型类的测试类
 * @author zj
 *
 */
public class ObjectTest {
	public static void main(String[] args) {
//		ObjectTool obj = new ObjectTool();
//		obj.setObj("hello");
//		System.out.println(obj.getObj());
		
		//其实ArrayList 底层就是一个泛型类
		ObjectTool<String> obj = new ObjectTool<String>();
		obj.setObj("hello");
		System.out.println(obj.getObj());
		
		ObjectTool<Integer> obj2 = new ObjectTool<Integer>();
		obj2.setObj(100);
		System.out.println(obj2.getObj());
		
		
	}

}
