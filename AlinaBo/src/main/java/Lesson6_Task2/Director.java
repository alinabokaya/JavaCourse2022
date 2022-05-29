package Lesson6_Task2;

public class Director implements Company{

    String jobTitle;

    public Director (String jobTitle) {
        this.jobTitle = jobTitle;
    }

    @Override
    public void printJobTitle() {
        System.out.println(jobTitle);
    }
}
