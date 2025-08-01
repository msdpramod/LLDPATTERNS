package Creational.Singleton.withoutThreadSafe;

public class Singleton1 {
    private static Singleton1 instance;
    public int value = 0;

    private Singleton1() {}

    public static Singleton1 getInstance() {
        if (instance == null) {
            instance = new Singleton1();
        }
        return instance;
    }
}