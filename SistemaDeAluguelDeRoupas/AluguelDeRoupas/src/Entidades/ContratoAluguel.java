package Entidades;
import java.util.List;

public class ContratoAluguel {
    private int idContratoAluguel;
    private Clientes cliente; // Objeto Cliente
    private List<Roupas> roupas; // Lista de objetos Roupas
    private String dataInicio;
    private String dataFim;
    private double valor;
    private String status; // Ex: "Pendente", "Ativo", "Finalizado"
    private Funcionario funcionario; // Funcionário responsável pelo contrato de aluguel

    public ContratoAluguel(int idContratoAluguel, Clientes cliente, List<Roupas> roupas, String dataInicio, String dataFim, double valor, Funcionario funcionario) {
        this.idContratoAluguel = idContratoAluguel;
        this.cliente = cliente;
        this.roupas = roupas;
        this.dataInicio = dataInicio;
        this.dataFim = dataFim;
        this.valor = valor;
        this.status = "Pendente"; // Inicia como Pendente
        this.funcionario = funcionario;
    }

    public ContratoAluguel(int i, String string, String string2, double d, String string3) {
        //TODO Auto-generated constructor stub
    }

    public int getIdContratoAluguel() {
        return idContratoAluguel;
    }

    public void setIdContratoAluguel(int idContratoAluguel) {
        this.idContratoAluguel = idContratoAluguel;
    }

    public Clientes getCliente() {
        return cliente;
    }

    public void setCliente(Clientes cliente) {
        this.cliente = cliente;
    }

    public List<Roupas> getRoupas() {
        return roupas;
    }

    public void setRoupas(List<Roupas> roupas) {
        this.roupas = roupas;
    }

    public String getDataInicio() {
        return dataInicio;
    }

    public void setDataInicio(String dataInicio) {
        this.dataInicio = dataInicio;
    }

    public String getDataFim() {
        return dataFim;
    }

    public void setDataFim(String dataFim) {
        this.dataFim = dataFim;
    }

    public double getValor() {
        return valor;
    }

    public void setValor(double valor) {
        this.valor = valor;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public Funcionario getFuncionario() {
        return funcionario;
    }

    public void setFuncionario(Funcionario funcionario) {
        this.funcionario = funcionario;
    }
}



