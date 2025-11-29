/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controlador;

/**
 *
 * @author Nancy
 */
public class Validador {
    public boolean validaVacio(String texto){
    return !texto.isEmpty();
    }
    
    public boolean validaInt(String texto){
        try {
            Integer.valueOf(texto);
            return true;
        } catch (Exception e) {
            return false;
        }
    }
}
