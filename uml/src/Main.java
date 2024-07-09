import model.*;
import Strategy.*;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        Website website1 = new Website("http://testwebsite.com");
        Website website2 = new Website("http://newwebsite.org");

        NotificationPreferences preferences = new NotificationPreferences();
        preferences.setFrequency("daily");
        preferences.setCommunicationChannel("email");

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

        WebsiteComparisonStrategy strategy = new IdenticalContentSizeStrategy();
        WebsiteMonitorSystem monitorSystem = new WebsiteMonitorSystem(strategy);

        List<Website> subscriptions = new ArrayList<>();
        subscriptions.add(website1);
        subscriptions.add(website2);
        monitorSystem.setSubscriptions(subscriptions);

        monitorSystem.addObserver(user1);
        monitorSystem.addObserver(user2);

        Notification notification = monitorSystem.generateNotification();
        notification.setNotificationId(1);
        notification.setMessage("New update available on the website.");

        monitorSystem.deliverNotification(notification);

        RegistrationController registrationController = new RegistrationController();
        registrationController.registerUser(user1);
        registrationController.registerUser(user2);
    }
}
