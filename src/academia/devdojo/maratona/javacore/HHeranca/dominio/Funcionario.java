package academia.devdojo.maratona.javacore.HHeranca.dominio;



public class Funcionario extends Pessoa {
    private double salario;

    {
        System.out.println("OI4 (Funcionario)");
    }
    static {
        System.out.println("OI5 (Funcionario)");
    }

    public Funcionario(String nome){
    super(nome);
        System.out.println("OI6 (Funcionario)");
    }
    public void imprime() {
        super.imprime();
        System.out.println(this.salario);
    }
    private void relatorioPagamento(){
        System.out.println("EU " + this.nome + " RECEBI O SALÁRIO DE " + this.salario);
    }


    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }
}