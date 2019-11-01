package com.TestProJavaPackage;

import com.google.common.hash.HashCode;

public class TestString {
	
	public static void main(String[] args) {
		testHashcode();

	}

	private static void testHashcode() {
		String s = "infras";
//		HashCode hCode = HashCode.fromString(s);
		System.out.println(new TestString().hashCode());
	}

}
