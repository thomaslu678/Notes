/**
 * This represents a bank account with a balance
 * which allows for deposits, withdrawals, and
 * returns a balance
 *
 */

public class BankAccount {

    private double balance;

    /**
     * Creates a bank account with a zero dollar balance
     */
    public BankAccount() {
        balance = 0;
    }

    /**
     * Creates an instance of a bank account with a starting balance
     * @param balance the starting balance
     */

    public BankAccount(double balance){
        this.balance = balance;
    }

    /**
     * Deposits to a bank account updated the balance
     * @param amount the amount to deposit
     */

    public void deposit(double amount){
        balance = balance + amount;
    }

    /**
     * Withdraw from a bank account updating the balance
     * @param amount the amount to withdraw
     *
     */

    public void withdraw(double amount){
        balance = balance - amount;
    }

    /**
     * Returns the account balance
     * @return the account balance
     */

    public double getBalance() {
        return balance;
    }

}