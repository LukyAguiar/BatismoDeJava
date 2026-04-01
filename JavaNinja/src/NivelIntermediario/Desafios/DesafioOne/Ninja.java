package NivelIntermediario.Desafios.DesafioOne;

public class Ninja {

    String nome;
    int idade;
    String missao;
    String nivelDificuldade;
    String statusDaMissao;

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public String getMissao() {
        return missao;
    }

    public void setMissao(String missao) {
        this.missao = missao;
    }

    public String getNivelDificuldade() {
        return nivelDificuldade;
    }

    public void setNivelDificuldade(String nivelDificuldade) {
        this.nivelDificuldade = nivelDificuldade;
    }

    public String getStatusDaMissao() {
        return statusDaMissao;
    }

    public void setStatusDaMissao(String statusDaMissao) {
        this.statusDaMissao = statusDaMissao;
    }

    public void mostrarInformações(){
        System.out.println("Nome do Ninja: " + nome);
        System.out.println("Idade do Ninja: " + idade);
        System.out.println("Missão Atual do Ninja:" + missao);
        System.out.println("Nivel da Dificuldade da Missao: " + nivelDificuldade);
        System.out.println("Status da Missão: " + statusDaMissao);
    }
}
