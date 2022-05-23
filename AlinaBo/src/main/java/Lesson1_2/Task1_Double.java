package Lesson1_2;

public class Task1_Double {
    public static void main(String[] args) {
        double initialNum = 999.333;
        boolean dot = false;

        StringBuilder temp1 = new StringBuilder();
        StringBuilder temp2 = new StringBuilder();

        String doubleToStr = String.valueOf(initialNum);

        for (int i = 0; i < doubleToStr.length(); i++) {
            if (doubleToStr.charAt(i) == '.') {
                dot = true;
            }
            if (dot && doubleToStr.charAt(i) != '.') {
                temp1.append(doubleToStr.charAt(i));
            }
            if (!dot && doubleToStr.charAt(i) != '.') {
                temp2.append(doubleToStr.charAt(i));
            }
        }
        System.out.println(temp1.toString() + "." + temp2.toString());
    }
}
