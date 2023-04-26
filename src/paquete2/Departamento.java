package paquete2;

import java.util.ArrayList;

/**
 *
 * @author MOISES
 */
public class Departamento {

    private ArrayList<Empleado> empleados;

    public Departamento() {
        this.empleados = new ArrayList<Empleado>();
    }

    //metodo para agregar empleado
    public void agregarEmpleado(Empleado empleado) {
        empleados.add(empleado);
    }

    //metodo para eliminar el empleado
    public void eliminarEmpleado(Empleado empleado) {
        empleados.remove(empleado);
    }
}
