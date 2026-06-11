package Bank;

public class Card implements ReadableCard {
    private final String name;
    private int amount;

    public Card(String name, int amount) {
        if (amount < 0) {
            throw new IllegalArgumentException("Starting amount cannot be negative.");
        }

        this.name = name;
        this.amount = amount;
    }

    @Override
    public String getName() {
        return name;
    }

    @Override
    public int getAmount() {
        return amount;
    }

    public void deposit(int amount) {
        if (amount <= 0) {
            throw new IllegalArgumentException("Deposit amount must be positive.");
        }

        this.amount += amount;
    }

    public void withdraw(int amount) {
        if (amount <= 0) {
            throw new IllegalArgumentException("Withdraw amount must be positive.");
        }

        if (amount > this.amount) {
            throw new IllegalArgumentException("Not enough money.");
        }

        this.amount -= amount;
    }
}
