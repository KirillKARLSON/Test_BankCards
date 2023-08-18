import java.util.HashMap;
import java.util.Map;

public abstract class CreditCard extends BankCard{

    private int balance;

    private int creditLimit;

    Map<String, Integer> availableFunds = new HashMap<>();


    private int getCreditLimit(){return this.creditLimit;}

    protected int getBalance(){
        return this.balance;
    }

    private void setBalance(int balance) {
        this.balance = balance;
    }

    private void setCreditLimit(int creditLimit) {
        this.creditLimit = creditLimit;
    }

    @Override
    abstract void replanishment(int moneyToAdd);


    Map<String, Integer> getAvailableFunds(){
        if (getBalance()>0){
            availableFunds.put("Собственные средства", balance);
            availableFunds.put("Кредитные средства", creditLimit);
        } else{
            availableFunds.put("Собственные средства", 0);
            availableFunds.put("Кредитные средства", balance+creditLimit);
        }
        return this.availableFunds;
    }

    public boolean payWithCard(int moneyToPay){
        if (moneyToPay <= this.balance+this.creditLimit){
            this.balance-=moneyToPay;
            return true;
        } else {
            return false;
        }
    }
}
