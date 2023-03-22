package service;

import model.Cliente;
import org.springframework.stereotype.Service;

import java.lang.reflect.Field;
import java.util.ArrayList;
import java.util.List;
@Service
public class ClienteService {

 private List<Cliente> clientes;

 public ClienteService(){
  this.clientes = new ArrayList<>();
 }

 public List<Cliente> getClientes() {
  return clientes;
 }

 public Cliente crearCliente(Cliente cliente){
   this.clientes.add(cliente);
   return cliente;
 }

 public Cliente actualizarCliente (Cliente cliente) throws IllegalAccessException {
  Cliente clienteExistente = obtenerClienteCedula(cliente.getCedula());
  if(clienteExistente != null){

   Class<?> clienteClass  = cliente.getClass();
   Field[] campos = clienteClass.getDeclaredFields();
   for(Field campo : campos){
    campo.setAccessible(true);
    Object valorCampo = campo.get(cliente);
    if(valorCampo!=null){
     campo.set(cliente,valorCampo);
    }

   }
   return clienteExistente;

  }
 return clienteExistente;
 }

 public Cliente obtenerClienteCedula(String cedula){
  return this.clientes.stream()
          .filter(cliente->cliente.getCedula().equals(cedula))
          .findFirst().get();
 }

 public String eliminarCliente (String cedula){
  Cliente cliente = obtenerClienteCedula(cedula);
  if(cliente == null){
   throw new RuntimeException("El empleado con cedula " + cedula + "no fue encontrado");
  }
  clientes.remove(cliente);
  return "El empleado con cedula" + cedula + "fue eliminado con exito";
 }
}
