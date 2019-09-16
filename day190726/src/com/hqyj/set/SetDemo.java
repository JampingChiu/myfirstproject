package com.hqyj.set;

import java.util.HashSet;
import java.util.Set;

/**
 *  set 特点： 元素不能重复的collection集合且无序
 *   存入和取出顺序不一致，作为一个集合自己肯定有自己的排序方式，
 *    如果某一天你存入和取出顺序一致了，证明你是碰巧的，这个时候多测几次就好了
 *    
 *  因为Set是接口 使用接口多态来创建对象
 *   HashSet
 * @author zj
 *
 */
public class SetDemo {
	public static void main(String[] args) {
		 Set<String> set = new HashSet<String>();
		 //
		 set.add("hello3");
		 set.add("hello");
		 set.add("hello1");
		 set.add("hello1");
		 set.add("hello2");
		 
		 //遍历
		 for(String s:set) {
			 System.out.println(s);
		 }
		 
		
	}

}
