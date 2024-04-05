class BankAccount {
    private double balance;

    public BankAccount(double initialBalance) {
        this.balance = initialBalance;
    }

    public synchronized void deposit(double amount) {
        balance += amount;
        System.out.println(Thread.currentThread().getName() + " deposited " + amount + ", balance is now " + balance);
    }

    public synchronized void withdraw(double amount) {
        if (balance >= amount) {
            balance -= amount;
            System.out.println(Thread.currentThread().getName() + " withdrew " + amount + ", balance is now " + balance);
        } else {
            System.out.println(Thread.currentThread().getName() + " tried to withdraw " + amount + " but balance is insufficient");
        }
    }
}

public class hw20 {
    public static void main(String[] args) {
        BankAccount account = new BankAccount(1000);

        // Create threads for transactions
        Thread thread1 = new Thread(() -> {
            account.deposit(500);
        });
        Thread thread2 = new Thread(() -> {
            account.withdraw(200);
        });
        Thread thread3 = new Thread(() -> {
            account.withdraw(700);
        });
        Thread thread4 = new Thread(() -> {
            account.deposit(300);
        });


        thread1.start();
        thread2.start();
        thread3.start();
        thread4.start();
    }
}

