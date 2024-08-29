package com.Programspractice;

import java.util.HashMap;
import java.util.Map;

public class FindDuplicateString {

	public static void main(String[] args) {
		String str = "JAVA AGAIN IS JAVA AGAIN";
		
		HashMap <String, Integer> map = new HashMap<>();
		
		String[] nstr = str.split(" ");
	
		for(String s: nstr)
			
		{
			//System.out.println(s);
			
			if(map.containsKey(s))
			{
				map.put(s, map.get(s)+1);
			}
			else
				map.put(s,  1);
		}
		
		//System.out.println(map);
		
		for(Map.Entry<String, Integer> entry : map.entrySet())
		{
			if(entry.getValue() >1)
			{
				System.out.println(entry.getKey() + "-" + entry.getValue());
			}
		}
		
		/*for(String s: map.keySet())
		{
			System.out.print(s + "\t");
			System.out.println(map.get(s));
		}*/
	}

}
