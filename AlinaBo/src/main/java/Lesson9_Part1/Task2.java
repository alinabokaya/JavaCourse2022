package Lesson9_Part1;

public class Task2 {
    public static void main(String[] args) {

        // В строке найти количество цифр.

        String someString = "This string contains 1 and 2 and 3 and 4 and 5!";
        char[] chars = someString.toCharArray();
        int digitsAmount = 0;

        for (int i = 0; i < chars.length; i++) {
            if (Character.isDigit(chars[i])) {
                digitsAmount++;
            }
        }
        System.out.println("Количество цифр в строке = " + digitsAmount);
    }

}
