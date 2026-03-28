package Condicoes;

public class IfEelse {
    public static void main(String[] args) {

        String nome = "Naruto";
        int idade = 16;
        boolean hokage = false;
        short numeroDeMissoes = 9;
        String rank;


        if(numeroDeMissoes > 10 && idade > 18){
            System.out.println(nome + " esta pronto para subir de nivel - (Rank Chunnin)");
        }else if(numeroDeMissoes >= 20){
            System.out.println("Rank Jounin");
        }
        else {
            System.out.println("O " + nome + " não completou o minimo de missoes - Rank Gennin");
        }

    }
}
