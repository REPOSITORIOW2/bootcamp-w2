package dev.feldmann.bootcamp.aula2.tt.pdf2;


public abstract class Employee {

    private Company company;
    private String nome;

    public Employee(Company company, String nome) {
        this.company = company;
        this.nome = nome;
    }

    public String getNome() {
        return nome;
    }

    public Company getCompany() {
        return company;
    }

    public abstract double payWage();

}
