import java.util.*;

public class Main {
    public static void main(String[] args) {
        Bank obj = new Bank();
        Scanner sc = new Scanner(System.in);

        while (true) {
            System.out.println("\n===== Welcome to Smart Bank System =====");
            System.out.println("1. Open Account");
            System.out.println("2. Deposit");
            System.out.println("3. Withdraw");
            System.out.println("4. Check Balance");
            System.out.println("5. View Account Details");
            System.out.println("0. Exit");
            System.out.print("Enter your choice: ");

            int value = sc.nextInt();
            sc.nextLine();

            switch (value) {
                case 1:

                    System.out.print("Enter Your Name: ");
                    String name = sc.nextLine();

                    System.out.print("Enter Your Age: ");
                    int age = sc.nextInt();
                    sc.nextLine();

                    System.out.print("Enter Address: ");
                    String address = sc.nextLine();

                    long accNo = (long)(Math.random() * 1_0_0_0_0_0_0L);
                    String bankAccountNumber = "0080"+ accNo;

                    System.out.println("Your Bank Account Number is : "+bankAccountNumber);

                    obj.openAccount(name, age, address,bankAccountNumber);

                    break;

                case 2:
                    System.out.print("Enter Your Name: ");
                    String name1 = sc.nextLine();

                    System.out.print("Enter Your Bank Account Number : ");
                    String banckacc = sc.nextLine();

                    System.out.print("Enter Amount to Deposit: ");
                    double amount = sc.nextDouble();
                    sc.nextLine();

                  //  nextLine() reads the leftover \n (Enter key) from previous input
                    // if we dont use  sc.nextLine(); while using string input it skip to take input of String
                    
                    obj.deposit(name1, banckacc, amount);

                    break;

                case 3:
                    System.out.print("Enter Your Name: ");
                    String name2 = sc.nextLine();

                    System.out.print("Enter Your Bank Account Number : ");
                    String banckacc2 = sc.nextLine();


                    System.out.print("Enter Amount to Withdraw: ");
                    double amount2 = sc.nextDouble();
                    sc.nextLine();

                    obj.withdraw(name2, banckacc2,amount2);

                    break;

                case 4:
                    System.out.print("Enter Your Name: ");
                    String name3 = sc.nextLine();

                    System.out.print("Enter Your Bank Account Number : ");
                    String banckacc3 = sc.nextLine();

                    obj.checkBalance(name3, banckacc3);

                    break;

                case 5:
                    System.out.print("Enter Your Name: ");
                    String name4 = sc.nextLine();

                    System.out.print("Enter Your Bank Account Number : ");
                    String banckacc4 = sc.nextLine();

                    obj.viewAccountDetails(name4, banckacc4);

                    break;

                case 0:
                    System.out.println("Thank you for using the Smart Banking System!");
                    sc.close();
                    return;

                default:
                    System.out.println("Please enter a valid option.");
            }
        }
    }
}
