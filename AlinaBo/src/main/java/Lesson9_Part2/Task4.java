package Lesson9_Part2;

public class Task4 {
    public static void main(String[] args) {
        // Подсчитать, сколько раз среди символов заданной строки встречается буква 'a'.

        String initialString = "Alina 123a22!";
        StringBuilder sb = new StringBuilder(initialString.toLowerCase());
        int aLetterAmount = 0;

        for (int i = 0; i < sb.length(); i++) {
            char temp = sb.charAt(i);
            if (temp == 'a') {
                aLetterAmount++;
            }
        }
        System.out.println("Количество букв 'a' в строке = " + aLetterAmount);

    }
}
