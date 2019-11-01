package com.TestProJavaPackage;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class FileHandlingTest {

	public static void main(String[] args) throws IOException {
		try {
			
//			Method 01
//			FileInputStream fis = new FileInputStream(new File("C:\\Users\\pawan.yadav\\Desktop\\test.txt"));
//			BufferedReader br = new BufferedReader(new InputStreamReader(fis));
			
//			Method 02
			FileReader fr = new FileReader(new File("C:\\Users\\pawan.yadav\\Desktop\\test.txt"));
			BufferedReader br = new BufferedReader(fr);
			
			
			StringBuilder sb = new StringBuilder();
			String line;
			while ((line=br.readLine())!=null) {
				sb=sb.append(line);
				sb=sb.append("\n");
			}
			System.out.println(sb);
			
			
		} catch (FileNotFoundException e) {
			System.out.println("File not found-->"+e.getMessage());
		}
		System.out.println("Inside");
	}

}
