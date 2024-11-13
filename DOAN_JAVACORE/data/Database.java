package DOAN_JAVACORE.data;

import DOAN_JAVACORE.entities.Book;
import DOAN_JAVACORE.entities.Ticket;
import DOAN_JAVACORE.entities.User;

import java.util.ArrayList;

public class Database {
    public static ArrayList<Book> books = new ArrayList<>();
    public static ArrayList<User> users = new ArrayList<>();
    public static ArrayList<Ticket> tickets = new ArrayList<>();

    static {

        User manager = new User("admin", "admin123", "Manager");
        users.add(manager);

        books.add(new Book("Lập trình Java căn bản", "Phạm Văn Trung", "Công Nghệ Thông Tin", 2022, 1));
        books.add(new Book("Lập trình Java nâng cao", "Phạm Văn Trung", "Công Nghệ Thông Tin", 2022, 1));
        books.add(new Book("Lập trình với Python", "Nguyễn Hữu Hưng", "Công Nghệ Thông Tin", 2022, 5));
        books.add(new Book("Lập trình với Python nâng cao", "Nguyễn Hữu Hưng", "Công Nghệ Thông Tin", 2022, 5));
        books.add(new Book("Cây Cam Ngọt Của Tôi", "José Mauro de Vasconcelos", "Tiểu Thuyết", 2020, 30));
        books.add(new Book("Nhật Ký Đặng Thùy Trâm", "Đặng Thùy Trâm", "Tiểu Thuyết", 2022, 10));
        books.add(new Book("Chiến Tranh Tiền Tệ", "Song Hong Bing", "Kinh Tế", 2022, 5));
        books.add(new Book("Tăng Trưởng Đột Phá", "Sean Ellis, Morgan Brown", "Kinh Tế", 2020, 5));
        books.add(new Book("Giải Thích Ngữ Pháp Tiếng Anh", "Mai Lan Hương, Hà Thanh Uy", "Ngoại Ngữ", 1973, 5));
        books.add(new Book("Học Tiếng Nhật Cấp Tốc", "Thiên Phúc", "Ngoại Ngữ", 2016, 5));
        books.add(new Book("Giáo Trình Chuẩn HSK 1", "Khương Lệ Bình", "Ngoại Ngữ", 2023, 5));
        books.add(new Book("15 Phút Tự Học Tiếng Hàn Mỗi Ngày", "The Changmi", "Ngoại Ngữ", 2020, 5));
        books.add(new Book("Võ Nguyên Giáp qua lời kể của những người thân", "Đặng Anh Đào", "Lịch Sử", 2014, 5));
        books.add(new Book("Lập Trình Với C#", " Phạm Quang Hiển", "Công Nghệ Thông Tin", 2020, 5));

    }
}
