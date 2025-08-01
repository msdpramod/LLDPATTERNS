package Creational.Singleton.withDoubleCheck;

public class Singleton3 {
    private static volatile Singleton3 instance;
    public int value = 0;

    private Singleton3() {}

    public static Singleton3 getInstance() {
        if (instance == null) {
            synchronized (Singleton3.class) {
                if (instance == null) {
                    instance = new Singleton3();
                }
            }
        }
        return instance;
    }
}
