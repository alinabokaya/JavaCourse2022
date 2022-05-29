package Lesson6_Task2;

public class Accountant implements Company{

    String jobTitle;

    public Accountant (String jobTitle) {
        this.jobTitle = jobTitle;
    }

    @Override
    public void printJobTitle() {
        System.out.println(jobTitle);
    }
}
