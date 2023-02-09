/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package co.edu.udistrital.mod_pro.marcadores.poo;

/**
 *
 * @author Santiago Baron Zuleta
 * 
 */
class Marcador {
    private String tapa;
    private String cuerpo;
    private String contenido;

    public Marcador(String tapa, String cuerpo, String contenido) {
        this.tapa = tapa;
        this.cuerpo = cuerpo;
        this.contenido = contenido;
    }

    public String getTapa() {
        return tapa;
    }

    public void setTapa(String tapa) {
        this.tapa = tapa;
    }

    public String getCuerpo() {
        return cuerpo;
    }

    public void setCuerpo(String cuerpo) {
        this.cuerpo = cuerpo;
    }

    public String getContenido() {
        return contenido;
    }

    public void setContenido(String contenido) {
        this.contenido = contenido;
    }

    public void borrarContenido() {
        this.contenido = "";
    }

    @Override
    public String toString() {
        return "Nuevo marcador creado: \n Tapa: " + tapa + "\n Cuerpo: " + cuerpo + "\n Contenido: " + contenido;
    }
}