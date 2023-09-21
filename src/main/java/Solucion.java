public class Solucion {

    //========== SOLUCIONES EC CUADRÁTICA ==========
    public static void ecCuadratica(double a, double b, double c) {
        try {
            //---------- SI EL DISCRIMINANTE ES MENOR QUE 0 ----------
            double discriminante = calcularDiscriminante(a, b, c);

            if (discriminante < 0) {
                throw new IllegalArgumentException(" La ecuación cuadrática NO tiene raíces REALES... ");
            }

                //---------- CALCULAR SOLUCIONES ----------
            double x1 = (-b + Math.sqrt(Math.pow(b, 2) - 4 * a * c)) / (2 * a);
            double x2 = (-b - Math.sqrt(Math.pow(b, 2) - 4 * a * c)) / (2 * a);

            System.out.println("            La primera solución de la ecuación cuadratica es : " + x1);
            System.out.println("            La segunda solución de la ecuación cuadratica es : " + x2);

        } catch (ArithmeticException e) {
            System.out.println(" Error: División por CERO ");

        } catch (IllegalArgumentException e) {
            System.out.println(e.getMessage());

        }
    }

    //========== DISCRIMINANTE ==========
    public static double calcularDiscriminante(double a, double b, double c){
        try{
            double discriminante    = Math.pow(b,2) - (4*a*c);
            System.out.println(discriminante);
            return discriminante;

        } catch(ArithmeticException e){
            System.out.println(" Error: División por CERO ");
            return Double.NaN;
        }

    }


    //========== PROPIEDADES DISCRIMINANTE ==========
    public static void propiedadesDiscriminante(double discriminante){
        if(discriminante == 0){
            System.out.println("        La ecuación cuadrática tiene DOS raíces reales IGUALES          ");
        } else if ( discriminante > 0){
            System.out.println("        La ecuación cuadrática tiene DOS raíces reales DIFERENTES       ");
        } else {
            System.out.println("        La ecuación cuadrática NO tiene raíces REALES                   ");
        }
    }


    //========== SISTEMA DE ECUACIONES 2X2 ==========
    public static void solucionSistema( double a, double b , double c ,
                                        double d, double e , double f ){
        try {
            // Verificar si alguno de los parámetros es nulo
            if (Double.isNaN(a) || Double.isNaN(b) || Double.isNaN(c) || Double.isNaN(d) || Double.isNaN(e) || Double.isNaN(f)) {
                throw new IllegalArgumentException(" Alguno de los parámetros es nulo ");
            }

            double denominador = (a * e) - (b * d);

            if (denominador == 0) {
                throw new IllegalArgumentException("Denominador igual a 0");
            }

            double x = ((c * e) - (b * f)) / denominador;
            double y = ((a * f) - (c * d)) / denominador;

            System.out.println("El valor de x es   : " + x);
            System.out.println("El valor de y es   : " + y);

        } catch (IllegalArgumentException ee) {
            System.out.println("Error: " + ee.getMessage());
        }
    }



    //========== ECUACIÓN DE LA RECTA ==========
    public static void ecuacionRecta(double x1, double y1, double x2, double y2){
        try{
                // Si los puntos en x son iguales hacen el númerador 0
            if (x1 == x2){
                throw new IllegalArgumentException(" Denominador igual a cero ");
            }

            double pendiente    = ((y2 - y1)/(x2 - x1));
            double terminoLibre = (y1 - (pendiente * x1));

            System.out.println("        La pendiente es            : " + pendiente                                 );
            System.out.println("        El término libre es        : " + terminoLibre                              );
            System.out.println("        La ecuación de la recta es : Y = " + pendiente + " C = " + terminoLibre    );
        } catch (IllegalArgumentException e){
            System.out.println("Error: " + e.getMessage());
        }
    }
}
