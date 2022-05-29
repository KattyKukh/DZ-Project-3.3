public class Main {
    public static void main(String[] args) {
        CreditPaymentService service = new CreditPaymentService();
        System.out.println();
        System.out.println("Сумма кредита: 1 000 000 руб., процентная ставка 9.99%, срок кредита 1 год");
        System.out.println("Аннуитетный платеж: " + service.calculate(1_000_000,9.99,1) + " руб.");
        System.out.println();
        System.out.println("Сумма кредита: 1 000 000 руб., процентная ставка 9.99%, срок кредита 2 года");
        System.out.println("Аннуитетный платеж: " + service.calculate(1_000_000,9.99,2) + " руб.");
        System.out.println();
        System.out.println("Сумма кредита: 1 000 000 руб., процентная ставка 9.99%, срок кредита 3 года");
        System.out.println("Аннуитетный платеж: " + service.calculate(1_000_000,9.99,3) + " руб.");
    }
}
