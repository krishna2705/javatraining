package com.asahi.thrillio;

import com.asahi.thrillio.constants.KidFriendlyStatus;
import com.asahi.thrillio.constants.UserType;
import com.asahi.thrillio.controllers.BookmarkController;
import com.asahi.thrillio.entities.Bookmark;
import com.asahi.thrillio.entities.User;
import com.asahi.thrillio.partner.Shareable;

public class View {
    public static void browse(User user, Bookmark[][] bookmarks) {
    	 System.out.println("\n" + user.getEmail() + " is bookmarking ");
    	 
    	 int bookMarkCount = 0;
    	 for(Bookmark[] bookmarkList : bookmarks) {
    		  for(Bookmark bookmark : bookmarkList) {
    			  //Bookmarking
    			  if( bookMarkCount < DataStore.USER_BOOKMARK_LIMIT ) {
    				  boolean isBookmarked = getBookmarkingDecision(bookmark);
    				  if(isBookmarked) {
    					  bookMarkCount++;
    					  BookmarkController.getInstance().saveUserBookmark(user, bookmark);
    					  System.out.println("New Item Bookmarked -->> " + bookmark);
    				  }
    			  }
    			  
    			//Mark as kid-friendly
     	    	 if(user.getUserType().equals(UserType.EDITOR)|| user.getUserType().equals(UserType.CHIEF_EDITOR )) {
     	    		 if( bookmark.isKidFriendlyEligible() && bookmark.getKidFriendlyStatus().equals(KidFriendlyStatus.UNKNOWN)) {
     	    			 String kidFriendlyStatus = getKidFriendlyStatusDecision(bookmark);
     	    			 if(!kidFriendlyStatus.equals(KidFriendlyStatus.UNKNOWN)) {
     	    				 BookmarkController.getInstance().setKidFriendlyStatus(user, kidFriendlyStatus, bookmark);
     	    			 }
     	    		 }
     	    	 }
     	    	 
     	    	 //Sharing!!
     	    	 if(bookmark.getKidFriendlyStatus().equals(KidFriendlyStatus.APPROVED)
     	    			 && bookmark instanceof Shareable) {
     	    		 boolean isShared = getShareDecision();
     	    		 if(isShared) {
     	    			BookmarkController.getInstance().share(user, bookmark);
     	    		 }
     	    	 }
    		  }
    		
    	 }
    	 
    	 /*for(int i=0; i<DataStore.USER_BOOKMARK_LIMIT; i++) {
    		 int typeOffset =  (int)(Math.random() * DataStore.BOOKMARK_TYPES_COUNT);
    		 int bookmarkOffset = (int)(Math.random() * DataStore.BOOKMARK_COUNT_PER_TYPE);
    		 Bookmark bookmark = bookmarks[typeOffset][bookmarkOffset];
    		 BookmarkController.getInstance().saveUserBookmark(user, bookmark);
    	 }*/
    }

	private static boolean getShareDecision() {
		// TODO Auto-generated method stub
		return Math.random() < 0.5 ? true : false;
	}

	private static String getKidFriendlyStatusDecision(Bookmark bookmark) {
		// TODO Auto-generated method stub
		
		return  Math.random() < 0.4 ? KidFriendlyStatus.APPROVED 
				: ( Math.random() > 0.4 && Math.random() < 0.8 ) ? KidFriendlyStatus.APPROVED 
				: KidFriendlyStatus.UNKNOWN ;
			
	}

	private static boolean getBookmarkingDecision(Bookmark bookmark) {
		// TODO Auto-generated method stub
		return Math.random()  > 0.5 ? true : false;
	}
}
