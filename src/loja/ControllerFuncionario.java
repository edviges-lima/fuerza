package loja;

import java.util.Scanner;

public class ControllerFuncionario extends Funcionario implements CadastrarFuncionario{
    Scanner ler = new Scanner(System.in);

    public ControllerFuncionario(int id, String nome, String cpf, String cargo, String dataAdimissao, String saida, float salario, Scanner ler) {
        super(id, nome, cpf, cargo, dataAdimissao, saida, salario);
    }

    public ControllerFuncionario(int id, String aNull, String aNull1, String aNull2, String aNull3, String aNull4, float salario) {
        super(id, aNull, aNull1, aNull2, aNull3, aNull4, salario);
    }

    @Override
    public void id() {
        System.out.println("Digite o ID: ");
        setId(ler.nextInt());
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
