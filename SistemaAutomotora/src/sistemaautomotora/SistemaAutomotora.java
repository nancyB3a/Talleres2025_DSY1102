/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package sistemaautomotora;

import java.util.Date;
import java.util.Scanner;

/**
 *
 * @author Nancy
 */
public class SistemaAutomotora {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // crear scanner para poder leer desde teclado
        
        Scanner sc = new Scanner(System.in);
        /*crearé objetos como null, ya que llamaré los constructores con 
        parámetros cuando tenga los datos para llenar los atributos*/
        
        Cliente cli1 = null;
        Vendedor vend1 = null;
        Vehiculo vehi1 = null;
        Venta venta1 = null;
        
        Valida val =new Valida();
        
        Sucursal suc1 = new Sucursal("SUCQTA", "BARATOCARS", "QUILLOTA");
        
        int op = 0;
        do{
            System.out.println("=== SISTEMA DE VENTAS AUTOMOTORA ===");
            System.out.println("1. Ingresar Cliente");
            System.out.println("2. Ingresar Vendedor");
            System.out.println("3. Ingresar Vehículo");
            System.out.println("4. Generar Venta");
            System.out.println("5. Salir");
            System.out.print("Seleccione una opcion: ");
            op = sc.nextInt();
            sc.nextLine();//limpiar buffer
            switch(op){
                case 1:
                    System.out.println("--- INGRESO DE CLIENTE ---");
                    System.out.print("RUT: ");
                    String rutCli = sc.nextLine();
                    System.out.print("Nombre: ");
                    String nombre = sc.nextLine();
                   if(val.validarVacio(nombre)){
                      System.out.println("Nombre no puede estar vacio");
                      return;
                    }else{
                      System.out.print("Edad: ");}
                    int edad = sc.nextInt();
                    sc.nextLine(); // Limpiar buffer                    
                    cli1 = new Cliente(rutCli, nombre, edad);                    
                    System.out.println("✔ Cliente registrado.\n");                    
                    break;
                case 2:
                    if (suc1 == null) {
                        System.out.println("⚠ Debe ingresar primero una sucursal.");
                    }else{                        
                        System.out.println("--- INGRESO DE VENDEDOR ---");
                        System.out.print("RUT: ");
                        String rutVen = sc.nextLine();
                        System.out.print("Nro vendedor: ");
                        int nro = sc.nextInt();
                        sc.nextLine(); // Limpiar buffer
                        System.out.print("Nombre: ");
                        String nombreVen = sc.nextLine();
                        Date ingreso = new Date();
                        vend1 = new Vendedor(rutVen, nombreVen, nro, ingreso, suc1);
                        System.out.println("✔ Vendedor registrado.\n");
                    }
                    break;
                case 3:
                    vehi1 = new Vehiculo("AUT1001", "Toyota", "Corolla", "Camioneta", "Nuevo", 2026);
                    //vehi1.calcularPrecioBase();
                    System.out.println("✔ Vehiculo registrado.\n");
                    System.out.println(vehi1.toString());
                    break;
                case 4:
                    venta1 = new Venta(cli1, vehi1, vend1, 1, new Date());
                    System.out.println(venta1.toString());
                    
            }
            
        }while(op != 5);
        
    }
    
}
