import java.util.Scanner;

public class Ejercicio2 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Ingrese su rut");
        String rut= scanner.nextLine();
        boolean valido=rut.matches("^\\d{7,8}-[0-9Kk]$");
        //System.out.println(valido);

        if (valido){
            String[] partes= rut.split("-");
            System.out.println("el digito verificador es "+partes[1]);
        }else{
            System.out.println("Rut no valido");
        }


    }
}
