package NivelBasico.Desafios.DesafioOne;

public class DesafioOne {
    public static void main(String[] args) {

        System.out.println();

        Ninja n1 = new Ninja();
        n1.setNome("Goku");
        n1.setIdade(14);
        n1.setMissoes(8);
        n1.setDificuldade('A');

        Ninja n2 = new Ninja();
        n2.setNome("Naruto");
        n2.setIdade(16);
        n2.setMissoes(18);
        n2.setDificuldade('C');

        Ninja n3 = new Ninja();
        n3.setNome("Sasuke");
        n3.setIdade(16);
        n3.setMissoes(10);
        n3.setDificuldade('A');

        System.out.println("nome do ninja: " + n1.getNome());
        System.out.println("idade do ninja: " + n1.getIdade());
        System.out.println("numero de missoes do ninja: " + n1.getMissoes());
        System.out.println("dificuldade da missao do ninja: " + n1.getDificuldade());
        System.out.println("Status da Missão do ninja: " + n1.isStatusDaMissao());

        System.out.println();

        System.out.println("nome do ninja: " + n2.getNome());
        System.out.println("idade do ninja: " + n2.getIdade());
        System.out.println("numero de missoes do ninja: " + n2.getMissoes());
        System.out.println("dificuldade da missao do ninja: " + n2.getDificuldade());
        System.out.println("Status da Missão do ninja: " + n2.isStatusDaMissao());

        System.out.println();

        System.out.println("nome do ninja: " + n3.getNome());
        System.out.println("idade do ninja: " + n3.getIdade());
        System.out.println("numero de missoes do ninja: "  + n3.getMissoes());
        System.out.println("dificuldade da missao do ninja: " + n3.getDificuldade());
        System.out.println("Status da Missão do ninja: " + n3.isStatusDaMissao());

        System.out.println();

        if (n1.getIdade() > 15){
            n1.setStatusDaMissao(true);
            System.out.println("O ninja concluiu a missão :" + n1.isStatusDaMissao());
        }else if(n1.getDificuldade() == 'C' || n1.getDificuldade() == 'D'){
            n1.setStatusDaMissao(true);
            System.out.println("nivel da Missão do Ninja " + n1.getDificuldade() + " concluiu a Missão: " + n1.isStatusDaMissao());
        }else{
            n1.setStatusDaMissao(false);
            System.out.println("O ninja não atende os requisios da missão, falhou: " + n1.isStatusDaMissao());
        }

        
    }
}
