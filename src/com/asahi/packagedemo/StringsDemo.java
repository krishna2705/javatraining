package com.asahi.packagedemo;

public class StringsDemo {
	
	public void stringExamples() {
		String s = "Hello";
		String s1 = "Hello";
		String s2 = "Hello";
		String s3 = "Hello".intern();
		String s4 = new String("Hello");
		String s5 = "lo";
		
	    System.out.println("String length ==== " + s.length()); 
	    System.out.println("String empty check ==== " + s.isEmpty()); 
	    
	    System.out.println("String equals s1 == s2 : " + (s1 == s2));
	    System.out.println("String equals s == s3 : " + (s == s3));
	    System.out.println("String equals s == s4 : " + (s == s4));
	    System.out.println("String equals s == s4.intern() : " + (s == s4.intern()));
	    System.out.println("String equals s == \"Hello\" : " + (s == "Hello"));
	    System.out.println("String equals s == \"Hel\" + s5 : " + (s == "Hel" + s5));
	    
	    System.out.println("String ignorecase ==== " + s.equalsIgnoreCase("HELLO WORLD")); 
	    System.out.println("String compare ==== " + s.compareTo("HELLO WORLD"));
	    System.out.println("String contains ==== " + s.contains("HELLO WORLD"));
	    System.out.println("String contains ==== " + s.contains("WORLD"));
	    System.out.println("String startsWith ==== " + s.startsWith("HELLO WORLD"));
	    System.out.println("String startsWith ==== " + s.startsWith("H"));
	    System.out.println("String endsWith ==== " + s.endsWith("d"));
	    System.out.println("String indexOf ==== " + s.indexOf('W'));
	    System.out.println("String lastIndexOf ==== " + s.lastIndexOf('l'));
	    
	    String[] reformat = s.split(" ");
	    for(String newFormat : reformat) {
	    	System.out.println("String split array ==== " + newFormat);
	    }
	}
	
	public void stringBufferExamples() {
		
		String str = "Hello World!";
		StringBuffer sb = new StringBuffer(str);
		sb.append(" Good").append(" Morning :) ");
		System.out.println("String Buffer Output ===== "+ sb.toString());
		sb.delete(1,5);
		System.out.println("String Buffer Delete Output ===== "+ sb.toString());
		sb.insert(1, "Hai");
		System.out.println("String Buffer insert Output ===== "+ sb.toString());
		sb.reverse();
		System.out.println("String Buffer reverse Output ===== "+ sb.toString());
	}

} 
 