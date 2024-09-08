package ejercicios;

import java.util.Scanner;

/**
 *
 * @author danielsanchez
 */
public class SetDeTenis {
   public static String evaluar(int numVictoriasA, int numVictoriasB) {
        if (numVictoriasA < 0 || numVictoriasB < 0 || 
            numVictoriasA > 7 || numVictoriasB > 7 ||
            (numVictoriasA == 7 && numVictoriasB < 5) ||
            (numVictoriasB == 7 && numVictoriasA < 5)) {
            return "Inválido";
        }

        if (numVictoriasA >= 6 || numVictoriasB >= 6) {
            if (Math.abs(numVictoriasA - numVictoriasB) >= 2 || 
                numVictoriasA == 7 || numVictoriasB == 7) {
                return (numVictoriasA > numVictoriasB) ? "Ganó A" : "Ganó B";
            }
        }
        
        return "Aún no termina";
    }
    
    public static void main(String[] args) {
        Scanner lector = new Scanner(System.in);
        
        System.out.print("Los juegos ganador por A:");
        int numVictoriasA = lector.nextInt();
        System.out.print("Los juegos ganador por B:");
        int numVictoriasB = lector.nextInt();
        
        String respuesta = evaluar(numVictoriasA, numVictoriasB);
        System.out.println(respuesta);
    }
}
