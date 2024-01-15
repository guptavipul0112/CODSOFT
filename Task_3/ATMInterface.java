import java.util.Scanner;



public class ATMInterface {
    public static void main(String [] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the Initial Balance of the Account: ");
        int initBal = sc.nextInt();

        BankAccount userAccount = new BankAccount(initBal);
        ATM atm = new ATM(userAccount);

        int choice;

        do {

            System.out.println("\n******************** Welcome to ATM ********************");
            System.out.println("\t\t1. Withdraw");
            System.out.println("\t\t2. Deposit");
            System.out.println("\t\t3. Check Balance");
            System.out.println("\t\t4. Exit");
            System.out.println("*********************************************************");
            System.out.print("Enter Your Choice: ");

            choice = atm.sc.nextInt();

            switch(choice) {
                case 1:
                    atm.withdraw();
                    break;
                
                case 2:
                    atm.deposit();
                    break;
                
                case 3:
                    atm.checkBalance();
                    break;

                case 4:
                    System.out.println("Thank You for Visiting our ATM");
                    break;
                
                default:
                    System.out.println("Invalid Input, Please Try again");
            }
        } while (choice != 4);
        atm.sc.close();
    }
}

class BankAccount {
    private double bal;

    public BankAccount(double initBal) {
        this.bal = initBal;
    }

    public double getBal() {
        return bal;
    }
    
    public void deposit(double amount) {
        bal += amount;
    }

    public boolean withdraw(double amount) {
        if (amount <= bal) {
            bal -= amount;
            return true;
        }
        return false;
    }
}

class ATM {
    private BankAccount userAccount;
    Scanner sc;

    public ATM(BankAccount account) {
        this.userAccount = account;
        this.sc = new Scanner(System.in); 
    }

    void withdraw() {
        System.out.print("Enter the withdraw amount: ");
        double amount = sc.nextDouble();

        if (userAccount.withdraw(amount)) {
            System.out.println("\nWithdraw Success, Balance Remaining: "+userAccount.getBal());
        }
        else
            System.out.println("Insufficient Funds. Withdraw Failed");
    }

    void deposit() {
        System.out.print("Enter the Deposit Amount: ");
        double  amount = sc.nextDouble();
        userAccount.deposit(amount);
        System.out.println("\nDeposit Successful, Updated Account Balance: "+userAccount.getBal());
    }

    void checkBalance() {
        System.out.println("Current Available Balance: "+userAccount.getBal());
    }
}