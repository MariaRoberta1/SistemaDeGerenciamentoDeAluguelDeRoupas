package Repositorios;
import Entidades.ContratoAluguel;
import interfac.IContratoAluguelRepositorio;
import java.util.ArrayList;

public class ContratoAluguelRepositorio implements IContratoAluguelRepositorio {

    private ArrayList<ContratoAluguel> contratos;

    public ContratoAluguelRepositorio() {
        this.contratos = contratos;
    }

    @Override
    public void salvar(ContratoAluguel contrato) {
        this.contratos.add(contrato);
    }

    @Override
    public ContratoAluguel buscarContratoPorId(int idContrato) {
        if (this.contratos != null) {
            for (ContratoAluguel contrato : this.contratos) {
                if (contrato.getIdContratoAluguel() == idContrato) {
                    return contrato;
                }
            }
        } else {
            System.out.println("ARRAY LIST VAZIO !");
        }
        return null;
    }

    @Override
    public ArrayList<ContratoAluguel> listarTodosContratos() {
        return contratos;
    }

    @Override
    public boolean removerContrato(ContratoAluguel contrato) {
        return contratos.remove(contrato);
    }

    @Override
    public void alterarContrato(ContratoAluguel contrato) {
        for (ContratoAluguel c : this.contratos) {
            if (c.getIdContratoAluguel() == contrato.getIdContratoAluguel()) {
                c.setCliente(contrato.getCliente());
                c.setRoupas(contrato.getRoupas());
                c.setDataInicio(contrato.getDataInicio());
                c.setDataFim(contrato.getDataFim());
                c.setValor(contrato.getValor());
                c.setStatus(contrato.getStatus());
                c.setFuncionario(contrato.getFuncionario());
                return;
            }
        }
    }

    public ContratoAluguel buscarContratoPorId(int i) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    public ContratoAluguel buscarContratoPorId(int i) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    public void alterarContrato(ContratoAluguel contrato) {
        throw new UnsupportedOperationException("Not supported yet.");
    }
}



