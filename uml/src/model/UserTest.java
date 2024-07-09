package model;

import static org.junit.Assert.*;

import org.junit.Test;

public class UserTest {

    @Test
    public void testCreateUserWithValidData() {
        NotificationPreferences preferences = new NotificationPreferences();
        preferences.setFrequency("daily");
        preferences.setCommunicationChannel("email");

        Website website = new Website("http://testwebsite.com");

        User user = new User();
        user.setUserId(1);
        user.setUsername("louay");
        user.setEmail("louay.hh7@gmail.com");
        user.setPassword("swedwebsite1209");
        user.setPreferences(preferences);
        user.setWebsite(website);

        assertEquals(1, user.getUserId());
        assertEquals("louay", user.getUsername());
        assertEquals("louay.hh7@gmail.com", user.getEmail());
        assertEquals("swedwebsite1209", user.getPassword());
        assertEquals(preferences, user.getPreferences());
        assertEquals(website, user.getWebsite());
    }

    @Test(expected = IllegalArgumentException.class)
    public void testCreateUserWithInvalidEmail() {
        User user = new User();
        user.setEmail("invalid-email-format");
    }

}

