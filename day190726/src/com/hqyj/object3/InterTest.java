package com.hqyj.object3;

public class InterTest {

	public static void main(String[] args) {
		//测试泛型接口
		InterImpl<String> in = new InterImpl<String>();
		in.show("hello");
// 这个其实就是List的底层 Set  Collection
		Inter<Integer> in2 = new InterImpl<Integer>();
		in2.show(100);
	}

}
