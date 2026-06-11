package Bank;

public class Main {
    public static void main(String[] args) {
        Card card1 = new Card("Main card", 1000);
        final ReadableCard card2 = new ReadOnlyCard("Read-only card", 1000);

        card1.deposit(500);
        card1.withdraw(200);

        System.out.println(card1.getName() + ": " + card1.getAmount());
        System.out.println(card2.getName() + ": " + card2.getAmount());
    }
}
