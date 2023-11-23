package school.sptech.bonus;

import school.sptech.funcionario.FuncionarioHorasSemanais;

import java.util.List;
import java.util.Objects;

public class ControleBonus {
    private List<Bonificavel> bonificaveis;

    public void adicionarBonificavel( Bonificavel bonificavel) {
        if(Objects.nonNull(bonificavel)) {
            bonificaveis.add(bonificavel);
        }
    }

    public void exibirFuncionariosHorasSemanais() {
        for (Bonificavel bonificavel : bonificaveis) {
            System.out.println(bonificavel);
        }
    }

    public Double totalBonus() {
        Double totalBonus = .0;

        for (Bonificavel bonificavel : bonificaveis) {
            totalBonus += bonificavel.getBonus();
        }

        return totalBonus;
    }
}
