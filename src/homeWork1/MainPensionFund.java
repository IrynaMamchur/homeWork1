package homeWork1;

public class MainPensionFund {
    public static void main(String[] args) {
        PensionFund statePensionFund = new PensionFund("State Pension Fund", true, "15.12.2022");
        PensionFund notStatePensionFund = new PensionFund("Best Pension Fund", false, "12.07.2000");
        PensionFund secondNotStatePensionFund = new PensionFund("Public Pension Fund", false, "03.05.2021");

        statePensionFund.pensionCalculation(52);
        notStatePensionFund.pensionCalculation(45);
        secondNotStatePensionFund.pensionCalculation(50);
    }
}
