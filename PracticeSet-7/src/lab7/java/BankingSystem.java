package lab7.java;

//BankAccount class simulating the bank account with balance
class BankAccount {
 private int balance;

 public BankAccount(int balance) {
     this.balance = balance;
 }

 // Synchronized method to ensure thread safety when withdrawing money
 public synchronized boolean withdraw(int amount) {
     if (amount <= balance) {
         balance -= amount;  // Deduct the amount if enough balance is available
         System.out.println(Thread.currentThread().getName() + 
        		 " successfully withdrew " + amount + ". Remaining balance: " + balance);
         return true;
     } else {
         // If not enough balance, print a message and return false
         System.out.println(Thread.currentThread().getName() + 
        		 " failed to withdraw " + amount + ". Insufficient balance.");
         return false;
     }
 }

 public int getBalance() {
     return balance;
 }
}

//Customer class simulating a customer withdrawing money
class Customer extends Thread {
 private BankAccount account;
 private int amount;

 public Customer(BankAccount account, int amount) {
     this.account = account;
     this.amount = amount;
 }

 @Override
 public void run() {
     // Try to withdraw money
     account.withdraw(amount);
 }
}

public class BankingSystem {
 public static void main(String[] args) {
     
     BankAccount account = new BankAccount(1000);

     
     Customer customer1 = new Customer(account, 300); 
     Customer customer2 = new Customer(account, 500);  
     Customer customer3 = new Customer(account, 200);  
     Customer customer4 = new Customer(account, 400);  

    
     customer1.start();
     customer2.start();
     customer3.start();
     customer4.start();

     try {
         // Wait for all threads to finish
         customer1.join();
         customer2.join();
         customer3.join();
         customer4.join();
     } catch (InterruptedException e) {
         e.printStackTrace();
     }
 }
}
