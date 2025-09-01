import java.util.Scanner;

public class MultipleCondition {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int number = -1;

        while(number <= 0){
            System.out.print("Enter a positive number: ");
            number = scan.nextInt();

            if (number<=0) {
                System.out.println("Invalid input. Enter a positive number.");
            }
        }
        System.out.println("You entered: " + number);
        scan.close();
    }
}
