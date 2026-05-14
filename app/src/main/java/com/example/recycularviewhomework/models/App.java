package com.example.recycularviewhomework.models;

public class App {

    private int app_icon;

    private String serial_number, app_name,app_category,app_size,app_rate;

    public App(String serial_number, int app_icon, String app_rate, String app_name, String app_category, String app_size) {
        this.serial_number = serial_number;
        this.app_icon = app_icon;
        this.app_rate = app_rate;
        this.app_name = app_name;
        this.app_category = app_category;
        this.app_size = app_size;
    }

    public String getSerial_number() {
        return serial_number;
    }

    public void setSerial_number(String serial_number) {
        this.serial_number = serial_number;
    }

    public int getApp_icon() {
        return app_icon;
    }

    public void setApp_icon(int app_icon) {
        this.app_icon = app_icon;
    }

    public String getApp_rate() {
        return app_rate;
    }

    public void setApp_rate(String app_rate) {
        this.app_rate = app_rate;
    }

    public String getApp_name() {
        return app_name;
    }

    public void setApp_name(String app_name) {
        this.app_name = app_name;
    }

    public String getApp_category() {
        return app_category;
    }

    public void setApp_category(String app_category) {
        this.app_category = app_category;
    }

    public String getApp_size() {
        return app_size;
    }

    public void setApp_size(String app_size) {
        this.app_size = app_size;
    }
}