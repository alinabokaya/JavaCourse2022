package Lesson1_2;

import java.util.Scanner;

public class Lesson9_Classwork {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter string size");
        int m = sc.nextInt();

        String[] array = new String[m];
        for (int i = 0; i< array.length; i++) {
            System.out.println("Enter string: ");
            array[i] = sc.next();
        }



    }

}
