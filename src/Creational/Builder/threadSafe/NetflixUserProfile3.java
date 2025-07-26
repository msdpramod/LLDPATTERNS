package Creational.Builder.threadSafe;

public class NetflixUserProfile3 {
    private String username;
    private String email;
    private String phone;
    private String profilePicture;
    private String preferences;
    private String watchHistroy;
    private String subscriptionPlans;

    public NetflixUserProfile3(Builder builder) {
        this.username = builder.username;
        this.email = builder.email;
        this.phone = builder.phone;
        this.profilePicture = builder.profilePicture;
        this.preferences = builder.preferences;
        this.watchHistroy = builder.watchHistroy;
        this.subscriptionPlans = builder.subscriptionPlans;
    }

    @Override
    public String toString() {
        return "NetflixUserProfile3{" +
                "username='" + username + '\'' +
                ", email='" + email + '\'' +
                ", phone='" + phone + '\'' +
                ", profilePicture='" + profilePicture + '\'' +
                ", preferences='" + preferences + '\'' +
                ", watchHistroy='" + watchHistroy + '\'' +
                ", subscriptionPlans='" + subscriptionPlans + '\'' +
                '}';
    }

    public static class Builder {
        private String username;
        private String email;
        private String phone;
        private String profilePicture;
        private String preferences;
        private String watchHistroy;
        private String subscriptionPlans;

        public Builder(String username, String email, String phone) {
            this.username = username;
            this.email = email;
            this.phone = phone;
        }

        public synchronized Builder setProfilePicture(String profilePicture) {
            this.profilePicture = profilePicture;
            return this;
        }

        public synchronized Builder setPreferences(String preferences) {
            this.preferences = preferences;
            return this;
        }

        public synchronized Builder setWatchHistroy(String watchHistroy) {
            this.watchHistroy = watchHistroy;
            return this;
        }

        public synchronized Builder setSubscriptionPlans(String subscriptionPlans) {
            this.subscriptionPlans = subscriptionPlans;
            return this;
        }

        public NetflixUserProfile3 build() {
            return new NetflixUserProfile3(this);
        }
    }
}
