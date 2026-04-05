package NivelIntermediario.Desafios.DesafioTwo;

import NivelIntermediario.Desafios.DesafioTwo.Dto.NinjaBasico;
import NivelIntermediario.Desafios.DesafioTwo.Enum.TipoHabilidade;

public class Main {
    public static void main(String[] args) {
        System.out.println();
        NinjaBasico Sasuke = new NinjaBasico("Sasuke Uchiha", 18, "Sharingan", "Assassinato", TipoHabilidade.NINJUTSO);
        Sasuke.mostrarInformacoes();
        System.out.println();
        Sasuke.executarHabilidade();
    }
}
