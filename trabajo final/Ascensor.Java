pubic class Ascensor {
    private int pisoActual;
    private puertaAscensor puerta;
    public Ascensor() {
        pisoActual= 1;
        puerta = new puertaAscensor();

    }
    public void mover(int pisoDestino) {
        System.out.println("Moviendo ascensor, espere porfavor . . .")
        while(pisoActual < pisoDestino){
            pisoActual--;
            System.out.println("Bajando al piso" + pisoActual);
        }
        detener();
    }
    public void detener() {
        System.out.println("Ascensor detenido...")
        puerta.abrir();
        puerta.cerrar();
    }
}