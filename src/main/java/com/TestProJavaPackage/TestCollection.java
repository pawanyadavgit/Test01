package com.TestProJavaPackage;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Hashtable;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class TestCollection {

	public static void main(String[] args) {
		
//		testSet();
//		testMap();
//		testList();
		testHashTable();
	
	}

	private static void testHashTable() {
		Hashtable<String, Integer> ht = new Hashtable<String, Integer>();
		ht.put("ssf", 1);
		ht.put("jkl", 2);
		ht.put("fdg", 6);
		
		Iterator<Entry<String,Integer>> it = ht.entrySet().iterator();
		
		while(it.hasNext())
		{
			System.out.println(it.next());
		}
		
//		for (Entry<String, Integer> et : ht.entrySet()) {
//			System.out.println(et);
//		}
		
	}

	private static void testList() {
		List<Integer> ls = new ArrayList<Integer>();
		ls.add(5);
		ls.add(52);
		ls.add(4);
		ls.add(63);
//		String[] arr = {"sdsd","sdswd"};
		
		Integer [] arr = ls.toArray(new Integer[0]);
		
		for(Integer s: arr)
		{
			System.out.println(s);
		}
		
	}

	private static void testMap() {
		Map<Integer , String> m = new HashMap<Integer, String>();
		m.put(1, "aaa");		
		m.put(3, "bbb");
		m.put(2, "ccc");
		
		System.out.println(m.get(null));
		
		List <Entry<Integer, String>> ls = new ArrayList<Entry<Integer,String>>(m.entrySet());
	
//		Collections.sort(ls, new Comparator<Entry<Integer, String>>() {
//
//			public int compare(Entry<Integer, String> o1, Entry<Integer, String> o2) {
//				return o1.getValue().compareToIgnoreCase(o2.getValue());
//			}
//			
//		});
//		for (Entry<Integer, String> entry : ls) {
//			System.out.println(entry);
//		}		
		
		
//		Set<Entry<Integer, String>> s = m.entrySet();
//		for (Map.Entry obj : s) {
//			System.out.println(obj);
//		}
		
		
	}

	private static void testSet() {
//		Set<String> s = new HashSet<String>();
		Set<String> s = new LinkedHashSet<String>();
//		Set<String> s = new TreeSet<String>();
		s.add("one");
		s.add("two");		
		s.add("three");
		s.add("four");
		
		
		
//		Iterator<String> itr = s.iterator();
//		while(itr.hasNext())
//		{
//			System.out.println(itr.next());
//		}
		
		for (String ele : s) {
			System.out.println(ele);
		}
		
	}

}
