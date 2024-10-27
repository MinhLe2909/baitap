package KiemTraOOP.bai2.entities;

import java.util.regex.Pattern;

public class User {
    private String username;
    private String password;
    private String email;

    public User(String username, String password, String email) {
        this.username = username;
        this.password = password;
        this.email = email;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    // Check tính hợp lệ của email
    public static boolean isValidEmail(String email) {
        String emailRegex = "^[a-zA-Z0-9._%+-]+@[a-zA-Z0-9.-]+\\.[a-zA-Z]{2,6}$";
        return Pattern.matches(emailRegex, email);
    }

    // Check tính hợp lệ của password
    public static boolean isValidPassword(String password) {
        String passwordRegex = "^(?=.*[A-Z])(?=.*[\\.,-_!;])(?=.*[a-zA-Z0-9]).{7,15}$";
        return Pattern.matches(passwordRegex, password);
    }


}
