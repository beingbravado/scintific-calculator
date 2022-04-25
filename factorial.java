import java.util.Scanner;

public class factorial {
    public static void fact() {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter the number: ");
        int x = scan.nextInt();
        long result = 1;
        for (int i = 1; i <= x; i++) {
            result = result * i;
        }
        System.out.println("Answer : " + result);
        scan.close();
    }
}
