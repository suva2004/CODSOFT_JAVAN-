package GradeCalculator;
import java.util.Scanner;

public class StudentGradeCalculator {
    public static void main(String[] args) {
        Scanner student = new Scanner(System.in);
        final double TOTAL_MARKS = 100.0;

        System.out.print("Enter marks for Subject_1: ");
        double marks1 = student.nextDouble();

        System.out.print("Enter marks for Subject_2: ");
        double marks2 = student.nextDouble();

        System.out.print("Enter marks for Subject_3: ");
        double marks3 = student.nextDouble();
        
        System.out.print("Enter marks for Subject_4: ");
        double marks4 = student.nextDouble();
        
        System.out.print("Enter marks for Subject_5: ");
        double marks5 = student.nextDouble();
        
        double TotalMarks = marks1 + marks2 + marks3 + marks4 + marks5;
        double averagePercentage = (TotalMarks / (5 * TOTAL_MARKS)) * 100;
        
        System.out.println("Your Total Marks are : " + TotalMarks);
        System.out.println("Your Average Percentage is : " + averagePercentage + " % ");

        if (TotalMarks > 89) {
            System.out.println("Your Grade: O");
        } else if (TotalMarks > 79) {
            System.out.println("Your Grade: A");
        } else if (TotalMarks > 69) {
            System.out.println("Your Grade: B");
        } else if (TotalMarks > 59) {
            System.out.println("Your Grade: C");
        } else {
            System.out.println("Your Grade: D");
        }

        student.close();
    }
}