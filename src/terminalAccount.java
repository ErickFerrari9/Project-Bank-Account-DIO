import java.math.BigDecimal;
import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class terminalAccount {
    public static void main(String[] args) {

        int agency = 1021; // Fixed agency number

        Scanner scanner=new Scanner(System.in);

        System.out.println("Welcome, let's open your account!");

        System.out.print("Please enter your name: ");
        String name = scanner.nextLine();

        System.out.print("Please enter your email: ");
        String email = scanner.nextLine();

        System.out.print("Please enter the value of your first deposit: ");
        BigDecimal deposit = new BigDecimal(scanner.next());

        System.out.println("Thank you, " + name + "!");
        System.out.println("Your account has been successfully created with the following details:");

        System.out.println("Account Number: " + accountNumberGenerator.numberGenerator() + " - Agency: " + agency);
        System.out.println("Name: " + name);
        System.out.println("Email: " + email);
        System.out.println("Initial Deposit: " + deposit);
        System.out.println("Your account is now active and ready to use!");


    }

}