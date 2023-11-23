package school.sptech.funcionario;

public class Secretaria extends Funcionario{
    private Double salario;
    private Double extra;

    public Secretaria(String cpf, String nome, Double salario, Double extra) {
        super(cpf, nome);
        this.salario = salario;
        this.extra = extra;
    }

    @Override
    public Double calculaSalario() {
        return salario + extra;
    }

    public Double getSalario() {
        return salario;
    }

    public void setSalario(Double salario) {
        this.salario = salario;
    }

    public Double getExtra() {
        return extra;
    }

    public void setExtra(Double extra) {
        this.extra = extra;
    }

    @Override
    public String toString() {
        return "Secretaria{" +
                "salario=" + salario +
                ", extra=" + extra +
                "} " + super.toString();
    }
}
