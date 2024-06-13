package data;

public class Wallet {
//     you can add here more data, and based on that send proper event, or any other action
    private Double balance;

    public Wallet(Double balance) {
        this.balance = balance;
    }

    public Double getBalance() {
        return balance;
    }
}
