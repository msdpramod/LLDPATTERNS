package Creational.Builder.WithBuilder;

public class NetflixUserProfile2 {
    private String username;
    private String email;
    private String phone;
    private String profilePicture;
    private String preferences;
    private String watchHistroy;
    private String subscriptionPlans;

    public NetflixUserProfile2(Builder1 builder1) {
        this.username = builder1.username;
        this.email = builder1.email;
        this.phone = builder1.phone;
        this.profilePicture = builder1.profilePicture;
        this.preferences = builder1.preferences;
        this.watchHistroy =builder1.watchHistroy;
        this.subscriptionPlans = builder1.subscriptionPlans;
    }

    @Override
    public String toString() {
        return "NetflixUserProfile2{" +
                "username='" + username + '\'' +
                ", email='" + email + '\'' +
                ", phone='" + phone + '\'' +
                ", profilePicture='" + profilePicture + '\'' +
                ", preferences='" + preferences + '\'' +
                ", watchHistroy='" + watchHistroy + '\'' +
                ", subscriptionPlans='" + subscriptionPlans + '\'' +
                '}';
    }
    public static class  Builder1 {
        private String username;
        private String email;
        private String phone;
        private String profilePicture;
        private String preferences;
        private String watchHistroy;
        private String subscriptionPlans;

        public Builder1(String username, String email, String phone) {
            this.username = username;
            this.email = email;
            this.phone = phone;
        }

        public Builder1 setProfilePicture(String profilePicture) {
            this.profilePicture = profilePicture;
            return this;
        }
        public Builder1 setPreferences(String preferences) {
            this.preferences = preferences;
            return this;
        }
        public Builder1 setWatchHistroy(String watchHistroy) {
            this.watchHistroy = watchHistroy;
            return this;
        }
        public Builder1 setSubscriptionPlans(String subscriptionPlans) {
            this.subscriptionPlans = subscriptionPlans;
            return this;
        }
        public NetflixUserProfile2 build() {
            return new NetflixUserProfile2(this);
        }

    }


}
