/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package javaapplication5;

import java.awt.BorderLayout;
import java.awt.Dimension;
import java.io.File;
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.IOException;
import java.sql.*;
import java.util.ArrayList;
import javax.swing.JOptionPane;
import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;
import org.w3c.dom.NodeList;
import org.xml.sax.SAXException;
import javax.swing.table.DefaultTableModel;

public class XML2EX extends javax.swing.JFrame {

    public XML2EX() {
        
        initComponents();
        
    }
    

    private Connection connection = null;
    private PreparedStatement preparedStatement = null;
    private ResultSet resultSet = null;
    
    

    @SuppressWarnings("unchecked")


    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jTextField2 = new javax.swing.JTextField();
        jButton2 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jButton4 = new javax.swing.JButton();
        jButton1 = new javax.swing.JButton();
        jButton6 = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable2 = new javax.swing.JTable();
        jButton7 = new javax.swing.JButton();
        jButton5 = new javax.swing.JButton();
        jTextField1 = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel2.setText("MONTO");

        jButton2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/Microsoft-Excel-2013-icon.png"))); // NOI18N
        jButton2.setText("EXPORTAR A CSV");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        jButton3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/Save-icon.png"))); // NOI18N
        jButton3.setText("ESCOJER RUTA");
        jButton3.setToolTipText("");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(59, 59, 59)
                .addComponent(jLabel2)
                .addGap(50, 50, 50)
                .addComponent(jTextField2, javax.swing.GroupLayout.PREFERRED_SIZE, 155, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jButton3)
                .addGap(18, 18, 18)
                .addComponent(jButton2)
                .addGap(218, 218, 218))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(jTextField2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(0, 0, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton2)
                    .addComponent(jButton3)))
        );

        jButton4.setText("CALCULAR");
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });

        jButton1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/database-arrow-right-icon.png"))); // NOI18N
        jButton1.setText("CARGAR TABLA");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jButton6.setText("CARGAR DATOS EN TABLA");
        jButton6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton6ActionPerformed(evt);
            }
        });

        jScrollPane1.setAutoscrolls(true);

        jTable2.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "id_reporte", "trimestre_reportado", "clave_organo_regulador", "clave_entidad", "folio_consecutivo", "fecha_hora", "tipo_operacion", "cuenta_contrato", "monto_operacion", "moneda", "Instrumento monetario", "cuenta_contrato_liquidacion", "Monto_operacion_liquidacion", "moneda_liquidacion", "instrumento_monetario_liquidacion", "clave_sucursal", "nombre", "apellido_paterno", "apellido_materno", "fecha_nacimiento", "pais_nacimiento", "pais_nacionalidad", "domicilio_unificado", "ciudad_poblacion", "colonia", "nombre_pf", "apellido_paterno_pf", "apellido_materno_pf", "fecha_nacimiento_pf", "pais_nacionalidad_pf", "actividad_economica_pf", "domicilio_unificado_pf", "ciudad_poblacion_pf", "colonia_pf"
            }
        ));
        jScrollPane1.setViewportView(jTable2);

        jButton7.setText("BORRAR TABLA");
        jButton7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton7ActionPerformed(evt);
            }
        });

        jButton5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/xml-icon.png"))); // NOI18N
        jButton5.setText("SELECCIONAR XML");
        jButton5.setDefaultCapable(false);
        jButton5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton5ActionPerformed(evt);
            }
        });

        jLabel1.setText("OPERACIONES");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 1370, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(415, 415, 415)
                        .addComponent(jButton4)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(jButton1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jButton5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(65, 65, 65)
                                .addComponent(jLabel1)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, 155, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jButton6)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jButton7)
                                .addContainerGap())
                            .addGroup(layout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addGap(218, 218, 218))))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(layout.createSequentialGroup()
                            .addComponent(jButton5, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED))
                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(jLabel1)
                                .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGap(10, 10, 10)))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jButton6)
                            .addComponent(jButton7))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jButton1)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jButton4)
                        .addGap(24, 24, 24))))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    String sel = "";
    public String FILENAME = "";
    
    ResultSetMetaData rsm;
    DefaultTableModel dtm;
    


      
    

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed

        // Instantiate the Factory
        DocumentBuilderFactory dbf = DocumentBuilderFactory.newInstance();
        connection = ConexionBASE.getConnection();

        try {

            // optional, but recommended
            // process XML securely, avoid attacks like XML External Entities (XXE)
            //dbf.setFeature(XMLConstants.FEATURE_SECURE_PROCESSING, true);
            // parse XML file
            DocumentBuilder db = dbf.newDocumentBuilder();

            org.w3c.dom.Document doc = db.parse(new File(FILENAME));

            // optional, but recommended
            // http://stackoverflow.com/questions/13786607/normalization-in-dom-parsing-with-java-how-does-it-work
            doc.getDocumentElement().normalize();
            // obtener operaciones
            NodeList list = doc.getElementsByTagName("operacion");
            NodeList list2 = doc.getElementsByTagName("reporte");
            NodeList list3 = doc.getElementsByTagName("usuario");
            NodeList list4 = doc.getElementsByTagName("persona_fisica");

            org.w3c.dom.Node node2 = list2.item(0);
            org.w3c.dom.Element element2 = (org.w3c.dom.Element) node2;
            String trime = element2.getElementsByTagName("trimestre_reportado").item(0).getTextContent();
            String regulador = element2.getElementsByTagName("clave_organo_regulador").item(0).getTextContent();
            String entidad = element2.getElementsByTagName("clave_entidad").item(0).getTextContent();
            int c = 0;

            for (int temp = 0, length = list.getLength(); temp < length; temp++) {

                org.w3c.dom.Node node = list.item(temp);

                if (node.getNodeType() == org.w3c.dom.Node.ELEMENT_NODE) {

                    org.w3c.dom.Element element = (org.w3c.dom.Element) node;
                    String folio = element.getElementsByTagName("folio_consecutivo").item(0).getTextContent();
                    String fechah = element.getElementsByTagName("fecha_hora").item(0).getTextContent();
                    String tipooperacion = element.getElementsByTagName("tipo_operacion").item(0).getTextContent();
                    String cuentacontrato = element.getElementsByTagName("cuenta_contrato").item(0).getTextContent();
                    String montooperacion = element.getElementsByTagName("monto_operacion").item(0).getTextContent();
                    String moneda = element.getElementsByTagName("moneda").item(0).getTextContent();
                    String instrumento = element.getElementsByTagName("instrumento_monetario").item(0).getTextContent();
                    String ccliquidacion = element.getElementsByTagName("cuenta_contrato_liquidacion").item(0).getTextContent();
                    String montooperacionLquidacion = element.getElementsByTagName("monto_operacion_liquidacion").item(0).getTextContent();
                    String monedaLiquidacion = element.getElementsByTagName("moneda_liquidacion").item(0).getTextContent();
                    String instrumentoMonetarioLiquidacion = element.getElementsByTagName("instrumento_monetario_liquidacion").item(0).getTextContent();
                    String claveSucursal = element.getElementsByTagName("clave_sucursal").item(0).getTextContent();
//                    connection = ConexionBASE.getConnection();
                    String sql;
                    sql = "insert into operaciones(trimestre_reportado,clave_organo_regulador,clave_entidad,folio_consecutivo,fecha_hora,tipo_operacion,cuenta_contrato,monto_operacion,moneda,instrumento_monetario,cuenta_contrato_liquidacion,monto_operacion_liquidacion,moneda_liquidacion,instrumento_monetario_liquidacion,clave_sucursal)"
                            + "values(?,?,?,?,?,?,?,?,?,?,?,?,?,?,?)";

                    try {

                        preparedStatement = connection.prepareStatement(sql);
                        preparedStatement.setString(1, trime);
                        preparedStatement.setString(2, regulador);
                        preparedStatement.setString(3, entidad);
                        preparedStatement.setString(4, folio);
                        preparedStatement.setString(5, fechah);
                        preparedStatement.setString(6, tipooperacion);
                        preparedStatement.setString(7, cuentacontrato);
                        preparedStatement.setString(8, montooperacion);
                        preparedStatement.setString(9, moneda);
                        preparedStatement.setString(10, instrumento);
                        preparedStatement.setString(11, ccliquidacion);
                        preparedStatement.setString(12, montooperacionLquidacion);
                        preparedStatement.setString(13, monedaLiquidacion);
                        preparedStatement.setString(14, instrumentoMonetarioLiquidacion);
                        preparedStatement.setString(15, claveSucursal);

                        preparedStatement.executeUpdate();

                    } catch (Exception e) {
                        System.out.println("Ocurrio un error : " + e.getMessage());

                    } 
                    
//                    finally {
//                        ConexionBASE.closeAll(connection, preparedStatement, resultSet);
//                    }

                }

            }
//            for (int temp = 0,length=list.getLength(); temp < length; temp++)
//            for (int t2 = 0; t2 < list3.getLength(); t2++)
            for (int t2 = 0, length = list3.getLength(); t2 < length; t2++) {
                org.w3c.dom.Node node3 = list3.item(t2);
//                connection = ConexionBASE.getConnection();
                if (node3.getNodeType() == org.w3c.dom.Node.ELEMENT_NODE) {
                    org.w3c.dom.Element element3 = (org.w3c.dom.Element) node3;
                    String nombre = element3.getElementsByTagName("nombre").item(0).getTextContent();
                    String apellido = element3.getElementsByTagName("apellido_paterno").item(0).getTextContent();
                    String apellidom = element3.getElementsByTagName("apellido_materno").item(0).getTextContent();
                    String fechaNac = element3.getElementsByTagName("fecha_nacimiento").item(0).getTextContent();
                    String paisNac = element3.getElementsByTagName("pais_nacimiento").item(0).getTextContent();
                    String paisNacN = element3.getElementsByTagName("pais_nacionalidad").item(0).getTextContent();
                    String domUni = element3.getElementsByTagName("domicilio_unificado").item(0).getTextContent();
                    String ciudadP = element3.getElementsByTagName("ciudad_poblacion").item(0).getTextContent();
                    String colonia = element3.getElementsByTagName("colonia").item(0).getTextContent();
                    c = t2 + 1;
                    String sql = "update operaciones set "
                            + "nombre=?,apellido_paterno=?,apellido_materno=?,fecha_nacimiento=?,pais_nacimiento=?,pais_nacionalidad=?,domicilio_unificado=?,ciudad_poblacion=?,colonia=? "
                            + " where id_reporte= " + c + " ";

                    try {

                        preparedStatement = connection.prepareStatement(sql);
                        preparedStatement.setString(1, nombre);
                        preparedStatement.setString(2, apellido);
                        preparedStatement.setString(3, apellidom);
                        preparedStatement.setString(4, fechaNac);
                        preparedStatement.setString(5, paisNac);
                        preparedStatement.setString(6, paisNacN);
                        preparedStatement.setString(7, domUni);
                        preparedStatement.setString(8, ciudadP);
                        preparedStatement.setString(9, colonia);
                        preparedStatement.executeUpdate();

                    } catch (Exception e) {
                        System.out.println("Ocurrio un error : " + e.getMessage());
                    } //finally {
//                        ConexionBASE.closeAll(connection, preparedStatement, resultSet);
//                    }

                }
            }
            for (int t3 = 0, length = list4.getLength(); t3 < length; t3++) {
                org.w3c.dom.Node node4 = list4.item(t3);
//                connection = ConexionBASE.getConnection();
                if (node4.getNodeType() == org.w3c.dom.Node.ELEMENT_NODE) {
                    org.w3c.dom.Element element4 = (org.w3c.dom.Element) node4;
                    String nombre = element4.getElementsByTagName("nombre").item(0).getTextContent();
                    String apellido = element4.getElementsByTagName("apellido_paterno").item(0).getTextContent();
                    String apellidom = element4.getElementsByTagName("apellido_materno").item(0).getTextContent();
                    String fechaNac = element4.getElementsByTagName("fecha_nacimiento").item(0).getTextContent();
                    String paisNacN = element4.getElementsByTagName("pais_nacionalidad").item(0).getTextContent();
                    String acteco = element4.getElementsByTagName("actividad_economica").item(0).getTextContent();
                    String ciudadP = element4.getElementsByTagName("ciudad_poblacion").item(0).getTextContent();
                    String colonia = element4.getElementsByTagName("colonia").item(0).getTextContent();
                    String domUni = element4.getElementsByTagName("domicilio_unificado").item(0).getTextContent();
                    c = ++c;
                    String sql = "update operaciones set "
                            + "nombre_pf=?,apellido_paterno_pf=?,apellido_materno_pf=?,fecha_nacimiento_pf=?,pais_nacionalidad_pf=?,actividad_economica_pf=?,domicilio_unificado_pf=?,ciudad_poblacion_pf=?,colonia_pf=?"
                            + " where id_reporte=" + c + " ";
                    try {

                        preparedStatement = connection.prepareStatement(sql);
                        preparedStatement.setString(1, nombre);
                        preparedStatement.setString(2, apellido);
                        preparedStatement.setString(3, apellidom);
                        preparedStatement.setString(4, fechaNac);
                        preparedStatement.setString(5, paisNacN);
                        preparedStatement.setString(6, acteco);
                        preparedStatement.setString(7, domUni);
                        preparedStatement.setString(8, ciudadP);
                        preparedStatement.setString(9, colonia);
                        preparedStatement.executeUpdate();

                    } catch (Exception e) {
                        System.out.println("Ocurrio un error : " + e.getMessage());

                    } 
                    
//                    System.out.println("c = " + c);

                }
            }

        } catch (ParserConfigurationException | SAXException | IOException e) {
            e.printStackTrace();
        }
        finally {
                        ConexionBASE.closeAll(connection, preparedStatement, resultSet);
                    }
        
        JOptionPane.showMessageDialog(null, "Operación realizada correctamente");
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        // TODO add your handling code here:
        connection = ConexionBASE.getConnection();
        try {

            String sql = "COPY (select * from orden ) to '" + sel + "\\data.csv' delimiter ',' CSV HEADER ENCODING 'LATIN1'";
            preparedStatement = connection.prepareStatement(sql);
            preparedStatement.executeUpdate();
            JOptionPane.showMessageDialog(null, "Su archivo esta listo");

        } catch (Exception e) {
            System.out.println("Ocurrio un error : " + e.getMessage());
        } finally {
            ConexionBASE.closeAll(connection, preparedStatement, resultSet);
        }


    }//GEN-LAST:event_jButton2ActionPerformed

    

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        JFileChooser chooser = new JFileChooser();
        chooser.setFileSelectionMode(JFileChooser.DIRECTORIES_ONLY);
        Component parent = null;
        int returnVal = chooser.showSaveDialog(parent);
        if (returnVal == JFileChooser.APPROVE_OPTION) {
            sel = chooser.getSelectedFile().getPath();
            System.out.println("El Directorio es : " + sel);

        }

    }//GEN-LAST:event_jButton3ActionPerformed

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
        // TODO add your handling code here:
        connection = ConexionBASE.getConnection();
        try {
            String sql = "select SUM ( monto_operacion :: Double PRECISION ) as monto, sum (monto_operacion_liquidacion::Double PRECISION) as liquidacion  from operaciones";
            preparedStatement = connection.prepareStatement(sql);
            resultSet = preparedStatement.executeQuery();
            while (resultSet.next()) {
                String data = resultSet.getString(1);
                jTextField1.setText(data);
                jTextField2.setText(resultSet.getString(2));
            }

        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            ConexionBASE.closeAll(connection, preparedStatement, resultSet);
        }
    }//GEN-LAST:event_jButton4ActionPerformed

    private void jButton5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton5ActionPerformed
        // TODO add your handling code here:
        JFileChooser chooser = new JFileChooser();
        chooser.setFileSelectionMode(JFileChooser.FILES_AND_DIRECTORIES);
        Component parent = null;
        int returnVal = chooser.showOpenDialog(parent);
        if (returnVal == JFileChooser.APPROVE_OPTION) {
            FILENAME = chooser.getSelectedFile().getPath();
            System.out.println("El Directorio es : " + FILENAME);

        }
    }//GEN-LAST:event_jButton5ActionPerformed

    private void jButton6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton6ActionPerformed
        // TODO add your handling code here:
        connection = ConexionBASE.getConnection();
        
        try {
            String sql="select * from operaciones order by id_reporte";
            preparedStatement = connection.prepareStatement(sql);
            resultSet = preparedStatement.executeQuery();
            rsm=resultSet.getMetaData();
            ArrayList<Object[]> data=new ArrayList<>();
            while(resultSet.next()){
            Object[] rows= new Object[rsm.getColumnCount()];
            for(int i=0;i< rows.length;i++){
            rows[i]=resultSet.getObject(i+1);
            }
            data.add(rows);
            }
            dtm=(DefaultTableModel)this.jTable2.getModel();
            for (int i = 0; i < data.size(); i++) {
                dtm.addRow(data.get(i));
                
            }
            
        } catch (Exception e) {
            JOptionPane.showMessageDialog(rootPane, e.getMessage());
        }
    }//GEN-LAST:event_jButton6ActionPerformed

    private void jButton7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton7ActionPerformed
        // TODO add your handling code here:
        
        
        for (int i = dtm.getRowCount() - 1; i >= 0; i--) {
            dtm.removeRow(i);
            
        }
        
        
    }//GEN-LAST:event_jButton7ActionPerformed

    
    
    
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
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JButton jButton5;
    private javax.swing.JButton jButton6;
    private javax.swing.JButton jButton7;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable2;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JTextField jTextField2;
    // End of variables declaration//GEN-END:variables
}
