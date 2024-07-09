package model;

import observer.Observable;
import observer.Observer;

public class User implements Observer {
    private int userId;
    private String username;
    private String email;
    private String password;
    private NotificationPreferences preferences;
    private Website website;

    public int getUserId() {
        return userId;
    }

    public void setUserId(int userId) {
        this.userId = userId;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public NotificationPreferences getPreferences() {
        return preferences;
    }

    public void setPreferences(NotificationPreferences preferences) {
        this.preferences = preferences;
    }

    public Website getWebsite() {
        return website;
    }

    public void setWebsite(Website website) {
        this.website = website;
    }

    @Override
    public void update(Notification notification) {
        // Logic to handle the notification update
        System.out.println("User " + username + " received notification: " + notification.getMessage()+ getWebsite().getUrl());
    }
}
