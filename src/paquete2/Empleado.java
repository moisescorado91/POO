package paquete2;

public class Empleado extends Persona {

    private double salario;

    //metodo constructor
    public Empleado(double salario, String nombre, String direccion, int edad) {
        // la palabra super la ocupamos para invocar el metodo constructor
        //de la clase padre de cual estamos heredando
        super(nombre, direccion, edad);
        this.salario = salario;
    }
    
    
    public  void imprimir(){
        System.out.println("El salario ingresado es el siguiente "+salario);
    }
}