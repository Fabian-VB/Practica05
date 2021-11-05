/*
Clase Figura
@author Villa Briseño Fabián
@version 1.0
*/public class MainFigura{
//Metodo principal para mostrar el área y el perímetro de una figura
  public static void main(String[] args){

    //utilizamos la clase figura y actualizamos los valores de la base y la altura
    Figura rectangulo1 = new Figura();
    rectangulo1.setBase(16);
    rectangulo1.setAltura(4);
    //imprime una cadena de caracteres con el valor de area de la figura y su perímetro
    System.out.println("El area es " + rectangulo1.area());
    System.out.println("El perimetro es " + rectangulo1.perimetro());

    //utilizamos la clase figura con los valores predeterminados
    Figura rectangulo2 = new Figura();
    //imprime una cadena de caracteres con el valor de area de la figura y su perímetro
    System.out.println("El area es " + rectangulo2.area());
    System.out.println("El perimetro es " + rectangulo2.perimetro());

    //imprime en pantalla los datos rectangulo2 del método
    System.out.println(rectangulo2);

  }
}
