/*
Clase CicloFor
@author Villa Briseño Fabián
@version 1.0
*/
import java.util.Scanner;
public class Condicionales{
  //Metodo principal para calcular qué nuémro es mayor que otro.
  public static void main(String[] args){

  System.out.println("*** Condicionales ***");

  // Utilizamos un Scanner para obtener datos del usuario
  //@param a Representación de un número
  Scanner entrada1 = new Scanner(System.in);
  System.out.print("Dame el numero 1: ");
  double a = entrada1.nextDouble();

  // Utilizamos un Scanner para obtener datos del usuario
  //@param b Representación de un número
  Scanner entrada2 = new Scanner(System.in);
  System.out.print("Dame el numero 2: ");
  double b = entrada2.nextDouble();

  //se declara un if con condición si b es menor que a
  if(b < a)
  {
    //imprime una cadena de caracteres que indica que a es el número mayor
    System.out.print("El numero con mayor valor es: " + a);
  }
  //si la condición anterior es falsa
  else
  {
    //imprime una cadena de caracteres que indica que b es el número mayor
    System.out.print("El numero con mayor valor es: " + b);
  }

  }
}
