import java.util.Scanner;

public class multiplicative {
    public static void inverse() {
        Scanner scan = new Scanner(System.in);
        System.out.println("You have selected 1/x function");
        System.out.println("Enter x: ");
        double x = scan.nextInt();
        if (x == 0) {
            System.out.println("1/0 not possible. Try again");
            inverse();
        }
        System.out.println("Answer : " + Math.pow(x, -1));
        scan.close();
    }
}
