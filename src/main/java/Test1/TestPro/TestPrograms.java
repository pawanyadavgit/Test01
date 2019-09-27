//package Test1.TestPro;
//
//import java.io.BufferedInputStream;
//import java.io.BufferedReader;
//import java.io.File;
//import java.io.FileInputStream;
//import java.io.FileNotFoundException;
//import java.io.FileReader;
//import java.io.IOException;
//import java.io.InputStream;
//import java.io.InputStreamReader;
//import java.util.ArrayList;
//import java.util.Arrays;
//import java.util.Collections;
//import java.util.Comparator;
//import java.util.HashMap;
//import java.util.List;
//import java.util.Map;
//import java.util.Map.Entry;
//import java.util.Set;
//
//public class TestPrograms {
//
//	public static void main(String[] args) throws IOException {
////		getNoOfDuplicateWordsInFile();
//		pratikshaProgram();
//
//	}
//
//	private static void pratikshaProgram() {
//		int [] arr = {5,-4,8,6,0,-7,2};
//		List<Integer> lsPos = new ArrayList<Integer>();		
//		Map<Integer,Integer> map = new HashMap<>();
//		
//		for (int i = 0; i < arr.length; i++) {
//			if(arr[i]<0)
//			{
//				map.put(arr[i], i);
//			}
//			else{
//				lsPos.add(arr[i]);
//			}				
//		}
//		
//		Collections.sort(lsPos);		
//		Set<Entry<Integer, Integer>> s = map.entrySet();
//		for (Entry<Integer, Integer> entry : s) {
//			lsPos.add(entry.getValue(), entry.getKey());
//		}
//		
//		Integer[] newArr = (Integer[]) lsPos.toArray();		
//
//		
//		for (Object object : newArr) {
//			System.out.println(object);
//		}
//	}
//
//	private static void getNoOfDuplicateWordsInFile() throws IOException {
//		FileReader fr = new FileReader(new File("C://Users//pawan.yadav//Desktop//test.txt"));
//		
//		BufferedReader br = new BufferedReader(fr);
//		
//		String para1 = br.readLine();
//		StringBuilder sb = new StringBuilder();
//		StringBuffer sbfr = new StringBuffer();
//		String line;
//		while((line=br.readLine())!=null)
//		{
//			sbfr.append(line);
//			sbfr.append("\n");
//		}
//		fr.close();
//		String para = sbfr.toString();
//
//		String[] words = para.split(" ");
//
//		
//		Map<String,Integer> wordRep = new HashMap<String, Integer>();
//		
//		for (String word : words) {
//			if(wordRep.get(word) == null)
//			{
//				wordRep.put(word, 1);
//			}
//			else
//			{
//				wordRep.put(word, wordRep.get(word)+1);
//			}
//		}	
//
//		
//		List<Entry<String,Integer>> ls = new ArrayList<Map.Entry<String,Integer>>(wordRep.entrySet());
//		
//		Collections.sort(ls, Collections.reverseOrder(new Comparator<Entry<String, Integer>>() {
//
//			public int compare(Entry<String, Integer> o1, Entry<String, Integer> o2) {
//				return o1.getValue() - o2.getValue();
//			}			
//		}));
//		for (Map.Entry<String, Integer> entry:ls) {
//			System.out.println(entry);
//		}
//	}
//
//}
