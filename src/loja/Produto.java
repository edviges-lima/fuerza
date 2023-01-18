package loja;

public class Produto {
    private int cod;
    private String nome;
    private double preco;
    private int quantidade;


    public Produto(int cod, String nome, double preco, int quantidade) {
        this.cod = cod;
        this.nome = nome;
        this.preco = preco;
        this.quantidade = quantidade;
    }

    public int getCod() {
        return cod;
    }

    public void setCod(int cod) {
        this.cod = cod;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public double getPreco() {
        return preco;
    }

    public void setPreco(double preco) {
        this.preco = preco;
    }

    public int getQuantidade() {
        return quantidade;
    }

    public void setQuantidade(int quantidade) {
        this.quantidade = quantidade;
    }


    public double valorEstoque() {
        return preco * quantidade;
    }
    public void adcProduto(int quantidade) {
        this.quantidade += quantidade;
    }
    public void removeProduto(int quantidade) {
        this.quantidade -= quantidade;
    }
    public String toString() {
        return cod +  ", " +nome
                    + ", R$ "
                + String.format("%.2f", preco)
                + ", "
                + quantidade
                + " unidades, Total: R$ "
                + String.format("%.2f", valorEstoque());
    }

}
