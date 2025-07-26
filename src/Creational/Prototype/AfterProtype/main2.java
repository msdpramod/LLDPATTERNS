package Creational.Prototype.AfterProtype;

public class main2 {
    public static void main(String[] args) {
        EASportsCharacter character1 = new EASportsCharacter("Red", "Lakers", "Basketball", "Short");
        EASportsCharacter character2 = character1.clone(); // Cloning character1

        System.out.println("Character 1: " + character1);
        System.out.println("Character 2 (cloned from Character 1): " + character2);

        // Modifying character2 to demonstrate that it is a separate instance
        character2 = new EASportsCharacter("Blue", "Warriors", "Basketball", "Long");
        System.out.println("Character 2 after modification: " + character2);
    }
}
