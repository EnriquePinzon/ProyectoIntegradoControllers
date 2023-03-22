package model;

public class Empleado {

    private String cedula;
    private String nombreEmpleado;
    private String apellidoEmpleado;
    private String celular;
    private String correoElectronico;
    private String direccionResidencia;
    private String ciudad;
    private String antiguedadEmpresa;
    private String tipoSangre;
    private String tipoEmpleado;

    public Empleado(String cedula, String nombreEmpleado, String apellidoEmpleado, String celular, String correoElectronico, String direccionResidencia, String ciudad, String antiguedadEmpresa, String tipoSangre, String tipoEmpleado) {
        this.cedula = cedula;
        this.nombreEmpleado = nombreEmpleado;
        this.apellidoEmpleado = apellidoEmpleado;
        this.celular = celular;
        this.correoElectronico = correoElectronico;
        this.direccionResidencia = direccionResidencia;
        this.ciudad = ciudad;
        this.antiguedadEmpresa = antiguedadEmpresa;
        this.tipoSangre = tipoSangre;
        this.tipoEmpleado = tipoEmpleado;
    }

    public String getCedula() {
        return cedula;
    }

    public String getNombreEmpleado() {
        return nombreEmpleado;
    }

    public String getApellidoEmpleado() {
        return apellidoEmpleado;
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

    public String getAntiguedadEmpresa() {
        return antiguedadEmpresa;
    }

    public String getTipoSangre() {
        return tipoSangre;
    }

    public String getTipoEmpleado() {
        return tipoEmpleado;
    }
}
