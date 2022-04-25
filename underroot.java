import java.util.Scanner;

public class underroot {
    public static void sqrt() {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter the number: ");
        double num = scan.nextInt();

        System.out.println("Answer : " + Math.sqrt(num));
        scan.close();
    }

    public static void cubic_root() {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter the number: ");
        double x = scan.nextInt();
        System.out.println("Answer : " + Math.pow(x, 1 / (double) 3));
        scan.close();
    }
}
