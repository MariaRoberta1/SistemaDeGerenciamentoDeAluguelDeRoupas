package App;

import Entidades.ContratoAluguel;
import Repositorios.ContratoAluguelRepositorio;

public class App {

	public static void main(String[] args) {
		ContratoAluguelRepositorio repositorio = new ContratoAluguelRepositorio();

        // Criando um exemplo de contrato
        ContratoAluguel contrato = new ContratoAluguel(1, "2025-03-31", "2025-04-30", 200.0, "Ativo");

        // Salvando o contrato no repositório
        repositorio.salvar(contrato);

        // Buscando o contrato pelo ID
        ContratoAluguel contratoEncontrado = repositorio.buscarContratoPorId(1);
        System.out.println(contratoEncontrado);

        // Alterando o contrato
        contrato.setStatus("Finalizado");
        repositorio.alterarContrato(contrato);

        // Listando todos os contratos
        System.out.println(repositorio.listarTodosContratos());


	}

}
