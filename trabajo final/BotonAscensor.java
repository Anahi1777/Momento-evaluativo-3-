public class BotonAscensor extends boton {
    private int piso;
    public BotonAscensor(int piso){
        this.piso = piso;
        public BotonAscensor(int piso){
            this.piso = piso;
        }
    }
    public void seleccionarPiso(){
        presionar();
        System.out.println("Piso seleccionado:"+ piso);
    }
}