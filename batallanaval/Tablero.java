package batallanaval;

/**
 *
 * @author Rocio L.
 */
public class Tablero {

    int nxn;// numero de tamanio del tablero
    String tablero[][];// tablero para combinar con letras
    String[] abc = {"a", "b", "c", "d", "e", "f", "g", "h", "i", "j", "k", "l", "m", "n", "o", "p", "q", "r", "s", "t", "u", "v", "w", "x", "y", "z"};

    Tablero(int nxn) {//metodo para correr el tablero
        this.nxn = nxn;

        tablero = new String[nxn][nxn];//contructor del tablero 

        for (int i = 1; i < nxn; i++) {
            for (int j = 1; j < nxn; j++) {
                tablero[i][j] = "~";//espacio donde aparecera el agua

            }
        }

        for (int i = 1; i < nxn; i++) {
            tablero[i][0] = String.valueOf(i); //Aquí se añaden los números de la columna
        }                                     //izquierda aprovechando el indice del for

        for (int j = 1; j < nxn; j++) //Aquí rellenamos las letras de la fila del array
        {
            tablero[0][j] = abc[j - 1];
        }

//para eliminar el null que queda en la posicion [0][0] tan fácil como:
        tablero[0][0] = "";

    }

    public void imprimeTablero() {
        for (int i = 0; i < nxn; i++) {
            for (int j = 0; j < nxn; j++) {
                System.out.print(tablero[i][j] + "\t");
            }
            System.out.println("\n");
        }
    }
}
