package dev.feldmann.bootcamp.aula2.tt.pdf2;

public class Company {

    private String name;
    private int goalsAchieved;
    private double profit;

    public Company(String name, int goalsAchieved, double profit) {
        this.name = name;
        this.goalsAchieved = goalsAchieved;
        this.profit = profit;
    }

    public int getGoalsAchieved() {
        return goalsAchieved;
    }

    public double getProfit() {
        return profit;
    }
}
