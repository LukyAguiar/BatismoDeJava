package NivelBasico.Condicoes;

public class Ternarios {

    public static void main(String[] args) {


        /**
         * Ternarios: São maneiras de reduzir o codigo
         * variavel = (condição) ? valorSeVerdadeiro : ValorSeFalso
         */

        short numeroDeMissoes = 9;

        String nivel =  (numeroDeMissoes >= 10) ? "Esse ninja esta com mais de 10 missões" : "Esse ninja esta com menos de 10 missoes";
        System.out.println(nivel);
    }




}
