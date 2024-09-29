
import java.util.Scanner;

public class AbsoluteValue {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int number = Integer.valueOf(scanner.nextLine());
        int positive = number * -1;

        if(number > 0){
            System.out.println(number);
        }else{
            System.out.println(positive);
        }
    }
}
