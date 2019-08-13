package batallanaval;

/**
 *
 * @author Rocio L.
 */
public class Jugador {
// variables de instancia

    String nombre;
    int puntos;
    int aciertos;
    int fallos;
    String jugador1;
    boolean estado;
    int contador;

// metodo del nombre     
    Jugador(String nombre) {
        this.nombre = nombre;
        this.puntos = 200;
        this.aciertos = 0;
        this.fallos = 0;
        this.contador = 0;
    }

    public String dimeNombre() {
        return nombre;

    }

    public void imprimeNombre() {
        System.out.println(nombre);
    }

    public int dimepuntos() {
        return puntos;
    }

    public int dimeAciertos() {
        return aciertos;
    }

    public int dimeFallos() {
        return fallos;
    }

}
