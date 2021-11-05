/*
Clase Cuenta que representa una cuenta
@author Villa Briseño Fabián
@version 1.0
*/
public class Cuenta{
  //representa los datos del usuario
  private String titular;
  //representael dinero del usuario
  private double dineroDisponible;

//------------------------------------------------------------------------------

/*
  Constructor que representa los datos del usuario
  @param titular Representación del nombre del usuario
*/
  public Cuenta(String titular){
    this.titular = titular;
    this.dineroDisponible = 0;
  }

  //Constructor que representa los datos del usuario
  public Cuenta(){
    titular = "Fabian";
    dineroDisponible = 20;
  }

//------------------------------------------------------------------------------

  /*
  método que devuelve el titular del usuario
  @return el nombre del usuario
  */
  public String getTitular(){
    return titular;
  }
  /*
  método que cambia el nómbre del titular
  @param titular el nuevo valor de titular
  */
  public void setTitular(String titular){
    this.titular = titular;
  }

  /*
  método que devuelve el dinero del usuario
  @return el dinero disponible
  */
  public double getDineroDisponible(){
    return dineroDisponible;
  }

  /*
  método que cambia el valor eel dinero disponible
  @param dineroDisponible el nuevo valor de dineroDisponible
  */
  public void setDineroDisponible(double dineroDisponible){
    this.dineroDisponible = dineroDisponible;
  }

//------------------------------------------------------------------------------

  /*
  método que muestra los valores de titular y dineroDisponible
  @return nombre del titular
  @return dinero disponible de dineroDisponible
  */
  public String toString(){
    return titular + " " + dineroDisponible;
  }
}
