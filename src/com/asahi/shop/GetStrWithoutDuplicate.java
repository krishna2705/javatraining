package com.asahi.shop;

import java.util.HashMap;
import java.util.Map;

public class GetStrWithoutDuplicate {
    	
	public void getStrWithoutDuplicate(String name, int pos) {
		
		Map<Character, Integer> charMap = new HashMap<Character, Integer>();
	
	    char[] arr = name.toCharArray();
	    StringBuilder newStr = new StringBuilder();

	    for (char value: arr) {   	
    	   value = Character.toLowerCase(value);
           if (charMap.containsKey(value)) {
               charMap.put(value, charMap.get(value) + 1);
           } else {
               charMap.put(value, 1);
           }
	    }
	    
	    
	    System.out.println("Without duplicate string =========  : " + charMap);
	    
	    for(Map.Entry<Character, Integer> entry : charMap.entrySet()) {
	    	Character key = entry.getKey();
	    	Integer uniqueValue = entry.getValue();
	    	if(uniqueValue == 1) {
	           newStr.append(key);
	    	}
	    }
	    
	    String filterStr = newStr.toString();
	    	    
	    //System.out.println("Without duplicate string =========  : " + filterStr);
	    
        try {
    	  char checkVal =  filterStr.charAt(pos);
    	  System.out.println(name + " : Get index value after removed duplicate string. " + checkVal);
        }
        catch (Exception e) {
    	  System.out.println("Index = '"+ pos +"' Char of given index not present after removed duplicate string ");
        } 
	}
	
	public static void main(String[] args) {
	
		String name = "MISSISSIPPICITY";
		
		
		GetStrWithoutDuplicate strObj = new GetStrWithoutDuplicate();
		
		strObj.getStrWithoutDuplicate(name, 5);
	}
}
