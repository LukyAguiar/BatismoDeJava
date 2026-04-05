package NivelIntermediario.Desafios.DesafioTwo.Dto;

import NivelIntermediario.Desafios.DesafioTwo.Enum.TipoHabilidade;
import NivelIntermediario.Desafios.DesafioTwo.Interface.Ninja;

public class NinjaBasico extends NinjaAvancado implements Ninja {


    public NinjaBasico(String nome, int idade, String habilidade, String especialidade, TipoHabilidade tipoHabilidade) {
        super(nome, idade, habilidade, especialidade, tipoHabilidade);
    }

    @Override
    public void executarHabilidade() {
        System.out.println("Meu nome é " + nome + " agora vou usar minha habilidade " + habilidade);
    }

    @Override
    public void mostrarInformacoes() {
        System.out.println("Nome do Ninja: " + nome);
        System.out.println("Idade do Ninja: " + idade);
        System.out.println("Habilidade do Ninja: " + habilidade);
        System.out.println("Especialidade do Ninja: " + especialidade);
        System.out.println("Tipo de Habilidade: " + tipoHabilidades);
    }
}
