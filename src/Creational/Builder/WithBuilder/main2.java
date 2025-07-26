package Creational.Builder.WithBuilder;

import Creational.Builder.BeforeBuilder.NetflixUserProfile;

public class main2 {
    public static void main(String[] args) {
        NetflixUserProfile2 profile = new NetflixUserProfile2.Builder1("john_doe", "john@hotmail.com", "1234567890")
                .setProfilePicture("profile.jpg")
                .setPreferences("Action, Comedy")
                .setWatchHistroy("Inception, The Dark Knight")
                .setSubscriptionPlans("Premium")
                .build();
        System.out.println(profile);

    }
}
