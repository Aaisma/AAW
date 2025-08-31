import java.util.Scanner; //importing the scanner class

public class UserName {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in); //Creating the scanner object
        System.out.print("Enter a Username: "); //Asks the user

        String username = scanner.nextLine(); //Read user input as string
        System.out.println("Username is " + username); //Output
        scanner.close(); //Close the scanner to free resources
    }
    
}
