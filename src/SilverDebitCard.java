import java.util.HashMap;
import java.util.Map;

/**SilverDebitCard - дебетовая карта с функией кэшбэка. Кэшбэк приходит при сумме затрат, превышающих определенное значение,
 * которое определяется в конструкторе при создании экземпляра карты.*/

public class SilverDebitCard extends DebitCard {


    final private int COST_TO_CASHBACK;
    private int sumCost = 0;

    private int balance;

    private Map<String, Integer> availableFunds = new HashMap<>();

    public SilverDebitCard(int balance, int costToCashBack) {
        this.balance = balance;
        this.COST_TO_CASHBACK = costToCashBack;
    }
    private void setBalance(int balance){
        this.balance = balance;
    }
    protected int getBalance(){
        return balance;
    }

    public int getSumCost() {
        return sumCost;
    }

    private void setSumCost(int sumCost) {
        this.sumCost = sumCost;
    }

    public void replanishment(int moneyToAdd) {
        setBalance(getBalance()+moneyToAdd);
    }

    private boolean isEnoughToCashBack() {
        if (sumCost >= COST_TO_CASHBACK) {
            setSumCost(getSumCost() - COST_TO_CASHBACK);
            return true;
        } else {
            return false;
        }
    }

    @Override
    public boolean payWithCard(int moneyToPay) {
        if (moneyToPay <= getBalance()) {
            setBalance(getBalance() - moneyToPay);
            setSumCost(getSumCost() + moneyToPay);
            if (isEnoughToCashBack()) {
                setBalance((int) (getBalance() + 0.1 * COST_TO_CASHBACK));}
                return true;
            } else {
                return false;
        }
    }

    @Override
    public Map<String, Integer> getAvailableFunds(){
        availableFunds.put("Доступные средства", getBalance());
        availableFunds.put("Сумма до кэшбека", COST_TO_CASHBACK-getSumCost());
        return availableFunds;
    }

}

