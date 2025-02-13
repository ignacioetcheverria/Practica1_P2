# Practicas_Programacion

En este programa se hace una aproximación iterativa al número PI mediante el 
método de Montecarlo. Para ello tenemos dos clases; una Principal, a través de 
la cual ejecutaremos el código y estableceremos la cantidad de "pasos" a hacer
para la aproximación, y otra llamada Matemáticas, con la cual hacemos el cálculo 
del número PI a través de el método de Montecarlo. 

Este método consiste en establecer un cuadrado con una circunferencia en su 
interior. A partir de eso creamos un método iterativo en el que iremos generando
puntos al azar. Estos puntos que generemos y que se encuentren en el área de la 
circunferencia los iremos guardando, para posteteriormente dividir este número
entre la cantidad de puntos totales generados. El resultado de esta división 
multiplicado por cuatro nos dará una aproximación al número PI.
