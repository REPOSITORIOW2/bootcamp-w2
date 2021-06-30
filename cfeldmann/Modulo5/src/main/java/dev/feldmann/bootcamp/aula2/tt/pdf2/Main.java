package dev.feldmann.bootcamp.aula2.tt.pdf2;

public class Main {


    public static void main(String[] args) {

        Company company = new Company("Aparture Science", 1, 100000);
        Employee pj = new EmployeePJ(company, "Edmilson", 12, 400);
        Employee diretor = new EmployeeCLT(company, "Ednaldo", EmployeeType.DIRECTOR);
        Employee technician = new EmployeeCLT(company, "Ednaldo", EmployeeType.TECHNICIAN);
        Employee manager = new EmployeeCLT(company, "Ednaldo", EmployeeType.MANAGER);
        Employee analyst = new EmployeeCLT(company, "Ednaldo", EmployeeType.ANALYST);


        System.out.println("PJ: " + pj.payWage());
        System.out.println("TECHNICIAN: " + technician.payWage());
        System.out.println("ANALYST: " + analyst.payWage());
        System.out.println("MANAGER: " + manager.payWage());
        System.out.println("DIRETOR: " + diretor.payWage());


    }
}
