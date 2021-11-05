/*
Clase Bisiesto
@author Villa Briseño Fabián
@version 1.0
*/
import java.util.Scanner;
public class Bisiesto{
  //Metodo principal para calcular años bisiestos
  public static void main(String[] args){

  //Imprime una cadena de caracteres
  System.out.println("*** Bisiesto ***");

  // Utilizamos un Scanner para obtener datos del usuario y se almaneca en:
  //@param a Representación del año
  Scanner entrada1 = new Scanner(System.in);
  System.out.print("Ingresa en año que desea saber si es bisiesto o no: ");
  int a = entrada1.nextInt();

  //Se declara un if con las condiciones
  /*
  El residuo de a/4 = 0
  El residuo de a/100 ≠ 0
  El residuo de a/400 = 0
  */
  //Si se cumple la primera y alguna de las siguientes imprime el valor de "a" y una cadena de caracteres (sí es bisiesto)
  if (a % 4 == 0 && (a % 100 != 0 || a % 400 == 0))
  {
    System.out.print( a + " si es bisiesto.");
  }
  //Si no se cumplen las condiciones imprime el valor de "a" y una cadena de caracteres (no es bisiesto)
  else
  {
    System.out.print( a + " no es bisiesto.");
  }

  }
}
