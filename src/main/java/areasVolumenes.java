public class areasVolumenes {


    //============================ CUADRADO ============================
    public static double perimetroCuadrado (double lado){
        return 4*lado;
    }

    public static double areaCuadrado (double lado){
        return lado*lado;
    }



    //============================ RECTANGULO ============================
    public static double perimetroRectangulo (double lado1, double lado2){
        return 2*(lado1 + lado2);
    }

    public static double areaRectangulo (double lado1, double lado2){
        return lado1*lado2;
    }



    //============================ CIRCULO ============================
    public static double perimetroCirculo (double radio){
        return 2 * Math.PI * radio;
    }

    public static double areaCirculo (double radio){
        return Math.PI * Math.pow(radio, 2);
    }



    //============================ ESFERA ============================
    public static double superficieEsfera (double radio){
        return 4 * Math.PI * Math.pow(radio, 2);
    }

    public static double volumenEsfera (double radio){
        return (4/3) * Math.PI * Math.pow(radio, 3);
    }



    //============================ CUBO ============================
    public static double superficieCubo (double lado){
        return 6 * Math.pow(lado, 2);
    }
    public static double volumenCubo (double lado){
        return Math.pow(lado,3);
    }



    //============================ CONO ============================
    public static double superficieCono (double radio, double altura){
        return (Math.PI * radio * altura) + (Math.PI * radio);
    }
    public static double volumenCono (double radio, double altura){
        return (1/3) * Math.PI * Math.pow(radio, 2) * altura;
    }


    //============================ PRUEBAS ============================
    public static void probarMetodosCuadrado (String[] args){
        double ladoCuadrado     = 5.0;
        double perimetro        = perimetroCuadrado(ladoCuadrado);
        double area             = areaCuadrado(ladoCuadrado);
        System.out.println("El perimetro del cuadrado es: " + perimetro);
        System.out.println("El perimetro del cuadrado es: " + area);
    }

    public static void probarMetodosRectangulo (String[] args){
        double lado1Rectangulo    = 4.0;
        double lado2Rectangulo    = 8.0;
        double perimetro          = perimetroRectangulo(lado1Rectangulo, lado2Rectangulo);
        double area               = areaRectangulo(lado1Rectangulo, lado2Rectangulo);
        System.out.println("El perimetro del Rectangulo es: " + perimetro);
        System.out.println("El perimetro del Rectangulo es: " + area);
    }

    public static void probarMetodosCirculo (String[] args){
        double radio              = 6.0;
        double perimetro          = perimetroCirculo(radio);
        double area               = areaCuadrado(radio);
        System.out.println("El perimetro del Circulo es:    " + perimetro);
        System.out.println("El perimetro del Circulo es:    " + area);
    }

    public static void probarMetodosEsferas (String[] args){
        double radio              = 6.5;
        double superficie         = superficieEsfera(radio);
        double volumen            = volumenEsfera(radio);
        System.out.println("La superficie de la esfera es:  " + superficie);
        System.out.println("El volumen de la esfera es:     " + volumen);
    }

    public static void probarMetodosCubo (String[] args){
        double lado               = 7.0;
        double superficie         = superficieCubo(lado);
        double volumen            = volumenCubo(lado);
        System.out.println("La superficie del cubo es:      " + superficie);
        System.out.println("El volumen del cubo es:         " + volumen);
    }

    public static void probarMetodosCono (String[] args){
        double lado               = 4.0;
        double altura             = 8.0;
        double superficie         = superficieCono(lado, altura);
        double volumen            = volumenCono(lado, altura);
        System.out.println("La superficie del cono es:      " + superficie);
        System.out.println("El volumen del cono es:         " + volumen);
    }
}

