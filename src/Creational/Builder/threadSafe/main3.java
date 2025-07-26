package Creational.Builder.threadSafe;

public class main3 {
    public static void main(String[] args) {
        Runnable task = () -> {
            NetflixUserProfile3 profile = new NetflixUserProfile3.Builder("john_doe", "doe@hotmail.com", "1234567890")
                    .setProfilePicture("profile.jpg")
                    .setPreferences("Action, Comedy")
                    .setWatchHistroy("Inception, The Dark Knight")
                    .setSubscriptionPlans("Premium")
                    .build();
            System.out.println(Thread.currentThread().getName() + ": " + profile);
        };

        for (int i = 0; i < 5; i++) {
            new Thread(task, "Thread-" + i).start();
        }
    }
}