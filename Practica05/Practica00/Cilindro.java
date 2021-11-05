/*
Clase Cilindro
@author Villa Briseño Fabián
@version 1.0
*/
public class Cilindro{
  //Metodo principal para calcular el área y volumen de un cilindro
  public static void main(String args[]){

    //Se declaran diferentes variables
    /*
    @param h Representación de altura
    @param r Representación de radio
    @param c Representación de radio al cuadrado
    @param a Representación de area
    @param v Representación de volumen
    @param pi Representación de pi
    */
    double h, r, c, a, v, pi;
    //Se le asignan valores a las variables
    h=20;
    r=10;
    c=r*r;
    pi=3.1416;

    //Realiza la operación del área y se le asigna el valor a la variable "a"
    a = 2*pi*r*h+r;
    //Realiza la operación del volumen y se le asigna el valor a la variable "v"
    v = pi*c*h;

    //Genera una cadena de caracteres que incluye los resultados de las variables "a" y "v" y se muestran en pantalla
    System.out.println("---Area y volumen de un cilindro---");
    System.out.println("El area del cilindro es: " + a + " cm^2");
    System.out.println("El volumen del cilindro es: " + v + " cm^2");

  }
}
