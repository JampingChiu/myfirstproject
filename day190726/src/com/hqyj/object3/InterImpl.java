package com.hqyj.object3;
/**
 * 第一种： 实现类已经知道了未来需要的数据类型
 * 第二种： 实现类目前也不知道未来的数据类型
 * @author zj
 *
 */
//public class InterImpl implements Inter<String> {
//
//	@Override
//	public void show(String t) {
//		System.out.println(t);
//		
//	}
//
//}

// 第二种： 实现类目前也不知道未来的数据类型
public class InterImpl<T> implements Inter<T> {

	@Override
	public void show(T t) {
		System.out.println(t);
		
	}


}
