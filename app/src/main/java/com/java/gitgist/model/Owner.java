package com.java.gitgist.model;

import android.os.Parcel;
import android.os.Parcelable;

import com.google.gson.annotations.SerializedName;

public class Owner implements Parcelable {

    public static final Parcelable.Creator<Owner> CREATOR = new Parcelable.Creator<Owner>() {
        @Override
        public Owner createFromParcel(Parcel source) {
            return new Owner(source);
        }

        @Override
        public Owner[] newArray(int size) {
            return new Owner[size];
        }
    };
    @SerializedName("gists_url")
    private String gistsUrl;
    @SerializedName("repos_url")
    private String reposUrl;
    @SerializedName("following_url")
    private String followingUrl;
    @SerializedName("starred_url")
    private String starredUrl;
    @SerializedName("login")
    private String login;
    @SerializedName("followers_url")
    private String followersUrl;
    @SerializedName("type")
    private String type;
    @SerializedName("url")
    private String url;
    @SerializedName("subscriptions_url")
    private String subscriptionsUrl;
    @SerializedName("received_events_url")
    private String receivedEventsUrl;
    @SerializedName("avatar_url")
    private String avatarUrl;
    @SerializedName("events_url")
    private String eventsUrl;
    @SerializedName("html_url")
    private String htmlUrl;
    @SerializedName("site_admin")
    private boolean siteAdmin;
    @SerializedName("id")
    private int id;
    @SerializedName("gravatar_id")
    private String gravatarId;
    @SerializedName("organizations_url")
    private String organizationsUrl;

    public Owner() {
    }

    protected Owner(Parcel in) {
        this.gistsUrl = in.readString();
        this.reposUrl = in.readString();
        this.followingUrl = in.readString();
        this.starredUrl = in.readString();
        this.login = in.readString();
        this.followersUrl = in.readString();
        this.type = in.readString();
        this.url = in.readString();
        this.subscriptionsUrl = in.readString();
        this.receivedEventsUrl = in.readString();
        this.avatarUrl = in.readString();
        this.eventsUrl = in.readString();
        this.htmlUrl = in.readString();
        this.siteAdmin = in.readByte() != 0;
        this.id = in.readInt();
        this.gravatarId = in.readString();
        this.organizationsUrl = in.readString();
    }

    public String getGistsUrl() {
        return gistsUrl;
    }

    public void setGistsUrl(String gistsUrl) {
        this.gistsUrl = gistsUrl;
    }

    public String getReposUrl() {
        return reposUrl;
    }

    public void setReposUrl(String reposUrl) {
        this.reposUrl = reposUrl;
    }

    public String getFollowingUrl() {
        return followingUrl;
    }

    public void setFollowingUrl(String followingUrl) {
        this.followingUrl = followingUrl;
    }

    public String getStarredUrl() {
        return starredUrl;
    }

    public void setStarredUrl(String starredUrl) {
        this.starredUrl = starredUrl;
    }

    public String getLogin() {
        return login;
    }

    public void setLogin(String login) {
        this.login = login;
    }

    public String getFollowersUrl() {
        return followersUrl;
    }

    public void setFollowersUrl(String followersUrl) {
        this.followersUrl = followersUrl;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public String getSubscriptionsUrl() {
        return subscriptionsUrl;
    }

    public void setSubscriptionsUrl(String subscriptionsUrl) {
        this.subscriptionsUrl = subscriptionsUrl;
    }

    public String getReceivedEventsUrl() {
        return receivedEventsUrl;
    }

    public void setReceivedEventsUrl(String receivedEventsUrl) {
        this.receivedEventsUrl = receivedEventsUrl;
    }

    public String getAvatarUrl() {
        return avatarUrl;
    }

    public void setAvatarUrl(String avatarUrl) {
        this.avatarUrl = avatarUrl;
    }

    public String getEventsUrl() {
        return eventsUrl;
    }

    public void setEventsUrl(String eventsUrl) {
        this.eventsUrl = eventsUrl;
    }

    public String getHtmlUrl() {
        return htmlUrl;
    }

    public void setHtmlUrl(String htmlUrl) {
        this.htmlUrl = htmlUrl;
    }

    public boolean isSiteAdmin() {
        return siteAdmin;
    }

    public void setSiteAdmin(boolean siteAdmin) {
        this.siteAdmin = siteAdmin;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getGravatarId() {
        return gravatarId;
    }

    public void setGravatarId(String gravatarId) {
        this.gravatarId = gravatarId;
    }

    public String getOrganizationsUrl() {
        return organizationsUrl;
    }

    public void setOrganizationsUrl(String organizationsUrl) {
        this.organizationsUrl = organizationsUrl;
    }

    @Override
    public int describeContents() {
        return 0;
    }

    @Override
    public void writeToParcel(Parcel dest, int flags) {
        dest.writeString(this.gistsUrl);
        dest.writeString(this.reposUrl);
        dest.writeString(this.followingUrl);
        dest.writeString(this.starredUrl);
        dest.writeString(this.login);
        dest.writeString(this.followersUrl);
        dest.writeString(this.type);
        dest.writeString(this.url);
        dest.writeString(this.subscriptionsUrl);
        dest.writeString(this.receivedEventsUrl);
        dest.writeString(this.avatarUrl);
        dest.writeString(this.eventsUrl);
        dest.writeString(this.htmlUrl);
        dest.writeByte(this.siteAdmin ? (byte) 1 : (byte) 0);
        dest.writeInt(this.id);
        dest.writeString(this.gravatarId);
        dest.writeString(this.organizationsUrl);
    }
}