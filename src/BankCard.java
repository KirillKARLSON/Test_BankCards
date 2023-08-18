import java.util.Map;

public abstract class BankCard {
    int balance;
    abstract int getBalance();

    abstract void replanishment(int moneyToAdd);
    abstract Map<String, Integer> getAvailableFunds();
    abstract boolean payWithCard(int moneyToPay);
}
