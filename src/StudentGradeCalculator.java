import java.util.Scanner;

public class StudentGradeCalculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Ask for the number of subjects
        System.out.print("Enter number of subjects: ");
        int subjects = scanner.nextInt();
       scanner.nextLine(); // Consume newline because we are taking number of subjects i.e integer first and after that we will require string value next so it is mandatory to consume the line

        int totalMarks = 0;

        // Taking the input for each subject
        for (int i = 1; i <= subjects; i++) {
            System.out.print("Enter subject " + i + " name: ");
            String subjectName = scanner.nextLine();

            int marks;
            while (true) {
                System.out.print("Enter marks for " + subjectName + ": ");
                marks = scanner.nextInt();
                if (marks >= 0 && marks <= 100) break;
                System.out.println("Invalid marks! Please enter a value between 0 and 100.");
            }
            totalMarks += marks;
            scanner.nextLine(); // Consume newline because we are taking subject name Strings first and immediately taking marks that is integer so consuming of line is necessary
        }

        // Calculating the percentage (formatted to 2 decimal places as it most common)
        double percentage = (double) totalMarks / subjects;
        String formattedPercentage = String.format("%.2f", percentage);

        // Determining grade here
        String grade;
        if (percentage >= 90) grade = "A+";
        else if (percentage >= 80) grade = "A";
        else if (percentage >= 70) grade = "B";
        else if (percentage >= 60) grade = "C";
        else if (percentage >= 50) grade = "D";
        else grade = "F";

        // Output results
        System.out.println("\nTotal Marks: " + totalMarks);
        System.out.println("Percentage: " + formattedPercentage + "%");
        System.out.println("Grade: " + grade);

        scanner.close();
    }
}
