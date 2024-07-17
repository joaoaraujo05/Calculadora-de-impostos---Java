package entities;

public class LegalPerson extends Person {

    private Integer numberOfEmployees;

    public LegalPerson(){}

    public LegalPerson(String name, Double anualIncome, Integer numberOfEmployees) {
        super(name, anualIncome);
        this.numberOfEmployees = numberOfEmployees;
    }

    public Integer getNumberOfEmployees() {
        return numberOfEmployees;
    }

    public void setNumberOfEmployees(Integer numberOfEmployees) {
        this.numberOfEmployees = numberOfEmployees;
    }

    @Override
    public double tax() {
        double totalTax = 0.0;

        if (getNumberOfEmployees() > 10) {
            totalTax = getAnualIncome() * 0.14;
        } else {
            totalTax = getAnualIncome() * 0.16;
        }

        return totalTax;
    }
}
