package Repositorios;

import Entidades.Roupas;
import java.util.ArrayList;
import java.util.List;

public class RoupasRepositorio {
    private List<Roupas> roupas;

    public RoupasRepositorio() {
        this.roupas = new ArrayList<>();
    }

    public void salvar(Roupas roupa) {
        this.roupas.add(roupa);
    }

    public Roupas buscarPorNome(String nome) {
        for (Roupas roupa : roupas) {
            if (roupa.getNome().equalsIgnoreCase(nome)) {
                return roupa;
            }
        }
        return null;
    }

    public List<Roupas> listarTodas() {
        return roupas;
    }

    public boolean remover(Roupas roupa) {
        return roupas.remove(roupa);
    }

    public void atualizar(Roupas novaRoupa) {
        for (int i = 0; i < roupas.size(); i++) {
            if (roupas.get(i).getNome().equalsIgnoreCase(novaRoupa.getNome())) {
                roupas.set(i, novaRoupa);
                return;
            }
        }
    }
}
