package entities;

public class FisicalPerson extends Person {

    private Double healthcareExpenditures;

    public FisicalPerson(String name, Double anualIncome, Double healthcareExpenditures) {
        super(name, anualIncome);
        this.healthcareExpenditures = healthcareExpenditures;
    }

    public Double getHealthcareExpenditures() {
        return healthcareExpenditures;
    }

    public void setHealthcareExpenditures(Double healthcareExpenditures) {
        this.healthcareExpenditures = healthcareExpenditures;
    }

    @Override
    public double tax() {
        double totalTax = 0.0;

        if (getAnualIncome() > 20000.00) {
            if (getHealthcareExpenditures() > 0.0) {
                totalTax = getAnualIncome() * 0.25 - getHealthcareExpenditures() * 0.5;
            } else {
                totalTax = getAnualIncome() * 0.25;
            }
        } else {
            if (getHealthcareExpenditures() > 0.0) {
                totalTax = getAnualIncome() * 0.15 - getHealthcareExpenditures() * 0.5;
            } else {
                totalTax = getAnualIncome() * 0.15;
            }
        }

        return totalTax;
    }
}
