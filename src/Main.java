import java.util.Scanner;

public class Main {


    public static void main(String[] args) {


        BankAccount defaultAccount = new BankAccount();
        BankAccount anjiesBankAccount = new BankAccount(12345, 0.00, "Anjie", "Anjie@gmail.com", "555-555-5555");

        System.out.println("Default account");
        System.out.println(defaultAccount);
        System.out.println(anjiesBankAccount);
        System.out.println(anjiesBankAccount.getBalance());
        Scanner scanner = new Scanner(System.in);


        System.out.println("How much do you want to deposit?");

        double depositAmount = scanner.nextDouble();

        anjiesBankAccount.deposit(depositAmount);

        System.out.println("How much would you like to withdraw?");
        double withdrawalAmount = scanner.nextDouble();
        anjiesBankAccount.withdrawal(withdrawalAmount);


    }

}