public class ControlRemoto {

private ReproductorAudio reproductor;

public ControlRemoto (ReproductorAudio reproductor) {
    this.reproductor = reproductor;
}

public void play () {
    this.reproductor.play();
}

public void pause () {
    this.reproductor.pause();
}

public void cambiarVolumen (int volumen) {
    this.reproductor.cambiarVolumen(volumen);
}

}
