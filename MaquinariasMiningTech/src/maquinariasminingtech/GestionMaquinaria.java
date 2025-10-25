/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package maquinariasminingtech;

import java.util.ArrayList;

/**
 *
 * @author Nancy
 */
public class GestionMaquinaria {

    private ArrayList<Maquinaria> listaMaquinas;

    public GestionMaquinaria() {
        listaMaquinas = new ArrayList<>();
    }
    
    /**
     * Validar que no se agregue una máquina con un código ya existente.
     * @param codigo
     * @return 
     */
    public boolean buscarMaquinaria(String codigo){
        for (Maquinaria aux : listaMaquinas) {
            if (aux.getCodigo().equals(codigo)) {
                return true;
            }
        }
        return false;  
    }
    
    public boolean agregarMaquinaria(Maquinaria newMachine){
        //buscarMaquinaria(newMachine.getCodigo()) == false
        if (!buscarMaquinaria(newMachine.getCodigo())) {
            this.listaMaquinas.add(newMachine);
            System.out.println("Se ingreso nueva maquina!!");
            return true;
        }
        System.out.println("Maquina YA existe!!");
        return false;
    }
    
    /**
     * Calcular costo total de todas las maquinarias de mi colección
     */
    public double calcularTotalOperacion(){
        double total = 0;
        for (Maquinaria aux : listaMaquinas) {
            total += aux.calcularCostoOperacion();
        }
        return total;
    }   
    
    /**
     * Un método para listar todas las máquinas registradas incluyendo 
     * el costo total de operación.
     */
    public void listarMaquinarias(){
        for (Maquinaria aux : listaMaquinas) {
            aux.mostrar();
        }
        System.out.println("Total por Operacion de Maquinarias: USD$" +
                calcularTotalOperacion());
    }
    /**
     * Un método que muestre las máquinas filtrándolas por tipo.
     */
    public void listarMaquinarias(String tipo){
        for (Maquinaria aux : listaMaquinas) {
            if (tipo.equalsIgnoreCase("excavadora") && (aux instanceof Excavadora e)) {
                System.out.println("Excavadora " + aux.getNombre()+
                        " Tipo de Cuchara: " + e.getTipoCuchara());
            }else if(tipo.equalsIgnoreCase("camion") && (aux instanceof Camion c)){
                System.out.println("Camion " + aux.getNombre()+
                        " Capacidad de Carga: " + c.getCapacidadCarga() + " Toneladas.");
            }else if(tipo.equalsIgnoreCase("Perforadora") && (aux instanceof Perforadora c)){
                aux.mostrar();
            }            
        }       
    }
    
    /**
     * Un método que permita dar de baja una maquinaria, eliminándola de la colección.
     */
    public boolean eliminarMaquinaria(String codigo){
        for (Maquinaria aux : listaMaquinas) {
            if (aux.getCodigo().equals(codigo)) {
                this.listaMaquinas.remove(aux);
                System.out.println("Maquinaria eliminada con exito!!");
                return true;
            } 
        }
        System.out.println("No se encontro maquinaria con el codigo ingresado");
        return false;
    }
    
    /**
     * Método para mostrar el total de maquinarias
     */
    public void cantidadMaquinaria(){
        System.out.println("Cantidad de Maquinas disponibles: " + this.listaMaquinas.size());
    } 
}
