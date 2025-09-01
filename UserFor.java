import java.util.Scanner;

public class UserFor {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int number = scan.nextInt();

        for(int i = 0; i < number; i++) {
            System.out.println(i);
        }
        scan.close();
    }
}
