/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package maquinariasminingtech;

/**
 *
 * @author Nancy
 */
public class Perforadora extends Maquinaria{

    private String tipoPerforacion; //barrenosXS - barrenosXL - altaPrecision

    public Perforadora() {
    }

    public Perforadora(String tipoPerforacion, String codigo, String nombre, String tipoCombustible, int potencia, int diasOperacion) {
        super(codigo, nombre, tipoCombustible, potencia, diasOperacion);
        this.tipoPerforacion = tipoPerforacion;
    }

    public String getTipoPerforacion() {
        return tipoPerforacion;
    }

    public void setTipoPerforacion(String tipoPerforacion) {
        this.tipoPerforacion = tipoPerforacion;
    }

    @Override
    public String toString() {
        return super.toString() + "\nPerforadora: tipo de perforacion=" + tipoPerforacion+
                "\n Costo por Operación: USD$" + calcularCostoOperacion();
    }
    
    /**
     * Para las perforadoras, si su tipo de perforación es de 
     * alta precisión, se aplica un incremento del 8%.
     * @return 
     */
    @Override
    public double calcularCostoOperacion() {
        double costo = super.calcularCostoOperacion();
        if (this.tipoPerforacion.equalsIgnoreCase("altaPrecision")) {            
            costo += costo * 0.08;
            /*la instrucción de arriba es equivalente a:
            costo = costo + (costo * 0.08);
            costo = costo * 1.08;
            */
        }
        return costo;
    }

    @Override
    public void mostrar() {
        System.out.println(toString());
    }
    
    
    
}
