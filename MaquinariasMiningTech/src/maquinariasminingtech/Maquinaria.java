/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package maquinariasminingtech;

/**
 *
 * @author Nancy
 */
public abstract class Maquinaria implements ICobradora{
    protected String codigo, nombre, tipoCombustible;
    protected int potencia, diasOperacion;

    public Maquinaria() {
    }

    public Maquinaria(String codigo, String nombre, String tipoCombustible, int potencia, int diasOperacion) {
        this.codigo = codigo;
        this.nombre = nombre;
        this.tipoCombustible = tipoCombustible;
        this.potencia = potencia;
        this.diasOperacion = diasOperacion;
    }

    public String getCodigo() {
        return codigo;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getTipoCombustible() {
        return tipoCombustible;
    }

    public void setTipoCombustible(String tipoCombustible) {
        this.tipoCombustible = tipoCombustible;
    }

    public int getPotencia() {
        return potencia;
    }

    public void setPotencia(int potencia) {
        this.potencia = potencia;
    }

    public int getDiasOperacion() {
        return diasOperacion;
    }

    public void setDiasOperacion(int diasOperacion) {
        this.diasOperacion = diasOperacion;
    }

    @Override
    public String toString() {
        return "Maquinaria{" + "codigo=" + codigo + ", nombre=" + nombre + ", tipoCombustible=" + tipoCombustible + ", potencia=" + potencia + ", diasOperacion=" + diasOperacion + '}';
    }

    @Override
    public double calcularCostoOperacion() {
        return this.diasOperacion * COSTO_DIA_OPERACION;
    }
    
    public abstract void mostrar();
    
    
}
