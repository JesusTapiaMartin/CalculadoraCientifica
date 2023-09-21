
import java.util.Scanner;
import java.lang.Math;

public class Main {

    //========== MAIN ==========
    public static void main(String[] args) {
    }

    //========== SUMA ==========
    public static double suma(double num1, double num2){
        return num1 + num2;
    }


    //========== RESTA ==========
    public static double resta(double num1, double num2){
        return num1 - num2;
    }


    //========== MULTIPLICACIÓN ==========
    public static double multiplicacion(double num1, double num2){
        return num1 * num2;
    }


    //========== DIVISIÓN ==========
    public static double division(double num1, double num2){
        return num1 / num2;
    }


    //========== MAYOR ==========
    public static void mayor(double num1, double num2){

        if (num1 > num2){
            System.out.println(" El número 1 es el mayor        ");

        } else if (num1 < num2){
            System.out.println(" El número 2 es mayor           ");

        } else if (num1 == num2){
            System.out.println(" Los números son iguales        ");

        } else {
            System.out.println(" Ingrese un NÚMERO válido...    ");

        }
    }

    //========== MENOR QUE ==========
    public static void menor(double num1, double num2){
        if ( num1 > num2){
            System.out.println(" El número 2 es el menor        ");

        } else if (num2 > num1){
            System.out.println(" El número 1 es el menor        ");

        } else if (num1 == num2){
            System.out.println(" Los números son IGUALES        ");

        } else {
            System.out.println(" Ingrese un número válido...    ");
        }
    }


    //=========== POTENCIA ===========
    public static double potencia(double num1, double num2){
        return Math.pow(num1,num2);
    }


    //=========== PORCENTAJE ===========
    public static double porcentaje(double base, double numPor){
        return (numPor * 100) / base;
    }
}

// METODO MOSTRAR RESULTADO
// sout(EL MAYOR ES + metodo)