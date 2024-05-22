package DesignPatterns;

public class Singleton {
    private static Singleton instance;

    private Singleton() {
        // set attrs
    }

    public static Singleton getInstance() {
        if (instance == null) {
            instance = new Singleton();
        }
        return instance;
    }


    // Singleton a = new Singleton();
    // Object a = Singleton::getInstance();

}
