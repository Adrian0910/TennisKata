
/**
 *
 * @author Toby
 */
public class Tennis {

    public static int J1, J2;
    

    static int marcador[] = {0, 15, 30, 40, 100, 200};

    public static int posJ1 = 0, posJ2 = 0;
  

    public static void main(String[] args) {

        while (J1 < 6 && J2 < 6) {

            if (crearPunto()) {

                switch (posJ1) {

                    case 2:
                        switch (posJ2) {
                            case 3:
                                posJ1 = posJ1 + 1;
                                Tennis.mostrarMarcador(posJ1, posJ2, J1, J2);
                                System.out.println("Deuce, incontable");
                                Tennis.resetVariablesDeuce();
                                break;
                            default:
                                posJ1 = posJ1 + 1;
                                Tennis.mostrarMarcador(posJ1, posJ2, J1, J2);
                                break;
                        }
                        break;

                    case 3:
                        switch (posJ2) {
                            case 3:
                                posJ1 = posJ1 + 1;
                                System.out.println("**********************************************");
                                System.out.println("Ventaja Para jugador 1");
                                System.out.println("**********************************************");
                                Tennis.mostrarMarcador(posJ1, posJ2, J1, J2);
                                break;
                            case 4:
                                posJ1 = posJ1 + 1;
                                Tennis.resetVariablesDeuce();
                                Tennis.mostrarMarcador(posJ1, posJ2, J1, J2);
                                System.out.println("Deuce, incontable");
                                break;
                            default:
                                posJ1 = posJ1 + 1;
                                System.out.println("**********************************************");
                                System.out.println("Juego para el jugador 1");
                                System.out.println("**********************************************");
                                J1 = J1 + 1;
                                Tennis.mostrarJuegos(J1, J2);
                                Tennis.resetVariables();
                                break;
                        }
                        break;

                    case 4:
                        posJ1 = posJ1 + 1;
                        System.out.println("**********************************************");
                        System.out.println("play para el jugador 1");
                        System.out.println("**********************************************");
                        J1 = J1 + 1;
                        Tennis.mostrarJuegos(J1, J2);
                        Tennis.resetVariables();

                        break;
                    default:
                        posJ1 = posJ1 + 1;
                        Tennis.mostrarMarcador(posJ1, posJ2, J1, J2);
                        break;

                };
            } else {

                switch (posJ2) {

                    case 2:
                        switch (posJ1) {
                            case 3:
                                posJ2 = posJ2 + 1;
                                Tennis.mostrarMarcador(posJ1, posJ2, J1, J2);
                                System.out.println("Deuce, incontable");
                                Tennis.resetVariablesDeuce();
                                break;
                            default:
                                posJ2 = posJ2 + 1;
                                Tennis.mostrarMarcador(posJ1, posJ2, J1, J2);
                                break;
                        }
                        break;

                    case 3:
                        switch (posJ1) {
                            case 3:
                                posJ2 = posJ2 + 1;
                                System.out.println("**********************************************");
                                System.out.println("Ventaja para el jugador 2");
                                System.out.println("**********************************************");
                                Tennis.mostrarMarcador(posJ1, posJ2, J1, J2);
                                break;
                            case 4:
                                posJ2 = posJ2 + 1;
                                Tennis.resetVariablesDeuce();
                                Tennis.mostrarMarcador(posJ1, posJ2, J1, J2);
                                System.out.println("Deuce, incontable");
                                break;
                            default:
                                posJ2 = posJ2 + 1;
                                System.out.println("**********************************************");
                                System.out.println("play para el jugador 2");
                                System.out.println("**********************************************");
                                J2 = J2 + 1;
                                Tennis.mostrarJuegos(J1, J2);
                                Tennis.resetVariables();
                                break;
                        }
                        break;

                    case 4:
                        posJ2 = posJ2 + 1;
                        System.out.println("**********************************************");
                        System.out.println("play para el jugador 2");
                        System.out.println("**********************************************");
                        J2 = J2 + 1;
                        Tennis.mostrarJuegos(J1, J2);
                        Tennis.resetVariables();
                        break;
                    default:
                        posJ2 = posJ2 + 1;
                        Tennis.mostrarMarcador(posJ1, posJ2, J1, J2);
                        break;
                };
            }
        }
        if (J1 == 6) {
            System.out.println("Jugador 1 es el Ganador del Juego");
        } else {
            System.out.println("Jugador 2 es el Ganador del Juego");
        }
    }

    public static boolean crearPunto() {
        int numeroAleatorio = (int) (Math.random() * 10 + 1);
        if (numeroAleatorio % 2 == 0) {
            return true;
        } else {
            return false;
        }
    }

    public static void resetVariables() {
        posJ1 = 0;
        posJ2 = 0;posJ2 = 0;
    }

    public static void resetVariablesDeuce() {
        posJ1 = 3;
        posJ2 = 3;
    }

    public static void mostrarMarcador(int posJ1, int posJ2, int J1, int J2) {

        if (marcador[posJ1] == 100) {
            
            System.out.println("v - " + marcador[posJ2] + "   Juegos: " + J1 + " " + J2);
        }
        if (marcador[posJ2] == 100) {
            
            System.out.println(marcador[posJ1] + " - v   Juegos: " + J1 + " " + J2);
        }

        if (marcador[posJ1] != 100 && marcador[posJ2] != 100) {
            System.out.println(marcador[posJ1] + " - " + marcador[posJ2] + "   Juegos: " + J1 + " " + J2);
        }
    }

    public static void mostrarJuegos(int J1, int J2) {

        System.out.println("   Juegos: " + J1 + " " + J2);

    }
}
