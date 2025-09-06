/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package sistemaautomotora;

/**
 *
 * @author Nancy
 */
public class Sucursal {
    private String codigoSuc, nombreSuc, ciudadSuc;

    public Sucursal() {
    }

    public Sucursal(String codigoSuc, String nombreSuc, String ciudadSuc) {
        this.codigoSuc = codigoSuc;
        this.nombreSuc = nombreSuc;
        this.ciudadSuc = ciudadSuc;
    }

    public String getCodigoSuc() {
        return codigoSuc;
    }

    public void setCodigoSuc(String codigoSuc) {
        this.codigoSuc = codigoSuc;
    }

    public String getNombreSuc() {
        return nombreSuc;
    }

    public void setNombreSuc(String nombreSuc) {
        this.nombreSuc = nombreSuc;
    }

    public String getCiudadSuc() {
        return ciudadSuc;
    }

    public void setCiudadSuc(String ciudadSuc) {
        this.ciudadSuc = ciudadSuc;
    }

    @Override
    public String toString() {
        return "Sucursal{" + "codigoSuc=" + codigoSuc + ", nombreSuc=" + nombreSuc + ", ciudadSuc=" + ciudadSuc + '}';
    }
    
}
