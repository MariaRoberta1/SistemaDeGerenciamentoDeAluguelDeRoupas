package Interface;
import Entidades.ContratoAluguel;

import java.util.ArrayList;


public interface IContratoAluguelRepositorio {

   
    void salvar(ContratoAluguel contrato);

    ContratoAluguel buscarContratoPorId(int idContrato);

    ArrayList<ContratoAluguel> listarTodosContratos();

    boolean removerContrato(ContratoAluguel contrato);

    void alterarContrato(ContratoAluguel contrato);


}

