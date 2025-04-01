package Entidades;
import java.util.ArrayList;
import java.util.List;


public class Clientes  extends Pessoa{

	private int id;
    private String nome;
    private String email;
    private String telefone;
    private boolean ativo;
    private List<Roupas> historicoAlugueis;

    public Clientes() {
        this.historicoAlugueis = new ArrayList<>();
        this.ativo = true;
    }
    
    public Clientes(int id, String nome, String email, String telefone) {
        this.id = id;
        this.nome = nome;
        this.email = email;
        this.telefone = telefone;
        this.historicoAlugueis = new ArrayList<>();
        this.ativo = true;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getTelefone() {
        return telefone;
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }

    public boolean isAtivo() {
        return ativo;
    }

    public void setAtivo(boolean ativo) {
        this.ativo = ativo;
    }

    public List<Roupas> getHistoricoAlugueis() {
        return historicoAlugueis;
    }

    public void setHistoricoAlugueis(List<Roupas> historicoAlugueis) {
        this.historicoAlugueis = historicoAlugueis;
    }
    
    public void adicionarAluguel(Roupas roupa) {
        this.historicoAlugueis.add(roupa);
    }

    @Override
    public String toString() {
        return "Cliente{" +
                "id=" + id +
                ", nome='" + nome + '\'' +
                ", email='" + email + '\'' +
                ", telefone='" + telefone + '\'' +
                ", ativo=" + ativo +
                ", historicoAlugueis=" + historicoAlugueis +
                '}';
    }
    
}
