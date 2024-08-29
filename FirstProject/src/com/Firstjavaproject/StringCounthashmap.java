package com.Firstjavaproject;
import java.util.*;

public class StringCounthashmap {	

	public static void main(String[] args) {
		String str = "TOM IS A TOM BOY TOM BOY";
		HashMap <String, Integer> map = new HashMap<>();
		String [] newString = str.split(" ");
		//System.out.println(newString.length);
		
		for(String words: newString)
			
		{
			if(map.containsKey(words))
			{
				//System.out.println(words);
				//System.out.println(map.get(words));
				map.put(words, map.get(words)+1);
			}
			else
				map.put(words, 1);
		}
				
		//System.out.println(map);
		for(String s: map.keySet())
		{
			System.out.print(s + "\t");
			System.out.println(map.get(s));
		}

}
	}
