public class Main {
    public static void main (String[] args) {
        Ascensor ascensor = new Ascensor();
        Piso piso3 = new Piso();
        Piso piso5 = new Piso(5);
        piso3.llamarAscensor();
        ascensor.mover(3);
        piso5.llamarAscensor();
        ascensor.mover(5);
    }
} 