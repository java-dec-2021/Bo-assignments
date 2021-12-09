

public class BankAccount {
    private double checkingBalance;
    private double savingsBalance;
    private static int numAccounts;
    private static int accountTotal;

    public BankAccount(double checkingBalance, double savingsBalance) {
        this.checkingBalance = checkingBalance;
        this.savingsBalance = savingsBalance;
        numAccounts++;
    }

    public double getUserCheckingBalance() {
        return checkingBalance;
    }

    public double getUserSavingBalance() {
        return savingsBalance;
    }

    public void depositMoney(String depositAccount, double depositMoney) {
        if(depositAccount.equals("checking")) {
            checkingBalance += depositMoney;
            accountTotal += depositMoney;
        } else if(depositAccount.equals("savings")) {
            savingsBalance += depositMoney;
            accountTotal += depositMoney;
        } else {
            return;
        }
    }

    public void withdrawMoney(String withdrawFromAccount, double withdrawAmount) {
        if(withdrawFromAccount.equals("checking") && checkingBalance - withdrawAmount >= 0) {
            checkingBalance -= withdrawAmount;
            accountTotal -= withdrawAmount;
        } else if(withdrawFromAccount.equals("savings") && savingsBalance - withdrawAmount >= 0) {
            savingsBalance -= withdrawAmount;
            accountTotal -= withdrawAmount; 
        } else {
            System.out.println("Insufficient Funds");
        }
    }

    public void displayTotalCheckingSavings() {
        System.out.println(accountTotal);
    }

}
