// Main.java
import model.*;
import Strategy.*;

public class Main {
    public static void main(String[] args) {
        // Create a website
        Website website1 = new Website("http://testwebsite.com");
        Website website2 = new Website("http://newwebsite.org");

        // Create notification preferences
        NotificationPreferences preferences = new NotificationPreferences();
        preferences.setFrequency("daily");
        preferences.setCommunicationChannel("email");

        // Create users
        User user1 = new User();
        user1.setUserId(1);
        user1.setUsername("louay");
        user1.setEmail("louay.hh7@gmail.com");
        user1.setPassword("swedwebsite1209");
        user1.setPreferences(preferences);
        user1.setWebsite(website1);

        User user2 = new User();
        user2.setUserId(2);
        user2.setUsername("Hamza");
        user2.setEmail("Hamza.marok@gmail.com");
        user2.setPassword("anypasswordisalwaaysworking0912");
        user2.setPreferences(preferences);
        user2.setWebsite(website2);

        // Choose a comparison strategy
        WebsiteComparisonStrategy strategy = new IdenticalContentSizeStrategy();
        // Create website monitor system with the chosen strategy
        WebsiteMonitorSystem monitorSystem = new WebsiteMonitorSystem(strategy);
        monitorSystem.getSubscriptions().add(website1);
        monitorSystem.getSubscriptions().add(website2);

        // Register users to the system
        monitorSystem.addObserver(user1);
        monitorSystem.addObserver(user2);

        // Simulate the system generating and delivering a notification
        Notification notification = monitorSystem.generateNotification();
        notification.setNotificationId(1);
        notification.setMessage("New update available on the website.");

        // Deliver the notification
        monitorSystem.deliverNotification(notification);

        // Demonstrate RegistrationController usage
        RegistrationController registrationController = new RegistrationController();
        registrationController.registerUser(user1);
        registrationController.registerUser(user2);
    }
}

