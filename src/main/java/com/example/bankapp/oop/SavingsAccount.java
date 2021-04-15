package com.example.bankapp.oop;

public class SavingsAccount extends Account{
    private double interestRate;

    public SavingsAccount(){
        super();
    }

    public SavingsAccount(int accountNumber, double interestRate){
        super(accountNumber);
        this.interestRate = interestRate;
    }

    // getter function
    public double getInterestRate(){
        return this.interestRate;
    }

    public void setInterestRate(double interestRate){
        this.interestRate = interestRate;
    }

    public double calcInterest(){
        return this.balance*this.interestRate;
    }

    public void applyInterest(){
        double interest = calcInterest();
        System.out.printf("Interest amount %.2f added to balance%n", interest);
        this.deposit(interest);
    }

    @Override
    public void deposit(double amount) {
        if(amount > 0){
            this.balance += amount;
            System.out.printf("Amount %.2f deposited%n", amount);
            System.out.printf("Current Balance is: %.2f%n", balance);
        }else{
            System.out.println("A negative amount cannot be deposited");
        }
    }

    @Override
    public void withdraw(double amount) {
        if(amount > 0){
            if(amount <= this.balance){
                System.out.printf("Amount of %.2f withdrawn from Account%n", amount);
                this.balance -= amount;
                System.out.printf("Current Balance is: %.2f%n", balance);
            }
        }else{
            System.out.println("Negative amount cannot be withdrawn!");
        }
    }
}


