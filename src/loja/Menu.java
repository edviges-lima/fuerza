package loja;

import java.util.*;

public class Menu {
    public static void main(String[] args) {
        Scanner ler =new Scanner(System.in);

        int opcao;

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

                    break;
                case 2:
                    System.out.println("Cadastrar Produto\n\n");

                    break;
                case 3:
                    System.out.println("Cadastrar Funcionário\n\n");

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
