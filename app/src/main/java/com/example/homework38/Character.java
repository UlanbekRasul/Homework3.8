package com.example.homework38;

import java.io.Serializable;

public class Character implements Serializable {

    private int imageView;
    private String alive;
    private String name;

    public Character(int imageView, String alive, String name) {
        this.alive = alive;
        this.imageView = imageView;
        this.name = name;
    }

    public int getImageView() {
        return imageView;
    }

    public void setImageView(int imageView) {
        this.imageView = imageView;
    }

    public String getAlive() {
        return alive;
    }

    public void setAlive(String alive) {
        this.alive = alive;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}