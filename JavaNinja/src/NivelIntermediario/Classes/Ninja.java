package NivelIntermediario.Classes;

public class Ninja {

    String nome;
    String aldeia;
    int idade;

    public int getIdade(){
        return idade;
    }

    public String getNome(){
        return nome;
    }

    public String getAldeia(){
        return aldeia;
    }

    public void setIdade(int idade){
        this.idade = idade;
    }

    public void setNome(String nome){
        this.nome = nome;
    }

    public void setAldeia(String aldeia){
        this.aldeia = aldeia;
    }

    // Método publico personalizado
    // Métodos com VOID não retornam valor
    public void SharinganAtivado(){
        System.out.println("Sharingannn ativou");
    }

    /*
    * Método String tem que retornar um texto
    * */
    public String euSouUmNinja(){
        return "Oi, eu sou um ninja";
    }

    /*
    * Método Int tem que retornar um numero
    * */

    public int anosParaSeTornarHokage(int idadeMinimaParaSerHokage){
        return idadeMinimaParaSerHokage - idade;
    }
}
