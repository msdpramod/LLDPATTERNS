package Creational.Prototype.Registry;

import Creational.Prototype.AfterProtype.EASportsCharacter;

public class main3 {
    public static void main(String[] args) {
        CharacterRegistry registry = new CharacterRegistry();

        // Register characters
        registry.registerCharacter("Football", new EASportsCharacter("Blue", "FC Barcelona", "Football", "Short"));
        registry.registerCharacter("Basketball", new EASportsCharacter("Red", "Los Angeles Lakers", "Basketball", "Curly"));

        // Clone characters
        EASportsCharacter footballCharacter = registry.getCharacter("Football");
        EASportsCharacter basketballCharacter = registry.getCharacter("Basketball");
        System.out.println("Football Character: " + footballCharacter);
        System.out.println("Basketball Character: " + basketballCharacter);
        // Modify the cloned characters
        footballCharacter = new EASportsCharacter("Green", "Manchester City", "Football", "Straight");
        basketballCharacter = new EASportsCharacter("Yellow", "Golden State Warriors",
                "Basketball", "Wavy");
        System.out.println("Modified Football Character: " + footballCharacter);
        System.out.println("Modified Basketball Character: " + basketballCharacter);
        // Remove a character from the registry
        registry.removeCharacter("Football");
        // Attempt to retrieve the removed character
        EASportsCharacter removedCharacter = registry.getCharacter("Football");
        if (removedCharacter == null) {
            System.out.println("Football character has been removed from the registry.");
        } else {
            System.out.println("Football Character: " + removedCharacter);
        }

    }
}
