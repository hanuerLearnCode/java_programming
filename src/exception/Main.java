package Exception;

import java.io.FileNotFoundException;

public class Main {
    public static void main(String[] args) throws FileNotFoundException {
        try {
            // do something

        } catch (Exception e) {
            throw new RuntimeException();
        } finally {
            System.out.println("This will always be executed!");
        }
    }
}
