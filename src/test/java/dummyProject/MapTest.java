package dummyProject;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.TreeMap;

public class MapTest {
	//If we want to represent a group of individual object as 
	//key - value pair, then we can use map
	//Internally uses Hashtable mechanism to store data
//	Map(I)-> HashMap(C)->TreeMap(C), LinkedHashMap(C)
	public static void main(String s[])
	{
		//Insertion order is not preserved
//		Map<String,Integer> m = new HashMap<String,Integer>();
		//Insertion order will be preserved with LinkedHashMap
//		Map<String,Integer> m = new LinkedHashMap<String,Integer>();
		//In Treemap, Key will be sorted and null values are not allowed
		Map<String,Integer> m = new TreeMap<String,Integer>();
		
		m.put("India", 1);
		m.put("USA", 2);
		m.put("UK", 3);
		m.put(null, null);
		System.out.println(m);
		for(Entry<String, Integer> i:m.entrySet())
		{
			System.out.println(i.getKey()+"  "+ i.getValue());
		}
		
	}

}
