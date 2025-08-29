//👤 Customer:
//Open new account
//
//Deposit money
//
//Withdraw money
//
//Check balance
//
//View account details
//
import java.sql.SQLOutput;
import java.util.*;
import java.util.ArrayList;

public class Customer {
    private String name;
    private int age;
    private String Address;
    private  double balance;
    private String bankAccountNumber;

    public String getBankAccountNumber() {
        return bankAccountNumber;
    }

    public void setBankAccountNumber(String bankAccountNumber) {
        this.bankAccountNumber = bankAccountNumber;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getAddress() {
        return Address;
    }

    public void setAddress(String address) {
        Address = address;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public void DisplayDetails(){
        System.out.println("Name : "+getName()+"BankAccountNumber : "+getBankAccountNumber()+" Age : "+getAge()+" Address : "+getAddress()+" Balance : "+getBalance());
    }
}



