package NivelBasico.Condicoes;

import java.util.Scanner;

public class ScannerUsuario {

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        System.out.println("Digite o nome do ninja: ");
        String nomeDoNinja = entrada.nextLine();
        System.out.println("O nome do ninja é: " + nomeDoNinja);

        System.out.println();

        System.out.println("Digite a idade do ninja");
        int idade = entrada.nextInt();
        System.out.println("A idade do seu ninja: " + idade + " anos");

        if (idade > 18){
            System.out.println("Esse ninja ja é maior de idade");
        } else {
            System.out.println("Esse ninja é muito novo");
        }

        entrada.close();
    }
}
