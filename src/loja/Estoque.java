package loja;

public class Estoque {
    public String nome;
    public double preço;
    public int quantidade;

    public double totalEstoque() {
        return preço * quantidade;
    }

    public void addProdutos(int quantidade) {
        this.quantidade += quantidade;
    }

    public void removerProdutos(int quantidade) {
        this.quantidade -= quantidade;
    }

    public String toString() {
        return nome
                + ", $ "
                + String.format("%.2f", preço)
                + ", "
                + quantidade
                + " units, Total: $ "
                + String.format("%.2f", totalEstoque());
    }
}

