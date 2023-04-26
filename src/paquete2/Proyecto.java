package paquete2;

public class Proyecto {
    
    //declaramos una variable por que esta se utiliza en los demas metodos que
    // se declaran mas abajo
    private Departamento departamento;

    public Proyecto(){
        
        //creamos la instancia hacia la clase departameto y la alojamos en la variable
        //que declaramos anteriormento
        this.departamento = new Departamento();
    }
    
    public void agregarEmpleado(Empleado empleado){
        departamento.agregarEmpleado(empleado);
    }
    
    public void eliminarEmpleado(Empleado empleado){
        departamento.eliminarEmpleado(empleado);
    }
}
