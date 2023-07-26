package com.data;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.concurrent.CopyOnWriteArraySet;

public class CollectionImpl {
	public static void main(String[] args) {
		CopyOnWriteArraySet<String> set = new CopyOnWriteArraySet<String>();
		set.add("Lambda");
		set.add("Kourav");
		System.out.println("set :" + set);
		

		Map<String, Integer> map = new HashMap<String,Integer>();
		map.put("Syan", 101);
		map.put("Ram", 102);
		System.out.println("Map :" + map);

		List<String> list = new ArrayList<String>();
		list.add("Ganesh");
		list.add("113");
		System.out.println("list :" + list);
		Iterator<String> iterate1 = list.iterator();
		System.out.println("Iterating String list the program:");
		while (iterate1.hasNext()) {
			System.out.print(iterate1
					.next() + ", ");
		
		}
		System.out.println(set);

		Iterator<String> iterate = set.iterator();
		System.out.println("Iterating String Set the program:");
		while (iterate.hasNext()) {
			System.out.print(iterate.next() + ", ");
			set.remove("Lambda");
		}
		System.out.println(set);
		
		Iterator<Entry<String, Integer>> iterator = map.entrySet().iterator();

		while (iterator.hasNext()) {
			Entry<String, Integer> next = iterator.next();
			System.out.println("We have Key :"+next.getKey());
			System.out.println("We have Value :"+next.getValue());
			
		}
		
	}
}