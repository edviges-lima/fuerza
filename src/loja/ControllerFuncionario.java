package loja;

import java.util.Scanner;

public class ControllerFuncionario extends Funcionario implements CadastrarFuncionario{
    Scanner ler = new Scanner(System.in);

    public ControllerFuncionario(String nome, String cpf) {
        super(nome, cpf);
    }


    @Override
    public void nome() {

        System.out.println("Digite o nome: ");
        setNome(ler.next());

    }

    @Override
    public void cpf() {

        System.out.println("Digite o cpf: ");
        setCpf(ler.next());

    }

    @Override
    public void cargo() {

        System.out.println("Digite o cargo: ");
        setCargo(ler.next());

    }

    @Override
    public void dataAdimissao() {

        System.out.println("Digite a data de admissão: ");
        setDataAdimissao(ler.next());

    }

    @Override
    public void setSaida(String saida) {
        super.setSaida(saida);
        setDataAdimissao(ler.next());
    }

}
