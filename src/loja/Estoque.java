package loja;

public class Estoque extends Produto{

        public String entrada;
        public String saida;

    public Estoque(int cod, String nome, double preco, int quantidade, String entrada, String saída) {
        super(cod, nome, preco, quantidade);
        this.entrada = entrada;
        this.saida = saída;
    }

    public String getEntrada() {
        return entrada;
    }

    public void setEntrada(String entrada) {
        this.entrada = entrada;
    }

    public String getSaída() {
        return saida;
    }

    public void setSaída(String saída) {
        this.saida = saída;
    }
}

