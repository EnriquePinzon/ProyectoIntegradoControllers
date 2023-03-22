package model;

public class Paquete {
    private String idPaquete;

    private String tipoPaquete;

    private float peso;
    private int valorDeclarado;

    public Paquete(String idPaquete, String tipoPaquete, float peso, int valorDeclarado) {
        this.idPaquete = idPaquete;
        this.tipoPaquete = tipoPaquete;
        this.peso = peso;
        this.valorDeclarado = valorDeclarado;
    }

    public String getIdPaquete() {
        return idPaquete;
    }

    public String getTipoPaquete() {
        return tipoPaquete;
    }

    public float getPeso() {
        return peso;
    }

    public int getValorDeclarado() {
        return valorDeclarado;
    }
}
