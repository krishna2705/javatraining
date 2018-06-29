package com.asahi.thrillio;

import com.asahi.thrillio.entities.Bookmark;
import com.asahi.thrillio.entities.User;
import com.asahi.thrillio.managers.BookmarkManager;
import com.asahi.thrillio.managers.UserManager;

public class Launch {
	
	private static User[] users;
	private static Bookmark[][] bookmarks;
    
	private static void loadData() {
		
		System.out.println("1. Loading all data ...");
		
		DataStore.loadData();
		users = UserManager.getInstance().getUsers();
		bookmarks = BookmarkManager.getInstance().getBookmarks();
		
		System.out.println("\nPrinting Data ....\n");
		printUserData();
		printBookmarkData();
	}
	
	private static void printUserData() {	
		for(User user : users) {
			System.out.println(user);
		}
	}
	
	private static void printBookmarkData() {	
		for(Bookmark[] bookmarkList : bookmarks) {
			for(Bookmark bookmark : bookmarkList) {
			  System.out.println(bookmark);
			}
		}
	}
	
	private static void startBookmarking() {
		
		System.out.println("\n2. Bookmarking ...");
		for(User user : users) {
			View.browse(user, bookmarks);
		}
	}
	
	public static void main(String[] args) {
		loadData();
		startBookmarking();
	}
}
