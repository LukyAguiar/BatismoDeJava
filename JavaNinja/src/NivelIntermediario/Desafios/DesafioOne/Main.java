package NivelIntermediario.Desafios.DesafioOne;

import java.util.Objects;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        int opcao = 0;


        Scanner entradaUsuario = new Scanner(System.in);

        Uchiha[] uchihas = new Uchiha[10];
        Ninja[] ninjas = new Ninja[10];


        while(opcao != 5){

            System.out.println("\n===== Menu Ninja =====");
            System.out.println("1. Cadastrar Ninja");
            System.out.println("2. Cadastrar Uchiha");
            System.out.println("3. Listar Ninjas");
            System.out.println("4. Atualizar Habilidade do Ninja");

            System.out.println("5. Sair");
            System.out.print("Escolha uma opção: ");
            opcao = entradaUsuario.nextInt();

            switch (opcao){
                case 1: {
                    Ninja ninja = new Ninja();

                    System.out.println("Insira as informações do ninja para o cadastro");
                    System.out.println("Digite o nome do ninja: ");
                    entradaUsuario.nextLine();
                    ninja.setNome(entradaUsuario.nextLine());
                    System.out.println("Digite a idade no ninja");
                    ninja.setIdade(entradaUsuario.nextInt());
                    System.out.println("Digite qual missao ele esta: ");
                    ninja.setMissao(entradaUsuario.nextLine());
                    System.out.println("Digite qual o nivel da missao: (Rank S - A - B - C - D)" );
                    ninja.setNivelDificuldade(entradaUsuario.nextLine());
                    System.out.println("Qual é o status da missão: ");
                    ninja.setStatusDaMissao(entradaUsuario.nextLine());

                    for (int i = 0; i < 10; i++) {
                        if(ninjas[i] == null){
                            ninjas[i] = ninja;
                            break;
                        }
                    }
                    System.out.println("Ninja Cadastrado do ninja com sucesso");
                    break;
                }
                case 2:
                    Uchiha uchiha = new Uchiha();

                    System.out.println("Insira as informações do ninja para o cadastro");
                    System.out.println("Digite o nome do ninja: ");
                    entradaUsuario.nextLine();
                    uchiha.setNome(entradaUsuario.nextLine());
                    System.out.println("Digite a idade no ninja");
                    uchiha.setIdade(entradaUsuario.nextInt());
                    System.out.println("Qual habilidade do ninja: ");
                    entradaUsuario.nextLine();
                    uchiha.setHabilidadeEspecial(entradaUsuario.nextLine());
                    System.out.println("Digite qual missao ele esta: ");
                    uchiha.setMissao(entradaUsuario.nextLine());
                    System.out.println("Digite qual o nivel da missao: (Rank S - A - B - C - D)" );
                    uchiha.setNivelDificuldade(entradaUsuario.nextLine());
                    System.out.println("Qual é o status da missão: ");
                    uchiha.setStatusDaMissao(entradaUsuario.nextLine());

                    for (int i = 0; i < 10; i++) {
                        if(uchihas[i] == null){
                            uchihas[i] = uchiha;
                            break;
                        }
                    }
                    System.out.println("Ninja Cadastrado do Uchiha com sucesso");
                    break;

                case 3:
                    System.out.println("Lista de Ninjas Cadastrados");
                    for (int i = 0; i < 10; i++)
                        if (uchihas[i] != null) {
                            System.out.println("==================================================");
                            uchihas[i].mostrarInformações();
                            System.out.println("==================================================");
                        }
                    break;
                case 4:
                    System.out.println("Qual ninja você quer atualizar?");
                    entradaUsuario.nextLine();
                    String nomeNinja = entradaUsuario.nextLine();
                    System.out.println("Qual vai ser a nova habilidade do ninja?:");
                    String novaHabilidade = entradaUsuario.nextLine();
                    for (int i = 0; i < 10; i++){
                        String nomeDoNinja = "";
                        if (uchihas[i] != null){
                          nomeDoNinja = uchihas[i].nome;
                        }
                        if(Objects.equals(nomeDoNinja, nomeNinja)){
                            uchihas[i].habilidadeEspecial = novaHabilidade;
                        } else {
                            System.out.println("ninja não encontrado");
                        }
                    }
                    break;
                case 5:
                    System.out.println("Finalizando Sistema");
                    break;
                default:
                    System.out.println("Opção invalida");

            }



        }



    }
}
