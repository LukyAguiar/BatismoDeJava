package NivelBasico.Desafios.DesafioOne;

import java.util.Scanner;

public class DesafioTwo {
    public static void main(String[] args) {

        Scanner entradaUsuario = new Scanner(System.in);
        String[] nomes = new String[10];
        int[] idade = new int[10];
        String nomeNinja;





        int opcaoEscolhida = 0;

        for (int x = 0; opcaoEscolhida != 3; x++) {

         System.out.println("\n===== Menu Ninja =====");
         System.out.println("1. Cadastrar Ninja");
         System.out.println("2. Listar Ninjas");
         System.out.println("3. Deletar Ninja");
         System.out.println("4. Sair");
         System.out.print("Escolha uma opção: ");

         opcaoEscolhida =  entradaUsuario.nextInt();

        switch (opcaoEscolhida){
            case 1:
                System.out.println("Insira as informações do ninja para o cadastro");
                System.out.println("Digite o nome do ninja: ");
                nomeNinja = entradaUsuario.nextLine();
                nomeNinja = entradaUsuario.nextLine();
                System.out.println("Digite a idade no ninja");
                int idadeNinja = entradaUsuario.nextInt();

                for (int i = 0; i < 10; i++) {
                    if(nomes[i] == null){
                        nomes[i] = nomeNinja;
                        break;
                    }
                }
                for (int i = 0; i < 10;i++) {
                    if(idade[i] == 0){
                        idade[i] = idadeNinja;
                    }
                }
                System.out.println("Ninja Cadastrado com sucesso - Retornando ao Menu");
                System.out.println("Digite 3 se quiser Sair | Digite 0 se quiser voltar ao menu");
                opcaoEscolhida = entradaUsuario.nextInt();
                System.out.print("\n==================================================");
                break;
            case 2:
                System.out.println("Lista de Ninjas Cadastrados");
                for (int i = 0; i < 10; i++)
                    if (nomes[i] != null)
                        System.out.println("Nome do Ninja: " + nomes[i] + "| Idade do Ninja: " + idade[i] + " anos;");
                System.out.println("Digite 3 se quiser Sair | Digite 0 se quiser voltar ao menu");
                opcaoEscolhida = entradaUsuario.nextInt();
                System.out.print("==================================================");
                break;
            case 3:
                System.out.println("Qual ninja você quer deletar?");
            case 4:
                System.out.println("Saindo do Sistema");
                break;
            default:
                System.out.println("Entrada invalida");
        }
        }
        System.out.println("Sistema Finalizado!");
        entradaUsuario.close();
    }
}
