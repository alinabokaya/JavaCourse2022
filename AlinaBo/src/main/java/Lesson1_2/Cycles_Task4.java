package Lesson1_2;

import java.math.BigInteger;

public class Cycles_Task4 {
    public static void main(String[] args) {
        double x;
        BigInteger mul = BigInteger.ONE;

        for (int i = 1; i <= 200; i++) {
            mul = mul.multiply(BigInteger.valueOf(i * i));
        }
        System.out.println("Result is: " + mul);
    }
}
