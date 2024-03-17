import java.util.ArrayList;
import java.util.List;

// Клас Book
class Book {
    private String title;
    private String author;
    private int year;
    private String isbn;

    public Book(String title, String author, int year, String isbn) {
        this.title = title;
        this.author = author;
        this.year = year;
        this.isbn = isbn;
    }

    // гетери та сетери для полів книги
    public String getTitle() {
        return title;
    }

    public String getAuthor() {
        return author;
    }

    public int getYear() {
        return year;
    }

    public String getIsbn() {
        return isbn;
    }
}

// Enum
enum ExceptionType {
    DUPLICATE_BOOK, INVALID_YEAR, BOOK_NOT_FOUND
}

// Клас для винятків
class LibraryException extends RuntimeException {
    private ExceptionType type;

    public LibraryException(ExceptionType type, String message) {
        super(message);
        this.type = type;
    }

    public ExceptionType getType() {
        return type;
    }
}


public class hw17 {
    private List<Book> books = new ArrayList<>();

    public void addBook(String title, String author, int year, String isbn) {
        for (Book book : books) {
            if (book.getIsbn().equals(isbn)) {
                throw new LibraryException(ExceptionType.DUPLICATE_BOOK, "Книга з таким ISBN вже існує");
            }
        }
        if (year < 0 || year > 2024) {
            throw new LibraryException(ExceptionType.INVALID_YEAR, "Невірний рік видання");
        }
        books.add(new Book(title, author, year, isbn));
    }

    public void removeBook(String isbn) {
        boolean removed = books.removeIf(book -> book.getIsbn().equals(isbn));
        if (!removed) {
            throw new LibraryException(ExceptionType.BOOK_NOT_FOUND, "Книга з таким ISBN не знайдена");
        }
    }

    public Book findBookByIsbn(String isbn) {
        for (Book book : books) {
            if (book.getIsbn().equals(isbn)) {
                return book;
            }
        }
        throw new LibraryException(ExceptionType.BOOK_NOT_FOUND, "Книга з таким ISBN не знайдена");
    }

    public List<Book> findBooksByAuthor(String author) {
        List<Book> result = new ArrayList<>();
        for (Book book : books) {
            if (book.getAuthor().equals(author)) {
                result.add(book);
            }
        }
        return result;
    }

    public List<Book> findBooksByYear(int year) {
        List<Book> result = new ArrayList<>();
        for (Book book : books) {
            if (book.getYear() == year) {
                result.add(book);
            }
        }
        return result;
    }

    public static void main(String[] args) {
        LibraryApp libraryApp = new LibraryApp();
        try {
            libraryApp.addBook("Війна і мир", "Лев Толстой", 1869, "978-3-16-148410-0");
            libraryApp.addBook("1984", "Джордж Орвелл", 1949, "978-3-16-148411-0");
            libraryApp.addBook("Анна Кареніна", "Лев Толстой", 1877, "978-3-16-148412-0");
            libraryApp.addBook("Майстер і Маргарита", "Михайло Булгаков", 1967, "978-3-16-148413-0");
            libraryApp.removeBook("978-3-16-148412-0");
            Book book = libraryApp.findBookByIsbn("978-3-16-148411-0");
            System.out.println("Знайдена книга: " + book.getTitle());
            List<Book> booksByAuthor = libraryApp.findBooksByAuthor("Лев Толстой");
            System.out.println("Книги Льва Толстого:");
            for (Book b : booksByAuthor) {
                System.out.println(b.getTitle());
            }
            List<Book> booksByYear = libraryApp.findBooksByYear(1967);
            System.out.println("Книги, видані у 1967 році:");
            for (Book b : booksByYear) {
                System.out.println(b.getTitle());
            }
        } catch (LibraryException e) {
            System.out.println("Помилка: " + e.getMessage());
        }
    }
}
