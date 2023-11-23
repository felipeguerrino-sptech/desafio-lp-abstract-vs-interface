package school.sptech;

import school.sptech.bonus.ControleBonus;
import school.sptech.funcionario.Coordenador;
import school.sptech.funcionario.Professor;
import school.sptech.funcionario.Secretaria;

public class App {
    public static void main(String[] args) {
        Professor diego = new Professor("1234", "Diego Brito", 30, 80.);
        Coordenador marise = new Coordenador("4332", "Marise Miranda", 30, 100., 2);
        Secretaria maria = new Secretaria("1223", "Maria Silva", 3000.89, 250.68);
        ControleBonus controleBonus = new ControleBonus();
        controleBonus.adicionarBonificavel(diego);
        controleBonus.adicionarBonificavel(marise);

        controleBonus.exibirFuncionariosHorasSemanais();
        System.out.printf("Total bonus: %.2f", controleBonus.totalBonus());
        System.out.printf("Salário Diego: %.2f", diego.calculaSalario());
        System.out.printf("Bônus Diego: %.2f", diego.getBonus());
        System.out.printf("Salário Marise: %.2f", marise.calculaSalario());
        System.out.printf("Bônus Marise: %.2f", marise.getBonus());
        System.out.printf("Salário Maria: %.2f", maria.calculaSalario());


    }
}