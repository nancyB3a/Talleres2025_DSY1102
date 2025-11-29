/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package modelo;

/**
 *
 * @author Nancy
 */
public class Donacion {
    private int id, monto;
    private String empresa;

    public Donacion() {
    }

    public Donacion(int id, int monto, String empresa) {
        this.id = id;
        this.monto = monto;
        this.empresa = empresa;
    }

    public Donacion(int monto, String empresa) {
        this.monto = monto;
        this.empresa = empresa;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getMonto() {
        return monto;
    }

    public void setMonto(int monto) {
        this.monto = monto;
    }

    public String getEmpresa() {
        return empresa;
    }

    public void setEmpresa(String empresa) {
        this.empresa = empresa;
    }

    @Override
    public String toString() {
        return "Donacion{" + "id=" + id + ", monto=" + monto + ", empresa=" + empresa + '}';
    }
    
    
}
