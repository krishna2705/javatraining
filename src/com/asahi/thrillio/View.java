package com.asahi.thrillio;

import com.asahi.thrillio.controllers.BookmarkController;
import com.asahi.thrillio.entities.Bookmark;
import com.asahi.thrillio.entities.User;

public class View {
    public static void bookmark(User user, Bookmark[][] bookmarks) {
    	 System.out.println("\n" + user.getEmail() + " is bookmarking ");
    	 for(int i=0; i<=DataStore.USER_BOOKMARK_LIMIT-1; i++) {
    		 int typeOffset =  (int)(Math.random() * DataStore.BOOKMARK_TYPES_COUNT);
    		 int bookmarkOffset = (int)(Math.random() * DataStore.BOOKMARK_COUNT_PER_TYPE);
    		 Bookmark bookmark = bookmarks[typeOffset][bookmarkOffset];
    		 BookmarkController.getInstance().saveUserBookmark(user, bookmark);
    	 }
    }
}
