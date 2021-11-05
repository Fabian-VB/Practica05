/*
Clase Figura que representa una cuenta
@author Villa Briseño Fabián
@version 1.0
*/public class Figura{

  //representa la base de la figura
  private double base;
  //representa la altura de la figura
  private double altura;

//------------------------------------------------------------------------------

  /*
  Constructor que representa los datos de la Figura
  @param base Representación de la base
  @param altura Representación de la altura
  */
  public Figura(double base, double altura){
    this.base = base;
    this.altura = altura;
  }

  /*
  Constructor que representa los datos de la Figura con valores
  */
  public Figura(){
    this.base = 10;
    this.altura = 5;
  }

//------------------------------------------------------------------------------

  /*
  método que devuelve la base de la Figura
  @return el valor de la base
  */
  public double getBase(){
    return base;
  }
  /*
  método que cambia el valor de la base
  @param base el nuevo valor de base
  */
  public void setBase(double base){
    if(base > 0 && base < 100){
      this.base = base;
    }
  }


  /*
  método que devuelve la altura de la Figura
  @return el valor de la altura
  */
  public double getAltura(){
    return altura;
  }
  /*
  método que cambia el valor de la altura
  @param altura el nuevo valor de altura
  */
  public void setAltura(double altura){
    if(altura > 0 && altura < 100){
      this.altura = altura;
    } else {
      throw new RuntimeException("La altura debe ser 0 < 100");
    }
  }

//------------------------------------------------------------------------------

  /*
  método publico que calcula el area
  @return  el valor de la base por la altura
  */
  public double area(){
    return base * altura;
  }

  /*
  método publico que calcula el perimetro
  @return el valor de la base por 2 más la altura por 2
  */
  public double perimetro(){
    return (base  * 2) + (altura * 2);
  }

//------------------------------------------------------------------------------

/*
método que muestra los valores de la base y la altura
@return valor de la base
@return el valor de la altura
*/
  public String toString() {
    return base + " " + altura;
  }

}
