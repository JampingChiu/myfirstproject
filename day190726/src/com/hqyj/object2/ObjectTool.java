package com.hqyj.object2;
/**
 *  泛型方法
 *  定义格式：
 *  public <T> void show(T s) {
		System.out.println(s);
	}
 *
 * @author zj
 */

public class ObjectTool{
	
	public <T> void show(T s) {
		System.out.println(s);
	}
}
//public class ObjectTool<T> {
//	public void show(T s) {
//		System.out.println(s);
//	}
//}



//public class ObjectTool {
//
//	public void show(String s) {
//		System.out.println(s);
//	}
//	public void show(int s) {
//		System.out.println(s);
//	}
//}
