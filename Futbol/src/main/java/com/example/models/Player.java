package com.example.models;

public class Player {
    private int id;
    private String name;
    private int age;
    private String position;
    private String statistics;

    public Player() {
    }

    public Player(int id, String name, int age, String position, String statistics) {
        this.id = id;
        this.name = name;
        this.age = age;
        this.position = position;
        this.statistics = statistics;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getPosition() {
        return position;
    }

    public void setPosition(String position) {
        this.position = position;
    }

    public String getStatistics() {
        return statistics;
    }

    public void setStatistics(String statistics) {
        this.statistics = statistics;
    }
}