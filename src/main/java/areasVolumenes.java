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

    public static void main (String[] args){

    }
}

