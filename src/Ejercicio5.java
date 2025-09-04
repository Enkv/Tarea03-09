import java.util.Scanner;

public class Ejercicio5 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Ingrese una palabra");
        String arreglo = scanner.nextLine();
        System.out.println("Palabra ingresada: "+ arreglo);
        char[] rreglo=arreglo.toCharArray();
        char[] invertido= new char[arreglo.length()];
        int x = 0;
        for (int i=arreglo.length()-1; i>=0; i--){
            invertido[x]=rreglo[i];
            x++;

        }
        System.out.println("Palabra invertida: ");
        for (int z=0; z<arreglo.length();z++){
            System.out.println(invertido[z]);
        }




    }
}

