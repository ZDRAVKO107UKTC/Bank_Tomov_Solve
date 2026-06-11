package Bank;

public class ReadOnlyCard implements ReadableCard {
    private final String name;
    private final int amount;

    public ReadOnlyCard(String name, int amount) {
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
}