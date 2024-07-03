package com.example.noteapp.model;

public class Post {
    private String id;
    private String author;
    private String title;
    private String content;
    private String color;
    public Post() {
    }

    public Post(String id, String author, String title, String content, String color) {
        this.id = id;
        this.author = author;
        this.title = title;
        this.content = content;
        this.color = color;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }
}
