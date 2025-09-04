import java.util.Scanner;


public class Ejercicio1 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Ingrese una palabra");
        String palabra = scanner.nextLine();
        System.out.println("Ingresa una letra");
        String etra = scanner.nextLine();
        char[] letra=etra.toCharArray();

        int x=0;

        for (int i=0; i<palabra.length(); i++){
            if (letra[0]==palabra.charAt(i)){
                x+= 1;

            }


        }
        System.out.println("Tienes "+x+" letras "+ " ");





    }
}