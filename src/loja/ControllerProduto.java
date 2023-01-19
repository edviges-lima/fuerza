package loja;

import java.util.Scanner;

public class ControllerProduto extends Produto implements RepositoryProduto{
Scanner ler = new Scanner(System.in);

    public ControllerProduto(String cod, String nome, String preco, String quantidade) {
        super(cod, nome, preco, quantidade);
    }


    @Override
    public void cod() {
        System.out.print("Código: ");
        setCod(ler.next());


    }

    @Override
    public void nome() {

        System.out.print("Nome: ");
        setNome(ler.next());

    }

    @Override
    public void preco() {

        System.out.print("Preço: ");
        setPreco(ler.next());

    }

    @Override
    public void quantidade() {
        System.out.print("Quantidade em estoque: ");
        setQuantidade(ler.next());

    }
}









