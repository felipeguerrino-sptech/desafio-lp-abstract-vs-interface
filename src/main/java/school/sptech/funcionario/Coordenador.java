package school.sptech.funcionario;

import school.sptech.bonus.Bonificavel;

public class Coordenador extends FuncionarioHorasSemanais implements Bonificavel {
    private Integer qtdCursos;
    private static final double BONUS = 0.2;

    public Coordenador(String cpf, String nome, Integer qtdHorasSemanais, Double valorHora, Integer qtdCursos) {
        super(cpf, nome, qtdHorasSemanais, valorHora);
        this.qtdCursos = qtdCursos;
    }

    @Override
    public Double calculaSalario() {
        return getQtdHorasSemanais() * getValorHora() * 4.5 + qtdCursos * 500;
    }

    @Override
    public Double getBonus() {
        return calculaSalario() * BONUS;
    }

    public Integer getQtdCursos() {
        return qtdCursos;
    }

    public void setQtdCursos(Integer qtdCursos) {
        this.qtdCursos = qtdCursos;
    }

    @Override
    public String toString() {
        return "Coordenador{" +
                "qtdCursos=" + qtdCursos +
                "} " + super.toString();
    }
}
