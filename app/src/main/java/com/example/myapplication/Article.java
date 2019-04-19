package com.example.myapplication;

public class Article {
    public int aNumber;
    public int aTitle;
    public boolean articleIsSaved;

    public int getaNumber() {
        return aNumber;
    }

    public void setaNumber(int aNumber) {
        this.aNumber = aNumber;
    }

    public int getaTitle() {
        return aTitle;
    }

    public void setaTitle(int aTitle) {
        this.aTitle = aTitle;
    }

    public boolean isArticleIsSaved() {
        return articleIsSaved;
    }

    public void setArticleIsSaved(boolean articleIsSaved) {
        this.articleIsSaved = articleIsSaved;
    }

    public Article (int number, int title){
        this.aNumber=number;
        this.aTitle=title;

    }
}
