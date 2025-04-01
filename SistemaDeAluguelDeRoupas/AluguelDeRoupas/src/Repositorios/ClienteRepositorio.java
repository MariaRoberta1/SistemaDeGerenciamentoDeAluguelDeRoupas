package Repositorios;

import java.util.ArrayList;

import Interface.IClienterepositorio;

public class ClienteRepositorio implements IClienterepositorio {
	

    public <Cliente> ClienteRepositorio(ArrayList<Cliente> clientes) {
       this.clientes = clientes;
    }
    
    private ArrayList<Cliente> clientes;

	public void salvar(Cliente cliente){
        this.clientes.add(cliente);
    }

    public Cliente buscarClientePorNome(String nome) {
        if (this.clientes != null) {
            for (Cliente cliente : this.clientes) {
                if (cliente.getNome().equalsIgnoreCase(nome)) {
                    return cliente;
                }
            }
        } else {
            System.out.println("ARRAY LIST VAZIO !");
        }
        return null;
    }

     public ArrayList<Cliente> listarTodosClientes(){
                return clientes;
        }

    public boolean removerCliente(Cliente cliente){
            return clientes.remove(cliente);
    }

    public boolean desativarCliente(Cliente cliente){
            cliente.setAtivo(false);
            return true;
    }

	@Override
	public void salvar(Object cliente) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public boolean removerCliente(Object cliente) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean desativarCliente(Object cliente) {
		// TODO Auto-generated method stub
		return false;
	}
	

}