package pattern;

public class Client {
    public static void main(String[] args) {
        PaymentContext paymentContext = new PaymentContext();

        //Credit card
        paymentContext.setStrategy(new CreditCardPayment());
        paymentContext.executePayment(1000);

        //Paypal
        paymentContext.setStrategy(new PaypalPayment());
        paymentContext.executePayment(2000);

        //Bank
        paymentContext.setStrategy(new BankTransferPayment());
        paymentContext.executePayment(3000);
    }
}
