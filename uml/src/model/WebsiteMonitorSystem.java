// WebsiteMonitorSystem.java
package model;

import observer.Observable;
import observer.Observer;
import Strategy.WebsiteComparisonStrategy;

import java.util.ArrayList;
import java.util.List;

public class WebsiteMonitorSystem implements Observable {
    private List<Website> subscriptions = new ArrayList<>();
    private List<Observer> observers = new ArrayList<>();
    private WebsiteComparisonStrategy comparisonStrategy;

    public WebsiteMonitorSystem(WebsiteComparisonStrategy strategy) {
        this.comparisonStrategy = strategy;
    }

    public void checkForUpdates() {
        // Logic to check for updates using the comparison strategy
        for (int i = 0; i < subscriptions.size() - 1; i++) {
            for (int j = i + 1; j < subscriptions.size(); j++) {
                if (comparisonStrategy.compare(subscriptions.get(i), subscriptions.get(j))) {
                    generateNotification();
                }
            }
        }
    }

    public Notification generateNotification() {
        // Logic to generate a notification
        return new Notification();
    }

    public void deliverNotification(Notification notification) {
        notifyObservers(notification);
    }

    public List<Website> getSubscriptions() {
        return subscriptions;
    }

    public void setSubscriptions(List<Website> subscriptions) {
        this.subscriptions.clear(); // Clear the existing list
        for (Website website : subscriptions) {
            this.subscriptions.add(website); // Add each element from the new list
        }
    }

    @Override
    public void addObserver(Observer observer) {
        observers.add(observer);
    }

    @Override
    public void removeObserver(Observer observer) {
        observers.remove(observer);
    }

    @Override
    public void notifyObservers(Notification notification) {
        for (Observer observer : observers) {
            observer.update(notification);
        }
    }
}
