
import java.util.Scanner;

public class AverageOfPositiveNumbers {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double number;
        double count = 0;
        double sum = 0;
        double average = 0;

        while(true){
            number = Double.valueOf(scanner.nextLine());

            if (number == 0) {
                break;
            }
            else if (number > 0) {
                count = count + 1;
                sum = sum + number;
                average = sum/count;
            }
        }
            if(average > 0){
                System.out.println("Average of the numbers: " + average);
            }else{
                System.out.println("Cannot calculate the average");
            }
        }
    }
