package pa4;



public class Test_PaymentSystem {
	 public static void main(String[] args) {
		 PaymentSystem creditCardPayment = new CreditCardPayment("1234567812345678", "Steven");
		 PaymentSystem payPalPayment = new PayPalPayment("steven@example.com", "password123");

	     // Process credit card payment
	     creditCardPayment.pay(100.0);
	     System.out.println(creditCardPayment.getPaymentDetails());

	     // Process PayPal payment
	     payPalPayment.pay(200.0);
	     System.out.println(payPalPayment.getPaymentDetails());
	 }
	}
