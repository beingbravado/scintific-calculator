import java.util.Scanner;

public class trignometry {
    public static void sin() {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter the number: ");
        double x = scan.nextInt();
        System.out.println("Answer : " + Math.sin(Math.toRadians(x)));
        scan.close();
    }

    public static void cos() {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter the number: ");
        double x = scan.nextInt();
        System.out.println("Answer : " + Math.cos(Math.toRadians(x)));
        scan.close();
    }

    public static void tan() {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter the number: ");
        double x = scan.nextInt();
        System.out.println("Answer : " + Math.tan(Math.toRadians(x)));
        scan.close();
    }
}
