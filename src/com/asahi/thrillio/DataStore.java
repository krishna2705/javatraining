package com.asahi.thrillio;

import com.asahi.thrillio.constants.BookGenre;
import com.asahi.thrillio.constants.Gender;
import com.asahi.thrillio.constants.UserType;
import com.asahi.thrillio.entities.Bookmark;
import com.asahi.thrillio.entities.User;
import com.asahi.thrillio.entities.UserBookmark;
import com.asahi.thrillio.managers.BookmarkManager;
import com.asahi.thrillio.managers.UserManager;

public class DataStore {
  public static final int USER_BOOKMARK_LIMIT = 5;
  public static final int BOOKMARK_COUNT_PER_TYPE = 5;
  public static final int BOOKMARK_TYPES_COUNT = 3;
  public static final int TOTAL_USER_COUNT = 5;
  public static User[] users = new User[TOTAL_USER_COUNT];
  
  private static Bookmark[][] bookmarks = new Bookmark[BOOKMARK_TYPES_COUNT][BOOKMARK_COUNT_PER_TYPE];
  public static Bookmark[][] getBookmarks() {
		return bookmarks;
  }
  
  private static UserBookmark[] userBookmarks = new UserBookmark[TOTAL_USER_COUNT*USER_BOOKMARK_LIMIT];
  private static int bookmarkIndex = 0;
  
  public static User[] getUsers() {
	return users;
  }

 public static void loadData() {
	  loadUsers();
	  loadWeblinks();
	  loadMovies();
  }
  
  private static void loadUsers() {
	  users[0] = UserManager.getInstance().createUser(1000,	"user0@semanticsquare.com"	,"test",	"John",		"M",	Gender.MALE, UserType.USER);
	  users[1] = UserManager.getInstance().createUser(1001,	"user1@semanticsquare.com"	,"test1",	"John1",	"M",	Gender.MALE, UserType.USER);
	  users[2] = UserManager.getInstance().createUser(1002,	"user2@semanticsquare.com"	,"test2",	"John2",	"M",	Gender.MALE, UserType.EDITOR);
	  users[3] = UserManager.getInstance().createUser(1003,	"user3@semanticsquare.com"	,"test3",	"John3",	"M",	Gender.MALE, UserType.EDITOR);
	  users[4] = UserManager.getInstance().createUser(1004,	"user4@semanticsquare.com"	,"test4",	"John4",	"M",	Gender.MALE, UserType.CHIEF_EDITOR);
  }
  
  private static void loadWeblinks() {
	  bookmarks[0][0] = BookmarkManager.getInstance().createWebLink(2000, "Taming Tiger, Part 2", "profile", "http://www.javaworld.com/article/2072759/core-java/taming-tiger--part-2.html",	"http://www.javaworld.com");
	  bookmarks[0][1] = BookmarkManager.getInstance().createWebLink(2001, "How do I import a pre-existing Java project into Eclipse and get up and running?", "profile", "http://stackoverflow.com/questions/142863/how-do-i-import-a-pre-existing-java-project-into-eclipse-and-get-up-and-running",	"http://www.stackoverflow.com");
	  bookmarks[0][2] = BookmarkManager.getInstance().createWebLink(2002, "Interface vs Abstract Class", "profile", "http://mindprod.com/jgloss/interfacevsabstract.html",	"http://mindprod.com");
	  bookmarks[0][3] = BookmarkManager.getInstance().createWebLink(2003, "NIO tutorial by Greg Travis", "profile", "http://cs.brown.edu/courses/cs161/papers/j-nio-ltr.pdf",	"http://cs.brown.edu");
	  bookmarks[0][4] = BookmarkManager.getInstance().createWebLink(2004, "Virtual Hosting and Tomcat", "profile", "http://tomcat.apache.org/tomcat-6.0-doc/virtual-hosting-howto.html",	"http://tomcat.apache.org");
	  
  }
  
  private static void loadMovies() {
	  bookmarks[1][0] = BookmarkManager.getInstance().createMovie(3000, "Citizen Kane", "", 1941, new String[] { "Orson Welles" ,"Joseph Cotten" }, new String[] { "Orson Welles" }, BookGenre.PHILOSOPHY , 8.0  );
	  bookmarks[1][1] = BookmarkManager.getInstance().createMovie(3001, "Citizen Kane", "", 1942, new String[] { "Orson Welles" ,"Joseph Cotten" }, new String[] { "Orson Welles test" }, BookGenre.BIOGRAPHY , 5.0  );
	  bookmarks[1][2] = BookmarkManager.getInstance().createMovie(3002, "Citizen Kane", "", 1943, new String[] { "Orson Welles" ,"Joseph Cotten" }, new String[] { "Orson Welles asahi" }, BookGenre.CHILDREN , 7.0  );
	  bookmarks[1][3] = BookmarkManager.getInstance().createMovie(3003, "Citizen Kane", "", 1944, new String[] { "Orson Welles" ,"Joseph Cotten" }, new String[] { "Orson Welles welcome" }, BookGenre.RELIGION , 6.0  );
	  bookmarks[1][4] = BookmarkManager.getInstance().createMovie(3004, "Citizen Kane", "", 1945, new String[] { "Orson Welles" ,"Joseph Cotten" }, new String[] { "Orson Welles world" }, BookGenre.MYSTERY , 9.0  );
	  bookmarks[2][0] = BookmarkManager.getInstance().createMovie(3005, "Citizen Kane", "", 1946, new String[] { "Orson Welles" ,"Joseph Cotten" }, new String[] { "Orson Welles" }, BookGenre.PHILOSOPHY , 8.0  );
	  bookmarks[2][1] = BookmarkManager.getInstance().createMovie(3006, "Citizen Kane", "", 1947, new String[] { "Orson Welles" ,"Joseph Cotten" }, new String[] { "Orson Welles test" }, BookGenre.BIOGRAPHY , 5.0  );
	  bookmarks[2][2] = BookmarkManager.getInstance().createMovie(3007, "Citizen Kane", "", 1948, new String[] { "Orson Welles" ,"Joseph Cotten" }, new String[] { "Orson Welles asahi" }, BookGenre.CHILDREN , 7.0  );
	  bookmarks[2][3] = BookmarkManager.getInstance().createMovie(3008, "Citizen Kane", "", 1949, new String[] { "Orson Welles" ,"Joseph Cotten" }, new String[] { "Orson Welles welcome" }, BookGenre.RELIGION , 6.0  );
	  bookmarks[2][4] = BookmarkManager.getInstance().createMovie(3009, "Citizen Kane", "", 1950, new String[] { "Orson Welles" ,"Joseph Cotten" }, new String[] { "Orson Welles world" }, BookGenre.MYSTERY , 9.0  );
  }
  
  public static void add(UserBookmark userBookmark) {
	  userBookmarks[bookmarkIndex] = userBookmark;
	  bookmarkIndex++;
  }
}
