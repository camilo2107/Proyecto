package com.example.models;

import java.util.Date;

public class Match {
    private int id;
    private Date date;
    private String teams;
    private String score;
    private String statistics;

    public Match(int id, Date date, String teams, String score, String statistics) {
        this.id = id;
        this.date = date;
        this.teams = teams;
        this.score = score;
        this.statistics = statistics;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public String getTeams() {
        return teams;
    }

    public void setTeams(String teams) {
        this.teams = teams;
    }

    public String getScore() {
        return score;
    }

    public void setScore(String score) {
        this.score = score;
    }

    public String getStatistics() {
        return statistics;
    }

    public void setStatistics(String statistics) {
        this.statistics = statistics;
    }
}