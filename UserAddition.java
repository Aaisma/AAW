import java.util.Scanner; //importing a scanner class

public class UserAddition {
    public static void main(String[] args) {
        Scanner myobj = new Scanner(System.in); //Creates a scanner object
        
        System.out.print("Enter the first number: ");
        int num1 = myobj.nextInt(); 

        System.out.print("Enter the second number: ");
        int num2 = myobj.nextInt();

        int sum = num1 + num2;

        System.out.println("The sum of " + num1 + " and " + num2 + " is " + sum + ".");

        myobj.close();
    }
    
}
