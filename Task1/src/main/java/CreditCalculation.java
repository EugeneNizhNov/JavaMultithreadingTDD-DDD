public class CreditCalculation {
    private final int amountOfCredit;
    private final int termOfCredit;
    private final double interestByCredit;
    private double getCalculateByMonth;
    private double getRepaymentAmount;
    private double getCalculateOverpayment;

    public CreditCalculation(int amountOfCredit, int termOfCredit, double interestByCredit) {
        this.amountOfCredit = amountOfCredit;
        this.termOfCredit = termOfCredit;
        this.interestByCredit = interestByCredit;
    }

    //метод вычисления ежемесячного платежа
    public void calculateByMonth() {
        return;
    }

    public double getcalculateByMonth() {
        return getCalculateByMonth;
    }

    //метод вычисления переплаты по кредиту
    public void CalculateOverpayment() {
        return;
    }

    public double getCalculateOverpayment() {
        return getCalculateOverpayment;
    }

    //метод вычисления полной суммы возарат по кредиту
    public void totalRepaymentAmount() {
        return;
    }

    public double getTotalRepaymentAmount() {
        return getRepaymentAmount;
    }
}
