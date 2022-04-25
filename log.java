import java.util.Scanner;

public class log {
    public static void base10() {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter the number: ");
        double x = scan.nextInt();
        System.out.println("Answer : " + Math.log10(x));
        scan.close();
    }
}
