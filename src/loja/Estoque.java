package loja;

public class Estoque extends Produto{

        public String entrada;
        public String saida;

    public Estoque(String cod, String nome, String preco, String quantidade) {
        super(cod, nome, preco, quantidade);
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

