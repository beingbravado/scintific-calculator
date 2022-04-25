import java.util.Scanner;

public class percent {
    public static void percentage() {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter percentage that you want: ");
        double a = scan.nextInt();
        System.out.println("Enter total: ");
        double b = scan.nextInt();

        if (a > b) {
            a = a / 100;
        } else {
            b = b / 100;
        }
        System.out.println("Answer : " + (a * b));
        scan.close();
    }
}
