public class ReproductorAudio {
    /*
    3 — El Sistema de Audio y Reproducción Multimedia

Contexto En los reproductores multimedia modernos, el control remoto o la interfaz de
usuario no manipula directamente los archivos de audio; en su lugar, envía mensajes de control
(reproducir, pausar, subirVolumen) a un objeto dedicado al manejo del hardware o software de sonido.

Consigna Construir un diagrama de clases y su respectivo código en Java donde un objeto
ControlRemoto envíe mensajes de control a un objeto ReproductorAudio.

Desarrollo requerido

Definir la clase ReproductorAudio con atributos como volumenActual, estado
(reproduciendo, pausado, detenido) y métodos de acción (play(), pause(), cambiarVolumen(int nuevoVolumen)).

Crear la clase ControlRemoto que mantenga una asociación (referencia) con el ReproductorAudio.

Incorporar validaciones dentro de los métodos del reproductor para que los mensajes no alteren el
estado de manera inválida (por ejemplo, volumen entre 0 y 100).

En el método main, instanciar el reproductor y el control remoto, y simular una secuencia de mensajes
(reproducir, cambiar volumen, pausar) imprimiendo los cambios por consola.
     */

    private int volumenActual;
    private String estado;

    public ReproductorAudio(int volumenActual, String estado) {
        if (volumenActual >= 0 && volumenActual <= 100) {
            this.volumenActual = volumenActual;
            this.estado = estado;
        } else {
            System.out.println("Volumen incorrecto. Reproductor detenido.");
            this.volumenActual = 0;
            System.out.println("Volumen: " + this.volumenActual);
            System.out.println(this.estado = "Detenido.");
        }

    }

    public int getVolumenActual() {
        return volumenActual;
    }

    public String getEstado() {
        return estado;
    }

    public void play() {
        System.out.println(estado = "Reproduciendo...");
    }

    public void pause() {
        System.out.println(estado = "En pausa...");
    }

    public void cambiarVolumen(int volumen) {
        if (volumen >= 0 && volumen <= 100) {
            System.out.println(volumenActual = volumen);
        } else {
            System.out.println("Volumen incorrecto. Reproductor detenido.");
            this.volumenActual = 0;
            System.out.println("Volumen: " + this.volumenActual);
            System.out.println(this.estado = "Detenido.");
        }
    }
}
