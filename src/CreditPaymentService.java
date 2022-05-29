public class CreditPaymentService {
    public double calculate(double sumCredit, double interestRate, int creditPeriod) {
        double creditPayment = Math.round(sumCredit*(interestRate/1200*Math.pow((1+interestRate/1200),creditPeriod*12)/(-1+Math.pow((1+interestRate/1200),creditPeriod*12))));
        return creditPayment;
    }

}
