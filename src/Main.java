public class Main {
    public static void main(String[] args) {
        CreditPaymentService service = new CreditPaymentService();
        double sumCredit = 1_000_000;
        double interestRate = 9.99;
        int creditPeriod;

        creditPeriod = 1;
        System.out.println();
        System.out.println("Сумма кредита: " + sumCredit + " руб., процентная ставка: " + interestRate + "%, срок кредита: " + creditPeriod + " год");
        System.out.println("Аннуитетный платеж: " + service.calculate(sumCredit, interestRate, creditPeriod) + " руб.");

        creditPeriod = 2;
        System.out.println();
        System.out.println("Сумма кредита: " + sumCredit + " руб., процентная ставка: " + interestRate + "%, срок кредита: " + creditPeriod + " года");
        System.out.println("Аннуитетный платеж: " + service.calculate(sumCredit, interestRate, creditPeriod) + " руб.");

        creditPeriod = 3;
        System.out.println();
        System.out.println("Сумма кредита: " + sumCredit + " руб., процентная ставка: " + interestRate + "%, срок кредита: " + creditPeriod + " года");
        System.out.println("Аннуитетный платеж: " + service.calculate(sumCredit, interestRate, creditPeriod) + " руб.");
    }
}
