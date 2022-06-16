package Lesson9_Part1;

public class Task3 {
    public static void main(String[] args) {
        // В строке найти количество букв.

        String someString = "This is 5!";
        char[] chars = someString.toCharArray();
        int lettersAmount = 0;

        for (int i = 0; i < chars.length; i++) {
            if (Character.isLetter(chars[i])) {
                lettersAmount++;
            }
        }
        System.out.println("Количество букв в строке = " + lettersAmount);


    }

}
