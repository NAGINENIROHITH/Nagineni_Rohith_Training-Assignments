package Oops_Assignment;
class BankAccount {
    protected String accountNo;
    protected double balance;

    // Constructor
    public BankAccount(String accountNo, double balance) {
        this.accountNo = accountNo;
        this.balance = balance;
    }

    // Method to deposit money
    public void deposit(double amount) {
        if (amount > 0) {
            balance += amount;
            System.out.println(amount + " deposited. New Balance: " + balance);
        } else {
            System.out.println("Invalid deposit amount!");
        }
    }

    // Method to withdraw money
    public void withdraw(double amount) {
        if (amount > 0 && amount <= balance) {
            balance -= amount;
            System.out.println(amount + " withdrawn. New Balance: " + balance);
        } else {
            System.out.println("Invalid or insufficient funds!");
        }
    }
}


class SavingsAccount extends BankAccount {
    private double interestRate;

    public SavingsAccount(String accountNo, double balance, double interestRate) {
        super(accountNo, balance);
        this.interestRate = interestRate;
    }

    // Method to add interest
    public void addInterest() {
        double interest = balance * (interestRate / 100);
        balance += interest;
        System.out.println("Interest added: " + interest + ". New Balance: " + balance);
    }
}


class SalaryAccount extends BankAccount {
    private double monthlySalary;

    public SalaryAccount(String accountNo, double balance, double monthlySalary) {
        super(accountNo, balance);
        this.monthlySalary = monthlySalary;
    }

    // Method to credit monthly salary
    public void creditSalary() {
        balance += monthlySalary;
        System.out.println("Salary credited: " + monthlySalary + ". New Balance: " + balance);
    }
}

public class BankDemo {
    public static void main(String[] args) {

        // Savings Account Test
        SavingsAccount sa = new SavingsAccount("SA101", 5000, 5);
        sa.deposit(1000);
        sa.withdraw(2000);
        sa.addInterest();

        System.out.println();

        // Salary Account Test
        SalaryAccount sla = new SalaryAccount("SAL201", 3000, 25000);
        sla.creditSalary();
        sla.withdraw(5000);
        sla.deposit(2000);
    }
}
