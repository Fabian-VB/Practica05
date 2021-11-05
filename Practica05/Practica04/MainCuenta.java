/*
Clase Cuenta
@author Villa Briseño Fabián
@version 1.0
*/
import java.util.Scanner;
public class MainCuenta{
    //Metodo principal para mostrar el nombre y dinero de determinado usuario
    public static void main(String [] args){

    //utilizamos la clase cuenta para mostrar el usuario y su dinero con unas cadenas de caracteres
    Cuenta nombre1 = new Cuenta();
    System.out.println("Usuario: " + nombre1.getTitular());
    System.out.println("Dinero: " + nombre1.getDineroDisponible());

    //utilizamos el método cuenta para mostrar el nuevo usuario y su dinero con unas cadenas de caracteres
    Cuenta nombre2 = new Cuenta("Juan");
    System.out.println("Usuario: " + nombre2.getTitular());
    System.out.println("Dinero: " + nombre2.getDineroDisponible());

    //imprime en pantalla los datos nombre1 del método
    System.out.println(nombre1);

//------------------------------------------------------------------------------

    }
}
