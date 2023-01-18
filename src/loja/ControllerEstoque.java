package loja;

public class ControllerEstoque extends Estoque implements RepositoryEstoque{


    public ControllerEstoque(int cod, String nome, double preco, int quantidade, String entrada, String saída) {
        super(cod, nome, preco, quantidade, entrada, saída);
    }

    @Override
    public void cod() {
        System.out.println(getCod());
    }

    @Override
    public void nome() {
        System.out.println(getNome());
    }

    @Override
    public void preco() {
        System.out.println(getPreco());
    }

    @Override
    public void quantidade() {
        System.out.println(getQuantidade());
    }

    @Override
    public void entrada() {
        System.out.println(getEntrada());
    }

    @Override
    public void saida() {
        System.out.println(getSaída());
    }
}
