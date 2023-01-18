package loja;

import java.util.*;

public class Menu {
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);

        int opcao;
        Cliente cliente01 = new Cliente(0,"null","null","null","null","null");
        Funcionario funcionario01 = new Funcionario(0,"Null","Null","Null","Null","Null",1200);
        Produto produto01 = new Produto(134234, "Sal",5.99,10000);

        while (true){
            System.out.print("""
                    *****************************************************
                                         LOJA FUERZA                    \s
                    *****************************************************
                                                                        \s
                                   1 - Cadastro de Cliente              \s
                                   2 - Cadastro de Produtos             \s
                                   3 - Cadastro de Funcionários         \s
                                   4 - Controle de Vendas               \s
                                   5 - Controle de Estoque              \s
                                   6 - Controle de Pessoas              \s
                                   7 - Histórico de Vendas              \s
                                   8 - Sair                             \s
                    *****************************************************
                    """);

            opcao = ler.nextInt();

            switch (opcao) {
                case 1:
                    System.out.println("Cadastrar Cliente\n\n");
                    System.out.println("Digite o ID: ");
                    cliente01.id = ler.nextInt();
                    System.out.println("\n");
                    System.out.println("Digite o Nome: ");
                    cliente01.nome = ler.next();
                    System.out.println("\n");
                    System.out.println("Digite o Cpf: ");
                    cliente01.cpf = ler.next();
                    System.out.println("\n");
                    System.out.println("Digite o Telefone: ");
                    cliente01.telefone = ler.next();
                    System.out.println("\n");
                    System.out.println("Digite o Endereço: ");
                    cliente01.endereco = ler.next();
                    System.out.println("\n");
                    System.out.println("Digite o Email: ");
                    cliente01.email = ler.next();
                    System.out.println("\n");
                    cliente01.visualizar();




                    break;
                case 2:
                    System.out.println("Cadastrar Produto\n\n");
                    System.out.println("Digite os dados do produto: ");
                    System.out.print("Código: ");
                    produto01.setCod(ler.nextInt());
                    System.out.print("Nome: ");
                    produto01.setNome(ler.next());
                    System.out.print("Preço: ");
                    produto01.setPreco(ler.nextDouble());
                    System.out.print("Quantidade em estoque: ");
                    produto01.setQuantidade(ler.nextInt());
                    System.out.println("Product data: " + produto01);

                    break;
                case 3:
                    System.out.println("Cadastrar Funcionário\n\n");

                    System.out.println("Digite o ID: ");
                    funcionario01.id = ler.nextInt();
                    System.out.println("\n");
                    System.out.println("Digite o Nome: ");
                    funcionario01.nome = ler.next();
                    System.out.println("\n");
                    System.out.println("Digite o Cpf: ");
                    funcionario01.cpf = ler.next();
                    System.out.println("\n");
                    System.out.println("Digite o Cargo: ");
                    funcionario01.cargo = ler.next();
                    System.out.println("\n");
                    System.out.println("Digite a data de adimissão: ");
                    funcionario01.dataAdimissao = ler.next();
                    System.out.println("\n");
                    funcionario01.visualizar();

                    break;
                case 4:
                    System.out.println("Controle de Vendas\n\n");

                    break;
                case 5:
                    System.out.println("Controle de Estoque\n\n");

                    break;
                case 6:
                    System.out.println("Controle de Pessoas\n\n");

                    break;
                case 7:
                    System.out.println("Histórico de Vendas\n\n");

                    break;
                case 8:
                        System.out.println("\nEncerrando...");
                        ler.close();
                        System.exit(0);
                default:
                    System.out.println("\nOpção Inválida!\n");
                    break;
            }

        }



    }
}
