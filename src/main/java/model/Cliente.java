package model;

public class Cliente {
    private String cedula;
    private String nombreCliente;
    private String apellidoCliente;
    private String celular;
    private String correoElectronico;
    private String direccionResidencia;
    private String ciudad;

    public Cliente(String cedula, String nombreCliente, String apellidoCliente, String celular, String correoElectronico, String direccionResidencia, String ciudad) {
        this.cedula = cedula;
        this.nombreCliente = nombreCliente;
        this.apellidoCliente = apellidoCliente;
        this.celular = celular;
        this.correoElectronico = correoElectronico;
        this.direccionResidencia = direccionResidencia;
        this.ciudad = ciudad;
    }

    public String getCedula() {
        return cedula;
    }

    public String getNombreCliente() {
        return nombreCliente;
    }

    public String getApellidoCliente() {
        return apellidoCliente;
    }

    public String getCelular() {
        return celular;
    }

    public String getCorreoElectronico() {
        return correoElectronico;
    }

    public String getDireccionResidencia() {
        return direccionResidencia;
    }

    public String getCiudad() {
        return ciudad;
    }
}
