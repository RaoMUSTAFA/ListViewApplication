package com.example.listviewapplication;

public class MainActivity {
    private String name;
    private String home;

    public MainActivity(String name, String home) {
        this.name = name;
        this.home = home;
    }

    public String getName() {
        return name;
    }

    public String getHome() {
        return home;
    }
}