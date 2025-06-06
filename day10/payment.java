interface PaymentGateway{
    boolean processpayment(double ammount);
    String getTransactionId(String transactionid);
}
class CreditCardpayment  implements PaymentGateway{
    public boolean processpayment (double amount){
    System.out.println("Processing Payment $"+ amount);
    return true;
    }
    public String getTransactionId(String transactionid){
        return "Credit Card Transction ID: "+transactionid;
    }

}
class UPIPayment implements PaymentGateway{
    public boolean processpayment(double amount){
        System.out.println("Processing payment $"+amount);
        return true;
    }
    public String get
}