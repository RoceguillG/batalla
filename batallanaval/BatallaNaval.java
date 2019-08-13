package batallanaval;

import java.util.Scanner;

/**
 *
 * @author Rocio L.
 */
public class BatallaNaval {

    //estas variables son para darle color a las letras en consola
    public static final String ANSI_RED = "\u001B[31m";
    public static final String ANSI_BLUE = "\u001B[34m";
    public static final String ANSI_RESET = "\u001B[0m";// se genera para finalizar el color

    public static void main(String[] args) {
        // aqui defino las variables de entrada del menu
        int opcion;
        Scanner entrada = new Scanner(System.in);
        // comienza el menu de opciones
        do {
            System.out.println(ANSI_RED + "°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°" + ANSI_RESET);
            System.out.println("Selecciona una Opción por favor ");
            System.out.println(" ");
            System.out.println("Opción 1: INICIA JUEGO NUEVO  ");
            System.out.println("Opción 2: HISTORIAL DE PARTIDAS");//otro mini menu de opciones
            System.out.println("Opción 3: Salir");
            opcion = entrada.nextInt();// con este se guarda la entrada de las opciones
            //comenzamos con el menu segun la opcion
            if (opcion == 1) {

                System.out.println("~~~ ¡¡BIENVENIDOS CAPITANES!! ~~~");

                int numT; // numero de nxn matris
                Scanner entradaF = new Scanner(System.in);//guarda la variable numt

                System.out.print("~~~ Por favor ingresen el tamaño del tablero, que sea > a 6 : ");
                numT = entradaF.nextInt();//guarda el numero con scanner
                System.out.println("");// un espacio

                Tablero tab_1 = new Tablero(numT+1);// contruimos el primer tablero de juego
                Tablero tab_j2 = new Tablero(numT+1);//tablero enemigo para atacar            

                // pedir los dos jugadores
                String nombre1, nombre2;
                Scanner nom = new Scanner(System.in);

                System.out.println("JUGADOR 1 ESCRIBE TU NOMBRE");
                //vamos a introducir el name
                nombre1 = nom.nextLine();
                System.out.println("");// un espacio
                Jugador nom_1 = new Jugador(nombre1);
                //nom_1.dimeNombre();//imprime nombre

                System.out.println("JUGADOR 2 ESCRIBE TU NOMBRE");
                Scanner nom2 = new Scanner(System.in);
                nombre2 = nom2.nextLine();
                System.out.println("");// un espacio
                Jugador nom_2 = new Jugador(nombre2);
                //nom_2.dimeNombre();

                //Random par escoger al primero en atacar.
                System.out.println("SE ESCOJERA EL JUGADOR AL AZAR PARA INICIAR JUEGO: ");
                int a = (int) (Math.random() * (2 - 1 + 1) + 1);

                System.out.println(a);
                if (a == 1) {
                    System.out.println("HOLA JUGADOR: " + nombre1);
                    System.out.println("\nPuntos: " + nom_1.dimepuntos());
                    System.out.println("Aciertos: " + nom_1.dimeAciertos());
                    System.out.println("Fallos: " + nom_1.dimeFallos());
                    System.out.println("");
                    System.out.println("ESTE ES TU TABLERO");
                    tab_1.imprimeTablero();// lo imprime, debe imprimir luego de que sea el random '{'
                    System.out.println("°°°enemigo°°°\n");
                    tab_j2.imprimeTablero();//imprime tablero '}'                                   

                    System.out.println("Cuentas con 10 Barcos:\n✓ 1 barco de 4 casillas\n"
                            + "✓ 2 barcos de 3 casillas\n"
                            + "✓ 3 barcos de 2 casillas\n"
                            + "✓ 4 barcos de 1 casilla");
                    
                    System.out.println("Escoje 1 barco para tu tablero");
                    Barquito grande4 = new Barquito(1);
                    System.out.println("has escogido el barco de una casilla!");
                    
                    
                    
                    
                    
                    

                } else {
                    System.out.println("EL JUGADOR" + nombre2 + "COMIENZA");
                    tab_1.imprimeTablero();// lo imprime, debe imprimir luego de que sea el random '{'
                    System.out.println("°°°enemigo°°°\n");
                    tab_j2.imprimeTablero();//imprime tablero '}'

                }

                /* tab_1.imprimeTablero();// lo imprime, debe imprimir luego de que sea el random '{'
                System.out.println("°°°enemigo°°°\n");
                tab_j2.imprimeTablero();//imprime tablero '}'
                 */
                // System.out.println("HOLA " + nombre1 + ", POR FAVOR ESCOJE TU LA POSICION DEL PRIMERO BARCO");
            }

            if (opcion == 2) {
                System.out.println("~~~  ~~~\n");

            }

            if (opcion == 3) {
                System.out.println("~~~ SALIR ~~~");

            } else if (opcion > 3) {
                System.out.println("INGRESAR OPCIÓN CORRECTA, POR FAVOR");

            }

        } while (opcion
                != 3);
        System.out.println(
                "~~~ HASTA PRONTO ~~~");

    }

}
