package Entidades;
import java.util.ArrayList;
import java.util.List;


public class Roupas {
	
	 private String nome;
	    private String tamanho;
	    private String cor;
	    private double precoAluguel;
	    private boolean disponivel;
	    private List<String> categorias;

	    public Roupas() {
	        this.categorias = new ArrayList<>();
	        this.disponivel = true;
	    }
	    
	    public  Roupas(String nome, String tamanho, String cor, double precoAluguel) {
	        this.nome = nome;
	        this.tamanho = tamanho;
	        this.cor = cor;
	        this.precoAluguel = precoAluguel;
	        this.categorias = new ArrayList<>();
	        this.disponivel = true;
	    }

	    public String getNome() {
	        return nome;
	    }

	    public void setNome(String nome) {
	        this.nome = nome;
	    }

	    public String getTamanho() {
	        return tamanho;
	    }

	    public void setTamanho(String tamanho) {
	        this.tamanho = tamanho;
	    }

	    public String getCor() {
	        return cor;
	    }

	    public void setCor(String cor) {
	        this.cor = cor;
	    }

	    public double getPrecoAluguel() {
	        return precoAluguel;
	    }

	    public void setPrecoAluguel(double precoAluguel) {
	        this.precoAluguel = precoAluguel;
	    }

	    public boolean isDisponivel() {
	        return disponivel;
	    }

	    public void setDisponivel(boolean disponivel) {
	        this.disponivel = disponivel;
	    }

	    public List<String> getCategorias() {
	        return categorias;
	    }

	    public void setCategorias(List<String> categorias) {
	        this.categorias = categorias;
	    }
	    
	    public void adicionarCategoria(String categoria) {
	        this.categorias.add(categoria);
	    }

	    public void alugar() {
	        if (disponivel) {
	            this.disponivel = false;
	            System.out.println("Roupa " + nome + " alugada com sucesso!");
	        } else {
	            System.out.println("Roupa " + nome + " já está alugada.");
	        }
	    }

	    public void devolver() {
	        this.disponivel = true;
	        System.out.println("Roupa " + nome + " devolvida com sucesso!");
	    }

	    @Override
	    public String toString() {
	        return "Roupa{" +
	                "nome='" + nome + '\'' +
	                ", tamanho='" + tamanho + '\'' +
	                ", cor='" + cor + '\'' +
	                ", precoAluguel=" + precoAluguel +
	                ", disponivel=" + disponivel +
	                ", categorias=" + categorias +
	                '}';
	    }

}
