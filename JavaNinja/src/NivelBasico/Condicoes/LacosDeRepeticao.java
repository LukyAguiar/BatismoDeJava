package NivelBasico.Condicoes;

public class LacosDeRepeticao {

    public static void main(String[] args) {


        /*
        * Lacos de Repeticao: Vão repetir infinitamente ou enquanto o parametro for atendido
        * While = FOR
        *
        *
        * */

        // While
        // While (condicao) {} = Enquanto a condicao for verdadeira vai rodar

        int numeroDeClones = 0;
        int numeroMaximoDeClones = 40;

//        while (numeroDeClones <= numeroMaximoDeClones){
//            //numeroDeClones = numeroDeClones + 1;
//            numeroDeClones++;
//            System.out.println("O naruto fez " + numeroDeClones + " clones das sombras" );
//        }

        // FOR

        for (int i = 0; i <= 40; i++) {
            System.out.println("O naurto esta se clonando e ja se clonou " + i);
        }

        // Usando o laço for para treinar Jutsus 5 vezes
        for (int i = 1; i <= 5; i++) { System.out.println("Treinamento de Jutsu número: " + i); } // Usando o laço do-while para simular o treinamento de controle de chakra int chakra = 100; do { System.out.println("Controlando o chakra, energia restante: " + chakra); chakra -= 10; // Reduzindo o chakra em 10 a cada iteração } while (chakra > 0);

        System.out.println("Treinamento concluído. O chakra foi completamente utilizado.");
    }
}
