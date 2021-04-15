package com.example.bankapp.oop;

public class CheckingAccount extends Account{
    private static double FEE = 2.5;

    public CheckingAccount(){
        super();
    }

    public CheckingAccount(int accountNumber, double fee){
        super(accountNumber);
        this.FEE = fee;
    }

    @Override
    public void deposit(double amount) {
        if(amount > 0){
            super.balance += amount;
            System.out.printf("Amount %.2f deposited%n", amount);
            super.balance -= FEE;
            System.out.printf("Fee %.2f Applied%n", FEE);
            System.out.printf("Current Balance is: %.2f%n", balance);
        }else{
            System.out.println("A negative amount cannot be deposited");
        }
    }

    @Override
    public void withdraw(double amount) {
        if(amount+this.FEE <= this.balance){
            System.out.printf("Amount of %.2f withdrawn from Account%n", amount);
            this.balance -= amount;
            this.balance -= this.FEE;
            System.out.printf("Fee of %.2f applied%n", FEE);
            System.out.printf("Current Balance is: %.2f%n", balance);
        }else{
            System.out.println("Negative amount cannot be withdrawn!");
        }
    }
}

