package dev.feldmann.bootcamp.aula1.tm.pdf2;


public class Exercise2 {


    private static class Company {

        private String name;
        double value;
        double avgAnnualGrow;

        public Company(String name, double value, double avgAnnualGrow) {
            this.name = name;
            this.value = value;
            this.avgAnnualGrow = avgAnnualGrow;
        }

        public double getValue() {
            return value;
        }


        public void grow() {
            this.value = value * (1 + avgAnnualGrow);

        }

        public void printCompany(int year) {
            double valueInMillions = this.value / 1_000_000;
            String formatted =  String.format("Empresa %s - 01/01/%d - Valor da empresa: %.2fm",this.name,year,valueInMillions);
            System.out.println(formatted);
        }
    }

    public static void main(String[] args) {
        var x = new Company("X", 1_130_000, 1.48);
        var y = new Company("Y", 18_400_000, 0.32);

        int year = 2021;

        do {
            System.out.println("---");
            x.printCompany(year);
            y.printCompany(year);

            if (x.getValue() > y.getValue()) {
                break;
            }

            x.grow();
            y.grow();
            year++;
        } while (true);

        System.out.println("A empresa X ultrapassará Y em "+year);


    }
}
