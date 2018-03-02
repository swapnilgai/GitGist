package com.java.gitgist.model.temp;

import com.google.gson.annotations.SerializedName;

public class HistoryItem{

	@SerializedName("committed_at")
	private String committedAt;

	@SerializedName("change_status")
	private ChangeStatus changeStatus;

	@SerializedName("user")
	private User user;

	@SerializedName("version")
	private String version;

	@SerializedName("url")
	private String url;

	public void setCommittedAt(String committedAt){
		this.committedAt = committedAt;
	}

	public String getCommittedAt(){
		return committedAt;
	}

	public void setChangeStatus(ChangeStatus changeStatus){
		this.changeStatus = changeStatus;
	}

	public ChangeStatus getChangeStatus(){
		return changeStatus;
	}

	public void setUser(User user){
		this.user = user;
	}

	public User getUser(){
		return user;
	}

	public void setVersion(String version){
		this.version = version;
	}

	public String getVersion(){
		return version;
	}

	public void setUrl(String url){
		this.url = url;
	}

	public String getUrl(){
		return url;
	}
}