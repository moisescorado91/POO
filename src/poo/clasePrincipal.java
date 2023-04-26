package poo;

//importamos los paquetes de donde estan las demas clases
//ya que las tengo alojadas en otro paquete

import paquete2.Empleado;
import paquete2.Proyecto;

public class clasePrincipal {

    public static void main(String[] args) {
        
        //creamos las instancias de la demas clases
        Proyecto proyecto = new Proyecto();
        Empleado empleado1 = new Empleado(555.55, "Moises", "alapar del vecino ", 20);
        
        
        //mandamos a llamar los metodos que muestran la informacion que hemos enviado
        empleado1.imprimir();
        empleado1.imprimirPersona();

    }

}
