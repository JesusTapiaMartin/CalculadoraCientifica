import java.util.Scanner;
public class Menu {
    public static void menu () {
        Scanner lector = new Scanner(System.in);
        String opcion;

        do {
            System.out.println("========================================");
            System.out.println("           Mega Calculadora             ");
            System.out.println("              cientifica                ");
            System.out.println("========================================");
            System.out.println("    [1] Operaciones aritmeticas         ");
            System.out.println("    [2] Ecuaciones cuadraticas          ");
            System.out.println("    [3] Figuras geometricas             ");
            System.out.println("    [4] Sistema de ecuaciones lineales  ");
            System.out.println("    [5] Ecuación de la recta            ");
            System.out.println("    [6] Salir                           ");
            System.out.println("========================================");
            System.out.print  ("            Ingrese su opción  :        ");
            opcion = lector.nextLine();
            System.out.println("========================================");

            switch (opcion){
                case "1":
                    break;


                case "2":
                    break;



                case "3" :
                    break;



                case "4":
                    break;



                case "5":
                    break;



                case "6":
                    System.out.println("        Hasta luego... ");



                default:
                    System.out.println("        Ingrese una opción válida... ");
                    break;
            }
        } while ( !opcion.equals("6") );
    }
}
