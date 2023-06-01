package questao2;

public class Endereco {

    // attributes
    private String rua;
    private int numero;
    
    // constructor
    public Endereco(String rua, int numero) {
        this.rua = rua;
        this.numero = numero;
    }

    // getters and setters
    public String getRua() {
        return rua;
    }
    public void setRua(String rua) {
        this.rua = rua;
    }
    public int getNumero() {
        return numero;
    }
    public void setNumero(int numero) {
        this.numero = numero;
    }
}