package com.example.madd_ordermanagement.Model;

import android.content.Intent;

public class Products {

    private String pid, name, description, image, event, date, time, price, count;

    public Products() {
    }

    public Products(String pid, String name, String description, String image, String event, String date, String time, String price, String count) {
        this.pid = pid ;
        this.name = name;
        this.description = description;
        this.image = image ;
        this.event = event ;
        this.date = date ;
        this.time = time ;
        this.price = price ;
        this.count = count ;
    }

    public String getPid() {
        return pid;
    }

    public void setPid(String pid) {
        this.pid = pid;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getImage() {
        return image;
    }

    public void setImage(String image) {
        this.image = image;
    }

    public String getEvent() {
        return event;
    }

    public void setEvent(String event) {
        this.event = event;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public String getTime() {
        return time;
    }

    public void setTime(String time) {
        this.time = time;
    }

    public String getPrice() {
        return price;
    }

    public void setPrice(String price) {
        this.price = price;
    }

    public String getCount() {
        return count;
    }

    public void setCount(String count) {
        this.count = count;
    }
}
