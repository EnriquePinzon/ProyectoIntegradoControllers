package controller;

import model.Cliente;
import model.Empleado;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import service.ClienteService;
import service.EmpleadoService;

import java.util.List;

@RestController
@RequestMapping("/apiMensajeria/v1")
public class ControllerEmpleado {
    private EmpleadoService empleadoService;

    @Autowired
    public ControllerEmpleado(EmpleadoService empleadoService) {
        this.empleadoService = empleadoService;
    }
    //Creacion de empleados.
    @PostMapping("/empleados")
    public Empleado crearCliente(@RequestBody Empleado empleado){
        Empleado empleado1 = empleadoService.crearEmpleado(empleado);
        return empleado1;
    }
    @PutMapping("/empleado")

    public ResponseEntity<String> actualizarEmpleado(@RequestBody Empleado empleadoActualizado) {
        //Metodo actualizarCliente para actualizar la información del cliente
        boolean actualizado = empleadoService.actualizarEmpleado(empleadoActualizado);

        if (actualizado) {
            // en caso exitoso HTTP 200 OK
            return new ResponseEntity<>("Cliente actualizado correctamente", HttpStatus.OK);
        } else {
            // En caso que no se actualice HTTP 400 Bad Request
            return new ResponseEntity<>("No se pudo actualizar el cliente", HttpStatus.BAD_REQUEST);
        }
    }

    @DeleteMapping("/empleados/{cedula}")
    public String eliminarEmpleado(@PathVariable("cedula") String cedula) {
        return empleadoService.eliminarEmpleado(cedula);
    }

    //obtener empleados  por cedula y traer la informacion

    @GetMapping("/empleados/{cedula}")
    public Empleado obtenerEmpleadoCedula(@PathVariable String cedula) {
        Empleado empleado = empleadoService.obtenerEmpleadoCedula(cedula);
        return empleado;
    }



}
