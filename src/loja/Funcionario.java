package loja;

public class Funcionario extends Pessoa{

    public String cargo;
    public String dataAdimissao;
    public String saida;
    public float salario = 1200.00f;

    public Funcionario(int id, String nome, String cpf, String cargo, String dataAdimissao, String saida, float salario) {
        super(id, nome, cpf);
        this.cargo = cargo;
        this.dataAdimissao = dataAdimissao;
        this.saida = saida;
        this.salario = salario;
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

    public float getSalario() {
        return salario;
    }

    public void setSalario(float salario) {
        this.salario = salario;
    }
    public void visualizar(){

        System.out.println("************************ FUNCIONÁRIO CADASTRADO ************************ ");
        System.out.println("ID: " + getId());
        System.out.println("Nome: " + getNome());
        System.out.println("Cpf: " + getCpf());
        System.out.println("Cargo: " + getCargo());
        System.out.println("Data de adimissão: " + getDataAdimissao());
        System.out.println("Salário: " + getSalario());
        System.out.println("************************************************************************* ");
        System.out.println("\n");
    }
}
