package com.Firstjavaproject;
import java.util.*;

public class HashMapStringCount {
	
	static void StringCount(String inputString)
	{
		HashMap<String, Integer> map = new HashMap<>();
		
		String[] words = inputString.split(" ");
		
		for(String word: words)
		{
			if (map.containsKey(word))
			{
				map.put(word, map.get(word)+1);
			}
			else
				map.put(word, 1);
		}

		for (String s: map.keySet())
		{
			System.out.print(s + "\t");
			System.out.println(map.get(s));
		}
		//System.out.println(map);
	}
	

	public static void main(String[] args) {
		String str = "SHE SELLS SEA SHELLS ON THE SEA SHORE";
		StringCount(str);

	}

}
