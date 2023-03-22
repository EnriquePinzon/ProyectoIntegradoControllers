package model;

import java.time.LocalTime;

public class Envio {

    private String idGuia;

    Cliente cliente;


    private String ciudadOrigen;

    private String ciudadDestino;

    private String direccionDestino;

    private String nombreDestinatario;

    private LocalTime horaEntrega;

    private String estadoDelEnvio;
    private int valorEnvio;

    Paquete paquete;

    public Envio(String idGuia, Cliente cliente, String ciudadOrigen, String ciudadDestino, String direccionDestino, String nombreDestinatario, LocalTime horaEntrega, String estadoDelEnvio, int valorEnvio, Paquete paquete) {
        this.idGuia = idGuia;
        this.cliente = cliente;
        this.ciudadOrigen = ciudadOrigen;
        this.ciudadDestino = ciudadDestino;
        this.direccionDestino = direccionDestino;
        this.nombreDestinatario = nombreDestinatario;
        this.horaEntrega = horaEntrega;
        this.estadoDelEnvio = estadoDelEnvio;
        this.valorEnvio = valorEnvio;
        this.paquete = paquete;
    }

    public String getIdGuia() {
        return idGuia;
    }

    public Cliente getCliente() {
        return cliente;
    }

    public String getCiudadOrigen() {
        return ciudadOrigen;
    }

    public String getCiudadDestino() {
        return ciudadDestino;
    }

    public String getDireccionDestino() {
        return direccionDestino;
    }

    public String getNombreDestinatario() {
        return nombreDestinatario;
    }

    public LocalTime getHoraEntrega() {
        return horaEntrega;
    }

    public String getEstadoDelEnvio() {
        return estadoDelEnvio;
    }

    public int getValorEnvio() {
        return valorEnvio;
    }

    public Paquete getPaquete() {
        return paquete;
    }
}
