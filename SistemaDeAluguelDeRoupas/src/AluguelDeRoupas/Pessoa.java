package AluguelDeRoupas;

public class Pessoa {
	protected int id;
    protected String nome;
    protected String telefone;
    protected String email;
    protected String endereco;
    
    public Pessoa(int id, String nome, String telefone, String email, String endereco) {
        this.id = id;
        this.nome = nome;
        this.telefone = telefone;
        this.email = email;
        this.endereco = endereco;
    }
    
    public int getId() { return id; }
    public String getNome() { return nome; }
    public String getTelefone() { return telefone; }
    public String getEmail() { return email; }
    public String getEndereco() { return endereco; }

}
