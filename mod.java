import java.util.Scanner;

public class mod {
    public static void modulus() {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter first number: ");
        long a = scan.nextInt();
        System.out.println("Enter second number: ");
        long b = scan.nextInt();

        System.out.println("Answer : " + (a % b));
        scan.close();
    }
}
