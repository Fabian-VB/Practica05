/*
Clase Primitivo
@author Villa Briseño Fabián
@version 1.0
*/
public class Primitivo{
  //Metodo principal para móstar cuantos bytes usa cada tipo de dato primitivo
  public static void main(String[] args){

    //Genera una cadena de caracteres que dice cuantos bytes usa un Byte
    System.out.println("byte: " + Byte.BYTES + " bytes");

    //Genera una cadena de caracteres que dice cuantos bytes usa un Short
    System.out.println("short: " + Short.BYTES + " bytes");

    //Genera una cadena de caracteres que dice cuantos bytes usa un Integer
    System.out.println("int: " + Integer.BYTES + " bytes");

    //Genera una cadena de caracteres que dice cuantos bytes usa un Long
    System.out.println("long: " + Long.BYTES + " bytes");

    //Genera una cadena de caracteres que dice cuantos bytes usa un Float
    System.out.println("float: " + Float.BYTES + " bytes");

    //Genera una cadena de caracteres que dice cuantos bytes usa un Double
    System.out.println("double: " + Double.BYTES + " bytes");

    //Se declara la variable "cosa" que es un Boolean y tiene valor verdadero
    boolean cosa = true;
    //Se declara un byte con la variable "valor" y le asisna el valor de comparar "cosa" con 1 y 0
    byte valor = (byte)(cosa?1:0);
    //Genera una cadena de caracteres que muestra la variable "valor"
    System.out.println("boolean: " + valor + " bits");

    //Genera una cadena de caracteres que dice cuantos bytes usa un Character
    System.out.println("char: " + Character.BYTES + " bytes");
  }
}
