/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package javaapplication5;


import java.util.Properties;
import java.sql.*;

/**
 *
 * @author eimartinezj
 */
public class ConexionBASE {

    

    static {
      
        try {
            
            // Use la secuencia que viene con la clase en sí (aplicación de reflexión), directorio: src, que es el directorio raíz del proyecto
       
// Divida la información de configuración en pares clave-valor a través del flujo de la propia clase
            Class.forName("org.postgresql.Driver");
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
    }

    /**
     * Reutilice el método, cada vez es una nueva conexión codificada
     * (codificada)
     *
     * @return un objeto de conexión de base de datos
     */
    public static Connection getConnection() {
        Properties mispropiedades = new propiedades().getProperties();
        String Host = mispropiedades.getProperty("host");
        String port = mispropiedades.getProperty("port");
        String bd = mispropiedades.getProperty("bd");
        String user = mispropiedades.getProperty("user");
        String password = mispropiedades.getProperty("password");
        Connection connection = null;
        try {
            String cox = "jdbc:postgresql://" + Host + ":" + port + "/" + bd;
            String url = cox;
            connection = DriverManager.getConnection(url, user, password);
           
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return connection;
    }

    // cerrar recurso
    public static void closeAll(Connection c, Statement s, ResultSet r) {
        try {
            if (r != null) {
                r.close();
            }
            if (s != null) {
                s.close();
            }
            if (c != null) {
                c.close();
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

}
