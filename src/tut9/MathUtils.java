package tut9;

import java.math.BigInteger;

// ****************************************************************
// MathUtils.java
//
// Provides static mathematical utility functions.
//
// ****************************************************************
public class MathUtils {
    //-------------------------------------------------------------
    // Returns the factorial of the argument given
    //-------------------------------------------------------------
    public static BigInteger factorial(int n) {
        if (n < 0) {
            throw new IllegalArgumentException("The integer must be greater than 0");
        }

        BigInteger fac = BigInteger.ONE;
        for (int i = n; i > 0; i--)
            fac = fac.multiply(BigInteger.valueOf(i));
        return fac;
    }
}

