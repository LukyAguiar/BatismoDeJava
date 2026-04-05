package NivelIntermediario.Desafios.DesafioTwo.Dto;

import NivelIntermediario.Desafios.DesafioTwo.Enum.TipoHabilidade;

public class NinjaAvancado{

    String nome;
    int idade;
    String habilidade;
    String especialidade;
    TipoHabilidade tipoHabilidades;

    public NinjaAvancado(String nome, int idade, String habilidade, String especialidade, TipoHabilidade tipoHabilidade){
        this.nome = nome;
        this.idade = idade;
        this.habilidade = habilidade;
        this.especialidade = especialidade;
        this.tipoHabilidades = tipoHabilidade;
    }
}
