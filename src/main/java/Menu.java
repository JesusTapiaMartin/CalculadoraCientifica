import java.sql.SQLOutput;
import java.util.Scanner;


public class Menu {

    public static void main(String[] args) {
        Scanner lector = new Scanner(System.in);
        String opcion;

        do {
            System.out.println("========================================");
            System.out.println("            MEGA CALCULADORA            ");
            System.out.println("               CIENTÍFICA               ");
            System.out.println("========================================");
            System.out.println("    [1] Operaciones aritméticas         ");
            System.out.println("    [2] Ecuaciones cuadráticas          ");
            System.out.println("    [3] Figuras geométricas             ");
            System.out.println("    [4] Sistema de ecuaciones lineales  ");
            System.out.println("    [5] Ecuación de la recta            ");
            System.out.println("    [6] Salir                           ");
            System.out.println("========================================");
            System.out.print("            Ingrese su opción  :        ");
            opcion = lector.nextLine();
            System.out.println("========================================");

            switch (opcion) {
                case "1":
                    menuOperacionesAritmeticas();
                    break;

                case "2":
                    menuEcuacionesCuadraticas();
                    break;

                case "3":
                    menuFigurasGeometricas();
                    break;

                case "4":
                    menuSistemaEcuacionesLineales();
                    break;

                case "5":
                    menuEcuacionRecta();
                    break;

                case "6":
                    System.out.println("        Hasta luego... ");
                    break;

                default:
                    System.out.println("        Ingrese una opción válida... ");
                    break;
            }
        } while (!opcion.equals("6"));
    }



    //========== OPERACIONES ARITMETICAS ==========
    public static void menuOperacionesAritmeticas() {
        Scanner lector = new Scanner(System.in);
        double num1, num2;

        System.out.println(" ---------- OPERACIONES ARITMETICAS ---------- ");
        System.out.print  ("        Ingrese el primer número    : ");
        num1 = lector.nextDouble();
        System.out.print  ("        Ingrese el segundo número   : ");
        num2 = lector.nextDouble();

        System.out.println("        Seleccione una operación        ");
        System.out.println("            [1] Suma                    ");
        System.out.println("            [2] Resta                   ");
        System.out.println("            [3] Multiplicación          ");
        System.out.println("            [4] División                ");
        System.out.println("            [5] Mayor                   ");
        System.out.println("            [6] Menor                   ");
        System.out.println("            [7] Igual                   ");
        System.out.println("            [8] Potencia                ");
        System.out.println("            [9] Porcentaje              ");
        System.out.print("              Ingrese la opción: ");
        int opcion = lector.nextInt();

        switch (opcion) {
            case 1:
                double resultado = Main.suma(num1, num2);
                System.out.println("        El resultado de la suma es : " + resultado);
                break;

            case 2:
                double resultado2 = Main.resta(num1, num2);
                System.out.println("        El resultado de la resta es : " + resultado2);
                break;

            case 3:
                double resultado3 = Main.multiplicacion(num1, num2);
                System.out.println("        El resultado de la multiplicación es : " + resultado3);
                break;
            case 4:
                double resultado4 = Main.division(num1, num2);
                System.out.println("        El resultado de la división es : " + resultado4);
                break;

            case 5:
                double mayorNumero = Main.mayor(num1, num2);
                System.out.println("        El número mayor es      : " + mayorNumero);
                break;
            case 6:
                double menorNumero = Main.menor(num1, num2);
                System.out.println("        El número menor es      : " + menorNumero);
                break;
            case 7:
                double resultadoIgual =  Main.igual(num1, num2);
                System.out.println("        El resultado es         : " + resultadoIgual);
                break;
            case 8:
                double resultado5 =Main.potencia(num1, num2);
                System.out.println("        El resultado de la potencia es : " + resultado5);
                break;

            case 9:
                double resultado6 = Main.porcentaje(num1, num2);
                System.out.println("        El resultado del porcentaje es : " + resultado6);
                break;

            default:
                System.out.println("        Ingrese una opción válida... ");
                break;
        }
    }


    //========== ECUACIONES CUADRATICAS ==========
    public static void menuEcuacionesCuadraticas() {
        Scanner lector = new Scanner(System.in);
        double a, b, c;

        System.out.println(" ---------- ECUACIONES CUADRATICAS --------- ");
        System.out.println("        Ingrese los coeficientes de la ecuación cuadrática  : ");
        System.out.print("              a: ");
        a = lector.nextDouble();

        System.out.print("              b: ");
        b = lector.nextDouble();

        System.out.print("              c: ");
        c = lector.nextDouble();

        Solucion.ecCuadratica(a, b, c);
    }


    //========== FIGURAS GEOMÉTRICAS ==========
    public static void menuFigurasGeometricas() {
        Scanner lector = new Scanner(System.in);

        System.out.println(" ---------- FIGURAS GEOMÉTRICAS ---------   ");
        System.out.println("        Seleccione una figura geométrica    ");
        System.out.println("            [1] Cuadrado                    ");
        System.out.println("            [2] Rectángulo                  ");
        System.out.println("            [3] Círculo                     ");
        System.out.println("            [4] Esfera                      ");
        System.out.println("            [5] Cubo                        ");
        System.out.println("            [6] Cono                        ");
        System.out.print  ("            Ingrese la opción: ");
        int opcion = lector.nextInt();

        switch (opcion) {
            case 1:
                menuCuadrado();
                break;
            case 2:
                menuRectangulo();
                break;
            case 3:
                menuCirculo();
                break;
            case 4:
                menuEsfera();
                break;
            case 5:
                menuCubo();
                break;
            case 6:
                menuCono();
                break;
            default:
                System.out.println("        Ingrese una opción válida... ");
                break;
        }
    }


    //========== CUADRADO ==========
    public static void menuCuadrado() {
        Scanner lector = new Scanner(System.in);
        double lado;

        System.out.println(" ---------- CUADRADO ---------");
        System.out.print  ("        Ingrese el lado del cuadrado: ");
        lado = lector.nextDouble();

        System.out.println("        Seleccione una operación:       ");
        System.out.println("            [1] Perímetro               ");
        System.out.println("            [2] Área                    ");
        System.out.print  ("            Ingrese la opción   : ");
        int opcion = lector.nextInt();

        switch (opcion) {
            case 1:
                System.out.println("        El perímetro del cuadrado es    : " + areasVolumenes.perimetroCuadrado(lado));
                break;
            case 2:
                System.out.println("        El área del cuadrado es         : " + areasVolumenes.areaCuadrado(lado));
                break;
            default:
                System.out.println("        Ingrese una opción válida... ");
                break;
        }
    }


    //========== RECTANGULO ==========
    public static void menuRectangulo() {
        Scanner lector = new Scanner(System.in);
        double lado1, lado2;

        System.out.println(" ---------- RECTANGULO ----------");
        System.out.print  ("        Ingrese el primer lado del rectángulo   : ");
        lado1 = lector.nextDouble();

        System.out.print  ("        Ingrese el segundo lado del rectángulo  : ");
        lado2 = lector.nextDouble();

        System.out.println("        Seleccione una operación: ");
        System.out.println("            [1] Perímetro       ");
        System.out.println("            [2] Área            ");
        System.out.print("              Ingrese la opción: ");
        int opcion = lector.nextInt();

        switch (opcion) {
            case 1:
                System.out.println("        El perímetro del rectángulo es  : " + areasVolumenes.perimetroRectangulo(lado1, lado2));
                break;
            case 2:
                System.out.println("        El área del rectángulo es       : " + areasVolumenes.areaRectangulo(lado1, lado2));
                break;
            default:
                System.out.println(" Ingrese una opción válida... ");
                break;
        }
    }



    //========== CIRCULO ==========
    public static void menuCirculo() {
        Scanner lector = new Scanner(System.in);
        double radio;

        System.out.println(" ---------- CIRCULO ---------");
        System.out.print  ("        Ingrese el radio del círculo: ");
        radio = lector.nextDouble();

        System.out.println("        Seleccione una operación: ");
        System.out.println("            [1] Perímetro           ");
        System.out.println("            [2] Área                ");
        System.out.print("              Ingrese la opción: ");
        int opcion = lector.nextInt();

        switch (opcion) {
            case 1:
                System.out.println("        El perímetro del círculo es : " + areasVolumenes.perimetroCirculo(radio));
                break;
            case 2:
                System.out.println("        El área del círculo es      : " + areasVolumenes.areaCirculo(radio));
                break;
            default:
                System.out.println("        Ingrese una opción válida... ");
                break;
        }
    }


    //========== ESFERA ==========
    public static void menuEsfera() {
        Scanner lector = new Scanner(System.in);
        double radio;

        System.out.println(" --------- ESFERA --------- ");
        System.out.print  ("        Ingrese el radio de la esfera: ");
        radio = lector.nextDouble();

        System.out.println("        Seleccione una operación    : ");
        System.out.println("            [1] Superficie");
        System.out.println("            [2] Volumen");
        System.out.print  ("            Ingrese la opción: ");
        int opcion = lector.nextInt();

        switch (opcion) {
            case 1:
                System.out.println("        La superficie de la esfera es   : " + areasVolumenes.superficieEsfera(radio));
                break;
            case 2:
                System.out.println("        El volumen de la esfera es      : " + areasVolumenes.volumenEsfera(radio));
                break;
            default:
                System.out.println("        Ingrese una opción válida... ");
                break;
        }
    }


    //========== CUBO ==========
    public static void menuCubo() {
        Scanner lector = new Scanner(System.in);
        double lado;

        System.out.println(" --------- CUBO ----------");
        System.out.print  ("        Ingrese el lado del cubo: ");
        lado = lector.nextDouble();

        System.out.println("        Seleccione una operación:");
        System.out.println("            [1] Superficie");
        System.out.println("            [2] Volumen");
        System.out.print("              Ingrese la opción: ");
        int opcion = lector.nextInt();

        switch (opcion) {
            case 1:
                System.out.println("        La superficie del cubo es   : " + areasVolumenes.superficieCubo(lado));
                break;
            case 2:
                System.out.println("        El volumen del cubo es      : " + areasVolumenes.volumenCubo(lado));
                break;
            default:
                System.out.println("        Ingrese una opción válida... ");
                break;
        }
    }



    //========== CONO ==========
    public static void menuCono() {
        Scanner lector = new Scanner(System.in);
        double radio, altura;

        System.out.println(" --------- CONO ---------");
        System.out.print  ("        Ingrese el radio del cono: ");
        radio = lector.nextDouble();

        System.out.print  ("        Ingrese la altura del cono: ");
        altura = lector.nextDouble();

        System.out.println("        Seleccione una operación    ");
        System.out.println("            [1] Superficie");
        System.out.println("            [2] Volumen");
        System.out.print  ("            Ingrese la opción: ");
        int opcion = lector.nextInt();

        switch (opcion) {
            case 1:
                System.out.println("        La superficie del cono es   : " + areasVolumenes.superficieCono(radio, altura));
                break;
            case 2:
                System.out.println("        El volumen del cono es      : " + areasVolumenes.volumenCono(radio, altura));
                break;
            default:
                System.out.println("        Ingrese una opción válida... ");
                break;
        }
    }



    //========== SISTEMA DE ECUACIONES ==========
    public static void menuSistemaEcuacionesLineales() {
        Scanner lector = new Scanner(System.in);
        double a, b, c, d, e, f;

        System.out.println(" --------- SISTEMA DE ECUACIONES LINEALES --------  ");
        System.out.println("                    ax+by=c                         ");
        System.out.println("                    dx+ey=f                         ");
        System.out.println("                                                    ");
        System.out.println("        Ingrese los coeficientes del sistema de ecuaciones lineales:");
        System.out.print("                      a: ");
        a = lector.nextDouble();

        System.out.print("                      b: ");
        b = lector.nextDouble();

        System.out.print("                      c: ");
        c = lector.nextDouble();

        System.out.print("                      d: ");
        d = lector.nextDouble();

        System.out.print("                      e: ");
        e = lector.nextDouble();

        System.out.print("                      f: ");
        f = lector.nextDouble();

        Solucion.solucionSistema(a, b, c, d, e, f);
    }

    public static void menuEcuacionRecta() {
        Scanner lector = new Scanner(System.in);
        double x1, y1, x2, y2;

        System.out.println(" --------- ECUACIÓN DE LA RECTA ---------");
        System.out.print("          Ingrese la coordenada de x1 : ");
        x1 = lector.nextDouble();

        System.out.print("          Ingrese la coordenada de y1 : ");
        y1 = lector.nextDouble();

        System.out.print("          Ingrese la coordenada de x2 : ");
        x2 = lector.nextDouble();

        System.out.print("          Ingrese la coordenada de y2 : ");
        y2 = lector.nextDouble();

        Solucion.ecuacionRecta(x1, y1, x2, y2);
    }
}
