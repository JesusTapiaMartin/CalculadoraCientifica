public class Solucion {


    //========== SOLUCIONES EC CUADRÁTICA ==========
    public static void ecCuadratica(double a, double b, double c){
        double x1       = (-b + Math.sqrt(Math.pow(b,2) - 4*a*c))/(2*a);
        System.out.println("            La primera solución de la ecuación cuadratica es : " +x1 );

        double x2       = (-b - Math.sqrt(Math.pow(b,2) -4*a*c))/(2*a);
        System.out.println("            La segunda solución de la ecuación cuadratica es : " +x2 );
    }


    //========== DISCRIMINANTE ==========
    public static double calcularDiscriminante(double a, double b, double c){
        double discriminante    = Math.pow(b,2) - (4*a*c);
        return discriminante;
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
                                        double d, double e , double f ,
                                        double x, double y){
            //ax+by=c
            //dx+ey=f
        x = (c*e - b*f)/(a*e - b*d);
        y = (a*f - c*d)/(a*e - b*d);

        System.out.println("        El valor de x es   : " + x);
        System.out.println("        El valor de y es   : " + y);
    }


    //========== ECUACIÓN DE LA RECTA ==========
    public static void ecuacionRecta(double x1, double y1, double x2, double y2){
        double pendiente    = ((y2 - y1)/(x2 - x1));
        double terminoLibre = (y1 - (pendiente * x1));
        System.out.println("        La pendiente es            : " + pendiente                                 );
        System.out.println("        El término libre es        : " + terminoLibre                              );
        System.out.println("        La ecuación de la recta es : Y = " + pendiente + " C = " + terminoLibre    );
    }
}
