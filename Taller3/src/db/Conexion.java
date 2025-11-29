/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package db;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

/**
 *
 * @author Nancy
 */
public class Conexion {
    public Connection obtenerConexion() {
        Connection connection = null;
        String url,user,password;
        url="jdbc:mysql://localhost:3306/teleton2025";
        user="root";
        password="";
        try {
            connection = DriverManager.getConnection(url,user,password);
            System.out.println("Conexión exitosa");
        } catch (SQLException ex) {
            System.out.println("Error conexión SQL: "+ex.getMessage());
        }
        catch (Exception ex) {
            System.out.println("Error conexión: "+ex.getMessage());
        }
        return connection;
    }
}
