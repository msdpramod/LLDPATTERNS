package Creational.Singleton.withoutThreadSafe;

public class main1 {
    public static void main(String[] args) {
        Runnable runnable1 = () -> {
            Singleton1 instance= Singleton1.getInstance();
            instance.value = 1;
            System.out.println(Thread.currentThread().getName() + ": value=" + instance.value + ", hash=" + instance.hashCode());
        };
        Runnable runnable2 = () -> {
            Singleton1 instance = Singleton1.getInstance();
            instance.value = 2;
            System.out.println(Thread.currentThread().getName() + ": value=" + instance.value + ", hash=" + instance.hashCode());
        };

        for (int i = 0; i < Integer.MAX_VALUE; i++) {
            new Thread(runnable1).start();
            new Thread(runnable2).start();
        }
    }
}