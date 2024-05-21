package tut02.tut02;

import java.util.ArrayList;

public class ex05 {
    public static void main(String[] args) {
//        System.out.println(binaryConvert(2500));
        System.out.println("Lowest common is: " + lowestCommon(14,25));
//        System.out.println(4&8);
    }

    public static int lowestCommon(long a, long b) {
        a = binaryConvert(a);
        b = binaryConvert(b);

        int flag = 0;
        while (a >= 0 && b >= 0) {
            long lastA = a%10;
            long lastB = b%10;
            if (lastA == lastB) {
                return flag;
            }
            a /= 10;
            b /= 10;
            flag++;
        }

        return -1;
    }

    static long binaryConvert(long input) {
        long longBinary = 0;

        if (input == 0) {
            return 0;
        }

        ArrayList<Integer> list = new ArrayList<>();
        while (input > 0) {
            list.add((int) (input % 2));
            input /= 2;
        }

        for (int i = 0; i < list.size(); i++) {
            longBinary += (long) (list.get(i)*Math.pow(10, i));
        }

//        System.out.println(list);
        return longBinary;
    }
}
