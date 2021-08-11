public class Main {
    public static void main(String[] args) {
         CreditCalculation creditCalculation = new CreditCalculation(200000,24,12);
        creditCalculation.calculateByMonth();
        creditCalculation.totalRepaymentAmount();
        creditCalculation.CalculateOverpayment();
    }
}
