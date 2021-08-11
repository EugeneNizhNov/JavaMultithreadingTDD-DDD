import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class CereditCalcTest {
    CreditCalculation creditCalculation = new CreditCalculation(200000, 24, 12);

    @Test
    public void calculateByMothTest() {
        creditCalculation.calculateByMonth();
        double expected = creditCalculation.getcalculateByMonth();
        double actual = 9414.694444652936;
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void CalculateOverpayment() {
        creditCalculation.calculateByMonth();
        creditCalculation.totalRepaymentAmount();
        creditCalculation.CalculateOverpayment();
        double expected = creditCalculation.getCalculateOverpayment();
        double actual = 25952.66667167045;
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void totalRepaymentAmount() {
        creditCalculation.calculateByMonth();
        creditCalculation.totalRepaymentAmount();
        double expected = creditCalculation.getTotalRepaymentAmount();
        double actual = 225952.66667167045;
        Assertions.assertEquals(expected, actual);
    }
}