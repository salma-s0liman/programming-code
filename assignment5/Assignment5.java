/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package assignment5;
import java.util.Date;

public class Assignment5 {

    
    public static void main(String[] args) {
        
    }
}
class Account{
    int id;
   private double balance;
   private double annualInterestRate;
   private Date datecreated;

    Account(){
        id=0;
        annualInterestRate=0.0;
        balance=0;
        
}
    Account(int newid ){
        id=newid;
        balance=5000;
        }
    int getId() {
        return id;
         }
    double getBalance() {
        return balance;
         }
    double getAnnualInterestRate() {
        return annualInterestRate;
         }
    void setId (int newId) { 
        id = newId;
         }
    void setBalance (double newBalance) {
        balance = newBalance;
          }
    void setAnnualInterestRate (double newAnnualInterestRate) {
        annualInterestRate = newAnnualInterestRate;
          }
    void seDateCreated (Date newDateCreated) { 
         datecreated = newDateCreated;
           }
    double getMonthlyInterestRate() {
        return annualInterestRate/12;
            }
    double withdraw (double amount) {  
        return balance -= amount;
            }
    double deposit(double amount) {
        return balance += amount;
            }
}