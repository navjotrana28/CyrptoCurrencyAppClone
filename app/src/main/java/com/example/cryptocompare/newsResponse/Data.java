package com.example.cryptocompare.newsResponse;

public class Data {
    private String upvotes;

    private String published_on;

    private String source;

    private String title;

    private String body;

    private String downvotes;

    private String url;

    private String tags;

    private String imageurl;

    private String guid;

    private String id;

    private String categories;

    private String lang;

    private Source_info source_info;

    public String getUpvotes() {
        return upvotes;
    }

    public void setUpvotes(String upvotes) {
        this.upvotes = upvotes;
    }

    public String getPublished_on() {
        return published_on;
    }

    public void setPublished_on(String published_on) {
        this.published_on = published_on;
    }

    public String getSource() {
        return source;
    }

    public void setSource(String source) {
        this.source = source;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getBody() {
        return body;
    }

    public void setBody(String body) {
        this.body = body;
    }

    public String getDownvotes() {
        return downvotes;
    }

    public void setDownvotes(String downvotes) {
        this.downvotes = downvotes;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public String getTags() {
        return tags;
    }

    public void setTags(String tags) {
        this.tags = tags;
    }

    public String getImageurl() {
        return imageurl;
    }

    public void setImageurl(String imageurl) {
        this.imageurl = imageurl;
    }

    public String getGuid() {
        return guid;
    }

    public void setGuid(String guid) {
        this.guid = guid;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getCategories() {
        return categories;
    }

    public void setCategories(String categories) {
        this.categories = categories;
    }

    public String getLang() {
        return lang;
    }

    public void setLang(String lang) {
        this.lang = lang;
    }

    public Source_info getSource_info() {
        return source_info;
    }

    public void setSource_info(Source_info source_info) {
        this.source_info = source_info;
    }

    @Override
    public String toString() {
        return "ClassPojo [upvotes = " + upvotes + ", published_on = " + published_on + ", source = " + source + ", title = " + title + ", body = " + body + ", downvotes = " + downvotes + ", url = " + url + ", tags = " + tags + ", imageurl = " + imageurl + ", guid = " + guid + ", id = " + id + ", categories = " + categories + ", lang = " + lang + ", source_info = " + source_info + "]";
    }
}
