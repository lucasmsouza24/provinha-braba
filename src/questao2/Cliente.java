package questao2;

import java.util.ArrayList;
import java.util.List;

public class Cliente {
    
    // attributes
    private String nome;
    private Endereco endereco;
    private List<Produto> lista;

    // constructors
    public Cliente(String nome, Endereco endereco) {
        this.nome = nome;
        this.endereco = endereco;
        this.lista = new ArrayList<Produto>();
    }
    public Cliente(String nome, String rua, int numero) {
        this(nome, new Endereco(rua, numero));
    }

    // getters and setters
    public String getNome() {
        return nome;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }
    public Endereco getEndereco() {
        return endereco;
    }
    public void setEndereco(Endereco endereco) {
        this.endereco = endereco;
    }
    public List<Produto> getLista() {
        return lista;
    }
}
