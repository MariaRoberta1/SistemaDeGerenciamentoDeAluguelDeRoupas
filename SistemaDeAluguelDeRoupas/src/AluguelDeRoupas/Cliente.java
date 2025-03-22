package AluguelDeRoupas;

public class Cliente extends Pessoa{
	
private List<String> historicoAlugueis;
    
    public Cliente(int id, String nome, String telefone, String email, String endereco) {
        super(id, nome, telefone, email, endereco);
        this.historicoAlugueis = new ArrayList<>();
    }
    
    public List<String> getHistoricoAlugueis() { return historicoAlugueis; }
    public void adicionarAluguelAoHistorico(String descricaoRoupa) {
        historicoAlugueis.add(descricaoRoupa);
    }
	
}