package Servicos;

import Entidades.Roupas;
import Repositorio.RoupasRepositorio;
import java.util.List;
    
public class RoupasServico {
    private RoupasRepositorio repositorio;
    
    public RoupasServico(RoupasRepositorio repositorio) {
        this.repositorio = repositorio;
    }

    public void cadastrarRoupa(Roupas roupa) {
        repositorio.salvar(roupa);
    }

    public Roupas buscarRoupa(String nome) {
        return repositorio.buscarPorNome(nome);
    }

    public List<Roupas> listarRoupas() {
        return repositorio.listarTodas();
    }

    public boolean removerRoupa(Roupas roupa) {
        return repositorio.remover(roupa);
    }

    public void alugarRoupa(String nome) {
        Roupas roupa = repositorio.buscarPorNome(nome);
        if (roupa != null && roupa.isDisponivel()) {
            roupa.alugar();
        } else {
            System.out.println("Roupa indisponível ou não encontrada.");
        }
    }

    public void devolverRoupa(String nome) {
        Roupas roupa = repositorio.buscarPorNome(nome);
        if (roupa != null && !roupa.isDisponivel()) {
            roupa.devolver();
        } else {
            System.out.println("Roupa já está disponível ou não encontrada.");
        }
    }
}