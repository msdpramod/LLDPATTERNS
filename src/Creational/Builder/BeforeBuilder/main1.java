package Creational.Builder.BeforeBuilder;

public class main1 {
    public static void main(String[] args) {
        NetflixUserProfile userProfile= new NetflixUserProfile(
            "john_doe",
            "john@gamil,com",
            "1234567890",
            "profilePic.jpg",
            "action, comedy",
            "watchedMovies.txt",
            "premium"
        );

        System.out.println(userProfile);
    }
}
