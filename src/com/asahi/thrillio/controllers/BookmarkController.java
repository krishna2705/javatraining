package com.asahi.thrillio.controllers;

import com.asahi.thrillio.entities.Bookmark;
import com.asahi.thrillio.entities.User;
import com.asahi.thrillio.managers.BookmarkManager;

public class BookmarkController {
    
	private static BookmarkController instance = new BookmarkController();
    
	private BookmarkController() {}
	
	public static BookmarkController getInstance() {
		return instance;
	}
	
	public void saveUserBookmark(User user, Bookmark bookmark) {
		 BookmarkManager.getInstance().saveUserBookmark(user, bookmark);
	}

	public void setKidFriendlyStatus(User user, String kidFriendlyStatus, Bookmark bookmark) {
		// TODO Auto-generated method stub
		BookmarkManager.getInstance().setKidFriendlyStatus(user, kidFriendlyStatus, bookmark);
	}

	public void share(User user, Bookmark bookmark) {
		// TODO Auto-generated method stub
		BookmarkManager.getInstance().share(user, bookmark);
	}
    
}
