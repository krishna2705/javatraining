package com.asahi.thrillio.managers;

import com.asahi.thirillio.dao.BookmarkDao;
import com.asahi.thrillio.entities.Book;
import com.asahi.thrillio.entities.Bookmark;
import com.asahi.thrillio.entities.Movie;
import com.asahi.thrillio.entities.User;
import com.asahi.thrillio.entities.UserBookmark;
import com.asahi.thrillio.entities.WebLink;

public class BookmarkManager {
	
	private static BookmarkManager instance = new BookmarkManager();
	private static BookmarkDao dao = new BookmarkDao();
    private BookmarkManager() {}
    
    public static BookmarkManager getInstance() {
    	return instance;
    }
    
    public Movie createMovie(long id, String title, String profileUrl, int releaseYear, String[] cast, String[] directors,
    String genre, double imdbRating) {
    	
    	Movie movie = new Movie();
    	movie.setId(id);
    	movie.setTitle(title);
    	movie.setProfileUrl(profileUrl);
    	movie.setReleaseYear(releaseYear);
    	movie.setCast(cast);
    	movie.setDirectors(directors);
    	movie.setGenre(genre);
    	movie.setImdbRating(imdbRating);
    	
    	return movie;
    	
    }
    
    public WebLink createWebLink(long id, String title, String profileUrl, String url, String host ) {
		
		WebLink weblink = new WebLink();
		weblink.setId(id);
		weblink.setTitle(title);
		weblink.setProfileUrl(profileUrl);
		weblink.setUrl(url);
		weblink.setHost(host);
		
		return weblink;
	}
    
    public Book createBook(long id, String title, String profileUrl, int publicationYear, String publisher, String[] authors,
		    String genre, double amazonRating) {
		    	
		Book book = new Book();
		book.setId(id);
		book.setTitle(title);
		book.setProfileUrl(profileUrl);
		book.setPublicationYear(publicationYear);
		book.setPublisher(publisher);
		book.setAuthors(authors);
		book.setGenre(genre);
		book.setAmazonRating(amazonRating);
		return book;
		    	
	}
    
    public Bookmark[][] getBookmarks(){
    	return dao.getBookmarks();
    }
    
    public void saveUserBookmark(User user, Bookmark bookmark) {
    	UserBookmark userBookmark = new UserBookmark();
    	userBookmark.setUser(user);
    	userBookmark.setBookmark(bookmark);
    	dao.saveUserBookmark(userBookmark);
    }

	public void setKidFriendlyStatus(User user, String kidFriendlyStatus, Bookmark bookmark) {
		// TODO Auto-generated method stub
		bookmark.setKidFriendlyStatus(kidFriendlyStatus);
		bookmark.setKidFriendlyMarkedBy(user);
		System.out.println("Kid-friendly status : " + kidFriendlyStatus + ", Marked by: " + user.getEmail() + ", "+ bookmark);
	}

	public void share(User user, Bookmark bookmark) {
		// TODO Auto-generated method stub
		bookmark.setSharedBy(user);
		System.out.println("Data to be shared by : ");
		
		if(bookmark instanceof Book) {
			System.out.println(((Book)bookmark).getItemData());
		}else if(bookmark instanceof WebLink) {
			System.out.println(((WebLink)bookmark).getItemData());
		}
		
	}
}
