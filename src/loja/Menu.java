package loja;

import java.util.*;

public class Menu {
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);

        int opcao;
        ControllerCliente cliente01 =  new  ControllerCliente("Null","null","null","null","null");
        ControllerFuncionario funcionario01 = new ControllerFuncionario("Null","11221");
        ControllerProduto produto01 =  new ControllerProduto("1245", "Sal","0","Null");
        String ver;
        String finalizar = null;
        ArrayList<String> lista = new ArrayList<>();
        ArrayList<String> listaFuncionario = new ArrayList<>();
        ArrayList<String> listaProduto = new ArrayList<>();



        while (true){
            System.out.print("""
                    *****************************************************
                                           MENU                         \s
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
                    do{
                    cliente01.nome();
                    lista.add(cliente01.getNome());
                    cliente01.cpf();
                    lista.add(cliente01.getCpf());
                    cliente01.telefone();
                    lista.add(cliente01.getTelefone());
                    cliente01.endereco();
                    lista.add(cliente01.getEndereco());
                    cliente01.email();
                    lista.add(cliente01.getEmail());
                    cliente01.visualizar();
                    System.out.println("Deseja cadastrar outro cliente? S/N");
                    finalizar = ler.next();
                    }while(finalizar.equals("S"));

                    System.out.println("Deseja ver o Cadastro dos Clientes? S/N ");
                    ver = ler.next();

                    if(ver.equals("S")){

                        System.out.println("LISTA COMPLETA:");
                        for(String cliente: lista){
                            System.out.println(cliente+"\n");


                        }
                    }



                    break;
                case 2:

                    System.out.println("Cadastrar Produto\n\n");

                    do{
                        produto01.cod();
                        listaProduto.add(produto01.getCod());
                        produto01.nome();
                        listaProduto.add(produto01.getNome());
                        produto01.preco();
                        listaProduto.add(produto01.getPreco());
                        produto01.quantidade();
                        listaProduto.add(produto01.getQuantidade());
                        System.out.println("Deseja cadastrar outro produto? S/N");
                        finalizar = ler.next();
                    }while(finalizar.equals("S"));
                    System.out.println("Deseja ver o estoque? S/N ");
                    ver = ler.next();

                    if(ver.equals("S")){

                        System.out.println("Estoque:");
                        for(String estoque: listaProduto){
                            System.out.println(estoque+"\n");


                        }
                    }



                    break;
                case 3:
                    System.out.println("Cadastrar Funcionário\n\n");

                  do{
                      funcionario01.nome();
                      listaFuncionario.add(funcionario01.getNome());
                      funcionario01.cpf();
                      listaFuncionario.add(funcionario01.getCpf());
                      funcionario01.cargo();
                      listaFuncionario.add(funcionario01.getCargo());
                      funcionario01.dataAdimissao();
                      listaFuncionario.add(funcionario01.getDataAdimissao());
                      funcionario01.visualizar();
                      System.out.println("Deseja Cadastrar outro Funcionário? S/N");
                      finalizar = ler.next();

                  }while (finalizar.equals("S"));

                    System.out.println("Deseja ver o Cadastro dos Funcionários? S/N ");
                    ver = ler.next();

                    if(ver.equals("S")){

                        System.out.println("LISTA COMPLETA:");
                        for(String funcionario: listaFuncionario){
                            System.out.println(funcionario+"\n");


                        }
                    }



                    break;
                case 4:
                    System.out.println("Controle de Vendas\n\n");

                    System.out.println("Digite o código do produto: ");
                    String codP = ler.next();
                    System.out.println("Digite o nome do produto: ");
                    String nomeP = ler.next();
                    System.out.println("Digite o preço do produto: ");
                    double precoP = ler.nextDouble();
                    System.out.println("Digite a quantidade de produtos: ");
                    int quantidadeP = ler.nextInt();
                    double total = precoP*quantidadeP;
                    System.out.println("O total a pagar é de: "+ "R$ " + total);

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
