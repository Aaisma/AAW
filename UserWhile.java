import java.util.Scanner;

public class UserWhile {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int number = scan.nextInt();

        int i=0;
        while(i< number) {
            System.out.println("Value of i: " + i);
            i++;
        }
        scan.close();
    }
}
