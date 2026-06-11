package Bank;

class Bank {
    public void showAmount(ReadableCard card) {
        System.out.println(card.getName() + " amount: " + card.getAmount());
    }
}