package NivelBasico;

public class Array {

    public static void main(String[] args) {

      String[] ninja = new String[5];
      int[] idade = new int[2];
      boolean[] missao = new boolean[1];

      //Array são tipo referencia
      ninja[0] = "Naruto";
      ninja[1] = "Sasuke";
      ninja[2] = "Sakura";
      ninja[3] = "Hinata";
      ninja[4] = "Kakashi";


      // como percorrer o array com o for
        for (int i = 0; i < 6; i++) {
            System.out.println(ninja[i]);
        }

      System.out.println(ninja[1]);
        System.out.println();
        idade[0] = 16;
      String nomeDoNinja1 = "Gaara";
      String nomeDoNinja2 = "Rock Lee";

      //array multidimensionais - array 2d


    }
}
