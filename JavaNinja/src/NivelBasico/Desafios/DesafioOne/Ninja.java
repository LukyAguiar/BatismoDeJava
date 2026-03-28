package NivelBasico.Desafios.DesafioOne;

public class Ninja {

    String nome;
    int idade;
    int missoes;
    String nomeDaMissao;
    char dificuldade;
    boolean statusDaMissao;

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

    public int getMissoes() {
        return missoes;
    }

    public void setMissoes(int missoes) {
        this.missoes = missoes;
    }

    public String getNomeDaMissao() {
        return nomeDaMissao;
    }

    public void setNomeDaMissao(String nomeDaMissao) {
        this.nomeDaMissao = nomeDaMissao;
    }

    public char getDificuldade() {
        return dificuldade;
    }

    public void setDificuldade(char dificuldade) {
        this.dificuldade = dificuldade;
    }

    public boolean isStatusDaMissao() {
        return statusDaMissao;
    }

    public void setStatusDaMissao(boolean statusDaMissao) {
        this.statusDaMissao = statusDaMissao;
    }
}
