package school.sptech.funcionario;

public abstract class FuncionarioHorasSemanais extends Funcionario{
    private Integer qtdHorasSemanais;
    private Double valorHora;

    public FuncionarioHorasSemanais(String cpf, String nome, Integer qtdHorasSemanais, Double valorHora) {
        super(cpf, nome);
        this.qtdHorasSemanais = qtdHorasSemanais;
        this.valorHora = valorHora;
    }

    public Integer getQtdHorasSemanais() {
        return qtdHorasSemanais;
    }

    public void setQtdHorasSemanais(Integer qtdHorasSemanais) {
        this.qtdHorasSemanais = qtdHorasSemanais;
    }

    public Double getValorHora() {
        return valorHora;
    }

    public void setValorHora(Double valorHora) {
        this.valorHora = valorHora;
    }

    @Override
    public String toString() {
        return "FuncionarioHorasSemanais{" +
                "qtdHorasSemanais=" + qtdHorasSemanais +
                ", valorHora=" + valorHora +
                "} " + super.toString();
    }
}
