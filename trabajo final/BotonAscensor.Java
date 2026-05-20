public class BotonAscensor extends Boton {
    private int piso;
    public BotonAscensor(int piso){
        this.piso = piso;
    }
    public void presionarPiso(){
        presionarPiso();
        System.out.println("Piso seleccionado:"+ piso);
    }
}