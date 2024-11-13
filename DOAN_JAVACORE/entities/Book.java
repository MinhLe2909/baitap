package DOAN_JAVACORE.entities;

public class Book {
    private static int idCounter = 0;
    private int id;
    private String title;
    private String author;
    private String genre;
    private int yearPublished;
    private int quantity;

    public Book(String title, String author, String genre, int yearPublished, int quantity) {
        this.id = ++idCounter;
        this.title = title;
        this.author = author;
        this.genre = genre;
        this.yearPublished = yearPublished;
        this.quantity = quantity;
    }

    public int getId() {
        return id;
    }

    public String getTitle() {
        return title;
    }

    public String getAuthor() {
        return author;
    }

    public String getGenre() {
        return genre;
    }

    public int getYearPublished() {
        return yearPublished;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public static int getIdCounter() {
        return idCounter;
    }

    public static void setIdCounter(int idCounter) {
        Book.idCounter = idCounter;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public void setGenre(String genre) {
        this.genre = genre;
    }

    public void setYearPublished(int yearPublished) {
        this.yearPublished = yearPublished;
    }

    @Override
    public String toString() {
        return String.format("ID: %d | Tên Sách: %s | Tác Giả: %s | Thể Loại: %s | Năm Xuất Bản: %d | Số Lượng: %d",
                id, title, author, genre, yearPublished, quantity);
    }

}
