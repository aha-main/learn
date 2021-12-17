package com.syw.bookadmin.dao;

public class Book {
    private Integer id;
    private String bookName;
    private String author;
    private String introduction;
    private Boolean borrowState;
    private Integer inventory;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getBookName() {
        return bookName;
    }

    public void setBookName(String bookName) {
        this.bookName = bookName;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public String getIntroduction() {
        return introduction;
    }

    public void setIntroduction(String introduction) {
        this.introduction = introduction;
    }

    public Boolean getBorrowState() {
        return borrowState;
    }

    public void setBorrowState(Boolean borrowState) {
        this.borrowState = borrowState;
    }

    public Integer getInventory() {
        return inventory;
    }

    public void setInventory(Integer inventory) {
        this.inventory = inventory;
    }
}
