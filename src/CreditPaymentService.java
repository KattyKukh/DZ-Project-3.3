public class CreditPaymentService {
    public double calculate(double sumCredit, double interestRate, int creditPeriod) {
        double annuityRatio = Math.pow((1 + interestRate / 1200), creditPeriod * 12);
        double creditPayment = Math.round(sumCredit * (interestRate / 1200 * annuityRatio) / (annuityRatio - 1));
        return creditPayment;
    }

}
