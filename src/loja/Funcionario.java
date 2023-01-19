package loja;

public class Funcionario extends Pessoa{

    public String cargo;
    public String dataAdimissao;
    public String saida;
    public String salario = "1200";

    public Funcionario(String nome, String cpf) {
        super(nome, cpf);
    }


    public String getCargo() {
        return cargo;
    }

    public void setCargo(String cargo) {
        this.cargo = cargo;
    }

    public String getDataAdimissao() {
        return dataAdimissao;
    }

    public void setDataAdimissao(String dataAdimissao) {
        this.dataAdimissao = dataAdimissao;
    }

    public String getSaida() {
        return saida;
    }

    public void setSaida(String saida) {
        this.saida = saida;
    }

    public String getSalario() {
        return salario;
    }

    public void setSalario(String salario) {
        this.salario = salario;
    }
    public void visualizar(){

        System.out.println("************************ FUNCIONÁRIO CADASTRADO ************************ ");
        System.out.println("Nome: " + getNome());
        System.out.println("Cpf: " + getCpf());
        System.out.println("Cargo: " + getCargo());
        System.out.println("Data de adimissão: " + getDataAdimissao());
        System.out.println("Salário: " + getSalario());
        System.out.println("************************************************************************* ");
        System.out.println("\n");
    }
}
