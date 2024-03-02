package com.example.First_Mock.Metods;

import java.util.Date;

import java.time.*;
import java.time.format.DateTimeFormatter;


public class User {

    private String login;
    private String password;
    private String currentDate;

    public String getLogin() {
        return this.login;
    }

    public void setLogin(String login) {
        this.login = login;
    }

    public String getPassword() {
        return this.password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getCurrentTime() {
        return currentDate;
    }

    public void setCurrentTime(Date currentDate) {
        this.currentDate = LocalDateTime.now(ZoneId.of("Europe/Moscow")).format(DateTimeFormatter.ofPattern("d.MM.yyyy HH:mm:ss"));
    }

    public User() {
        super();
    }

    public User(String login, String password) {
        this.login = login;
        this.password = password;
        this.currentDate = LocalDateTime.now(ZoneId.of("Europe/Moscow")).format(DateTimeFormatter.ofPattern("d.MM.yyyy HH:mm:ss")).toString();
    }

    @Override
    public String toString() {
        return "User{" + "login:'" + login + '\'' + ", password:'" + password + '\'' + ", date:'" + currentDate + '\'' + '}';
    }
}
