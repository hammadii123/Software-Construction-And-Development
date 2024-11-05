import java.util.Scanner;

public class Marksheet {

    private String studentName;
    private double totalMarks;
    private double obtainedMarks;
    private double percentage;
    private String grade;
    private double gpa;

    public void inputStudentDetails() {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter Student Name: ");
        studentName = scanner.nextLine();

        System.out.print("Enter Total Marks: ");
        totalMarks = scanner.nextDouble();

        System.out.print("Enter Obtained Marks: ");
        obtainedMarks = scanner.nextDouble();

        scanner.close();
    }

    private void calculatePercentage() {
        percentage = (obtainedMarks / totalMarks) * 100;
    }

    private void assignGrade() {
        if (percentage >= 90) {
            grade = "A";
            gpa = 4.0;
        } else if (percentage >= 80) {
            grade = "B";
            gpa = 3.0;
        } else if (percentage >= 70) {
            grade = "C";
            gpa = 2.0;
        } else if (percentage >= 60) {
            grade = "D";
            gpa = 1.0;
        } else {
            grade = "F";
            gpa = 0.0;
        }
    }

    public void displayMarkSheet() {
        calculatePercentage();
        assignGrade();

        System.out.println("\n------ Mark Sheet ------");
        System.out.println("Student Name: " + studentName);
        System.out.println("Total Marks: " + totalMarks);
        System.out.println("Obtained Marks: " + obtainedMarks);
        System.out.println("Percentage: " + String.format("%.2f", percentage) + "%");
        System.out.println("Grade: " + grade);
        System.out.println("GPA: " + String.format("%.1f", gpa));
    }

    public static void main(String[] args) {
        Marksheet markSheet = new Marksheet();
        markSheet.inputStudentDetails();
        markSheet.displayMarkSheet();
    }
}
