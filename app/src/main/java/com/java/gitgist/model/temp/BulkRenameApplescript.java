package com.java.gitgist.model.temp;

import com.google.gson.annotations.SerializedName;

public class BulkRenameApplescript{

	@SerializedName("filename")
	private String filename;

	@SerializedName("size")
	private int size;

	@SerializedName("truncated")
	private boolean truncated;

	@SerializedName("language")
	private String language;

	@SerializedName("type")
	private String type;

	@SerializedName("raw_url")
	private String rawUrl;

	@SerializedName("content")
	private String content;

	public void setFilename(String filename){
		this.filename = filename;
	}

	public String getFilename(){
		return filename;
	}

	public void setSize(int size){
		this.size = size;
	}

	public int getSize(){
		return size;
	}

	public void setTruncated(boolean truncated){
		this.truncated = truncated;
	}

	public boolean isTruncated(){
		return truncated;
	}

	public void setLanguage(String language){
		this.language = language;
	}

	public String getLanguage(){
		return language;
	}

	public void setType(String type){
		this.type = type;
	}

	public String getType(){
		return type;
	}

	public void setRawUrl(String rawUrl){
		this.rawUrl = rawUrl;
	}

	public String getRawUrl(){
		return rawUrl;
	}

	public void setContent(String content){
		this.content = content;
	}

	public String getContent(){
		return content;
	}
}