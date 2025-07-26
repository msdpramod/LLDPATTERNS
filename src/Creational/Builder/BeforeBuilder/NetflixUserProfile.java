package Creational.Builder.BeforeBuilder;

public class NetflixUserProfile {
    private String username;
    private String email;
    private String phone;
    private String profilePicture;
    private String preferences;
    private String watchHistroy;
    private String subscriptionPlans;

    public NetflixUserProfile(String username,
                              String email, String phone,
                              String profilePicture, String preferences,
                              String watchHistroy, String subscriptionPlans) {
        this.username = username;
        this.email = email;
        this.phone = phone;
        this.profilePicture = profilePicture;
        this.preferences = preferences;
        this.watchHistroy = watchHistroy;
        this.subscriptionPlans = subscriptionPlans;
    }

    @Override
    public String toString() {
        return "NetflixUserProfile{" +
                "username='" + username + '\'' +
                ", email='" + email + '\'' +
                ", phone='" + phone + '\'' +
                ", profilePicture='" + profilePicture + '\'' +
                ", preferences='" + preferences + '\'' +
                ", watchHistroy='" + watchHistroy + '\'' +
                ", subscriptionPlans='" + subscriptionPlans + '\'' +
                '}';
    }
}
