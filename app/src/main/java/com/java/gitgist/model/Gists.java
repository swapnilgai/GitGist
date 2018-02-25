package com.java.gitgist.model;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.gson.annotations.SerializedName;

public class Gists implements Parcelable {
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
	private User user;

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

	public void setUser(User user){
		this.user = user;
	}

	public User getUser(){
		return user;
	}

	@Override
	public int describeContents() {
		return 0;
	}

	@Override
	public void writeToParcel(Parcel dest, int flags) {
		dest.writeString(this.commitsUrl);
		dest.writeInt(this.comments);
		dest.writeString(this.forksUrl);
		dest.writeString(this.gitPushUrl);
		dest.writeString(this.createdAt);
		dest.writeString(this.description);
		dest.writeByte(this.truncated ? (byte) 1 : (byte) 0);
		dest.writeString(this.url);
		dest.writeByte(this.jsonMemberPublic ? (byte) 1 : (byte) 0);
		dest.writeString(this.updatedAt);
		dest.writeString(this.htmlUrl);
		dest.writeString(this.gitPullUrl);
		dest.writeString(this.commentsUrl);
		dest.writeParcelable(this.files, flags);
		dest.writeString(this.id);
		dest.writeParcelable(this.user, flags);
	}

	public Gists() {
	}

	protected Gists(Parcel in) {
		this.commitsUrl = in.readString();
		this.comments = in.readInt();
		this.forksUrl = in.readString();
		this.gitPushUrl = in.readString();
		this.createdAt = in.readString();
		this.description = in.readString();
		this.truncated = in.readByte() != 0;
		this.url = in.readString();
		this.jsonMemberPublic = in.readByte() != 0;
		this.updatedAt = in.readString();
		this.htmlUrl = in.readString();
		this.gitPullUrl = in.readString();
		this.commentsUrl = in.readString();
		this.files = in.readParcelable(Files.class.getClassLoader());
		this.id = in.readString();
		this.user = in.readParcelable(Object.class.getClassLoader());
	}

	public static final Parcelable.Creator<Gists> CREATOR = new Parcelable.Creator<Gists>() {
		@Override
		public Gists createFromParcel(Parcel source) {
			return new Gists(source);
		}

		@Override
		public Gists[] newArray(int size) {
			return new Gists[size];
		}
	};
}