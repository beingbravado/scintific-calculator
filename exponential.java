import java.util.Scanner;

public class exponential {
    public static void a_to_power_b() {
        Scanner scan = new Scanner(System.in);
        System.out.println("You have selected a^b function");
        System.out.println("Enter a: ");
        double a = scan.nextInt();
        System.out.println("Enter b: ");
        double b = scan.nextInt();

        System.out.println("Answer : " + Math.pow(a, b));
        scan.close();
    }

    public static void square() {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter the number: ");
        double a = scan.nextInt();
        System.out.println("Answer : " + Math.pow(a, 2));
        scan.close();
    }

    public static void cube() {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter the number: ");
        double a = scan.nextInt();
        System.out.println("Answer : " + Math.pow(a, 3));
        scan.close();
    }
}
