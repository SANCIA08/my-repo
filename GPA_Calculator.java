import java.util.Scanner;

public class GPA_Calculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int semester, subjects;
        float numerator = 0, denominator = 0, GPA, CGPA = 0;

        System.out.print("Enter number of semesters: ");
        semester = scanner.nextInt();

        for (int i = 0; i < semester; i++) {
            System.out.println("Semester " + (i + 1));
            System.out.print("Enter the number of subjects for this semester: ");
            subjects = scanner.nextInt();

            for (int j = 0; j < subjects; j++) {
                System.out.println("Subject " + (j + 1) + ":");
                System.out.print("Enter the subject grade: ");
                int grade = scanner.nextInt();
                System.out.print("Enter the subject credit: ");
                int credit = scanner.nextInt();

                numerator += (float) (grade * credit);
                denominator += (float) credit;
            }

            System.out.println("GPA for semester " + (i + 1) + ":");
            GPA = numerator / denominator;
            System.out.printf("%.2f\n", GPA);

            CGPA += GPA;
        }

        CGPA /= semester;
        System.out.printf("The CGPA is: %.2f\n", CGPA);
    }
}
