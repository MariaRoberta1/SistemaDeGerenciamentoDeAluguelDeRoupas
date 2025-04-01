package Servicos;
import java.util.Scanner;
import Entidades.Clientes;
import Repositorio.ClienteRepositorio;
import interface.IClienterepositorio;


public class ClienteServicos {
	

    private IClienteRepositorio clienteRepositorio;

    public ClienteServicos(ClienteRepositorio clienteRepositorio) {
        this.clienteRepositorio = clienteRepositorio;
    }
    
    public void salvar(Clientes cliente){
        this.clienteRepositorio.salvar(cliente);
    }

    public void cadastrarCliente(Clientes cliente, String nome, String cpf, String telefone, String email) {
        
        if (!validarCPF(cpf)) {
            System.out.println("CPF inválido, Cliente não pode ser cadastrado");
            return;
        }

        if (isBlank(nome)) {
            System.out.println("Nome inválido, Cliente não pode ser cadastrado");
            return; 
        }

        if (isBlank(email) || !email.contains("@")) {
            System.out.println("E-mail inválido, Cliente não pode ser cadastrado");
            return;
        }

        if (!validarTelefone(telefone)) {
            System.out.println("Telefone inválido, Cliente não pode ser cadastrado");
            return;
        }

        Clientes clientePesquisado = this.clienteRepositorio.buscarClientePorNome(nome);

        if (clientePesquisado == null) {
            cliente.setNome(nome);
            cliente.setCpf(cpf);
            cliente.setTelefone(telefone);
            cliente.setEmail(email);
            cliente.setAtivo(true);
            this.salvar(cliente);
            System.out.println("Cliente cadastrado com sucesso!");
        } else {
            System.out.println("Cliente já existe no sistema.");
        }
    }

    public boolean deletarCliente(Cliente cliente){
        Cliente clientePesquisado = this.clienteRepositorio.buscarClientePorNome(cliente.getNome());

        if (clientePesquisado != null) {
            System.out.println("Cliente deletado com sucesso!");
            return this.clienteRepositorio.removerCliente(cliente);
        } else {
            System.out.println("Cliente inexistente!");
            return false;
        }
    }

    public void inativarCliente(Cliente cliente){
        Cliente clientePesquisado = this.clienteRepositorio.buscarClientePorNome(cliente.getNome());

        if (clientePesquisado != null) {
            cliente.setAtivo(false);
            System.out.println("Cliente desativado com sucesso!");
        } else {
            System.out.println("Cliente inexistente!");
        }
    }

    public void listarClientesAtivos(){
        for (Cliente cliente : this.clienteRepositorio.listarTodosClientes()){
            if (cliente.isAtivo()) {
                System.out.println("Nome: " + cliente.getNome());            
            }      
        }
    }

    public void listarClientesInativos(){
        for (Cliente cliente : this.clienteRepositorio.listarTodosClientes()){
            if (!cliente.isAtivo()) {
                System.out.println("Nome: " + cliente.getNome());
            }
        }
    }

    private boolean validarCPF(String cpf){
        return cpf != null && cpf.length() == 11;
    }

    private boolean validarTelefone(String telefone){
        return telefone != null && telefone.length() >= 8;
    }

    private boolean isBlank(String string){
        return string == null || string.trim().isEmpty();
    }

}
