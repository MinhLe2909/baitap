package DOAN_JAVACORE.entities;

public class Ticket {
    private static int idCounter = 0;
    private int id;
    private int userId;
    private int bookId;

    public Ticket(int userId, int bookId) {
        this.id = ++idCounter;
        this.userId = userId;
        this.bookId = bookId;
    }

    public int getId() { return id; }
    public int getUserId() { return userId; }
    public int getBookId() { return bookId; }

    public static int getIdCounter() {
        return idCounter;
    }

    public static void setIdCounter(int idCounter) {
        Ticket.idCounter = idCounter;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setUserId(int userId) {
        this.userId = userId;
    }

    public void setBookId(int bookId) {
        this.bookId = bookId;
    }

    @Override
    public String toString() {
        return "Ticket{" +
                "id=" + id +
                ", userId=" + userId +
                ", bookId=" + bookId +
                '}';
    }
}