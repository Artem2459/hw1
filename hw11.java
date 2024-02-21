import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

// Задача 1: Менеджер книг у бібліотеці
class Book {
    private String title;
    private String author;
    private int year;

    public Book(String title, String author, int year) {
        this.title = title;
        this.author = author;
        this.year = year;
    }

    // Getters
    public String getTitle() {
        return title;
    }

    public String getAuthor() {
        return author;
    }

    public int getYear() {
        return year;
    }
}

class Library {
    private List<Book> books;

    public Library() {
        this.books = new ArrayList<>();
    }

    // Додавання нової книги
    public void addBook(Book book) {
        books.add(book);
    }

    // Видалення книги
    public void removeBook(Book book) {
        books.remove(book);
    }

    // Пошук книги за назвою
    public Book findBookByTitle(String title) {
        for (Book book : books) {
            if (book.getTitle().equals(title)) {
                return book;
            }
        }
        return null;
    }

    // Пошук книги за автором
    public List<Book> findBooksByAuthor(String author) {
        List<Book> booksByAuthor = new ArrayList<>();
        for (Book book : books) {
            if (book.getAuthor().equals(author)) {
                booksByAuthor.add(book);
            }
        }
        return booksByAuthor;
    }

    // Статичний метод для підрахунку кількості книг у бібліотеці
    public static int countBooks(Library library) {
        return library.books.size();
    }
}

// Задача 2: Управління банківським рахунком
class BankAccount {
    private double balance;

    public BankAccount(double balance) {
        this.balance = balance;
    }

    // Додавання грошей на рахунок
    public void deposit(double amount) {
        balance += amount;
    }

    // Зняття грошей з рахунку
    public void withdraw(double amount) {
        if (balance >= amount) {
            balance -= amount;
        } else {
            System.out.println("Insufficient funds");
        }
    }

    // Getter для балансу
    public double getBalance() {
        return balance;
    }
}

class Bank {
    private Map<Integer, BankAccount> accounts;
    private int nextAccountId;

    public Bank() {
        this.accounts = new HashMap<>();
        this.nextAccountId = 1;
    }

    // Створення нового банківського рахунку
    public int createAccount(double initialBalance) {
        int accountId = nextAccountId;
        accounts.put(accountId, new BankAccount(initialBalance));
        nextAccountId++;
        return accountId;
    }

    // Блокування рахунку
    public void blockAccount(int accountId) {
        // Implementation
    }

    // Розблокування рахунку
    public void unblockAccount(int accountId) {
        // Implementation
    }

    // Getter для банківського рахунку по ID
    public BankAccount getAccount(int accountId) {
        return accounts.get(accountId);
    }
}

// Задача 3: Система управління персоналом
class Employee {
    private String name;
    private double salary;
    private String department;

    public Employee(String name, double salary, String department) {
        this.name = name;
        this.salary = salary;
        this.department = department;
    }

    // Getter і Setter для зарплати
    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    // Getter для відділу
    public String getDepartment() {
        return department;
    }
}

class HRSystem {
    private List<Employee> employees;

    public HRSystem() {
        this.employees = new ArrayList<>();
    }

    // Додавання нового працівника
    public void addEmployee(Employee employee) {
        employees.add(employee);
    }

    // Видалення працівника
    public void removeEmployee(Employee employee) {
        employees.remove(employee);
    }

    // Підрахунок загальної зарплати компанії
    public double calculateTotalSalary() {
        double totalSalary = 0;
        for (Employee employee : employees) {
            totalSalary += employee.getSalary();
        }
        return totalSalary;
    }

    // Статичний метод для підрахунку середньої зарплати працівників компанії
    public static double calculateAverageSalary(HRSystem hrSystem) {
        double totalSalary = hrSystem.calculateTotalSalary();
        return totalSalary / hrSystem.employees.size();
    }
}

public class hw11 {
    public static void main(String[] args) {
        // Задача 1: Менеджер книг у бібліотеці
        Library library = new Library();
        library.addBook(new Book("The Great Gatsby", "F. Scott Fitzgerald", 1925));
        library.addBook(new Book("To Kill a Mockingbird", "Harper Lee", 1960));
        library.addBook(new Book("1984", "George Orwell", 1949));

        System.out.println("Total number of books in the library: " + Library.countBooks(library));

        // Задача 2: Управління банківським рахунком
        Bank bank = new Bank();
        int accountId1 = bank.createAccount(1000);
        int accountId2 = bank.createAccount(2000);

        BankAccount account1 = bank.getAccount(accountId1);
        BankAccount account2 = bank.getAccount(accountId2);

        System.out.println("Initial balance of account 1: " + account1.getBalance());
        System.out.println("Initial balance of account 2: " + account2.getBalance());

        // Задача 3: Система управління персоналом
        HRSystem hrSystem = new HRSystem();
        hrSystem.addEmployee(new Employee("John Doe", 50000, "Engineering"));
        hrSystem.addEmployee(new Employee("Jane Smith", 60000, "Marketing"));
        hrSystem.addEmployee(new Employee("Mike Johnson", 70000, "Sales"));

        System.out.println("Total salary of the company: $" + hrSystem.calculateTotalSalary());
        System.out.println("Average salary of the company: $" + HRSystem.calculateAverageSalary(hrSystem));
    }
}
