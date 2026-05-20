public class Piso {
    private int numero;
    private BotonPiso boton;
    private puertapiso puerta;
    public Piso(int numero) {
        this.numero =numero;
        boton=new BotonPiso();
        puerta=new puertapiso
    }
    public void llamarAscensor() {
        System.out.println("Piso" + numero);
        boton.llamarAscensor();

    }
    publicint getNumber(){
        return numero;
    }
}