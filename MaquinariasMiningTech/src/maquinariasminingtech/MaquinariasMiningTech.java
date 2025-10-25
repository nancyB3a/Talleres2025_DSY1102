/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package maquinariasminingtech;

/**
 *
 * @author Nancy
 */
public class MaquinariasMiningTech {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // creo objetos del tipo de las clases derivadas
        Excavadora m01 = new Excavadora("cucharaCorte", "M01", "Gran Caterpila", "Diesel", 500, 3);
        Excavadora m02 = new Excavadora("cucharonMatLiviano", "M02", "Jonh Dere", "Bencina 95", 700, 1);
        Excavadora m03 = new Excavadora("cucharonMatPesado", "M03", "SuperExcavadora", "Diesel", 1000, 4);
        Camion m04 = new Camion(30, "M04", "OptimusPrime", "Diesel", 500, 5);
        Camion m05 = new Camion(50, "M05", "Tolva", "Bencina 93", 600, 10);
        Perforadora m06 = new Perforadora("barrenosXS", "M06", "Perforin", "Bencina 97", 250, 1);
        Perforadora m07 = new Perforadora("altaPrecision", "M07", "Perforota", "Diesel", 850, 3);

        GestionMaquinaria r = new GestionMaquinaria();
        r.agregarMaquinaria(m01);
        r.agregarMaquinaria(m01);
        r.agregarMaquinaria(m02);
        r.agregarMaquinaria(m03);
        r.agregarMaquinaria(m04);
        r.agregarMaquinaria(m05);
        r.agregarMaquinaria(m06);
        r.agregarMaquinaria(m07);
        r.listarMaquinarias();  
        System.out.println("Listar por tipo\n~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
        r.listarMaquinarias("camion");
        r.listarMaquinarias("perforadora");
        r.cantidadMaquinaria();
        r.eliminarMaquinaria("M06");
        r.cantidadMaquinaria();
        
        
    
    }
    
}
