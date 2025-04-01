package Interface;
import Entidades.ContratoAluguel;
import Entidades.Roupas;
import java.util.List;


public interface IContratoDeAluguelServicos{

    
        void criarContrato(ContratoAluguel contrato);
    
        List<ContratoAluguel> listarContratos();
    
        void assinarContrato(int idContrato);
    
        void cancelarContrato(int idContrato);
    
        void finalizarContrato(int idContrato);
    
        ContratoAluguel buscarContratoPorId(int idContrato);
    
        void adicionarRoupaAoContrato(int idContrato, Roupas roupa);
    
        double calcularValorTotal(int idContrato);

}