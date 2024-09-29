
import java.util.Scanner;

public class AverageOfNumbers {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double count = 0;
        double sum = 0;
        double average = 0;

        while(true){
            System.out.println("Give a number: ");
            double number = Double.valueOf(scanner.nextLine());

            if (number == 0) {
                break;
            }
            else if (number == number) {
                count = count + 1;
                sum = sum + number;
                average = sum/count;
            }
        }
        System.out.println("Average of the numbers: " + average);
    }
}
