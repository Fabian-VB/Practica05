/*
Clase CicloDoWhile
@author Villa Briseño Fabián
@version 1.0
*/
import java.util.Scanner;
public class CicloDoWhile{
  //Metodo principal para calcular números primos
  public static void main(String[] args){

    System.out.println("---Programa que calcula numeros primos---");

    // Utilizamos un Scanner para obtener datos del usuario
    Scanner entrada1 = new Scanner(System.in);
    System.out.print("Introduzca el valor inicial: ");
    /*
    @param a Representa el inicio del ciclo
    */
    int a = entrada1.nextInt();

    // Utilizamos un Scanner para obtener datos del usuario
    Scanner entrada2 = new Scanner(System.in);
    System.out.print("Introduzca en valor final: ");
    /*
    @param b Representa el límite del ciclo
    */
    int b = entrada2.nextInt();

    /*
    @param c Representa el divisor
    @param esPrimo Representa el valor de verdad
    */
    int c;
    boolean esPrimo;

    //se declara un if con la condición si a es mayor que b
    if(a > b)
    {
      //impime una cadena de caracteres
      System.out.println("Error de entrada.");
    }
    //Si la condición es falsa
    else
    {
      do
      {
        c = 2;
        esPrimo = true;
        do
        {
          //se declara un if con la condición si a/c = 0 esPrimo es falso y actualiza el valor de c
          if(a % c == 0)
          {
            esPrimo = false;
          }
          c++;
        }
        //se declara un while con condición mientras c es menor que a
        while(c < a);
        //se declara un if con condición esPrimo = True imprime el valor de a
        if(esPrimo)
        {
          System.out.println(a);
        }
        //actualiza el valor de a
        //actualiza el valor de esPrimo
        a++;
        esPrimo = true;
      }
      //se declara un while mientras a sea menor o igual a b has todo lo anterior
      while(a <= b);
    }

  }
}
