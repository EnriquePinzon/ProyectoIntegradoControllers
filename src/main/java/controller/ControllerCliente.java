package controller;

import model.Cliente;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import service.ClienteService;

import java.util.List;

@RestController
@RequestMapping("/apiMensajeria/v1")
public class ControllerCliente {

    private ClienteService clienteService;

    @Autowired
    public ControllerCliente(ClienteService clienteService) {
        this.clienteService = clienteService;
    }

    //Creacion de clientes.
    @PostMapping("/clientes")
    public Cliente crearCliente(@RequestBody Cliente cliente){
        Cliente cliente1 = clienteService.crearCliente(cliente);
        return cliente1;
    }
    @PutMapping("/clientes/")
    public ResponseEntity<String> actualizarCliente(@RequestBody Cliente clienteActualizado) {
       //Metodo actualizarCliente para actualizar la información del cliente
        boolean actualizado = clienteService.actualizarCliente(clienteActualizado);

        if (actualizado) {
            // en caso exitoso HTTP 200 OK
            return new ResponseEntity<>("Cliente actualizado correctamente", HttpStatus.OK);
        } else {
            // En caso que no se actualice HTTP 400 Bad Request
            return new ResponseEntity<>("No se pudo actualizar el cliente", HttpStatus.BAD_REQUEST);
        }
    }





    //eliminando por cedula y trayendo mensaje;

    @DeleteMapping("/clientes/{cedula}")
    public String eliminarCliente(@PathVariable("cedula") String cedula) {
        return clienteService.eliminarCliente(cedula);
    }

    //obtener clientes por cedula y traer la informacion

    @GetMapping("/clientes/{cedula}")
    public Cliente obtenerClienteCedula(@PathVariable String cedula) {
        Cliente cliente = clienteService.obtenerClienteCedula(cedula);
        return cliente;
    }

}
