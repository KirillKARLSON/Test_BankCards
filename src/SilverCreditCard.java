import java.util.HashMap;
import java.util.Map;


/** SilverCreditCard предоставляет возможность увеличения кредитного лимита на 10% в случае превышения суммы возврата кредита
 * на сумму, задаваемую через конструктор. */

public class SilverCreditCard extends CreditCard{

    private final int SUM_FOR_INCREASE_CREDIT_LIMIT;

    private int sumOfPayedCreditsNow = 0;
    private int balance;
    private int creditLimit;
    private Map<String, Integer> availableFunds = new HashMap<>();

    public SilverCreditCard(int SUM_FOR_INCREASE_CREDIT_LIMIT, int balance, int creditLimit) {
        super();
        this.SUM_FOR_INCREASE_CREDIT_LIMIT = SUM_FOR_INCREASE_CREDIT_LIMIT;
        this.balance = balance;
        this.creditLimit = creditLimit;
    }
    @Override
    public void replanishment(int moneyToAdd) {
        if (balance<0) workWithCreditLimit (moneyToAdd);
        balance+=moneyToAdd;
    }

    private void workWithCreditLimit (int moneyToAdd){
        if (balance+moneyToAdd<=0) sumOfPayedCreditsNow+=moneyToAdd;
        else sumOfPayedCreditsNow+= -balance;

        if (sumOfPayedCreditsNow >= SUM_FOR_INCREASE_CREDIT_LIMIT) {
            sumOfPayedCreditsNow-=SUM_FOR_INCREASE_CREDIT_LIMIT;
            creditLimit = (int) (1.1*creditLimit);
        }
    }

    @Override
    Map<String, Integer> getAvailableFunds(){
        if (balance>0){
            availableFunds.put("Собственные средства", balance);
            availableFunds.put("Кредитные средства", creditLimit);
            availableFunds.put("Погасить для увеличения лимита", SUM_FOR_INCREASE_CREDIT_LIMIT-sumOfPayedCreditsNow);

        } else{
            availableFunds.put("Собственные средства", 0);
            availableFunds.put("Кредитные средства", balance+creditLimit);
            availableFunds.put("Погасить для увеличения лимита", SUM_FOR_INCREASE_CREDIT_LIMIT - sumOfPayedCreditsNow);
        }
        return this.availableFunds;
    }

    public boolean payWithCard(int moneyToPay){
        if (moneyToPay <= balance+creditLimit){
            balance-=moneyToPay;
            return true;
        } else {
            return false;
        }
    }
}
