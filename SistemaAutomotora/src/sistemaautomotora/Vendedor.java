/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package sistemaautomotora;

import java.util.Date;

/**
 *
 * @author Nancy
 */
public class Vendedor {
    private String rut, nombre;
    private int nroVendedor;
    private Date fechaIngreso;
    private Sucursal sucursal; //Atributo de colaboración

    public Vendedor() {
    }

    public Vendedor(String rut, String nombre, int nroVendedor, Date fechaIngreso, Sucursal sucursal) {
        this.rut = rut;
        this.nombre = nombre;
        this.nroVendedor = nroVendedor;
        this.fechaIngreso = fechaIngreso;
        this.sucursal = sucursal;
    }

    public String getRut() {
        return rut;
    }

    public void setRut(String rut) {
        this.rut = rut;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getNroVendedor() {
        return nroVendedor;
    }

    public void setNroVendedor(int nroVendedor) {
        this.nroVendedor = nroVendedor;
    }

    public Date getFechaIngreso() {
        return fechaIngreso;
    }

    public void setFechaIngreso(Date fechaIngreso) {
        this.fechaIngreso = fechaIngreso;
    }

    public Sucursal getSucursal() {
        return sucursal;
    }

    public void setSucursal(Sucursal sucursal) {
        this.sucursal = sucursal;
    }

    @Override
    public String toString() {
        return "Vendedor{" + "rut=" + rut + ", nombre=" + nombre + ", nroVendedor=" + nroVendedor + ", fechaIngreso=" + fechaIngreso + ", sucursal=" + sucursal + '}';
    }
    
    
}
