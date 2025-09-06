/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package sistemaautomotora;

/**
 *
 * @author Nancy
 */
public class Vehiculo {
    private String codigo, marca, modelo,tipo, condicion;
    private int annio;
    private double precioBase;

    public Vehiculo() {
    }

    public Vehiculo(String codigo, String marca, String modelo, String tipo, String condicion, int annio) {
        this.codigo = codigo;
        this.marca = marca;
        this.modelo = modelo;
        this.tipo = tipo;
        this.condicion = condicion;
        this.annio = annio;
        calcularPrecioBase();
    }

    public String getCodigo() {
        return codigo;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public String getCondicion() {
        return condicion;
    }

    public void setCondicion(String condicion) {
        this.condicion = condicion;
    }

    public int getAnnio() {
        return annio;
    }

    public void setAnnio(int annio) {
        this.annio = annio;
    }

    public double getPrecioBase() {
        return precioBase;
    }

    public void setPrecioBase(double precioBase) {
        this.precioBase = precioBase;
    }

    @Override
    public String toString() {
        return "Vehiculo{" + "codigo=" + codigo + "\nmarca=" + marca + "\nmodelo=" + modelo + "\ntipo=" + tipo + "\ncondicion=" + condicion + "\nannio=" + annio + "\nprecioBase= $" + precioBase + '}';
    }
    
    public void calcularPrecioBase(){
        if(this.tipo.equalsIgnoreCase("sedan")){
            if(this.condicion.equalsIgnoreCase("nuevo")){
                this.precioBase = 12000;
            }else{            
                this.precioBase = 7000;
            }
        }else{
            if(this.tipo.equalsIgnoreCase("suv")){
                if(this.condicion.equalsIgnoreCase("nuevo")){
                    this.precioBase = 18000;
                }else{            
                    this.precioBase = 11000;
                }
            }else{//camioneta
                if(this.condicion.equalsIgnoreCase("nuevo")){
                    this.precioBase = 20000;
                }else{            
                    this.precioBase = 13000;
                }
            }
        }
    }


    
    
}
