package Creational.Singleton.withSynchronized;

public class Singleton2 {
    private static Singleton2 instance;
    public int value = 0;

    private Singleton2() {}

    public static synchronized Singleton2 getInstance() {
        if (instance == null) {
            instance = new Singleton2();
        }
        return instance;
    }
}
