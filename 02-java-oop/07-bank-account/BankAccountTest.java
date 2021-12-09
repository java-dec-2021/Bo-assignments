

public class BankAccountTest {
    public static void main(String[] args) {
        BankAccount account1 = new BankAccount(100, 500);
        System.out.println("Account 1 Checking Balance: " + account1.getUserCheckingBalance());
        System.out.println("Account 1 Savings Balance: " + account1.getUserSavingBalance());

        account1.depositMoney("checking", 25);
        account1.depositMoney("savings", 50);

        System.out.println();
        System.out.println("Account 1 Checking Balance: " + account1.getUserCheckingBalance());
        System.out.println("Account 1 Savings Balance: " + account1.getUserSavingBalance());

        account1.withdrawMoney("checking", 100);
        account1.withdrawMoney("savings", 575);

        System.out.println();

        System.out.println("Account 1 Checking Balance: " + account1.getUserCheckingBalance());
        System.out.println("Account 1 Savings Balance: " + account1.getUserSavingBalance());

        
    }
}
