package com.java.gitgist.model.temp;

import java.util.List;
import com.google.gson.annotations.SerializedName;

public class ForkOf{

	@SerializedName("owner")
	private Owner owner;

	@SerializedName("forks")
	private List<ForksItem> forks;

	@SerializedName("commits_url")
	private String commitsUrl;

	@SerializedName("comments")
	private int comments;

	@SerializedName("forks_url")
	private String forksUrl;

	@SerializedName("git_push_url")
	private String gitPushUrl;

	@SerializedName("created_at")
	private String createdAt;

	@SerializedName("description")
	private String description;

	@SerializedName("truncated")
	private boolean truncated;

	@SerializedName("history")
	private List<HistoryItem> history;

	@SerializedName("url")
	private String url;

	@SerializedName("public")
	private boolean jsonMemberPublic;

	@SerializedName("updated_at")
	private String updatedAt;

	@SerializedName("html_url")
	private String htmlUrl;

	@SerializedName("git_pull_url")
	private String gitPullUrl;

	@SerializedName("comments_url")
	private String commentsUrl;

	@SerializedName("files")
	private Files files;

	@SerializedName("id")
	private String id;

	@SerializedName("user")
	private Object user;

	public void setOwner(Owner owner){
		this.owner = owner;
	}

	public Owner getOwner(){
		return owner;
	}

	public void setForks(List<ForksItem> forks){
		this.forks = forks;
	}

	public List<ForksItem> getForks(){
		return forks;
	}

	public void setCommitsUrl(String commitsUrl){
		this.commitsUrl = commitsUrl;
	}

	public String getCommitsUrl(){
		return commitsUrl;
	}

	public void setComments(int comments){
		this.comments = comments;
	}

	public int getComments(){
		return comments;
	}

	public void setForksUrl(String forksUrl){
		this.forksUrl = forksUrl;
	}

	public String getForksUrl(){
		return forksUrl;
	}

	public void setGitPushUrl(String gitPushUrl){
		this.gitPushUrl = gitPushUrl;
	}

	public String getGitPushUrl(){
		return gitPushUrl;
	}

	public void setCreatedAt(String createdAt){
		this.createdAt = createdAt;
	}

	public String getCreatedAt(){
		return createdAt;
	}

	public void setDescription(String description){
		this.description = description;
	}

	public String getDescription(){
		return description;
	}

	public void setTruncated(boolean truncated){
		this.truncated = truncated;
	}

	public boolean isTruncated(){
		return truncated;
	}

	public void setHistory(List<HistoryItem> history){
		this.history = history;
	}

	public List<HistoryItem> getHistory(){
		return history;
	}

	public void setUrl(String url){
		this.url = url;
	}

	public String getUrl(){
		return url;
	}

	public void setJsonMemberPublic(boolean jsonMemberPublic){
		this.jsonMemberPublic = jsonMemberPublic;
	}

	public boolean isJsonMemberPublic(){
		return jsonMemberPublic;
	}

	public void setUpdatedAt(String updatedAt){
		this.updatedAt = updatedAt;
	}

	public String getUpdatedAt(){
		return updatedAt;
	}

	public void setHtmlUrl(String htmlUrl){
		this.htmlUrl = htmlUrl;
	}

	public String getHtmlUrl(){
		return htmlUrl;
	}

	public void setGitPullUrl(String gitPullUrl){
		this.gitPullUrl = gitPullUrl;
	}

	public String getGitPullUrl(){
		return gitPullUrl;
	}

	public void setCommentsUrl(String commentsUrl){
		this.commentsUrl = commentsUrl;
	}

	public String getCommentsUrl(){
		return commentsUrl;
	}

	public void setFiles(Files files){
		this.files = files;
	}

	public Files getFiles(){
		return files;
	}

	public void setId(String id){
		this.id = id;
	}

	public String getId(){
		return id;
	}

	public void setUser(Object user){
		this.user = user;
	}

	public Object getUser(){
		return user;
	}
}