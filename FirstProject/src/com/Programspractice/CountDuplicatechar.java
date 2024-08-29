package com.Programspractice;

import java.util.HashMap;
import java.util.Map;

public class CountDuplicatechar {

	public static void main(String[] args) {
		String str = "SATHYASHREE";
		HashMap <Character,Integer> map = new HashMap<>();
		
		char[] ch = str.toCharArray();
		
		for (char c: ch)
		{
			if(map.containsKey(c))
			{
				map.put(c, map.get(c)+1);
			}
			else
				map.put(c, 1);
		}
		
		//System.out.println(map);
		
		for(Map.Entry <Character, Integer> entry : map.entrySet())
		{
			if(entry.getValue() >1 )
			{
			System.out.println(entry.getKey() + " - " + entry.getValue() + "times");
			}
		}
		
	}

}
