package chapter5;

public class Singleton {


    private Singleton() {
    }

    public static Singleton getInstance() {
        return InnerInstance.instance;
    }

    public static class InnerInstance {
        private static final Singleton instance = new Singleton();
    }

}
