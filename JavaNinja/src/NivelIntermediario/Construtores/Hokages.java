package NivelIntermediario.Construtores;

public class Hokages {

    String nome;
    int idade;
    boolean vivoOuNao;

    //Construtor Vazio
    public Hokages(){

    }

    //Criar um construtor com argumento
    public Hokages(String nome, int idade){
        this.nome = nome;
        this.idade = idade;
    }

    public Hokages(String nome, int idade, boolean vivoOuNao){
        this.nome = nome;
        this.idade = idade;
        this.vivoOuNao = vivoOuNao;
    }


}
