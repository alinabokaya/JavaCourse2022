package Lesson1_2;

public class Task2_Time {
    public static void main(String[] args) {
        long initSeconds = 155800;

        long hour = initSeconds / 3600;
        long min = initSeconds / 60 % 60;
        long sec = initSeconds / 1 % 60;


        System.out.println("HH:" + hour + " MM:" + min + " SS:" + sec);
        System.out.println(String.format("%02d:%02d:%02d", hour, min, sec));
    }
}
