package com.hqyj.object;
/**
 * 泛型类
 * 定义格式 
 *  class 类名<T>{}
 * @author zj
 */
public class ObjectTool<T> {
	private T obj;
	
   public void setObj(T t) {
	   obj  = t;
   }
   public T getObj() {
	   return obj;
   }
}
