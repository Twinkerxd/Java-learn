import java.util.Scanner;

public class ScannerPractice {
    public static void main(String[] args) {
        int sum = 0;
        Scanner console = new Scanner(System.in);

        for (int i = 0; i < 3; i++) {
            System.out.println("Please enter an int number: ");
            String str = console.nextLine();
            sum = sum + Integer.parseInt(str);
        }

        System.out.println("The sum of the entered numbers: "+sum);
    }
}
