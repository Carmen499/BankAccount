package academy.learnprogramming;

public class BankAccount {
    private int accountNumber;
    private double balance;
    private String customerName;
    private String email;
    private String phoneNumber;

//constructors are useful in setting values or eve default values.
    public BankAccount(int accountNumber, double balance, String customerName,
                       String email, String phoneNumber){

        this.accountNumber = accountNumber;
        this. balance = balance;
        this.customerName = customerName;         //This is "setting" field values within the constructor
        this.email = email;
        this.phoneNumber = phoneNumber;
    }

    public void setAccountNumber(int accountNumber) {
        this.accountNumber = accountNumber;
    }

    public int getAccountNumber() {
        return accountNumber;
    }

    public void setBalance(int balance) {
        this.balance = balance;
    }

    public double getBalance() {
        return balance;
    }

    public void setCustomerName(String customerName) {
        this.customerName = customerName;
    }

    public String getCustomerName() {
        return customerName;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getEmail() {
        return email;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void depositFunds(int depositAmount) {
       this.balance += depositAmount;
        System.out.println("Deposit of " + depositAmount + " made. New balance is " + this.balance);
    }

    public void withdrawFunds(int withdrawalAmount) {
        if (this.balance - withdrawalAmount < 0) {     // its not "<= 0" because if you have $10 and you want to withdraw 10 then you would be left with 0 balance
            System.out.println("Only " + this.balance + " available. Withdrawal not processed");
        } else {
           this.balance -= withdrawalAmount;
            System.out.println("Withdrawal amount of " + withdrawalAmount + " processed. Remaining balance is " + this.balance);
        }

    }
}