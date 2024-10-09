package BTVN_ATM;

public class Account {
    private String username;
    private String password;
    private double balance;

    public Account(String username, String password, double balance) {
        this.username = username;
        this.password = password;
        this.balance = balance;
    }

    public String getUsername() {
        return username;
    }

    public String getPassword() {
        return password;
    }

        public double getBalance() {
            return balance;
    }

    public void withdraw(double amount) {
        if (amount <= balance) {
            balance -= amount;
            System.out.println("Bạn đã rút " + amount + " VNĐ vào lúc " + java.time.LocalDateTime.now());
            System.out.println("Số dư hiện tại của bạn là: "+balance);
        } else {
            System.out.println("Số dư không đủ để rút.");
        }
    }
}
