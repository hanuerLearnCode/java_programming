import java.util.HashSet;
import java.util.Set;

public class Main {
    public static void main(String[] args) {

//        label statement
        int[] scores = {1, 2, 3};
        outer:
        for (int score1 : scores) {
            for (int score2 : scores) {
                if (score2 == 2)
                    break outer;
            }
        }

    }
}