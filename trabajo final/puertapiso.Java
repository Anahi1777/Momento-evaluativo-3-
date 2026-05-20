public class puertapiso extends puerta {
    private int numeroPiso;

    public puertapiso(int numeroPiso) {
        super();
        this.numeroPiso = numeroPiso;
    }

    
    public void abrir() {
        System.out.println(" [Puerta piso " + numeroPiso + "] Abierta");
        this.abierta = true;
    }

    
    public void cerrar() {
        if (hayObstaculo) {
            System.out.println(" [Puerta piso " + numeroPiso + "] Obstaculo! No se cierra");
            return;
        }
        System.out.println(" [Puerta piso " + numeroPiso + "] Cerrada");
        this.abierta = false;
    }
}