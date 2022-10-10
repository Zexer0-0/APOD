package com.example.apodproject;

public class ApodModel {
    String date,title,explanation,url,media_type;

    public ApodModel(String date, String title, String explanation, String url, String media_type) {
        this.date = date;
        this.title = title;
        this.explanation = explanation;
        this.url = url;
        this.media_type = media_type;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getExplanation() {
        return explanation;
    }

    public void setExplanation(String explanation) {
        this.explanation = explanation;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public String getMedia_type() {
        return media_type;
    }

    public void setMedia_type(String media_type) {
        this.media_type = media_type;
    }
}
