package service;
import model.Empleado;
import org.springframework.stereotype.Service;

import java.lang.reflect.Field;
import java.util.ArrayList;
import java.util.List;
@Service
public class EmpleadoService {
    private List<Empleado> empleados;

    public EmpleadoService(){
        this.empleados = new ArrayList<>();
    }

    public List<Empleado> getEmpleados() {
        return empleados;
    }

    public Empleado crearEmpleado(Empleado empleado){
        this.empleados.add(empleado);
        return empleado;
    }

    public Empleado actualizarEmpleado (Empleado empleado) throws IllegalAccessException {
        Empleado empleadoExistente = obtenerEmpleadoCedula(empleado.getCedula());
        if(empleadoExistente != null){



            Class<?> clienteClass  = empleado.getClass();
            Field[] campos = clienteClass.getDeclaredFields();
            for(Field campo : campos){
                campo.setAccessible(true);
                Object valorCampo = campo.get(empleado);
                if(valorCampo!=null){
                    campo.set(empleado,valorCampo);
                }

            }
            return empleadoExistente;

        }
        return empleadoExistente;
    }


    public Empleado obtenerEmpleadoCedula(String cedula){
        return this.empleados.stream()
                .filter(empleado->empleado.getCedula().equals(cedula))
                .findFirst().get();
    }

    public String eliminarEmpleado (String cedula){
        Empleado empleado = obtenerEmpleadoCedula(cedula);
        if(empleado == null){
            throw new RuntimeException("El empleado con cedula " + cedula + "no fue encontrado");
        }
        empleados.remove(empleado);
        return "El empleado con cedula" + cedula + "fue eliminado con exito";
    }

}


