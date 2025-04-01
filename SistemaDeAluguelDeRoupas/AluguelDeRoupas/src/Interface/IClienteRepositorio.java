package Interface;

import java.util.ArrayList;

public interface IClienteRepositorio<Cliente> {
	void salvar(Cliente cliente);
    Cliente buscarClientePorNome(String nome);
    boolean removerCliente(Cliente cliente);
    ArrayList<Cliente> listarTodosClientes();
    boolean desativarCliente(Cliente cliente);

}
