import java.text.DecimalFormat;

public class CreditCalculation {
    private final int amountOfCredit;
    private final int termOfCredit;
    private final double interestByCredit;
    private double getCalculateByMonth;
    private double getRepaymentAmount;
    private double getCalculateOverpayment;
    private final DecimalFormat decimalFormat = new DecimalFormat("#.##");

    public CreditCalculation(int amountOfCredit, int termOfCredit, double interestByCredit) {
        this.amountOfCredit = amountOfCredit;
        this.termOfCredit = termOfCredit;
        this.interestByCredit = interestByCredit;
    }

    //метод вычисления ежемесячного платежа
    public void calculateByMonth() {
        double coefficient;
        coefficient = interestByCredit / 100 / 12;
        getCalculateByMonth = amountOfCredit * (coefficient + (coefficient / (Math.pow(1 + coefficient, 24) - 1)));
        System.out.println("Ежемемесячный платеж: " + decimalFormat.format(getCalculateByMonth));
    }

    public double getcalculateByMonth() {
        return getCalculateByMonth;
    }

    //метод вычисления переплаты по кредиту
    public void CalculateOverpayment() {
        getCalculateOverpayment = getTotalRepaymentAmount() - amountOfCredit;
        System.out.println("Переплата по кредиту: " + decimalFormat.format(getCalculateOverpayment));
    }

    public double getCalculateOverpayment() {
        return getCalculateOverpayment;
    }

    //метод вычисления полной суммы возарат по кредиту
    public void totalRepaymentAmount() {
        getRepaymentAmount = getcalculateByMonth() * termOfCredit;
        System.out.println("Полная сумма возврата по кредиту: " + decimalFormat.format(getRepaymentAmount));
    }

    public double getTotalRepaymentAmount() {
        return getRepaymentAmount;
    }
}
