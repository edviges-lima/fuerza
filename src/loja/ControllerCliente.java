package loja;

import java.util.Scanner;

public class ControllerCliente extends Cliente implements CadastrarCliente{
    Scanner ler = new Scanner(System.in);

    public ControllerCliente(int id, String nome, String cpf, String telefone, String endereco, String email) {
        super(id, nome, cpf, telefone, endereco, email);
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
    public void telefone() {

        System.out.println("Digite o telefone: ");
        setTelefone(ler.next());

    }

    @Override
    public void endereco() {

        System.out.println("Digite o endereço: ");
        setEndereco(ler.next());

    }

    @Override
    public void email() {

        System.out.println("Digite o email: ");
        setEmail(ler.next());

    }
}
