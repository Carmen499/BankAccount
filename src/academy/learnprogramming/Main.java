package academy.learnprogramming;

public class Main {

    public static void main(String[] args) {
        BankAccount carmenAccount = new BankAccount(12354, 2.50,
                "Carmen Smith", "VJS@yahoo.com", "555-555-555");


        //now that parameters are set (bankAccount class) we can print out the parameters by using ".get" and constructor name

        System.out.println(carmenAccount.getAccountNumber());
        System.out.println(carmenAccount.getCustomerName());


        carmenAccount.depositFunds(100);
        carmenAccount.withdrawFunds(50);
    }
}
