package tut02;

public class RollingDice {
    public static void main(String[] args) {
        int first = (int) (Math.random() * 6 + 1);
        int second = (int) (Math.random() * 6 + 1);
        System.out.println(first);
        System.out.println(second);
        System.out.println(first + second);
    }
}
