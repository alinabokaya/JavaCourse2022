package Lesson9_Part2;

public class Task1 {
    public static void main(String[] args) {
        // Дана строка. Найдите наибольшее количество подряд идущих пробелов в ней.

        String initialString = "This  string     is  broken  !";
        StringBuilder sb = new StringBuilder(initialString);

        int spaceCurrentMax = 0;
        int spaceMax = 0;


        for (int i = 0; i < sb.length(); i++) {
            char temp = sb.charAt(i);
            if (temp == ' ') {
                spaceCurrentMax++;
                if (spaceCurrentMax > spaceMax) {
                    spaceMax = spaceCurrentMax;

                }
            } else {
                spaceCurrentMax = 0;
            }
        }
        System.out.println("Максимальное количество пробелов: " + spaceMax);
    }

}
