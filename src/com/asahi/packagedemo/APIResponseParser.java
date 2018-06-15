package com.asahi.packagedemo;

import java.util.ArrayList;

public class APIResponseParser {
    
    /**
	 * Parses the input text and returns a Book instance containing
	 * the parsed data. 
	 * @param response text to be parsed
	 * @return Book instance containing parsed data
	 */
    public static Book parseXml(String response) {
        Book book = new Book();
        //String[] paramsList = {"best_book=id", "title","books_count", "author=name", "image_url", "small_image_url" };
        
        String[] paramsList = {"id", "title", "author=name", "small_image_url", "books_count", "ratings_count", "average_rating"};
        
        ArrayList<String> getResults = new ArrayList<String>();
		getResults = parse(response, paramsList); 
		
		System.out.println("Get book information from API response : " + getResults);
		//String title = "API Response";
	    //book.setTitle(title);
		
		// Your code
		return book;
    }
    
    private static ArrayList<String> parse(String response, String[] arrParamsList) {
    	
    	String defaultRes = response;
    	ArrayList<String> results = new ArrayList<String>();
    	
    	for(String getParam : arrParamsList) {
    		
    		String[] arrGetInnerParams = getParam.split("=");
    		int len = arrGetInnerParams.length;
    		
    		String parentTag = arrGetInnerParams[0];
    		
    		String innerTag = "";
    		if(len > 1 ) {
    			innerTag = arrGetInnerParams[1];
    		}
    		
			// TODO Auto-generated method stub
	    	String[] arrGetContentWithStartrule = defaultRes.split("<" + parentTag + ">");
	    	
	    	for(String getStr : arrGetContentWithStartrule) {
	    		
	    		// Checks the "title" word present in the string content;  
	    		if(getStr.contains(parentTag)) {
	    		
	    			//Split the string with "</title>" 
	    			String[] arrGetContentWithEndrule = getStr.split("</" + parentTag + ">");
	    		    
	    			//Logically the first element of array value has title content. Because of end rule split by "</title>"
		    		int i = 0;
	    			for(String getTagContent : arrGetContentWithEndrule) {
		    			if(i == 0) {
		    				if(innerTag != null) {
		    					//ArrayList<String> getResults = new ArrayList<String>();
		    					
		    					String[] innerParamsList = {innerTag};
		    					//getInnerTag(getTagContent, innerParamsList);
		    					results.add(new String( getInnerTag(getTagContent, innerParamsList )));
		    				}else {
		    				   results.add(new String(getTagContent));
		    				}
		    				break;
		    			}
		    		}
	    		}
	    	}
    	}
    	
		return results;
	}
    
    
private static String getInnerTag(String response, String[] arrParamsList) {
    	
    	String defaultRes = response;
    	
    	ArrayList<String> innerTagResults = new ArrayList<String>();
       	
    	String getInnerTagContent = "";
    	
    	for(String getParam : arrParamsList) {
    		
    		String innerTag = getParam;
    		
			// TODO Auto-generated method stub
	    	String[] arrGetContentWithStartrule = defaultRes.split("<" + innerTag + ">");
	    	
	    	for(String getStr : arrGetContentWithStartrule) {
	    		
	    		// Checks the "title" word present in the string content;  
	    		if(getStr.contains(innerTag)) {
	    		
	    			//Split the string with "</title>" 
	    			String[] arrGetContentWithEndrule = getStr.split("</" + innerTag + ">");
	    		    
	    			//Logically the first element of array value has title content. Because of end rule split by "</title>"
		    		int i = 0;
	    			for(String getTagContent : arrGetContentWithEndrule) {
		    			if(i == 0) {
		    				getInnerTagContent = getTagContent;
		    				innerTagResults.add(new String(getTagContent));
		    				break;
		    			}
		    		}
	    		}
	    	}
    	}
    	int len = innerTagResults.size();
    	if(len > 1) {
    		
    		StringBuilder sb = new StringBuilder();
    		for (String s : innerTagResults)
    		{
    		    sb.append(s);
    		    sb.append(",");
    		}
    		getInnerTagContent = sb.toString();
    		getInnerTagContent = getInnerTagContent.substring(0, getInnerTagContent.length() - 1);
    	}
    	
    	getInnerTagContent = (getInnerTagContent != null) ? getInnerTagContent : ""; 
    	
		return getInnerTagContent;
	}

	// write overloaded parse method with the 3 parameters response, startRule, endRule
    
    public void accessApiResponse() {
		String response = "<work>" + 
	                            "<id>2361393</id>" +
	                            "<books_count>813</books_count>" +
	                            "<ratings_count>1,16,315</ratings_count>" + 
	                            "<text_reviews_count>3439</text_reviews_count>" +
	                            "<original_publication_year>1854</original_publication_year>" +
								"<original_publication_month>" +
								"</original_publication_month>" +
								"<original_publication_day>" +
								"</original_publication_day>" +
								"<average_rating>3.79</average_rating>" +
								"<best_book>" +
									"<id>16902</id>" +
									"<title>Walden</title>" + 
									"<author>" +
									    "<id>12602</id>" +
										"<name>Henry David Thoreau</name>" + 
									"</author>" +
									"<image_url>" + 
										"http://images.gr-assets.com/books/1465675526m/16902.jpg" +
									"</image_url>" +
									"<small_image_url>" + 
										"http://images.gr-assets.com/books/1465675526s/16902.jpg" +
									"</small_image_url>" +
								"</best_book>" +
							"</work>";
		
		APIResponseParser.parseXml(response);
	}
}
