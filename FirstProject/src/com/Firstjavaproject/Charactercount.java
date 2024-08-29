package com.Firstjavaproject;
import java.util.HashMap;
import java.util.Map;

public class Charactercount {
	
	static void IdentifyCharactercount(String s)
	{
		HashMap<Character, Integer> map = new HashMap<>();
		char[] stringarray = s.toCharArray();
		//System.out.println(stringarray);
		
		for(char c:stringarray)
		{
			if(map.containsKey(c))
			{
				map.put(c, map.get(c)+1);
			}
			else
				map.put(c, 1);
		}
		
		
		for (Map.Entry entry : map.entrySet()) {
            System.out.println(entry.getKey() + " " + entry.getValue());
        }
	}

	public static void main(String[] args) {
		
		String str = "SATHYASHREE";
		IdentifyCharactercount(str);	
		
	}

}
