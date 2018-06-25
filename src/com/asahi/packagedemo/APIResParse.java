package com.asahi.packagedemo;

public class APIResParse {
    
    /**
	 * Parses the input text and returns a Book instance containing
	 * the parsed data. 
	 * @param response text to be parsed
	 * @return Book instance containing parsed data
	 */
    public static Book parse(String response) {
       Book book = new Book();
		String endRule = "<";
		
		String startRule = "<title>";		
		String title = parse(response, startRule, endRule); 
	    book.setTitle(title);
	    		
		return book;
    }
    
    public static String parse(String response, String startRule, String endRule ){
         
        String output = "";	
   	  		
   		String[] arrContent = startRule.split("<");
   		
   		String[] arrGetContentWithStartrule = response.split( startRule );
   		
   		for(String getStr : arrGetContentWithStartrule) {
    		
   			String endCon = endRule + "/" + arrContent[1];
    		// Checks the "title" word present in the string content;  
    		if(getStr.contains(endCon)) {
    		
    			//Split the string with "</title>" 
    			String[] arrGetContentWithEndrule = getStr.split(endCon);
    			
    			//Logically the first element of array value has title content. Because of end rule split by "</title>"
	    		int i = 0;
    			for(String getTagContent : arrGetContentWithEndrule) {
	    			if(i == 0) {
	    				output = getTagContent;
	    				break;
	    			}
	    		}
    		}
    	}
   		
		return output;
    }
    
    // write overloaded parse method with the 3 parameters response, startRule, endRule
    
    public static void main(String[] args) {
		String response = "<work>" + 
	                            "<id type=\"integer\">2361393</id>" +
	                            "<books_count type=\"integer\">813</books_count>" +
	                            "<ratings_count type=\"integer\">1,16,315</ratings_count>" + 
	                            "<text_reviews_count type=\"integer\">3439</text_reviews_count>" +
	                            "<original_publication_year type=\"integer\">1854</original_publication_year>" +
								"<original_publication_month type=\"integer\" nil=\"true\"/>" +
								"<original_publication_day type=\"integer\" nil=\"true\"/>" +
								"<average_rating>3.79</average_rating>" +
								"<best_book type=\"Book\">" +
									"<id type=\"integer\">16902</id>" +
									"<title>Walden</title>" + 
									"<author>" +
										"<id type=\"integer\">10264</id>" + 
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
		
		APIResParse.parse(response);
	}
}