package dev.feldmann.bootcamp.aula2.tt.pdf2;

public class EmployeePJ extends Employee {


    private double remunerationByHour;
    private double workedHours;

    public EmployeePJ(Company company, String nome, float remunerationByHour, float workedHours) {
        super(company, nome);
        this.remunerationByHour = remunerationByHour;
        this.workedHours = workedHours;
    }


    @Override
    public double payWage() {
        return remunerationByHour * workedHours;
    }
}
