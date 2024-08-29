package com.Programspractice;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;

public class ArrayListPractice {

	public static void main(String[] args) {
		List<String> al = new ArrayList<String>();
		
		al.add("1");
	
	al.add("Hello");
	System.out.println(al);
	
	ArrayList<String> al1 = new ArrayList<>();
	
	al1.add("This");
	al1.add("is");
	al1.add("a");
	al1.add("test");
	al1.add("array");
	al1.add("list");
	al1.add("array");
	al1.add("list");
	al1.add(null);
	al1.add(null);
	
	System.out.println(al1);
	
	//al1.remove(null);
	
	
	int n = al1.size();
	System.out.println(n);
	
	al1.add(0, "Hello!");
	
	al.addAll(al1);
	System.out.println("Adding collection al1 using add all" + al);
	
	System.out.println("If al1 list has word this " + al1.contains("This"));
	
	System.out.println("If al1 list has word Hi " + al1.contains("hi"));
	
	System.out.println(al1.isEmpty());
	
	System.out.println("if al1 contains all in al " + al1.containsAll(al));
	System.out.println("if al contains all in al1 " + al.containsAll(al1));
	
	System.out.println("Index of is" + al.indexOf("is"));
	
	System.out.println("Second" + al.get(2));
	
	for(String s: al1)
	{
		System.out.println(s);
		//System.out.print("\t");
	}
	
	System.out.println("-----------------------------------------");
	Iterator<String> iterator = al1.iterator();
	
	while(iterator.hasNext())
	{
		System.out.println(iterator.next());
	}
	
	ListIterator<String> iterator1 = al1.listIterator(al1.size());
	
	while(iterator1.hasPrevious())
	{
		System.out.println(iterator1.previous());
	}
		
	ArrayList<String> al2 = new ArrayList<>();
	al2 = (ArrayList) al1.clone();
	
	System.out.println("Arraylist2" + al2);
	
	System.out.println("if al2 contains all in al1 " + al2.containsAll(al1));
	
	}

}
