package Creational.Singleton.withSynchronized;

public class main2 {
    public static void main(String[] args) {
        Runnable runnable1 = () -> {
            Singleton2 instance = Singleton2.getInstance();
            instance.value = 1;
            System.out.println(Thread.currentThread().getName() + ": value=" + instance.value + ", hash=" + instance.hashCode());
        };
        Runnable runnable2 = () -> {
            Singleton2 instance = Singleton2.getInstance();
            instance.value = 2;
            System.out.println(Thread.currentThread().getName() + ": value=" + instance.value + ", hash=" + instance.hashCode());
        };

        for (int i = 0; i < 3; i++) {
            new Thread(runnable1).start();
            new Thread(runnable2).start();
        }
    }
}
