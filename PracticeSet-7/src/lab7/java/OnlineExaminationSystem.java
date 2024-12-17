package lab7.java;

import java.util.ArrayList;
import java.util.List;

// ExamSubmissionBox class simulating the shared exam submission box
class ExamSubmissionBox {
    private List<String> submissions; // List to store exam submissions

    // Constructor to initialize the submission list
    public ExamSubmissionBox() {
        submissions = new ArrayList<>();
    }

    // Synchronized method to ensure thread-safe submission
    public synchronized void submitAnswer(String answer) {
        submissions.add(answer); // Add the answer to the submissions list
        System.out.println(Thread.currentThread().getName() + " submitted answer: " + answer);
    }

    // Method to get the list of all submissions
    public List<String> getSubmissions() {
        return submissions;
    }
}

// Student class representing a student submitting answers
class Student extends Thread {
    private ExamSubmissionBox submissionBox; // Shared submission box
    private String answer; // Student's answer

    // Constructor to initialize student with the submission box and their answer
    public Student(ExamSubmissionBox submissionBox, String answer) {
        this.submissionBox = submissionBox;
        this.answer = answer;
    }

    @Override
    public void run() {
        // Student submits their answer to the shared submission box
        submissionBox.submitAnswer(answer);
    }
}

public class OnlineExaminationSystem {
    public static void main(String[] args) {
        // Create an exam submission box (shared resource)
        ExamSubmissionBox submissionBox = new ExamSubmissionBox();

        // Create multiple student threads attempting to submit answers
        Student student1 = new Student(submissionBox, "Answer A");  // Student 1 submits "Answer A"
        Student student2 = new Student(submissionBox, "Answer B");  // Student 2 submits "Answer B"
        Student student3 = new Student(submissionBox, "Answer C");  // Student 3 submits "Answer C"
        Student student4 = new Student(submissionBox, "Answer D");  // Student 4 submits "Answer D"

        // Start all student threads
        student1.start();
        student2.start();
        student3.start();
        student4.start();

        try {
            // Wait for all threads to finish
            student1.join();
            student2.join();
            student3.join();
            student4.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        // After all submissions are done, print all exam submissions
        System.out.println("\nFinal Exam Submissions:");
        for (String submission : submissionBox.getSubmissions()) {
            System.out.println(submission);
        }
    }
}
