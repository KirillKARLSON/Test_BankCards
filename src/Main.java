public class Main {
    public static void main(String[] args) {


        /** Тестируем класс SimpleCreditCard: создаем карту, выводим на экран результаты покупок в случае,
         * когда доступных средств хватает (первые две покупки), когда не хватает(третья покупка),
         * производим пополнение счета, затем снова пробуем(четвертая покупка). Далее выводим на экран доступные средства.
         */
       /*SimpleCreditCard scc = new SimpleCreditCard(1000, 5000);

        System.out.println("Оплата прошла? " + scc.payWithCard(500));
        System.out.println ("Доступные средства:\n"+scc.getAvailableFunds());
        System.out.println("Оплата прошла? " + scc.payWithCard(1500));
        System.out.println("Оплата прошла? "+ scc.payWithCard(5000));
        System.out.println ("Доступные средства:\n"+scc.getAvailableFunds());
        scc.replanishment(1500);
        System.out.println ("Доступные средства:\n"+scc.getAvailableFunds());
        System.out.println("Оплата прошла? "+scc.payWithCard(5000));
        System.out.println ("Доступные средства:\n"+scc.getAvailableFunds());*/



        /**Тестируем класс DebitCard, */
        /*DebitCard sdc = new DebitCard (1000);
        System.out.println(sdc.getAvailableFunds());
        sdc.payWithCard(500);
        System.out.println(sdc.getAvailableFunds());
        sdc.replanishment(1000);
        System.out.println(sdc.getAvailableFunds());
        System.out.println(sdc.payWithCard(1600));*/







   /**Тестируем SilverDebitCard */
        SilverDebitCard silverDebitCard = new SilverDebitCard(1000, 2000);
        System.out.println(silverDebitCard.getAvailableFunds());

        silverDebitCard.replanishment(1500);

        System.out.println(silverDebitCard.getAvailableFunds());

        silverDebitCard.payWithCard(1000);

        System.out.println(silverDebitCard.getAvailableFunds());

        silverDebitCard.payWithCard(1000);
        System.out.println(silverDebitCard.getAvailableFunds());


     /**Тестируем SilverCreditCard*/

  /*
     SilverCreditCard silverCreditCard = new SilverCreditCard(3000,0,2000);

        silverCreditCard.payWithCard(1500);
        System.out.println(silverCreditCard.getAvailableFunds());
        silverCreditCard.replanishment(2000);
        System.out.println(silverCreditCard.getAvailableFunds());

        silverCreditCard.payWithCard(2500);
        System.out.println(silverCreditCard.getAvailableFunds());
        silverCreditCard.replanishment(1500);
        System.out.println(silverCreditCard.getAvailableFunds());
        silverCreditCard.replanishment(500);
        System.out.println(silverCreditCard.getAvailableFunds());*/

    }
}