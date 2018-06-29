package com.asahi.packagedemo;

public class APIResParse {
	public static void main(String[] args){
    	StringBuilder sb = new StringBuilder("<work>");
        sb.append(" <id type=\"integer\">2361393</id>");
        sb.append(" <books_count type=\"integer\">813</books_count>");
        sb.append(" <ratings_count type=\"integer\">1,16,315</ratings_count> ");
        sb.append(" <text_reviews_count type=\"integer\">3439</text_reviews_count> ");
        sb.append(" <original_publication_year type=\"integer\">1854</original_publication_year>");
        sb.append(" <original_publication_month type=\"integer\" nil=\"true\"/>");
        sb.append(" <original_publication_day type=\"integer\" nil=\"true\"/>");
        sb.append(" <average_rating>3.79</average_rating>");
        sb.append(" <best_book type=\"Book\">");
        sb.append(" <id type=\"integer\">16902</id>");
        sb.append(" <title>Walden</title>");
        sb.append(" <author>");
        sb.append(" <id type=\"integer\">10264</id>");
        sb.append(" <name>Henry David Thoreau</name>"); 
        sb.append(" </author>");
        sb.append(" <image_url>http://images.gr-assets.com/books/1465675526m/16902.jpg</image_url>");
       	 sb.append(" <small_image_url>http://images.gr-assets.com/books/1465675526s/16902.jpg</small_image_url>");
       		 sb.append(" </best_book>"); 
       		 sb.append(" </work>");
       		 String response= sb.toString();
       		APIResParse.parse(response);
	}
    	
	/**
	 * Parses the input text and returns a Book instance containing the parsed
	 * data.
	 * 
	 * @param response
	 *            text to be parsed
	 * @return Book instance containing parsed data
	 */
	public static Book parse(String response) {
		Book book = new Book();
		String endRule = "</title>";

		String startRule = "<title>";
		String title = parse(response, startRule, endRule);
		book.setTitle(title);
		String endRule1 = "</name>";
		String startRule1 = "<name>";		
		String author = parse(response, startRule1, endRule1); 
	    book.setAuthor(author);
	    String endRule5 = "</image_url>";
	    String startRule5 = "<image_url>";		
		String imageUrl = parse(response, startRule5, endRule5); 
	    book.setImageUrl(imageUrl);
	   
	    String endRule3 = "</average_rating>";
	    String startRule3 = "<average_rating>";		
		String averageRating = parse(response, startRule3, endRule3); 
		double avgRating= Double.parseDouble(averageRating);
	    book.setAverageRating(avgRating);
	    
	    String endRule4 = "</ratings_count>";
	    String startRule4 = "<ratings_count type=\"integer\">";		
		String ratingsCount = parse(response, startRule4, endRule4); 
		int ratingCount= Integer.parseInt(ratingsCount.replaceAll(",", ""));
	    book.setRatingsCount(ratingCount);	
	    
	    String endRule2 = "</original_publication_year>";
	    String startRule2 = "<original_publication_year type=\"integer\">";		
		String publicationYear = parse(response, startRule2, endRule2); 
		int publicYear= Integer.parseInt(publicationYear);
	    book.setPublicationYear(publicYear);
	  
		return book;
     }


	private static String parse(String response, String startRule,String endRule) 
	{	
		String data=null;
        int startPos= (response.indexOf(startRule)+startRule.length());
        System.out.println("startPos: "+startPos);
        int endPos= response.indexOf(endRule);
        System.out.println(endPos);
        data= response.substring(startPos,endPos);
        System.out.println(data);
        return data;

	}
}