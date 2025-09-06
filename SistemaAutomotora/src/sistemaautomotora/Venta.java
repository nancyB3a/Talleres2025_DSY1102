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
public class Venta {
    /*para hacer la gestión de la venta debo generar colaboración con mis otras 
    clases involucradas en una venta*/
    private Cliente cliente;
    private Vehiculo vehiculo;
    private Vendedor vendedor;
    private int cantidad;
    private Date fechaVenta;

    public Venta() {
    }

    public Venta(Cliente cliente, Vehiculo vehiculo, Vendedor vendedor, int cantidad, Date fechaVenta) {
        this.cliente = cliente;
        this.vehiculo = vehiculo;
        this.vendedor = vendedor;
        this.cantidad = cantidad;
        this.fechaVenta = fechaVenta;
    }

    public Cliente getCliente() {
        return cliente;
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }

    public Vehiculo getVehiculo() {
        return vehiculo;
    }

    public void setVehiculo(Vehiculo vehiculo) {
        this.vehiculo = vehiculo;
    }

    public Vendedor getVendedor() {
        return vendedor;
    }

    public void setVendedor(Vendedor vendedor) {
        this.vendedor = vendedor;
    }

    public int getCantidad() {
        return cantidad;
    }

    public void setCantidad(int cantidad) {
        this.cantidad = cantidad;
    }

    public Date getFechaVenta() {
        return fechaVenta;
    }

    public void setFechaVenta(Date fechaVenta) {
        this.fechaVenta = fechaVenta;
    }

    @Override
    public String toString() {
        return "Venta{" + "cliente=" + cliente.getNombre() + 
                "\nvehiculo=" + vehiculo.getCodigo() + 
                "\nvendedor=" + vendedor.getNombre() + 
                "\ncantidad=" + cantidad + 
                "\nfechaVenta=" + fechaVenta + 
                "\nTotal Bruto: $" + totalBruto() +
                "\nDescuento: $" +descuento() +
                "\nTotal a Pagar: $" + totalNeto()
                +'}';
    }
    
    public double totalBruto(){
        return this.cantidad * this.vehiculo.getPrecioBase();
    }
    /**
     Un método que calcule, dado el total bruto, el descuento aplicable:
    • Si el total supera $15.000.000 → aplicar 5%
    • Si es igual o superior a $30.000.000 → aplicar 12%
    • Si el cliente tiene más de 65 años → aplicar primero un 10% de descuento especial al total bruto
     */
    public double descuento(){
        double bruto = totalBruto();
        double dscto = 0;
        if(this.cliente.getEdad() > 65){
            dscto = 0.1;
        }
        if(bruto >=30000){
            dscto += 0.12;            
        }else{
            if(bruto > 15000){
                dscto += 0.05;  
            }
        }
        return (bruto * dscto);        
    }
    
    public double totalNeto(){
        return totalBruto()-descuento();
    }
}
