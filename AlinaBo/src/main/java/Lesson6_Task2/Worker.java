package Lesson6_Task2;

public class Worker implements Company{

    String jobTitle;

    public Worker (String jobTitle) {
        this.jobTitle = jobTitle;
    }

     @Override
     public void printJobTitle(){
         System.out.println(jobTitle);
     }
}
