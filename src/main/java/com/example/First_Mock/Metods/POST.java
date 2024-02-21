package com.example.First_Mock.Metods;

import java.util.Date;

import java.time.*;
import java.time.format.DateTimeFormatter;




public class POST {

    private String login;
    private String password;
    private String currentDate;


    public POST(String login, String password) {
        this.login = login;
        this.password = password;
        this.currentDate = LocalDateTime.now(ZoneId.of("Europe/Moscow")).format(DateTimeFormatter.ofPattern("d.MM.yyyy HH:mm:ss"));
    }


    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getLogin() {
        return login;
    }

    public void setLogin(String login) {
        this.login = login;
    }

    public String getCurrentTime() {
        return currentDate;
    }

    public void setCurrentTime(Date currentDate) {
        this.currentDate = LocalDateTime.now(ZoneId.of("Europe/Moscow")).format(DateTimeFormatter.ofPattern("d.MM.yyyy HH:mm:ss"));
    }
}
