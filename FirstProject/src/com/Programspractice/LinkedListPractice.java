package com.Programspractice;

import java.util.LinkedList;
import java.util.List;

public class LinkedListPractice {

	public static void main(String[] args) {
		List<Integer> list = new LinkedList<>();
		list.add(45);
		list.add(54);
		list.add(12);
		list.add(null);
		
		System.out.println(list);
		
		list.add(3, 34);
		System.out.println(list);
		System.out.println(list.hashCode());
		System.out.println(list.get(3));
		System.out.println(list.indexOf(54));
		System.out.println(list.size());
		System.out.println(list.lastIndexOf(12));
		list.add(12);
		System.out.println(list);
		System.out.println(list.lastIndexOf(12));
		System.out.println(list.isEmpty());
		System.out.println(list.contains(12));
		System.out.println(list.set(0, 98));
		System.out.println(list);

	}

}
