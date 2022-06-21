/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package javaapplication5;

import javax.swing.*;
import java.awt.*;
import java.sql.*;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import javax.swing.JOptionPane;

import javax.swing.table.DefaultTableModel;

public class XML2EX extends javax.swing.JFrame {

    public XML2EX() {

        initComponents();
        this.setTitle("OPERACIONES INUSUALES");
        this.setResizable(false);

    }
    private Connection connection = null;
    private PreparedStatement preparedStatement = null;
    private ResultSet resultSet = null;
    private PreparedStatement preparedStatement2 = null;
    private ResultSet resultSet2 = null;
    String sql = null;
    String p1 = null;
    String FILENAME = null;
    String query2 = null;
    String cb = null;
    int id_campo = 0;
    String selCampo = null;

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        jTable2 = new javax.swing.JTable();
        cargar = new javax.swing.JButton();
        empieza = new javax.swing.JCheckBox();
        Termina = new javax.swing.JCheckBox();
        igual = new javax.swing.JCheckBox();
        contiene = new javax.swing.JCheckBox();
        todas = new javax.swing.JCheckBox();
        jButton1 = new javax.swing.JButton();
        REVISAR = new javax.swing.JButton();
        Opciones = new javax.swing.JComboBox<>();
        Codigo = new javax.swing.JCheckBox();
        Generar = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        sucursales = new javax.swing.JCheckBox();
        jScrollPane2 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jButton3 = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        valor = new javax.swing.JTextField();
        jButton4 = new javax.swing.JButton();
        jButton5 = new javax.swing.JButton();
        Especiales = new javax.swing.JButton();
        jSeparator1 = new javax.swing.JSeparator();
        jSeparator2 = new javax.swing.JSeparator();
        jLabel2 = new javax.swing.JLabel();
        jSeparator3 = new javax.swing.JSeparator();
        campo41 = new javax.swing.JCheckBox();
        jButton6 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jScrollPane1.setAutoscrolls(true);
        jScrollPane1.setMinimumSize(new java.awt.Dimension(160, 160));
        jTable2.setAutoResizeMode(JTable.AUTO_RESIZE_OFF);

        jTable2.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "ID REPORTE", "TIPO DE REPORTE", "PERIODO DEL REPORTE", "FOLIO", "ORGANO SUPERVISOR", "CLAVE DEL SUJETO OBLIGADO", "LOCALIDAD", "SUCURSAL", "TIPO DE OPERACION", "INSTRUMENTO MONETARIO", "NUMERO DE CUENTA", "MONTO", "MONEDA", "FECHA DE LA OPERACION", "FECHA DE DETECCION DE LA OPERACION*", "NACIONALIDADd", "TIPO DE PERSONA", "RAZON SOCIAL O DENOMINACION", "NOMBRE", "APELLIDO PATERNO", "APELLIDO MATERNO", "RFC", "CURP", "FECHA DE NACIMIENTO", "DOMICILIO", "COLONIA", "CIUDAD", "TELEFONO", "ACTIVIDAD ECONOMICA", "AGENTE O APODERADO DE SEGUROS NOMBRE", "APELLIDO PATERNO**", "APELLIDO MATERNO**", "RFC**", "CURP**", "CONSECUTIVO DE CUENTAS Y/O PERSONAS RELACIONADAS *", "NUMERO DE CUENTA", "CLAVE DEL SUJETO OBLIGADO", "NOMBRE DEL TITULAR", "APELLIDO PATERNO*", "APELLIDO MATERNO*", "DESCRIPCION DE LA OPERACION*", "RAZONES POR LAS QUE EL ACTO U OPERACION SE CONSIDERA INUSUAL O PREOCUPANTE*"
            }
        ));
        jScrollPane1.setViewportView(jTable2);

        try {
            connection = ConexionBASE.getConnection();
            String sql = "Select * from reportes_inusuales order by id_reporte";
            preparedStatement = connection.prepareStatement(sql);
            resultSet = preparedStatement.executeQuery();
            rsm = resultSet.getMetaData();
            ArrayList<Object[]> data = new ArrayList<>();
            while (resultSet.next()) {
                Object[] rows = new Object[rsm.getColumnCount()];
                for (int i = 0; i < rows.length; i++) {
                    rows[i] = resultSet.getObject(i + 1);
                }
                data.add(rows);
            }
            dtm = (DefaultTableModel) this.jTable2.getModel();
            for (int i = 0; i < data.size(); i++) {
                dtm.addRow(data.get(i));
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(rootPane, e.getMessage());
        }

        cargar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/Microsoft-Excel-2013-icon.png"))); // NOI18N
        cargar.setText("CARGAR CSV ");
        cargar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cargarActionPerformed(evt);
            }
        });

        empieza.setText("Empieza con (?%)");

        Termina.setText("Termina con (%?)");

        igual.setText("Es igual a (=)");

        contiene.setText("Contiene (%?%)");

        todas.setText("Todas las condiciones(*)");

        jButton1.setText("BORRAR REGISTRO");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        REVISAR.setText("REVISAR");
        REVISAR.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                REVISARActionPerformed(evt);
            }
        });

        Opciones.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "NOMBRE_BLOQUE_1", "NOMBRE_BLOQUE_2", "NOMBRE_BLOQUE_3", "NOMBRE_BLOQUE_4", "NOMBRE_BLOQUE_5", "NOMBRE_BLOQUE_6", "NOMBRE_BLOQUE_7", "NOMBRE_BLOQUE_8", "NOMBRE_BLOQUE_9", "DIRECCION_BLOQUE_1", "DIRECCION_BLOQUE_2", "COLONIA_BLOQUE_1" }));
        Opciones.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                OpcionesActionPerformed(evt);
            }
        });

        Codigo.setText("Codigo postal ");

        Generar.setText("GENERAR ARCHIVOS");
        Generar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                GenerarActionPerformed(evt);
            }
        });

        jButton2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/bank-icon.png"))); // NOI18N
        jButton2.setText("CARGAR SUCURSALES CSV");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        sucursales.setText("Sucursales no encontradas");

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "IDENTIFICADOR", "VALOR"
            }
        ));
        jScrollPane2.setViewportView(jTable1);

        jButton3.setText("VER PARAMETROS");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });

        jLabel1.setText("AGREGAR PARAMETROS");

        jButton4.setText("+");
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });

        jButton5.setText("-");
        jButton5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton5ActionPerformed(evt);
            }
        });

        Especiales.setText("BUSQUEDA CARACTERES ESPECIALES");
        Especiales.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                EspecialesActionPerformed(evt);
            }
        });

        jSeparator1.setOrientation(javax.swing.SwingConstants.VERTICAL);

        jSeparator2.setOrientation(javax.swing.SwingConstants.VERTICAL);

        jLabel2.setBackground(new java.awt.Color(255, 51, 51));
        jLabel2.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 51, 51));
        jLabel2.setText("CONDICIONES");

        jSeparator3.setOrientation(javax.swing.SwingConstants.VERTICAL);

        campo41.setText("Campo 41 importe");

        jButton6.setText("CARGAR ARCHIVO ORIGEN");
        jButton6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton6ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addContainerGap())
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(cargar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jButton2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(Especiales, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addGap(6, 6, 6)
                                .addComponent(jButton6, javax.swing.GroupLayout.PREFERRED_SIZE, 250, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(34, 34, 34)
                        .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel2, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 287, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(contiene)
                                    .addComponent(todas)
                                    .addComponent(igual)
                                    .addComponent(Termina)
                                    .addComponent(empieza))
                                .addGap(42, 42, 42)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(sucursales)
                                    .addComponent(Codigo)
                                    .addComponent(campo41))
                                .addGap(44, 44, 44))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addComponent(REVISAR, javax.swing.GroupLayout.PREFERRED_SIZE, 123, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(30, 30, 30)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jSeparator2, javax.swing.GroupLayout.PREFERRED_SIZE, 17, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(79, 79, 79)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                        .addComponent(Opciones, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(jButton3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                    .addComponent(jLabel1)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(valor, javax.swing.GroupLayout.PREFERRED_SIZE, 135, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(jButton4)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(jButton5))))
                            .addGroup(layout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 294, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jSeparator3, javax.swing.GroupLayout.PREFERRED_SIZE, 17, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(Generar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jButton1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGap(21, 21, 21))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 367, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(Opciones, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jButton1))
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(Generar)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jButton3)
                                .addGap(18, 18, 18)))
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 139, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(valor, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jButton4)
                            .addComponent(jButton5))
                        .addGap(43, 43, 43))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(13, 13, 13)
                        .addComponent(cargar, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 56, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jButton6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(Especiales, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(57, 57, 57))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(jSeparator1, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 291, Short.MAX_VALUE)
                            .addComponent(jSeparator2, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jSeparator3, javax.swing.GroupLayout.Alignment.LEADING))
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(Codigo)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(sucursales)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(campo41))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(empieza)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(Termina)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(igual)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(contiene)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(todas)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(REVISAR, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(81, 81, 81))))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    String sel = null;

    ResultSetMetaData rsm;
    DefaultTableModel dtm;
    ResultSetMetaData rsm2;
    DefaultTableModel dtm2;


    private void cargarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cargarActionPerformed
        // TODO add your handling code here:
        connection = ConexionBASE.getConnection();
        String tabla = null;
        try {
            String sql = "select * from reportes_inusuales ";
            preparedStatement = connection.prepareStatement(sql);
            resultSet = preparedStatement.executeQuery();

            while (resultSet.next()) {
                tabla = resultSet.getString(2);

            }
        } catch (Exception e) {
        }

        System.out.println("data = " + tabla);

        if (tabla != null) {
            int result = JOptionPane.showConfirmDialog(null,
                    "Hay datos existentes,desea borrarlos?", null, JOptionPane.YES_NO_OPTION);
            if (result == JOptionPane.YES_OPTION) {

                try {
                    String sql = "Truncate table reportes_inusuales restart identity";
                    preparedStatement = connection.prepareStatement(sql);
                    preparedStatement.executeUpdate();
                    JOptionPane.showMessageDialog(null, "Tabla borrada");
                } catch (Exception e) {
                    JOptionPane.showMessageDialog(rootPane, e.getMessage());
                }
                try {
                    String sql = "Truncate table reportes_inusuales_inc restart identity";
                    preparedStatement = connection.prepareStatement(sql);
                    preparedStatement.executeUpdate();
                    JOptionPane.showMessageDialog(null, "Tabla borrada ERRORES");
                } catch (Exception e) {
                    JOptionPane.showMessageDialog(rootPane, e.getMessage());
                }

            }

        }

        JFileChooser SELECTOR = new JFileChooser();
        SELECTOR.setFileSelectionMode(JFileChooser.FILES_AND_DIRECTORIES);
        Component Parent = null;
        int ReturnVal = SELECTOR.showSaveDialog(Parent);
        if (ReturnVal == JFileChooser.APPROVE_OPTION) {
            FILENAME = SELECTOR.getSelectedFile().getPath();
            System.out.println("file = " + FILENAME);
        }
        if (FILENAME == null) {
            JOptionPane.showMessageDialog(null, "NO SELECCIONASTE UN ARCHIVO,POR FAVOR SELECCIONA UN ARCHIVO");
        } else {

            if (dtm != null) {
                for (int i = dtm.getRowCount() - 1; i >= 0; i--) {
                    dtm.removeRow(i);
                }
            }

        }
        try {
            if (FILENAME != null) {
                String sql;
                sql = "copy  reportes_inusuales    (tipo_de_reporte, periodo_de_reporte, folio, organo_supervisor, clave_del_sujeto_obligado, localidad, sucursal, tipo_de_operacion, instrumento_monetario, numero_de_cuenta, monto, moneda, fecha_de_la_operacion, fecha_de_deteccion_de_la_operacion, nacionalidad, tipo_de_persona, razon_social_o_denominacion, nombre, apellido_paterno, apellido_materno, rfc, curp, fecha_de_nacimiento_o_constitucion, domicilio, colonia, ciudad_o_poblacion, telefono, actividad_economica, agente_o_apoderado_de_seguros_y_o_fianzas, apellido_paterno_, apellido_materno_, rfc_, curp_, consecutivo_de_cuentas, numero_de_cuenta_, cve_del_sujeto_obligado_, nombre_del_titular_de_la_cuenta, apellido_paterno__, apellido_materno__, descripcion_de_la_operacion, razones_por_las_que_el_acto_u_operacion_se_considera_inusual) from"
                        + "'" + FILENAME + "'" + "  DELIMITER ',' CSV HEADER ENCODING 'LATIN1'";
                preparedStatement = connection.prepareStatement(sql);
                preparedStatement.execute();
                JOptionPane.showMessageDialog(null, "DATOS INSERTADOS CON EXITO");

            } else {

            }

        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e.getMessage());
        }

        try {
            String sql = "Select * from reportes_inusuales   order by id_reporte";
            preparedStatement = connection.prepareStatement(sql);
            resultSet = preparedStatement.executeQuery();
            rsm = resultSet.getMetaData();
            ArrayList<Object[]> data = new ArrayList<>();
            while (resultSet.next()) {
                Object[] rows = new Object[rsm.getColumnCount()];
                for (int i = 0; i < rows.length; i++) {
                    rows[i] = resultSet.getObject(i + 1);

                }
                data.add(rows);
            }
            dtm = (DefaultTableModel) this.jTable2.getModel();
            for (int i = 0; i < data.size(); i++) {
                dtm.addRow(data.get(i));

            }

        } catch (Exception e) {
            JOptionPane.showMessageDialog(rootPane, e.getMessage());
        } finally {
            ConexionBASE.closeAll(connection, preparedStatement, resultSet);
            FILENAME = null;
        }


    }//GEN-LAST:event_cargarActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        connection = ConexionBASE.getConnection();
        String value = null;
        try {
            int columna = 0;
            int row = jTable2.getSelectedRow();
            value = jTable2.getModel().getValueAt(row, columna).toString();
            System.out.println(value);
        } catch (Exception e) {
            e.printStackTrace();
        }

        try {
            if (value == null) {
                JOptionPane.showMessageDialog(null, "Selecciona un Dato");
            } else {

                String sql = "delete from reportes_inusuales_inc where id_dato ='" + value + "'";
                preparedStatement = connection.prepareStatement(sql);
                preparedStatement.execute();
                JOptionPane.showMessageDialog(null, "BORRADO");
            }

        } catch (Exception e) {
            System.out.println(e.getMessage());
        } finally {
            ConexionBASE.closeAll(connection, preparedStatement, resultSet);
        }


    }//GEN-LAST:event_jButton1ActionPerformed

    private void REVISARActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_REVISARActionPerformed
        // TODO add your handling code here:

        connection = ConexionBASE.getConnection();
        sql = null;
        if (dtm != null) {
            for (int i = dtm.getRowCount() - 1; i >= 0; i--) {
                dtm.removeRow(i);
            }

        }

        if (Codigo.isSelected()) {
            sql = "SELECT *, 'codigo postal' as C_error FROM reportes_inusuales WHERE (SELECT RIGHT(DOMICILIO,5)) ~*'[^0-9]' or"
                    + " (SELECT RIGHT(DOMICILIO,5)) LIKE '% 000%' or (SELECT RIGHT(DOMICILIO,5)) LIKE '% 00%' or (SELECT RIGHT(DOMICILIO,5))"
                    + " LIKE '% 0%' or (SELECT RIGHT(DOMICILIO,5)) like '% 0000%' or (SELECT RIGHT(DOMICILIO,5)) = '00000' or "
                    + "(SELECT RIGHT(DOMICILIO,5)) = '12345'  or (SELECT RIGHT(DOMICILIO,5)) = '0000' or (SELECT RIGHT(DOMICILIO,5)) = '0000' "
                    + " or (SELECT RIGHT(DOMICILIO,5)) = '000' or (SELECT RIGHT(DOMICILIO,5)) = '00' or (SELECT RIGHT(DOMICILIO,5)) = '0' or  "
                    + "(SELECT RIGHT(DOMICILIO,5)) = 'NULL' OR (SELECT RIGHT(DOMICILIO,5)) is null";
            try {
                preparedStatement = connection.prepareStatement(sql);
                resultSet2 = preparedStatement.executeQuery();
                rsm = resultSet2.getMetaData();
                ArrayList<Object[]> data = new ArrayList<>();
                while (resultSet2.next()) {

                    Object[] rows = new Object[rsm.getColumnCount()];
                    for (int i = 0; i < rows.length; i++) {
                        rows[i] = resultSet2.getObject(i + 1);

                    }
                    data.add(rows);

                }
                dtm = (DefaultTableModel) this.jTable2.getModel();
                for (int i = 0; i < data.size(); i++) {
                    dtm.addRow(data.get(i));
                }
            } catch (Exception e) {
                e.printStackTrace();

            }

            query2 = "insert into reportes_inusuales_inc " + sql;
            try {
                preparedStatement = connection.prepareStatement(query2);
                preparedStatement.executeUpdate();
                query2 = null;
//                    JOptionPane.showMessageDialog(null, "insertado");
            } catch (Exception e) {
//                    e.printStackTrace();
            }

        }

        else if (sucursales.isSelected()) {
            sql = "select b.*,'SUCURSAL' as C_error from sucursal a right join reportes_inusuales b on a.id_suc = b.sucursal where a.id_suc is null ";
            try {
                preparedStatement = connection.prepareStatement(sql);
                resultSet2 = preparedStatement.executeQuery();
                rsm = resultSet2.getMetaData();
                ArrayList<Object[]> data = new ArrayList<>();
                while (resultSet2.next()) {

                    Object[] rows = new Object[rsm.getColumnCount()];
                    for (int i = 0; i < rows.length; i++) {
                        rows[i] = resultSet2.getObject(i + 1);

                    }
                    data.add(rows);

                }
                dtm = (DefaultTableModel) this.jTable2.getModel();
                for (int i = 0; i < data.size(); i++) {
                    dtm.addRow(data.get(i));
                }
            } catch (Exception e) {
                e.printStackTrace();

            }

            query2 = "insert into reportes_inusuales_inc " + sql;
            try {
                preparedStatement = connection.prepareStatement(query2);
                preparedStatement.executeUpdate();
                JOptionPane.showMessageDialog(null, "insertado");
            } catch (Exception e) {
                e.printStackTrace();
            }

        }

        else if (campo41.isSelected()) {
            sql = "select * , 'Campo 41 no contiene importe ' as C_error from reportes_inusuales where id_reporte not in(\n"
                    + "select id_reporte from reportes_inusuales where \n"
                    + "descripcion_de_la_operacion like '%'|| ltrim((select to_char( monto::float,'999,999,999,999.9'))) ||'%' or  \n"
                    + "descripcion_de_la_operacion like '%'|| ltrim((select to_char( monto::float,'999,999,999,999.99'))) ||'%' or\n"
                    + "descripcion_de_la_operacion like '%'|| ltrim((select to_char( monto::float,'999999999999.99'))) ||'%'  or \n"
                    + "descripcion_de_la_operacion like '%'|| ltrim((select to_char( monto::float,'999999999999'))) ||'%' \n"
                    + ")";
            try {
                preparedStatement = connection.prepareStatement(sql);
                resultSet2 = preparedStatement.executeQuery();
                rsm2 = resultSet2.getMetaData();
                ArrayList<Object[]> data = new ArrayList<>();
                while (resultSet2.next()) {

                    Object[] rows = new Object[rsm.getColumnCount()];
                    for (int i = 0; i < rows.length; i++) {
                        rows[i] = resultSet2.getObject(i + 1);

                    }
                    data.add(rows);

                }
                dtm = (DefaultTableModel) this.jTable2.getModel();
                for (int i = 0; i < data.size(); i++) {
                    dtm.addRow(data.get(i));
                }

            } catch (Exception e) {
                e.printStackTrace();

            }

            query2 = "insert into reportes_inusuales_inc " + sql;
            try {
                preparedStatement = connection.prepareStatement(query2);
                preparedStatement.executeUpdate();
                JOptionPane.showMessageDialog(null, "insertado");
            } catch (Exception e) {
                e.printStackTrace();
            }

        } 
        
        else {
            try {
                String cb = (String) Opciones.getSelectedItem();

                if (cb == "NOMBRE_BLOQUE_1") {
                    id_campo = 1;
                    selCampo = "nombre";
                } else if (cb == "NOMBRE_BLOQUE_2") {
                    id_campo = 2;
                    selCampo = "nombre";
                } else if (cb == "NOMBRE_BLOQUE_3") {
                    id_campo = 3;
                    selCampo = "nombre";
                } else if (cb == "NOMBRE_BLOQUE_4") {
                    id_campo = 4;
                    selCampo = "nombre";
                } else if (cb == "DIRECCION_BLOQUE_1") {
                    id_campo = 5;
                    selCampo = "domicilio";
                } else if (cb == "DIRECCION_BLOQUE_2") {
                    id_campo = 6;
                    selCampo = "domicilio";
                } else if (cb == "COLONIA_BLOQUE_1") {
                    id_campo = 7;
                    selCampo = "COLONIA";

                } else if (cb == "NOMBRE_BLOQUE_5") {
                    id_campo = 8;
                    selCampo = "nombre";
                } else if (cb == "NOMBRE_BLOQUE_6") {
                    id_campo = 9;
                    selCampo = "nombre";
                } else if (cb == "NOMBRE_BLOQUE_7") {
                    id_campo = 10;
                    selCampo = "nombre";
                } else if (cb == "NOMBRE_BLOQUE_8") {
                    id_campo = 11;
                    selCampo = "nombre";
                } else if (cb == "NOMBRE_BLOQUE_9") {
                    id_campo = 12;
                    selCampo = "nombre";
                } else if (cb == "NOMBRE_BLOQUE_10") {
                    id_campo = 13;
                    selCampo = "nombre";
                }

                sql = "Select * from contenedor_valores_errores where id_campo_error =" + id_campo + " ";

                preparedStatement = connection.prepareStatement(sql);
                resultSet = preparedStatement.executeQuery();

                while (resultSet.next()) {
                    //System.out.println(resultSet.getString(2));
                    try {
                        String parametroError = resultSet.getString(2);

                        if (contiene.isSelected()) {
                            if (selCampo == "nombre") {
                                //query2 = "Select *,'" + selCampo + "' as C_ERROR  from reportes_inusuales where " + selCampo + " like '%" + parametroError + "%' or apaterno like '%" + parametroError + "%' or amaterno like '%" + parametroError + "%'";
                                query2 = "Select *,'" + selCampo + "' as C_ERROR  from reportes_inusuales where " + selCampo + " like '%" + parametroError + "%' or apellido_paterno like '%" + parametroError + "%' or apellido_materno like '%" + parametroError + "%'";
                            } else {
                                query2 = "Select *,'" + selCampo + "' as C_ERROR  from reportes_inusuales where " + selCampo + " like '%" + parametroError + "%'";
                            }
                        } else if (Termina.isSelected()) {
                            if (selCampo == "nombre") {
                                query2 = "Select *,'" + selCampo + "' as C_ERROR  from reportes_inusuales where " + selCampo + " like '%" + parametroError + "' or apellido_paterno like '%" + parametroError + "' or apellido_materno like '%" + parametroError + "'";

                            } else {
                                query2 = "Select *,'" + selCampo + "' as C_ERROR  from reportes_inusuales where " + selCampo + " like '%" + parametroError + "' ";
                            }
                        } else if (empieza.isSelected()) {
                            if (selCampo == "nombre") {
                                query2 = "Select *,'" + selCampo + "' as C_ERROR  from reportes_inusuales where " + selCampo + " like '" + parametroError + "%' or apellido_paterno like '" + parametroError + "%' or apellido_materno like '" + parametroError + "%'";
                            } else {
                                query2 = "Select *,'" + selCampo + "' as C_ERROR  from reportes_inusuales where " + selCampo + " like '" + parametroError + "%'";
                            }
                        } else if (igual.isSelected()) {

                            if (selCampo == "nombre") {
                                query2 = "Select *,'" + selCampo + "' as C_ERROR  from reportes_inusuales where " + selCampo + " = '" + parametroError + "' or or apellido_paterno = '" + parametroError + "' or apellido_materno = '" + parametroError + "'";
                            }
                            query2 = "Select *,'" + selCampo + "' as C_ERROR  from reportes_inusuales where " + selCampo + " = '%" + parametroError + "'";
                        } else if (todas.isSelected()) {
                            if (selCampo == "nombre") {

                                query2 = "Select *,'" + selCampo + "' as C_ERROR  from reportes_inusuales where " + selCampo + " like '%" + parametroError + "%' or " + selCampo + " like '" + parametroError + "%' or " + selCampo + " like '%" + parametroError + "' or " + selCampo + " = '" + parametroError + "' or apellido_paterno like '%" + parametroError + "%' or apellido_paterno like '%" + parametroError + "' or apellido_paterno like '" + parametroError + "%' or apellido_paterno='" + parametroError + "' or apellido_materno like '%" + parametroError + "%' or apellido_materno like '%" + parametroError + "' or apellido_materno like '" + parametroError + "%' or apellido_materno='" + parametroError + "' ";

                            } else {
                                query2 = "Select *,'" + selCampo + "' as C_ERROR  from reportes_inusuales where " + selCampo + " like '%" + parametroError + "%' or " + selCampo + " like '" + parametroError + "%' or " + selCampo + " like '%" + parametroError + "' or " + selCampo + " = '" + parametroError + "'";
                            }
                        }

//                        System.out.println(query2);
                        preparedStatement2 = connection.prepareStatement(query2);
                        resultSet2 = preparedStatement2.executeQuery();
                        rsm = resultSet2.getMetaData();
                        ArrayList<Object[]> data = new ArrayList<>();

                        while (resultSet2.next()) {

                            Object[] rows = new Object[rsm.getColumnCount()];
                            for (int i = 0; i < rows.length; i++) {
                                rows[i] = resultSet2.getObject(i + 1);

                            }
                            data.add(rows);

                        }
                        dtm = (DefaultTableModel) this.jTable2.getModel();
                        for (int i = 0; i < data.size(); i++) {
                            dtm.addRow(data.get(i));
                        }

                    } catch (Exception e) {
                        System.out.println(e.getMessage());
                    }
//                    System.out.println(query2);

                    sql = "insert into reportes_inusuales_inc " + query2;
                    preparedStatement = connection.prepareStatement(sql);
                    preparedStatement.execute();
//                        JOptionPane.showMessageDialog(null, "Succesful");

                }
            } catch (Exception e) {
                e.printStackTrace();
            }

        }


    }//GEN-LAST:event_REVISARActionPerformed

    private void OpcionesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_OpcionesActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_OpcionesActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        // TODO add your handling code here:
        connection = ConexionBASE.getConnection();
        String tabla = null;
        try {
            String sql = "select * from sucursal";
            preparedStatement = connection.prepareStatement(sql);
            resultSet = preparedStatement.executeQuery();

            while (resultSet.next()) {
                tabla = resultSet.getString(2);

            }
        } catch (Exception e) {
        }

        System.out.println("data = " + tabla);

        if (tabla != null) {
            int result = JOptionPane.showConfirmDialog(null,
                    "Hay datos existentes,desea borrarlos?", null, JOptionPane.YES_NO_OPTION);
            if (result == JOptionPane.YES_OPTION) {

                try {
                    String sql = "Truncate table sucursal restart identity";
                    preparedStatement = connection.prepareStatement(sql);
                    preparedStatement.executeUpdate();
                    JOptionPane.showMessageDialog(null, "Tabla borrada");
                } catch (Exception e) {
                    JOptionPane.showMessageDialog(rootPane, e.getMessage());
                }

            }

        }

        JFileChooser SELECTOR = new JFileChooser();
        SELECTOR.setFileSelectionMode(JFileChooser.FILES_AND_DIRECTORIES);
        Component Parent = null;
        int ReturnVal = SELECTOR.showSaveDialog(Parent);
        if (ReturnVal == JFileChooser.APPROVE_OPTION) {
            FILENAME = SELECTOR.getSelectedFile().getPath();
            System.out.println("file = " + FILENAME);
        }
        if (FILENAME == null) {
            JOptionPane.showMessageDialog(null, "NO SELECCIONASTE UN ARCHIVO,POR FAVOR SELECCIONA UN ARCHIVO");
        } else {

            if (dtm != null) {
                for (int i = dtm.getRowCount() - 1; i >= 0; i--) {
                    dtm.removeRow(i);
                }
            }

        }
        try {
            if (FILENAME != null) {
                String sql;
                sql = "copy  sucursal (id_suc,banco,entidad,localidad,estatus,fecha)  from"
                        + "'" + FILENAME + "'" + "  DELIMITER ',' CSV HEADER ENCODING 'LATIN1'";
                preparedStatement = connection.prepareStatement(sql);
                preparedStatement.execute();
                JOptionPane.showMessageDialog(null, "DATOS INSERTADOS CON EXITO");

            } else {

            }

        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e.getMessage());
        }


    }//GEN-LAST:event_jButton2ActionPerformed

    private void GenerarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_GenerarActionPerformed
        // TODO add your handling code here:
        GuardaArchivo estaaaa = new GuardaArchivo();
        connection = ConexionBASE.getConnection();
        JFileChooser chooser = new JFileChooser();

        chooser.setFileSelectionMode(JFileChooser.DIRECTORIES_ONLY);
        Component parent = null;
        int returnVal = chooser.showSaveDialog(parent);

        if (returnVal == JFileChooser.APPROVE_OPTION) {
            FILENAME = chooser.getSelectedFile().getPath();
//            System.out.println("El Directorio es : " + sel);
        }
        if (FILENAME == null) {
            JOptionPane.showMessageDialog(null, "Seleccione una ruta ");

        } else {
            estaaaa.Guardar(FILENAME);

        }


    }//GEN-LAST:event_GenerarActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        // TODO add your handling code here:
        cb = (String) Opciones.getSelectedItem();

        connection = ConexionBASE.getConnection();
        if (dtm2 != null) {
            for (int i = dtm2.getRowCount() - 1; i >= 0; i--) {
                dtm2.removeRow(i);
            }

        }

        try {

            if (cb == "NOMBRE_BLOQUE_1") {
                id_campo = 1;

            } else if (cb == "NOMBRE_BLOQUE_2") {
                id_campo = 2;

            } else if (cb == "NOMBRE_BLOQUE_3") {
                id_campo = 3;

            } else if (cb == "NOMBRE_BLOQUE_4") {
                id_campo = 4;

            } else if (cb == "NOMBRE_BLOQUE_5") {
                id_campo = 8;

            } else if (cb == "NOMBRE_BLOQUE_6") {
                id_campo = 9;

            } else if (cb == "NOMBRE_BLOQUE_7") {
                id_campo = 10;

            } else if (cb == "NOMBRE_BLOQUE_8") {
                id_campo = 11;

            } else if (cb == "NOMBRE_BLOQUE_9") {
                id_campo = 12;

            } else if (cb == "NOMBRE_BLOQUE_9") {
                id_campo = 13;
            } else if (cb == "DIRECCION_BLOQUE_10") {
                id_campo = 5;

            } else if (cb == "DIRECCION_BLOQUE_2") {
                id_campo = 6;

            } else if (cb == "COLONIA_BLOQUE_1") {
                id_campo = 7;

            }
            query2 = "select * from contenedor_valores_errores where id_campo_error = " + id_campo + "";
            preparedStatement2 = connection.prepareStatement(query2);
            resultSet2 = preparedStatement2.executeQuery();
            rsm2 = resultSet2.getMetaData();
            ArrayList<Object[]> data = new ArrayList<>();
            while (resultSet2.next()) {

                Object[] rows = new Object[rsm2.getColumnCount()];
                for (int i = 0; i < rows.length; i++) {
                    rows[i] = resultSet2.getObject(i + 1);

                }
                data.add(rows);

            }
            dtm2 = (DefaultTableModel) this.jTable1.getModel();
            for (int i = 0; i < data.size(); i++) {
                dtm2.addRow(data.get(i));
            }

        } catch (Exception e) {
            System.out.println(e.getMessage());

        }

    }//GEN-LAST:event_jButton3ActionPerformed

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
        // TODO add your handling code here:
        cb = (String) Opciones.getSelectedItem();
        id_campo = 0;

        try {

            if (cb == "NOMBRE_BLOQUE_1") {
                id_campo = 1;
            } else if (cb == "NOMBRE_BLOQUE_2") {
                id_campo = 2;
            } else if (cb == "NOMBRE_BLOQUE_3") {
                id_campo = 3;
            } else if (cb == "NOMBRE_BLOQUE_4") {
                id_campo = 4;
            } else if (cb == "DIRECCION_BLOQUE_1") {
                id_campo = 5;
            } else if (cb == "DIRECCION_BLOQUE_2") {
                id_campo = 6;
            } else if (cb == "COLONIA_BLOQUE_1") {
                id_campo = 7;
            } else if (cb == "NOMBRE_BLOQUE_5") {
                id_campo = 8;
            } else if (cb == "NOMBRE_BLOQUE_6") {
                id_campo = 9;
            } else if (cb == "NOMBRE_BLOQUE_7") {
                id_campo = 10;
            } else if (cb == "NOMBRE_BLOQUE_8") {
                id_campo = 11;
            } else if (cb == "NOMBRE_BLOQUE_9") {
                id_campo = 12;
            } else if (cb == "NOMBRE_BLOQUE_10") {
                id_campo = 13;
            }

            String id_err = valor.getText();
            sql = "insert into contenedor_valores_errores(valor_error,id_campo_error) values('" + id_err + "'," + id_campo + ")";

            int result = JOptionPane.showConfirmDialog(null, "Desea agregar el valor :" + id_err, null, JOptionPane.YES_NO_OPTION);
            if (result == JOptionPane.YES_OPTION) {

                try {
                    preparedStatement2 = connection.prepareStatement(sql);
                    preparedStatement2.execute();
                } catch (Exception e) {
                    System.out.println(e.getMessage());
                }
            }

        } catch (Exception e) {
            System.out.println(e.getMessage());;
        }


    }//GEN-LAST:event_jButton4ActionPerformed

    private void jButton5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton5ActionPerformed
        // TODO add your handling code here:

        connection = ConexionBASE.getConnection();
        int id_err = 0;

        try {
            id_err = Integer.parseInt(valor.getText());

            sql = "delete from contenedor_valores_errores where id_error =" + id_err + " ";
            preparedStatement2 = connection.prepareStatement(sql);
            preparedStatement2.execute();
            JOptionPane.showMessageDialog(null, "BORRADO");

        } catch (Exception e) {
            System.out.println(e.getMessage());
        } finally {
            ConexionBASE.closeAll(connection, preparedStatement, resultSet);
        }

    }//GEN-LAST:event_jButton5ActionPerformed

    private void EspecialesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_EspecialesActionPerformed
        // TODO add your handling code here:
        connection = ConexionBASE.getConnection();
        Caracteresespeciales especiales = new Caracteresespeciales();
        sql = "select * from reportes_inusuales";
        Texto loges = new Texto();
        JFileChooser chooser = new JFileChooser();
        chooser.setFileSelectionMode(JFileChooser.DIRECTORIES_ONLY);
        Component parent = null;
        String local = null;
        DateTimeFormatter Time = DateTimeFormatter.ofPattern("yyyy-MM-dd HH,mm");
        String nombre = Time.format(LocalDateTime.now());

        int returnVal = chooser.showSaveDialog(parent);

        if (returnVal == JFileChooser.APPROVE_OPTION) {
            local = chooser.getSelectedFile().getPath();
//            System.out.println("El Directorio es : " + sel);
            try {
                preparedStatement = connection.prepareStatement(sql);
                resultSet = preparedStatement.executeQuery();

                while (resultSet.next()) {

                    Integer id = Integer.parseInt(resultSet.getString(1)) + 1;

                    ResultSetMetaData columns = resultSet.getMetaData();
                    int numbercol = columns.getColumnCount();

//            System.out.println(numbercol);
                    for (int i = 1; i <= numbercol; i++) {
                        String parametro = resultSet.getString(i);

                        boolean cE = especiales.getSpecialCharacterCount(parametro);
                        System.out.println(cE);
                        if (cE == true) {
                            String dato = "error en linea: " + id + " parametro : " + parametro + "  Columna: " + i;
                            String local2 = local + "\\" + nombre + "_log_error.txt";
                            System.out.println(dato);
                            loges.Escribir(local2, dato);

                        }
                    }
                    JOptionPane.showConfirmDialog(null, "");
//            

                }

            } catch (Exception e) {
                e.printStackTrace();

            }
        } else if (local == null) {
            JOptionPane.showMessageDialog(null, "Seleccione una ruta ");

        }
        System.out.println(local);


    }//GEN-LAST:event_EspecialesActionPerformed

    private void jButton6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton6ActionPerformed
        // TODO add your handling code here:
        
         connection = ConexionBASE.getConnection();
        String tabla = null;
        try {
            String sql = "select * from reportes_inusuales ";
            preparedStatement = connection.prepareStatement(sql);
            resultSet = preparedStatement.executeQuery();

            while (resultSet.next()) {
                tabla = resultSet.getString(2);

            }
        } catch (Exception e) {
        }

        System.out.println("data = " + tabla);

        if (tabla != null) {
            int result = JOptionPane.showConfirmDialog(null,
                    "Hay datos existentes,desea borrarlos?", null, JOptionPane.YES_NO_OPTION);
            if (result == JOptionPane.YES_OPTION) {

                try {
                    String sql = "Truncate table reportes_inusuales restart identity";
                    preparedStatement = connection.prepareStatement(sql);
                    preparedStatement.executeUpdate();
                    JOptionPane.showMessageDialog(null, "Tabla borrada");
                } catch (Exception e) {
                    JOptionPane.showMessageDialog(rootPane, e.getMessage());
                }
                try {
                    String sql = "Truncate table reportes_inusuales_inc restart identity";
                    preparedStatement = connection.prepareStatement(sql);
                    preparedStatement.executeUpdate();
                    JOptionPane.showMessageDialog(null, "Tabla borrada ERRORES");
                } catch (Exception e) {
                    JOptionPane.showMessageDialog(rootPane, e.getMessage());
                }

            }

        }

        JFileChooser SELECTOR = new JFileChooser();
        SELECTOR.setFileSelectionMode(JFileChooser.FILES_AND_DIRECTORIES);
        Component Parent = null;
        int ReturnVal = SELECTOR.showSaveDialog(Parent);
        if (ReturnVal == JFileChooser.APPROVE_OPTION) {
            FILENAME = SELECTOR.getSelectedFile().getPath();
            System.out.println("file = " + FILENAME);
        }
        if (FILENAME == null) {
            JOptionPane.showMessageDialog(null, "NO SELECCIONASTE UN ARCHIVO,POR FAVOR SELECCIONA UN ARCHIVO");
        } else {

            if (dtm != null) {
                for (int i = dtm.getRowCount() - 1; i >= 0; i--) {
                    dtm.removeRow(i);
                }
            }

        }
        try {
            if (FILENAME != null) {
                String sql;
                sql = "copy  reportes_inusuales    (tipo_de_reporte, periodo_de_reporte, folio, organo_supervisor, clave_del_sujeto_obligado, localidad, sucursal, tipo_de_operacion, instrumento_monetario, numero_de_cuenta, monto, moneda, fecha_de_la_operacion, fecha_de_deteccion_de_la_operacion, nacionalidad, tipo_de_persona, razon_social_o_denominacion, nombre, apellido_paterno, apellido_materno, rfc, curp, fecha_de_nacimiento_o_constitucion, domicilio, colonia, ciudad_o_poblacion, telefono, actividad_economica, agente_o_apoderado_de_seguros_y_o_fianzas, apellido_paterno_, apellido_materno_, rfc_, curp_, consecutivo_de_cuentas, numero_de_cuenta_, cve_del_sujeto_obligado_, nombre_del_titular_de_la_cuenta, apellido_paterno__, apellido_materno__, descripcion_de_la_operacion, razones_por_las_que_el_acto_u_operacion_se_considera_inusual,campo) from"
                        + "'" + FILENAME + "'" + "  DELIMITER ';'  ENCODING 'LATIN1'";
                preparedStatement = connection.prepareStatement(sql);
                preparedStatement.execute();
                JOptionPane.showMessageDialog(null, "DATOS INSERTADOS CON EXITO");

            } else {

            }

        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e.getMessage());
        }

        try {
            String sql = "Select * from reportes_inusuales   order by id_reporte";
            preparedStatement = connection.prepareStatement(sql);
            resultSet = preparedStatement.executeQuery();
            rsm = resultSet.getMetaData();
            ArrayList<Object[]> data = new ArrayList<>();
            while (resultSet.next()) {
                Object[] rows = new Object[rsm.getColumnCount()];
                for (int i = 0; i < rows.length; i++) {
                    rows[i] = resultSet.getObject(i + 1);

                }
                data.add(rows);
            }
            dtm = (DefaultTableModel) this.jTable2.getModel();
            for (int i = 0; i < data.size(); i++) {
                dtm.addRow(data.get(i));

            }

        } catch (Exception e) {
            JOptionPane.showMessageDialog(rootPane, e.getMessage());
        } finally {
            ConexionBASE.closeAll(connection, preparedStatement, resultSet);
            FILENAME = null;
        }


        
        
    }//GEN-LAST:event_jButton6ActionPerformed

    public static void main(String args[]) throws Exception {

        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(XML2EX.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(XML2EX.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(XML2EX.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(XML2EX.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new XML2EX().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JCheckBox Codigo;
    private javax.swing.JButton Especiales;
    private javax.swing.JButton Generar;
    private javax.swing.JComboBox<String> Opciones;
    private javax.swing.JButton REVISAR;
    private javax.swing.JCheckBox Termina;
    private javax.swing.JCheckBox campo41;
    private javax.swing.JButton cargar;
    private javax.swing.JCheckBox contiene;
    private javax.swing.JCheckBox empieza;
    private javax.swing.JCheckBox igual;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JButton jButton5;
    private javax.swing.JButton jButton6;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JSeparator jSeparator3;
    private javax.swing.JTable jTable1;
    private javax.swing.JTable jTable2;
    private javax.swing.JCheckBox sucursales;
    private javax.swing.JCheckBox todas;
    private javax.swing.JTextField valor;
    // End of variables declaration//GEN-END:variables
}
