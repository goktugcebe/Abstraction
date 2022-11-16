/**
 * The CreditCard program implements an application that
 *  *   simply create an abstract class and method for VisaCard and MasterCard classes.
  */

abstract class CreditCard {
    private String cardName;
    private double cardBalance;

     /**
      *
      * @param cardName
      * @param cardBalance
      */
     public CreditCard(String cardName, double cardBalance) {
         this.cardName = cardName;
         this.cardBalance = cardBalance;
     }

     public String getCardName() {
         return cardName;
     }

     public void setCardName(String cardName) {
         this.cardName = cardName;
     }

     public double getCardBalance() {
         return cardBalance;
     }

     public void setCardBalance(double cardBalance) {
         this.cardBalance = cardBalance;
     }
 }
