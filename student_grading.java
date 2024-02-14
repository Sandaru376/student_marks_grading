import java.util.Scanner;

public class student_grading {
    public static void main(String[] args) {
        Scanner sum = new Scanner(System.in);
        char more;

        do {
            System.out.println("Enter student mark=");
            int mark = sum.nextInt();

            if (mark > 75) {
                System.out.println("you have A pass ....");
            } else if (mark > 65) {
                System.out.println("you have B pass ");
            } else if (mark > 55) {
                System.out.println("you have C pass ");
            } else if (mark > 35) {
                System.out.println("you have S pass ");
            } else {
                System.out.println("you are fail ...");
            }

            System.out.println("Do you want to continue? (y/n): ");
            more = sum.next().charAt(0);
        } while (more == 'y');

        System.out.println("Finish.....");
        sum.close();
    }
}
