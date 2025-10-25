/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package maquinariasminingtech;

/**
 *
 * @author Nancy
 */
public class Excavadora extends Maquinaria {
    private String tipoCuchara; //cucharaCorte - cucharonMatPesado - cucharonMatLiviano

    public Excavadora() {
    }

    public Excavadora(String tipoCuchara, String codigo, String nombre, String tipoCombustible, int potencia, int diasOperacion) {
        super(codigo, nombre, tipoCombustible, potencia, diasOperacion);
        this.tipoCuchara = tipoCuchara;
    }

    public String getTipoCuchara() {
        return tipoCuchara;
    }

    public void setTipoCuchara(String tipoCuchara) {
        this.tipoCuchara = tipoCuchara;
    }

    @Override
    public String toString() {
        return super.toString() + "\nExcavadora: " + "tipo de cuchara=" + tipoCuchara;
    }

    /**
     * Para las excavadoras, el costo diario aumenta 
     * en un 12% si la cuchara es de corte.
     * @return 
     */
    @Override
    public double calcularCostoOperacion() {
        double costo = super.calcularCostoOperacion();
        if (this.tipoCuchara.equalsIgnoreCase("CUCHARACORTE")) {            
            costo += costo * 0.12;
            /*la instrucción de arriba es equivalente a:
            costo = costo + (costo * 0.12);
            costo = costo * 1.12;
            */
        }
        return costo;
    }

    @Override
    public void mostrar() {
        System.out.println(toString() +
                "\n Costo por Operación: USD$" + calcularCostoOperacion());
    }
    
    
    
    
    
}
