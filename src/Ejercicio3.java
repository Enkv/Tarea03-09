import java.util.Scanner;

public class Ejercicio3 {
    public static void main(String[] args) {

        int[] numeros = {1,2,3,4,5};
        int[] numerosInvertidos = new int[5];
        int x = 0;

        for (int i=4; i>=0; i--){
            numerosInvertidos[x]=numeros[i];
            x++;

        }
        for (int z=0; z<=4 ; z++){
            System.out.println(numerosInvertidos[z]);
        }



    }
}
