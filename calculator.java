import java.util.Scanner;

public class calculator {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("1. Add");
        System.out.println("2. Substract");
        System.out.println("3. Multiply");
        System.out.println("4. Divide");
        System.out.println("5. Sqrt");
        System.out.println("6. a^b");
        System.out.println("7. x^2");
        System.out.println("8. x^3");
        System.out.println("9. 1/x");
        System.out.println("10. x^(1/3)");
        System.out.println("11. factorial");
        System.out.println("12. percentage");
        System.out.println("13. log10(x)");
        System.out.println("14. Modulus");
        System.out.println("15. sin(x)");
        System.out.println("16. cos(x)");
        System.out.println("17. tan(x)");

        System.out.println("Select one of the function above:-");
        int operation = scan.nextInt();
        switch (operation) {
            case 1:
                addition.add();
                break;
            case 2:
                substraction.substract();
                break;
            case 3:
                multiplication.multiply();
                break;
            case 4:
                division.divide();
                break;
            case 5:
                underroot.sqrt();
                break;
            case 6:
                exponential.a_to_power_b();
                break;
            case 7:
                exponential.square();
                break;
            case 8:
                exponential.cube();
                break;
            case 9:
                multiplicative.inverse();
                break;
            case 10:
                underroot.cubic_root();
                break;
            case 11:
                factorial.fact();
                break;
            case 12:
                percent.percentage();
                break;
            case 13:
                log.base10();
                break;
            case 14:
                mod.modulus();
                break;
            case 15:
                trignometry.sin();
                break;
            case 16:
                trignometry.cos();
                break;
            case 17:
                trignometry.tan();
                break;

            default:
                break;
        }
        scan.close();
    }
}