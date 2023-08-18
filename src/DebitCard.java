import java.util.HashMap;
import java.util.Map;

public class DebitCard extends BankCard{

    private int balance;

    private Map<String, Integer> availableFunds = new HashMap<>();

    public DebitCard(){
        this.balance = 0;
    }
    public DebitCard(int balance){
        this.balance = balance;
    }

    private void setBalance(int balance){
        this.balance = balance;
    }
    protected int getBalance(){
        return this.balance;
    }

    @Override
    void replanishment(int moneyToAdd) {
        setBalance(getBalance()+moneyToAdd);
    }

    public Map<String, Integer> getAvailableFunds(){
        availableFunds.put("Доступные средства", getBalance());
    return availableFunds;
    }

    @Override
    boolean payWithCard(int moneyToPay) {
        if (moneyToPay <= getBalance()){
            setBalance(getBalance()-moneyToPay);
            return true;
        } else {
            return false;
        }
    }
}
