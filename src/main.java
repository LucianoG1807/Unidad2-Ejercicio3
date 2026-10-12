public class main {
    static void main(String[] args) {

        ReproductorAudio reproductorAudio = new ReproductorAudio(80, "reproduciendo...");

        ControlRemoto controlRemoto = new ControlRemoto(reproductorAudio);

        controlRemoto.pause();
        controlRemoto.play();
        controlRemoto.cambiarVolumen(100);
        controlRemoto.cambiarVolumen(20);
        controlRemoto.cambiarVolumen(-5);
    }
}
