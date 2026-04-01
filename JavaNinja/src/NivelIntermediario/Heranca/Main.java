package NivelIntermediario.Heranca;

import NivelIntermediario.Classes.Ninja;

public class Main {
    public static void main(String[] args) {

        Uchiha Sasuke = new Uchiha();
        Sasuke.setNome("Sasuke Uchiha");
        Sasuke.setAldeia("Konoha");
        Sasuke.setIdade(15);
        Sasuke.SharinganAtivado();

        System.out.println();

        Uzumaki Naruto = new Uzumaki();
        Naruto.setNome("Naruto Uzumaki");
        Naruto.setAldeia("Konoha");
        Naruto.setIdade(18);
        Naruto.modoSabio();

        System.out.println();

        Haruno Sakura = new Haruno();
        Sakura.setNome("Sakura");
        Sakura.setAldeia("Konoha");
        Sakura.setIdade(17);
        Sakura.AtivarCura();

        System.out.println();

        Hyuuga Hinata = new Hyuuga();
        Hinata.setAldeia("Konoha");
        Hinata.setNome("Hinata");
        Hinata.setIdade(16);
        Hinata.Byakugan();
    }
}

