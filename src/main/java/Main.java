

import java.util.Scanner;
import java.lang.Math;

public class Main {

    //========== MAIN ===========
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
    public static double multiplicacion(double num1, double num2) {
        return num1 * num2;
    }


    //========== DIVISIÓN ===========
    public static double division(double num1, double num2){
        return num1 / num2;
    }


    //========== MAYOR ===========
    public static double mayor(double num1, double num2){
        if(num1 > num2){
            return num1;
        } else {
            return num2;
        }
    }

    //========== MENOR ==========
    public static double menor(double num1, double num2){
        if(num1 < num2) {
            return num1;
        } else {
            return num2;
        }
    }


    //=========== IGUAL =============
    public static double igual(double num1, double num2) {
        return num1;
    }



    //=========== POTENCIA ============
    public static double potencia(double num1, double num2) {
        return Math.pow(num1,num2);
    }


    //=========== PORCENTAJE ===========
    public static double porcentaje(double base, double numPor) {
        return (numPor * base) / 100;
    }

    //=========== MOSTRAR RESULTADO SUMA =============
    public static void resultadoSuma(double num1, double num2) {
        double resultado = suma(num1, num2);
        System.out.println(resultado);
    }

    //========== MOSTRAR RESULTADO RESTA =============
    public static void resultadoResta(double num1, double num2) {
        double resultado = resta(num1, num2);
        System.out.println(resultado);
    }

    //========== MOSTRAR RESULTADO MULTIPLICACION =============
    public static void resultadoMultiplicacion(double num1, double num2) {
        double resultado = multiplicacion(num1, num2);
        System.out.println(resultado);
    }

    //========== MOSTRAR RESULTADO DIVISION =============
    public static void resultadoDivision(double num1, double num2) {
        double resultado = division(num1, num2);
        System.out.println(resultado);
    }

    //========== MOSTRAR RESULTADO POTENCIA =============
    public static void resultadoPotencia(double num1, double num2) {
        double resultado = potencia(num1, num2);
        System.out.println(resultado);
    }

    //========== MOSTRAR RESULTADO PORCENTAJE =============
    public static void resultadoPorcentaje(double num1, double num2) {
        double resultado = porcentaje(num1, num2);
        System.out.println(resultado);
    }

}
