package com.hqyj.listson;

import java.util.ArrayList;

public class ArrayListDemo2 {

	public static void main(String[] args) {
		ArrayList<String> list = new ArrayList<String>();
		list.add("hello");
		list.add("hello2");
		list.add("hello");
		//
		list = null;
		if(list != null) {
			for(String s:list) {
				System.out.println(s);
			}
		}else {
			System.out.println("null");
		}
		

	}

}
