import java.util.Scanner;

public class division {
    public static void divide() {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter first number: ");
        long a = scan.nextInt();
        System.out.println("Enter second number: ");
        long b = scan.nextInt();

        System.out.println("Answer : " + (a / (double) b));
        scan.close();
    }
}
