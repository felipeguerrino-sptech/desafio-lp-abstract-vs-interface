package school.sptech.funcionario;

import school.sptech.bonus.Bonificavel;

public class Professor extends FuncionarioHorasSemanais implements Bonificavel {

    private static final double BONUS = 0.15;
    public Professor(String cpf, String nome, Integer qtdHorasSemanais, Double valorHora) {
        super(cpf, nome, qtdHorasSemanais, valorHora);
    }

    @Override
    public Double calculaSalario() {
        return getQtdHorasSemanais() * getValorHora() * 4.5;
    }

    @Override
    public Double getBonus() {
        return calculaSalario() * BONUS;
    }

    @Override
    public String toString() {
        return "Professor{} " + super.toString();
    }
}
