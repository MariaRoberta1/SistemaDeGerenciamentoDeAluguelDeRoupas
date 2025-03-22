package AluguelDeRoupas;

public class Roupas {

	
	class Roupa implements Aluguel{
	    protected int id;
	    protected String descricao;
	    protected double preco;
	    protected boolean disponivel;
	    
	    public Roupa(int id, String descricao, double preco) {
	        this.id = id;
	        this.descricao = descricao;
	        this.preco = preco;
	        this.disponivel = true;
	    }
	    
	    public int getId() { return id; }
	    public String getDescricao() { return descricao; }
	    public double getPreco() { return preco; }
	    public boolean isDisponivel() { return disponivel; }
	    
	    public void alugar() { this.disponivel = false; }
	    public void devolver() { this.disponivel = true; }
}
}
