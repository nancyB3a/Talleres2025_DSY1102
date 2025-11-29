/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controlador;

import db.Conexion;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.sql.ResultSet;
import java.util.ArrayList;
import modelo.Donacion;

/**
 *
 * @author Nancy
 */
public class ControladorDonacion {
    
    public boolean agregar(Donacion newDonacion){
    
        try {
            //establecer la conexión
            Conexion coneX = new Conexion();
            Connection cnx = coneX.obtenerConexion();
            //preparo la QUERY que ejecutaré en la BD
            String query = "INSERT INTO donacion(empresa, monto) VALUES (?,?)";
            PreparedStatement stmt = cnx.prepareStatement(query);
            //ingreso los parámetros
            stmt.setString(1, newDonacion.getEmpresa());
            stmt.setInt(2, newDonacion.getMonto());
            //Ejecutar la instrucción en la BD
            stmt.executeUpdate();
            //cierro las conexiones y libero
            stmt.close();
            cnx.close();           
            
            return true;
        } catch (SQLException e) {
            System.out.println("Error SQL al agregar() - ControladorDonacion: " + e.getMessage());
            return false;    
        } catch (Exception e) {
            System.out.println("Error al agregar() - ControladorDonacion: " + e.getMessage());
            return false;
        }
    }
    
    public boolean actualizar(Donacion newDonacion){
    
        try {
            //establecer la conexión
            Conexion coneX = new Conexion();
            Connection cnx = coneX.obtenerConexion();
            //preparo la QUERY que ejecutaré en la BD
            String query = "UPDATE donacion SET empresa=?,monto=? WHERE id=?";
            PreparedStatement stmt = cnx.prepareStatement(query);
            //ingreso los parámetros
            stmt.setString(1, newDonacion.getEmpresa());
            stmt.setInt(2, newDonacion.getMonto());
            stmt.setInt(3, newDonacion.getId());
            //Ejecutar la instrucción en la BD
            stmt.executeUpdate();
            //cierro las conexiones y libero
            stmt.close();
            cnx.close();           
            
            return true;
        } catch (SQLException e) {
            System.out.println("Error SQL al actualizar() - ControladorDonacion: " + e.getMessage());
            return false;    
        } catch (Exception e) {
            System.out.println("Error al actualizar() - ControladorDonacion: " + e.getMessage());
            return false;
        }
    }    
    
    public boolean eliminar(int id){
    
        try {
            //establecer la conexión
            Conexion coneX = new Conexion();
            Connection cnx = coneX.obtenerConexion();
            //preparo la QUERY que ejecutaré en la BD
            String query = "DELETE FROM donacion WHERE id=?";
            PreparedStatement stmt = cnx.prepareStatement(query);
            //ingreso los parámetros
            stmt.setInt(1, id);
            //Ejecutar la instrucción en la BD
            stmt.executeUpdate();
            //cierro las conexiones y libero
            stmt.close();
            cnx.close();           
            
            return true;
        } catch (SQLException e) {
            System.out.println("Error SQL al eliminar() - ControladorDonacion: " + e.getMessage());
            return false;    
        } catch (Exception e) {
            System.out.println("Error al eliminar() - ControladorDonacion: " + e.getMessage());
            return false;
        }
    }    
    
    public Donacion buscarUnaDonacion(int id){
        Donacion donacion = new Donacion();
        try {
            //establecer la conexión
            Conexion coneX = new Conexion();
            Connection cnx = coneX.obtenerConexion();
            //preparo la QUERY que ejecutaré en la BD
            String query = "SELECT id, empresa, monto FROM donacion WHERE id= ?";
            PreparedStatement stmt = cnx.prepareStatement(query);
            //ingreso los parámetros
            stmt.setInt(1, id);
            //Ejecutar la instrucción en la BD
            ResultSet rs  = stmt.executeQuery();
            //convertir el ResultSet en una Donacion
            if(rs.next()){
                donacion.setId(id);
                donacion.setEmpresa(rs.getString("empresa"));
                donacion.setMonto(rs.getInt("monto"));
            }
            //cierro las conexiones y libero
            stmt.close();
            cnx.close();
            rs.close();
            
        } catch (SQLException e) {
            System.out.println("Error SQL al agregar() - ControladorDonacion: " + e.getMessage());
        } catch (Exception e) {
            System.out.println("Error al agregar() - ControladorDonacion: " + e.getMessage());
        }
        return donacion;
    }
    
    public ArrayList<Donacion> buscarDonaciones(){
        ArrayList<Donacion> lista = new ArrayList<Donacion>();
        try {
            //establecer la conexión
            Conexion coneX = new Conexion();
            Connection cnx = coneX.obtenerConexion();
            //preparo la QUERY que ejecutaré en la BD
            String query = "SELECT id, empresa, monto FROM donacion";
            PreparedStatement stmt = cnx.prepareStatement(query);
            //Ejecutar la instrucción en la BD
            ResultSet rs  = stmt.executeQuery();
            //convertir el ResultSet en una Donacion
            while(rs.next()){
                Donacion donacion = new Donacion();
                donacion.setId(rs.getInt("id"));
                donacion.setEmpresa(rs.getString("empresa"));
                donacion.setMonto(rs.getInt("monto"));
                lista.add(donacion);
            }
            //cierro las conexiones y libero
            stmt.close();
            cnx.close();
            rs.close();
            
        } catch (SQLException e) {
            System.out.println("Error SQL al agregar() - ControladorDonacion: " + e.getMessage());
        } catch (Exception e) {
            System.out.println("Error al agregar() - ControladorDonacion: " + e.getMessage());
        }
        
        return lista;
    }
}
