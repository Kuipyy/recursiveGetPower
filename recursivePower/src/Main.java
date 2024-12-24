
import java.util.Scanner;

public class Main {

    static int getPower(int a, int b) {
        if (b == 0) {
            return 1;
        } else {
            return a * getPower(a, b - 1);
        }
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter the base number: ");
        int base = input.nextInt();

        System.out.print("Enter the power number: ");
        int power = input.nextInt();

        int result = getPower(base, power);
        System.out.printf("The result of %d^%d is %d%n", base, power, result);

    }
}