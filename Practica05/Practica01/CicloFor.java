/*
Clase CicloFor
@author Villa Briseño Fabián
@version 1.0
*/
public class CicloFor{
//Metodo principal para calcular números primos
  public static void main(String[] args){

    //Se declara un for con los argumentos
    /*
    Se declara la variable a = 1
    a debe ser menor o igual a 1000 para que el for actúe
    a va aumentar de 1 en 1 en el proceso
    @param a Representa el inicio del ciclo 
    */
    for(int a = 1; a <= 1000; a ++)
    {
      //Se declara un boolean con la variable esPrimo = True
      boolean esPrimo = true;
      //Se declara un for con los argumentos
      /*
      Se declara la variable b = 2
      b debe ser menor que a para que el for actúe
      b va aumentar de 1 en 1 en el proceso
      */
      for (int b = 2; b < a; b++)
      {
        //se declara un if con la condición a/b = 0
        if(a % b == 0)
        {
          //si se cumple actualiza el valor de esPrimo y termina el proceso
          esPrimo = false;
          break;
        }
      }
      //se declara un if con la condición
      //si esPrimo = True imprime el valor de a
      if(esPrimo)
      {
        System.out.println(a + " es primo.");
      }
    }

  }
}
