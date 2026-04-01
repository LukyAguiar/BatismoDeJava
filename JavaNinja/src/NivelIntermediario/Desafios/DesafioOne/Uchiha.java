package NivelIntermediario.Desafios.DesafioOne;



public class Uchiha extends Ninja {

    String habilidadeEspecial;

    @Override
    public void mostrarInformações() {
        super.mostrarInformações();
        System.out.println("Habilidade Especial: " + habilidadeEspecial);
    }

    public String getHabilidadeEspecial() {
        return habilidadeEspecial;
    }

    public void setHabilidadeEspecial(String habilidadeEspecial) {
        this.habilidadeEspecial = habilidadeEspecial;
    }
}
