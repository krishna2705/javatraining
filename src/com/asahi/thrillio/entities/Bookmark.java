package com.asahi.thrillio.entities;

import com.asahi.thrillio.constants.KidFriendlyStatus;

public abstract class Bookmark {
	
	private long id;
	private String title;
	private String profileUrl;
	private String kidFriendlyStatus = KidFriendlyStatus.UNKNOWN;  // unknown, approved, rejected
	private User kidFriendlyMarkedBy;
	private User sharedBy;
	
	public long getId() {
		return id;
	}
	public void setId(long id) {
		this.id = id;
	}
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public String getProfileUrl() {
		return profileUrl;
	}
	public void setProfileUrl(String profileUrl) {
		this.profileUrl = profileUrl;
	}
	@Override
	public String toString() {
		return "Bookmark [id=" + id + ", title=" + title + ", profileUrl=" + profileUrl + "]";
	}
	
	public abstract boolean isKidFriendlyEligible();
	
	public String getKidFriendlyStatus() {
		return kidFriendlyStatus;
	}
	public void setKidFriendlyStatus(String kidFriendlyStatus) {
		this.kidFriendlyStatus = kidFriendlyStatus;
	}
	/**
	 * @return the kidFriendlyMarkedBy
	 */
	public User getKidFriendlyMarkedBy() {
		return kidFriendlyMarkedBy;
	}
	/**
	 * @param kidFriendlyMarkedBy the kidFriendlyMarkedBy to set
	 */
	public void setKidFriendlyMarkedBy(User kidFriendlyMarkedBy) {
		this.kidFriendlyMarkedBy = kidFriendlyMarkedBy;
	}
	/**
	 * @return the sharedBy
	 */
	public User getSharedBy() {
		return sharedBy;
	}
	/**
	 * @param sharedBy the sharedBy to set
	 */
	public void setSharedBy(User sharedBy) {
		this.sharedBy = sharedBy;
	}
	
}
