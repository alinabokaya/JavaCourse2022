package Lesson9_Part1;

public class Task4 {
    public static void main(String[] args) {

        // Заменить серии подряд идущих пробелов на одиночные пробелы. Крайние пробелы удалить.

        String initialString = "   This string   is         broken!   ";
        String trimmedString = initialString.trim().replaceAll(" +", " ");
        System.out.println(trimmedString);
    }

}
