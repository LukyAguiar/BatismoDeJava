package NivelBasico.Condicoes;

import java.util.Scanner;

public class EstudoSwitchCases {

    public static void main(String[] args) {
        /*
         *SwitchCases: Que servem para gerar casos especificios
         *Objetivo: Pedir pro usuario escolher entre os Ninjas
         *
         * */

        Scanner entrada = new Scanner(System.in);

        System.out.println("Escolha um personagem: ");
        System.out.println("1 - Naruto");
        System.out.println("2 - Sasuke");
        System.out.println("3 - Sakura");

        int valorEscolhido = entrada.nextInt();

        System.out.println("Você digitou o numero: " + valorEscolhido);

        switch (valorEscolhido) {
            case 1:
                System.out.println("O usuario escolheu o Naruto Uzumaki");
            case 2:
                System.out.println("O Usuario escolheu o Sasuke");
                break;
            case 3:
                System.out.println("O usuario escolheu a Sakura");
                break;
            default:
                System.out.println("Você selecinou uma opção invalida");
        }
        entrada.close();
    }
}
