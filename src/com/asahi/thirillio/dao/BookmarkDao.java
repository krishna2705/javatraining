package com.asahi.thirillio.dao;

import com.asahi.thrillio.DataStore;
import com.asahi.thrillio.entities.Bookmark;
import com.asahi.thrillio.entities.UserBookmark;
public class BookmarkDao {
   public Bookmark[][] getBookmarks(){
	   return DataStore.getBookmarks();
   }
   
   public void saveUserBookmark(UserBookmark userBookmark) {
	   DataStore.add(userBookmark);
   }
}
