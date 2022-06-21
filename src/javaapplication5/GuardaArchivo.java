/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package javaapplication5;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import javax.swing.JOptionPane;

/**
 *
 * @author eimartinezj
 */
public class GuardaArchivo {
    private Connection connection = null;
    private PreparedStatement preparedStatement = null;
    private ResultSet resultSet = null;
    private PreparedStatement preparedStatement2 = null;
    private ResultSet resultSet2 = null;
    String sql = null;
    String p1 = null;

    
    public void Guardar(String r){
       connection = ConexionBASE.getConnection();
        DateTimeFormatter Time = DateTimeFormatter.ofPattern("yyyy-MM-dd HH,mm");
        String nombre = Time.format(LocalDateTime.now());

        try {
            sql = "COPY (select distinct (id_reporte),* from reportes_inusuales_inc order by c_error,id_reporte desc) to '" + r + "\\" + nombre + "_ERRORES.csv' delimiter ',' CSV HEADER ENCODING 'LATIN1'";
            preparedStatement = connection.prepareStatement(sql);
            preparedStatement.executeUpdate();

        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Ocurrio un error : " + e.getMessage());
        }
        try {
            String sql = "COPY (select * FROM reportes_inusuales WHERE id_reporte not in (Select id_reporte from  reportes_inusuales_inc) order by id_reporte) to '" + r + "\\" + nombre + "_LIMPIO.csv' delimiter ',' CSV HEADER ENCODING 'LATIN1'";
            preparedStatement = connection.prepareStatement(sql);
            preparedStatement.executeUpdate();
            JOptionPane.showMessageDialog(null, "Su archivo esta listo");

        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Ocurrio un error : " + e.getMessage());
        } finally {
            ConexionBASE.closeAll(connection, preparedStatement, resultSet);
        }
    }
    
}
