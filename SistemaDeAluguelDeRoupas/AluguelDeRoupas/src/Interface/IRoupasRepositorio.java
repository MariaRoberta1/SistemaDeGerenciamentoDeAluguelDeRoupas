package Interface;
import Entidades.Roupas;
import java.util.List;
    
public interface IRoupasRepositorio {
    void salvar(Roupas roupa);
    Roupas buscarPorNome(String nome);
    List<Roupas> listarTodas();
    boolean remover(Roupas roupa);
    void atualizar(Roupas roupa);



    }