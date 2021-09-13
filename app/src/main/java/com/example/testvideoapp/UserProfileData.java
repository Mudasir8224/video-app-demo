package com.example.testvideoapp;

public class UserProfileData {
    String name;
    String title;
    String Url="";

    public UserProfileData(String name, String title, String url) {
        this.name = name;
        this.title = title;
        Url = url;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getUrl() {
        return Url;
    }

    public void setUrl(String url) {
        Url = url;
    }
}
