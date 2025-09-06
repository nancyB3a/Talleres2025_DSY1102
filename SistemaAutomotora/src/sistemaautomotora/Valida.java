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
public class Valida {

    public Valida() {
    }
    
    public boolean validarVacio(String valor){
        return valor.isBlank();
    }
    
    public boolean validaTipo(String valor){
        return (valor.equalsIgnoreCase("SEDAN")|| 
                valor.equalsIgnoreCase("SUV") || 
                valor.equalsIgnoreCase("CAMIONETA"));
    }
    
    public boolean validaCategoria(String valor){
        return (valor.equalsIgnoreCase("nuevo")|| 
                valor.equalsIgnoreCase("usado"));
    }
    
    public boolean validaFecha(Date valor){
        Date hoy = new Date();
        return(valor.compareTo(hoy) <=0);
        
    }
}
