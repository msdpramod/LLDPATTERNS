package Creational.Prototype.Registry;

import Creational.Prototype.AfterProtype.EASportsCharacter;

import java.util.HashMap;
import java.util.Map;

public class CharacterRegistry {
    private Map<String, EASportsCharacter> characterMap = new HashMap<>();

    public void registerCharacter(String key, EASportsCharacter character) {
        characterMap.put(key, character);
    }
    public EASportsCharacter getCharacter(String key) {
        EASportsCharacter character = characterMap.get(key);
        if (character != null) {
            return character.clone(); // Return a clone to ensure the original is not modified
        }
        return null; // or throw an exception if preferred
    }
    public void removeCharacter(String key) {
        characterMap.remove(key);
    }

}
