import java.util.Scanner;
public class UserSimpleCondition {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the first number: ");
        int num1 = sc.nextInt();

        Scanner sc2 = new Scanner(System.in);
        System.out.print("Enter the second number: ");
        int num2 = sc2.nextInt();

        if (num1>num2){
            System.out.print(num1 + " is greater than " + num2);
        } else {
            System.out.print(num2 + " is greater than " + num1);
        }

        sc.close();
        sc2.close();

    }
    
}
