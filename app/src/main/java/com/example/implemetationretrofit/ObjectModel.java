package com.example.implemetationretrofit;
public class ObjectModel {
    private long albumID;
    private long id;
    private String title;
    private String url;
    private String thumbnailUrl;
    public long getAlbumID() {
        return albumID;
    }
    public void setAlbumID(long albumID) {
        this.albumID = albumID;
    }
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
    public String getUrl() {
        return url;
    }
    public void setUrl(String url) {
        this.url = url;
    }
    public String getThumbnailURL() {return thumbnailUrl;}
    public void setThumbnailURL(String thumbnailURL) {
        this.thumbnailUrl = thumbnailURL;
    }
}
