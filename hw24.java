////////import java.util.ArrayList;
////////import java.util.List;
////////
////////class hw24 {
////////    private String title;
////////    private String author;
////////    private int year;
////////    private int id;
////////
////////    public hw24(String title, String author, int year, int id) {
////////        this.title = title;
////////        this.author = author;
////////        this.year = year;
////////        this.id = id;
////////    }
////////
////////    // Геттери та сеттери
////////
////////    public void addBook() {
////////        LibrarySystem.getInstance().addBook(this);
////////    }
////////
////////    public void removeBook() {
////////        LibrarySystem.getInstance().removeBook(this);
////////    }
////////
////////    public void editBook() {
////////        LibrarySystem.getInstance().editBook(this);
////////    }
////////
////////    public List<Book> searchByTitle(String title) {
////////        return LibrarySystem.getInstance().searchBookByTitle(title);
////////    }
////////
////////    public List<Book> searchByAuthor(String author) {
////////        return LibrarySystem.getInstance().searchBookByAuthor(author);
////////    }
////////}
////////
////////class Reader {
////////    private String firstName;
////////    private String lastName;
////////    private String phoneNumber;
////////    private int cardNumber;
////////
////////    public Reader(String firstName, String lastName, String phoneNumber, int cardNumber) {
////////        this.firstName = firstName;
////////        this.lastName = lastName;
////////        this.phoneNumber = phoneNumber;
////////        this.cardNumber = cardNumber;
////////    }
////////
////////    // Геттери та сеттери
////////
////////    public void registerReader() {
////////        LibrarySystem.getInstance().addReader(this);
////////    }
////////
////////    public void removeReader() {
////////        LibrarySystem.getInstance().removeReader(this);
////////    }
////////
////////    public void editReader() {
////////        LibrarySystem.getInstance().editReader(this);
////////    }
////////}
////////<Book> readers;
////////class Loan {
////////    private Book book;
////////    private Reader reader;
////////    private String dueDate;
////////    private double fine;
////////
////////    public Loan(Book book, Reader reader, String dueDate, double fine) {
////////        this.book = book;
////////        this.reader = reader;
////////        this.dueDate = dueDate;
////////        this.fine = fine;
////////    }
////////
////////    // Геттери та сеттери
////////
////////    public void issueBook() {
////////        LibrarySystem.getInstance().issueBook(book, reader, dueDate);
////////    }
////////
////////    public void returnBook() {
////////        LibrarySystem.getInstance().returnBook(book, reader);
////////    }
////////
////////    public void calculateFine() {
////////        LibrarySystem.getInstance().calculateFine(this);
////////    }
////////}
////////
////////class Reservation {
////////    private Book reservedBook;
////////    private Reader reservedBy;
////////
////////    public Reservation(Book reservedBook, Reader reservedBy) {
////////        this.reservedBook = reservedBook;
////////        this.reservedBy = reservedBy;
////////    }
////////
////////    // Геттери та сеттери
////////
////////    public void reserveBook() {
////////        LibrarySystem.getInstance().reserveBook(reservedBook, reservedBy);
////////    }
////////
////////    public void cancelReservation() {
////////        LibrarySystem.getInstance().cancelReservation(reservedBook, reservedBy);
////////    }
////////}
////////
////////class LibrarySystem {
////////    private static LibrarySystem instance;
////////    private List<Book> books;
////////    private List
//////
//////private LibrarySystem() {
//////    books = new ArrayList<>();
//////    readers = new ArrayList<>();
//////}
//////
//////public static LibrarySystem getInstance() {
//////    if (instance == null) {
//////        instance = new LibrarySystem();
//////    }
//////    return instance;
//////}
//////
//////// Методи для керування книгами
//////
//////public void addBook(Book book) {
//////    books.add(book);
//////}
//////
//////public void removeBook(Book book) {
//////    books.remove(book);
//////}
//////
//////public void editBook(Book book) {
//////    // Логіка для редагування книги
//////}
//////
//////public List<Book> searchBookByTitle(String title) {
//////    List<Book> result = new ArrayList<>();
//////    for (Book book : books) {
//////        if (book.getTitle().equalsIgnoreCase(title)) {
//////            result.add(book);
//////        }
//////    }
//////    return result;
//////}
//////
//////public List<Book> searchBookByAuthor(String author) {
//////    List<Book> result = new ArrayList<>();
//////    for (Book book : books) {
//////        if (book.getAuthor().equalsIgnoreCase(author)) {
//////            result.add(book);
//////        }
//////    }
//////    return result;
//////}
//////
//////// Методи для керування читачами
//////
//////public void addReader(Reader reader) {
//////    readers.add(reader);
//////}
//////
//////public void removeReader(Reader reader) {
//////    readers.remove(reader);
//////}
//////
//////public void editReader(Reader reader) {
//////    // Логіка для редагування читача
//////}
//////
//////// Методи для видачі та повернення книг
//////
//////public void issueBook(Book book, Reader reader, String dueDate) {
//////    // Логіка для видачі книги читачеві
//////}
//////
//////public void returnBook(Book book, Reader reader) {
//////    // Логіка для повернення книги
//////}
//////
//////public void calculateFine(Loan loan) {
//////    // Логіка для розрахунку боргу читача
//////}
//////
//////// Методи для резервування та видалення резервації книг
//////
//////public void reserveBook(Book book, Reader reader) {
//////    // Логіка для резервування книги
//////}
//////
//////public void cancelReservation(Book book, Reader reader) {
//////    // Логіка для видалення резервації книги
//////}
////public String loadFromFile() {
////    // Логіка для завантаження даних з файлу
////    return "";
////}
//Reader reader1 = new Reader("John", "Doe", "123-456-7890", 1001);
//Reader reader2 = new Reader("Jane", "Smith", "987-654-3210", 1002);
//
//// Реєстрація читачів та додавання книг до системи
//    reader1.registerReader();
//    reader2.registerReader();
//
//    book1.addBook();
//    book2.addBook();
//
//// Видача книги та резервування книги
//    LibrarySystem.getInstance().issueBook(book1, reader1, "2024-05-15");
//    LibrarySystem.getInstance().reserveBook(book2, reader2);
//
//// Повернення книги та видалення резервації
//    LibrarySystem.getInstance().returnBook(book1, reader1);
//    LibrarySystem.getInstance().cancelReservation(book2, reader2);
//}
