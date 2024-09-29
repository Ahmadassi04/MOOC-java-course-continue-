
import java.util.Scanner;

public class SquareRootOfSum {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double number1 = Double.valueOf(scanner.nextLine());
        double number2 = Double.valueOf(scanner.nextLine());

        double sum = number1 + number2;
        double squareRoot = Math.sqrt(sum);

        System.out.println(squareRoot);
    }
}
