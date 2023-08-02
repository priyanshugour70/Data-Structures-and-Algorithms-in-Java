import java.util.Scanner;

public class p10_GradeCalculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the total marks: ");
        int totalMarks = scanner.nextInt();

        if (totalMarks < 0 || totalMarks > 100) {
            System.out.println("Invalid input! Total marks should be between 0 and 100.");
        } else {
            char finalGrade;

            if (totalMarks >= 90) {
                finalGrade = 'A';
            } else if (totalMarks >= 80) {
                finalGrade = 'B';
            } else if (totalMarks >= 70) {
                finalGrade = 'C';
            } else if (totalMarks >= 50) {
                finalGrade = 'D';
            } else {
                finalGrade = 'F';
            }

            System.out.println("Final Grade: " + finalGrade);
        }

        scanner.close();
    }
}
