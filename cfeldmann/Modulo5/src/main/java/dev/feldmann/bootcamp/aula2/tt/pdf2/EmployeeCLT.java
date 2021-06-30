package dev.feldmann.bootcamp.aula2.tt.pdf2;

public class EmployeeCLT extends Employee {

    private EmployeeType type;

    public EmployeeCLT(Company company, String name, EmployeeType type) {
        super(company, name);
        this.type = type;
    }

    @Override
    public double payWage() {
        double baseWage = this.type.getBaseWage();
        double profitShare = this.getCompany().getProfit() * this.type.getProfitShare();
        double totalGoalBonus =  baseWage * this.type.getGoalBonusPercentage() * this.getCompany().getGoalsAchieved();

        return baseWage + totalGoalBonus + profitShare;
    }


}
