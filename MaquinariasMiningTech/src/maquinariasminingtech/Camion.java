/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package maquinariasminingtech;

/**
 *
 * @author Nancy
 */
public class Camion extends Maquinaria {
   private int capacidadCarga; //15 -30 -50

    public Camion() {
    }

    public Camion(int capacidadCarga, String codigo, String nombre, String tipoCombustible, int potencia, int diasOperacion) {
        super(codigo, nombre, tipoCombustible, potencia, diasOperacion);
        this.capacidadCarga = capacidadCarga;
    }

    public int getCapacidadCarga() {
        return capacidadCarga;
    }

    public void setCapacidadCarga(int capacidadCarga) {
        this.capacidadCarga = capacidadCarga;
    }

    @Override
    public String toString() {
        return "\nCamion: capacidad de carga=" + capacidadCarga + " Toneladas.";
    }
    
    /**
     * Para los camiones mineros, se aplica un incremento 
     * del 10% si su capacidad de carga es de 50 toneladas.
     * @return 
     */
    @Override
    public double calcularCostoOperacion() {
        double costo = super.calcularCostoOperacion();
        if (this.capacidadCarga == 50) {            
            costo += costo * 0.1;
            /*la instrucción de arriba es equivalente a:
            costo = costo + (costo * 0.1);
            costo = costo * 1.1;
            */
        }
        return costo;
    }

    @Override
    public void mostrar() {
        System.out.println(super.toString() + toString() +
                "\n Costo por Operación: USD$" + calcularCostoOperacion());
    }
   
   
}
