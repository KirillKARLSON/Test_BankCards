# Test_BankCards
My test work for applying

In this project I create abstract BankCard class and some other classes, that extends from BankCard.

# DebitCard
Simple realization of abstract class BankCard, that provide opotunities to 
* create card,
* pay with card,
* replanishment card
* show available funds.

# SilverDebitCard
This class, also can provide such opotunities like DebitCard and, besides that,
can put a cashback to the card balance, if sum of payments grow more than "special sum".
"Special sum" assigned during create instance of Class;

# SimpleCreditCard
Simple realization of abstract class CreditCard. Class provide opotunities:

* create card,
* pay with card,
* replanishment card
* show available funds (own funds, credit funds).

# SilverCreditCard
Realization of abstract class CreditCard, that supports all function of SimpleCreditCard and also 
can improve credit limit of the card, if sum of loan payments is more than "Control Sum".

