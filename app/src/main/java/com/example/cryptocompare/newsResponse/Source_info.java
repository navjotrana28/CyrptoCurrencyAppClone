package com.example.cryptocompare.newsResponse;

public class Source_info {
    private String img;

    private String name;

    private String lang;

    public String getImg() {
        return img;
    }

    public void setImg(String img) {
        this.img = img;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getLang() {
        return lang;
    }

    public void setLang(String lang) {
        this.lang = lang;
    }

    @Override
    public String toString() {
        return "ClassPojo [img = " + img + ", name = " + name + ", lang = " + lang + "]";
    }
}
