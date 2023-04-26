
package paquete2;

/**
 *
 * @author MINEDUCYT
 */
public class Persona {
    
   //variables donde vamos a alojar los datos quen nos van enviar
    //encapsulados de tipo private
    private  String nombre = "", direccion = "";
    private int edad;
    
    //metodo constructor
    public Persona(String nombre, String direccion, int edad){
        //this hace referencia a las variables de nuestra clase
        this.nombre = nombre;
        this.direccion = direccion;
        this.edad = edad;
    }
    
    //creamos los metodos setter y getter para nombre
    public String getNombre(){
        return nombre;
    }
    
    public void setNombre(String nombre){
        this.nombre = nombre;
    }
    
    //cramos metodos setter y getter para edad
    public int getEdad(){
        return edad;
    }
    
    public void setEdad(int edad){
        this.edad = edad;
    }
    
    //declaramos el metodo setter a 
    public String getDireccion(){
        return direccion;
    }
    
    public  void setDireccion(String direccion){
        this.direccion = direccion;
    }
    
    //metodo que imprime la informacion quen nos enviaron de la clase principal
    public void imprimirPersona(){
        System.out.println("nombre Ingresado: " + nombre + " EDAD Ingresado: " + edad);
        System.out.println("La direccion ingresada es: "+ direccion);
    }
}
