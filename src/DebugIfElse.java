import java.util.Scanner;

public class DebugIfElse {
    public static void main (String[] arg){

        Scanner input = new Scanner(System.in);
        int testScore;
        char grade;

        System.out.print("Enter the test score: ");
        testScore = input.nextInt();

        if (testScore >= 90){
            grade = 'A';
        }else if (testScore >= 80) {
            grade = 'B';
        }else if (testScore >= 70) {
            grade = 'C';
        }else if (testScore >= 60) {
            grade = 'D';
        }else {
            grade = 'F';
        }
        System.out.println("Grade = " + grade);
    }

}
