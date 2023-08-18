import java.util.HashMap;
import java.util.Map;

/**SimpleCreditCard - простая кредитная карта, без примочек. Обладает минимальным набором функциональности.*/

public class SimpleCreditCard extends CreditCard{

    private int balance;
    private int creditLimit;

    private Map<String, Integer> availableFunds = new HashMap<>();

    protected int getBalance(){
        return this.balance;
    }

    public SimpleCreditCard(int balance, int creditLimit) {
        this.balance = balance;
        this.creditLimit = creditLimit;
    }

    public boolean payWithCard(int moneyToPay){
        if (moneyToPay <= this.balance+this.creditLimit){
            this.balance -= moneyToPay;
            return true;
        } else {
            return false;
        }
    }

    public Map<String, Integer> getAvailableFunds(){
        if (balance>0){
            availableFunds.put("Собственные средства", balance);
            availableFunds.put("Кредитные средства", creditLimit);
        } else{
            availableFunds.put("Собственные средства", 0);
            availableFunds.put("Кредитные средства", balance+creditLimit);
        }
        return this.availableFunds;
    }
    public void replanishment(int moneyToAdd) {
        this.balance+=moneyToAdd;
    }


}
