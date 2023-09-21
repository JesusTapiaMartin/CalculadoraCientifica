# CalculadoraCientifica

La Calculadora Cientifica - Caso: Simulación 

================================================

Nombres: Benjamín Fernández, 
         Jesús Tapia,
         Yoandri Villarroel.
         
================================================



==================== PASOS A DESARROLLAR ===============================


Antes de comenzar la actividad, decidimos quien creaba el repositorio y como nos dividiremos el trabajo para mejorar
el trabajo en equipo mientras se sigue aprendiendo con las actividades y los repositorios de github.


A) Como grupo se nos pidio crear un programa que simule una calculadora cientifica que pueda hacer:

-Operaciones aritmeticas

-Ecuacion Cuadratica (soluciones)

-Figuras Geometricas (calculo)

-Sistema de ecuaciones

-Ecuacion de la recta

Por lo tanto nos dividimos el trabajo en 4 ramas para luego integrarlas todas agregando el menu para que el usuario pueda seleccionar que
hacer con la calculadora. Se utilizo el Junit para hacer pruebas unitarias a nuestro codigo los cuales debian tener 2 pruebas unitarias por
cada metodo que este asociado al calculo de resultados.


B) Preguntas:

¿Que pasa si se intenta ingresar como divisor un CERO?

R: ocurrira un error por lo cual nos saltara la siguiente excepcion: "Exception in thread "main" java.lang.ArithmeticException: / by zero"

¿Que pasa si base y exponente de la potencia son CERO?

R: Si intentamos imprimir la potencia 0^0, como salida nos saldra que es 1, lo cual esto se genera por una convencion matematica ya que al ser solo una operacion
se considera que esta potencia es igual a 1, sin embargo en otras areas de matematicas como es el calculo puede que no sea asi (exclisivamente en limites), sin embargo,
como es solo una operacion, se considera igual a 1.

¿Que pasa si se intenta ingresar una variable de entrada no numerica?

R: Buscando en API de Java existe una excepcion llamada: "NumberFormatException" lo cual se produce cuando intentas convertir una cadena que no representa un número válido en un número.




