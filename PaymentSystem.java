package pa4;


//Interface Payment
interface PaymentSystem {
 void pay(double amount);
 String getPaymentDetails();
}

//Class CreditCardPayment
class CreditCardPayment implements PaymentSystem {
 private String cardNumber;
 private String cardHolderName;

 public CreditCardPayment(String cardNumber, String cardHolderName) {
     this.cardNumber = cardNumber;
     this.cardHolderName = cardHolderName;
 }

 @Override
 public void pay(double amount) {
     System.out.println("Processing credit card payment of $" + amount + " for card holder: " + cardHolderName);
 }

 @Override
 public String getPaymentDetails() {
     return "Credit Card Payment [Card Number=****" + cardNumber.substring(cardNumber.length() - 4) + ", Card Holder Name=" + cardHolderName + "]";
 }
}

//Class PayPalPayment
class PayPalPayment implements PaymentSystem {
 private String email;
 private String password;

 public PayPalPayment(String email, String password) {
     this.email = email;
     this.password = password;
 }

 @Override
 public void pay(double amount) {
     System.out.println("Processing PayPal payment of $" + amount + " for email: " + email);
 }

 @Override
 public String getPaymentDetails() {
     return "PayPal Payment [Email=" + email + "]";
 }
}
