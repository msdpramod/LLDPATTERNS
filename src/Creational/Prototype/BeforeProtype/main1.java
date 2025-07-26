package Creational.Prototype.BeforeProtype;

public class main1 {
    public static void main(String[] args) {
        EASportsCharacter character1 = new EASportsCharacter("Red", "Lakers", "Basketball", "Short");
        EASportsCharacter character2 = new EASportsCharacter("Blue", "Warriors", "Basketball", "Long");

        System.out.println("Character 1: " + character1);
        System.out.println("Character 2: " + character2);

        // Here, we would typically have methods to clone or copy characters,
        // but since this is the 'Before Prototype' example, we are just creating new instances.
    }
}
