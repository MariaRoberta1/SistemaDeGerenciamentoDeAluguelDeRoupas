package Entidades;

public class Funcionario {
	private int id;
    private String nome;
    private String cargo;
    private double salario;
    private String email;
    private String telefone;

    public Funcionario() {
    }

    public Funcionario(int id, String nome, String cargo, double salario, String email, String telefone) {
        this.id = id;
        this.nome = nome;
        this.cargo = cargo;
        this.salario = salario;
        this.email = email;
        this.telefone = telefone;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCargo() {
        return cargo;
    }

    public void setCargo(String cargo) {
        this.cargo = cargo;
    }

    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getTelefone() {
        return telefone;
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }

    @Override
    public String toString() {
        return "Funcionario [ID=" + id + ", Nome=" + nome + ", Cargo=" + cargo + ", Salário=" + salario + ", Email=" + email + ", Telefone=" + telefone + "]";
    }
	    
}

