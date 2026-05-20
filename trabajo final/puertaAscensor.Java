public class puertaAscensor extends puerta {
    public puertaAscensor() {
        super();
    }

    // Sobreescribe abrir para mensaje especifico
    
    public void abrir() {
        System.out.println(" [Puerta cabina] Abierta");
        this.abierta = true;
    }

    
    public void cerrar() {
        if (mantenerAbierta) {
            System.out.println(" [Puerta cabina] Se mantiene abierta");
            return;
        }
        if (hayObstaculo) {
            System.out.println(" [Puerta cabina] Obstaculo! No se cierra");
            return;
        }
        System.out.println(" [Puerta cabina] Cerrada");
        this.abierta = false;
    }
}