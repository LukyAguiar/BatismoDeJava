package NivelIntermediario.Classes;

public class Main {
    public static void main(String[] args) {

        Ninja Naruto = new Ninja();

        Naruto.setAldeia("Konoha");
        Naruto.setIdade(18);
        Naruto.setNome("Naruto");

        Ninja Sasuke = new Ninja();
        Sasuke.setNome("Sasuke");
        Sasuke.setAldeia("Konoha");
        Sasuke.setIdade(15);

        Sasuke.SharinganAtivado();
        int quantoTempoFaltaSasuke = Sasuke.anosParaSeTornarHokage(70);
        int quantoTempoFaltaNaruto = Naruto.anosParaSeTornarHokage(70);

        System.out.println("O que falta " + quantoTempoFaltaSasuke + " anos, para o Sasuke tornar Hokage");
        System.out.println("O que falta " + quantoTempoFaltaNaruto + " anos, para o Naruto tornar Hokage");
        System.out.println(Sasuke.euSouUmNinja());
    }
}
