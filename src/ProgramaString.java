import java.util.Scanner;

public class ProgramaString {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        String[] array=new String[10];
        for (int i = 0; i < 10; i++) {
            System.out.println("Introduzca palabra");
            array[i]= scanner.next();
        }
        System.out.println("Elija una de las siguientes opciones: \n 1) Ver todas las palabras: \n 2) Obtener una palabra al azar: \n 3) Ver número de letras:  \n 4) Ver media de letras: "
                + "\n 5) Ver palabra con más letras: \n 6) Ver palabra con menos letras");
        int opcion= scanner.nextInt();
        switch (opcion){
            case 1:
                for (String item :
                        array) {
                    System.out.print("\t"+item);
                }
                break;
            case 2:
                int azar=(int)(Math.random()* array.length);
                System.out.println("La palabra al azar es: "+array[azar]);
                break;
            case 3:

                break;

            case 4:

                break;

            case 5:

                break;

            case 6:

                break;

            default:
                System.out.println("Opción no contemplada");
                break;


        }


    }
}
