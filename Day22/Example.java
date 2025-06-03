package Day22;

import java.util.Scanner;

class BankAccount{
    
    int deposit(int balance,int amount){
    return amount+balance;
    }

    int withdraw(int amount){
        return balance-amount;
    }
}

class SavingsAccount extends BankAccount{

}

public class Example {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);

    }
}
