package Lesson9_Part2;

public class Task2 {
    public static void main(String[] args) {
        // В строке вставить после каждого символа 'a' символ 'b'.


        String someString = "Alina is studying Java. What a surprise!";
        StringBuilder sb = new StringBuilder(someString);

        for (int i = 0; i < sb.length(); i++) {
            char temp = sb.charAt(i);
            if (temp == 'a') {
                sb.insert(i + 1, 'b');
            }
        }
        System.out.println(sb);

        // Второй вариант решения со String.replace()
        String replaceAtoAb2 = "Alina is studying Java. What a surprise!".replace("a", "ab");
        System.out.println(replaceAtoAb2);

    }
}
