package Lesson9_Part2;

public class Task3 {
    public static void main(String[] args) {
        // Проверить является ли заданное слово палиндромом.

        String palindrome = "Madam";
        StringBuilder sb = new StringBuilder(palindrome).reverse();

        if (palindrome.equalsIgnoreCase(sb.toString())) {
            System.out.println("The word is a palindrome!");
        } else System.out.println("The word is NOT a palindrome!");
    }

}
