package dev.feldmann.bootcamp.aula2.tt.pdf2;

public enum EmployeeType {

    TECHNICIAN(3200, 40, .05, 0),
    ANALYST(4000, 40, .08, 4),
    MANAGER(6000, 36, .125, 4),
    DIRECTOR(15000, 0, 0, 0, .03);


    // Salario base
    private double baseWage;
    // Horas trabalhadas por semana
    private double workHoursPerWeek;
    // Bonus por meta
    private double goalBonusPercentage;
    // Horas de descanso remuneradas
    private double paidRestHours;
    // Participação nos lucros
    private double profitShare;


    EmployeeType(double baseWage, double workHoursPerWeek, double goalBonusPercentage, double paidRestHours, double profitShare) {
        this.baseWage = baseWage;
        this.workHoursPerWeek = workHoursPerWeek;
        this.goalBonusPercentage = goalBonusPercentage;
        this.paidRestHours = paidRestHours;
        this.profitShare = profitShare;
    }

    EmployeeType(double baseWage, double workHoursPerWeek, double goalBonus, double paidRestHours) {
        this(baseWage, workHoursPerWeek, goalBonus, paidRestHours, 0);
    }

    public double getBaseWage() {
        return baseWage;
    }

    public double getWorkHoursPerWeek() {
        return workHoursPerWeek;
    }

    public double getGoalBonusPercentage() {
        return goalBonusPercentage;
    }

    public double getPaidRestHours() {
        return paidRestHours;
    }

    public double getProfitShare() {
        return profitShare;
    }
}
