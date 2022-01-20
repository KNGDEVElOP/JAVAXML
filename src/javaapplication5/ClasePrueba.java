/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package javaapplication5;

import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;
import org.xml.sax.SAXException;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;
import java.io.File;
import java.io.IOException;
import java.io.InputStream;
import javax.xml.XMLConstants;

/**
 *
 * @author eimartinezj
 */
public class ClasePrueba {

    private static final String FILENAME = "E:\\Users\\eimartinezj\\Desktop\\reportePLD.xml";

    public static void main(String[] args) throws ParserConfigurationException {
        DocumentBuilderFactory dbf = DocumentBuilderFactory.newInstance();
        Caracteresespeciales especiales = new Caracteresespeciales();
        try {
            
            
            DocumentBuilder db = dbf.newDocumentBuilder();
            // optional, but recommended
            // process XML securely, avoid attacks like XML External Entities (XXE)
            //dbf.setFeature(XMLConstants.FEATURE_SECURE_PROCESSING, true);
            // parse XML file
            

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
                    int r=temp+1;
                    String folio = element.getElementsByTagName("folio_consecutivo").item(0).getTextContent();
                    String fechah = element.getElementsByTagName("fecha_hora").item(0).getTextContent();
                    var cE=especiales.getSpecialCharacterCount(fechah);
                   if(cE){
                       System.out.println("Error en linea folio_consecutivo:" +r);
                   }
                   
                    String tipooperacion = element.getElementsByTagName("tipo_operacion").item(0).getTextContent();
                    cE=especiales.getSpecialCharacterCount(tipooperacion);
                    if(cE){
                     System.out.println("Error en campo tipo_operacion linea : " +r);
                    }
                    String cuentacontrato = element.getElementsByTagName("cuenta_contrato").item(0).getTextContent();
                    cE=especiales.getSpecialCharacterCount(cuentacontrato);
                    if(cE){
                     System.out.println("Error en campo cuenta_contrato linea :" +r);
                    }
                    String montooperacion = element.getElementsByTagName("monto_operacion").item(0).getTextContent();
                    cE=especiales.getSpecialCharacterCount(montooperacion);
                    if(cE){
                     System.out.println("Error en campo monto_operacion linea :" +r);
                    }
                    
                    String moneda = element.getElementsByTagName("moneda").item(0).getTextContent();
                     cE=especiales.getSpecialCharacterCount(moneda);
                    if(cE){
                     System.out.println("Error en campo moneda linea :" +r);
                    }
                    
                    String instrumento = element.getElementsByTagName("instrumento_monetario").item(0).getTextContent();
                    cE=especiales.getSpecialCharacterCount(instrumento);
                    if(cE){
                     System.out.println("Error en campo instrumento_monetario linea :" +r);
                    }
                    
                    String ccliquidacion = element.getElementsByTagName("cuenta_contrato_liquidacion").item(0).getTextContent();
                    cE=especiales.getSpecialCharacterCount(ccliquidacion);
                    if(cE){
                     System.out.println("Error en campo cuenta_contrato Liquidacion  linea :" +r);
                    }
                    
                    String montooperacionLquidacion = element.getElementsByTagName("monto_operacion_liquidacion").item(0).getTextContent();
                    cE=especiales.getSpecialCharacterCount(montooperacionLquidacion);
                    if(cE){
                     System.out.println("Error en campo monto_operacion_liquidacion  linea :" +r);
                    }
                    
                    String monedaLiquidacion = element.getElementsByTagName("moneda_liquidacion").item(0).getTextContent();
                    cE=especiales.getSpecialCharacterCount(monedaLiquidacion);
                    if(cE){
                     System.out.println("Error en campo moneda_liquidacion  linea :" +r);
                    }
                    
                    String instrumentoMonetarioLiquidacion = element.getElementsByTagName("instrumento_monetario_liquidacion").item(0).getTextContent();
                    cE=especiales.getSpecialCharacterCount(instrumentoMonetarioLiquidacion);
                    if(cE){
                     System.out.println("Error en campo instrumentoMonetarioLiquidacion  linea :" +r);
                    }
              
                }

            }

            for (int t2 = 0, length = list3.getLength(); t2 < length; t2++) {
                org.w3c.dom.Node node3 = list3.item(t2);
                if (node3.getNodeType() == org.w3c.dom.Node.ELEMENT_NODE) {
                    org.w3c.dom.Element element3 = (org.w3c.dom.Element) node3;
                    c = t2 + 1;
                    String nombre = element3.getElementsByTagName("nombre").item(0).getTextContent();
                    boolean cE=especiales.getSpecialCharacterCount(nombre);
                    if(cE){
                        System.out.println("Error en campo nombre  linea :" +c);
                        
                    }
                    String apellido = element3.getElementsByTagName("apellido_paterno").item(0).getTextContent();
                    cE=especiales.getSpecialCharacterCount(apellido);
                    if(cE){
                        System.out.println("Error en campo apellido_paterno  linea :" +c);
                        
                    }
                    String apellidom = element3.getElementsByTagName("apellido_materno").item(0).getTextContent();
                     cE=especiales.getSpecialCharacterCount(apellidom);
                    if(cE){
                        System.out.println("Error en campo apellido_materno  linea :" +c);
                        
                    }
                    String fechaNac = element3.getElementsByTagName("fecha_nacimiento").item(0).getTextContent();
                      cE=especiales.getSpecialCharacterCount(fechaNac);
                    if(cE){
                        System.out.println("Error en campo fecha_nacimiento  linea :" +c);
                        
                    }
                    String paisNac = element3.getElementsByTagName("pais_nacimiento").item(0).getTextContent();
                    cE=especiales.getSpecialCharacterCount(paisNac);
                    if(cE){
                        System.out.println("Error en campo pais_nacimiento  linea :" +c);
                        
                    }
                    
                    String paisNacN = element3.getElementsByTagName("pais_nacionalidad").item(0).getTextContent();
                     cE=especiales.getSpecialCharacterCount(paisNacN);
                    if(cE){
                        System.out.println("Error en campo pais_nacionalidad  linea :" +c);
                        
                    }
                    
                    String domUni = element3.getElementsByTagName("domicilio_unificado").item(0).getTextContent();
                     cE=especiales.getSpecialCharacterCount(domUni);
                    if(cE){
                        System.out.println("Error en campo domicilio_unificado  linea :" +c);
                        
                    }
                    
                    String ciudadP = element3.getElementsByTagName("ciudad_poblacion").item(0).getTextContent();
                     cE=especiales.getSpecialCharacterCount(ciudadP);
                    if(cE){
                        System.out.println("Error en campo ciudad_poblacion  linea :" +c);
                        
                    }
                    String colonia = element3.getElementsByTagName("colonia").item(0).getTextContent();
                     cE=especiales.getSpecialCharacterCount(colonia);
                    if(cE){
                        System.out.println("Error en campo colonia  linea :" +c);
                        
                    }
                    
                    

                }
            }
            for (int t3 = 0, length = list4.getLength(); t3 < length; t3++) {
                org.w3c.dom.Node node4 = list4.item(t3);

                if (node4.getNodeType() == org.w3c.dom.Node.ELEMENT_NODE) {
                    org.w3c.dom.Element element4 = (org.w3c.dom.Element) node4;
                    c = ++c;
                    String nombre = element4.getElementsByTagName("nombre").item(0).getTextContent();
                    boolean cE=especiales.getSpecialCharacterCount(nombre);
                    if(cE){
                        System.out.println("Error en campo nombre  linea :" +c);
                        
                    }
                    String apellido = element4.getElementsByTagName("apellido_paterno").item(0).getTextContent();
                    cE=especiales.getSpecialCharacterCount(apellido);
                    if(cE){
                        System.out.println("Error en campo apellido_paterno  linea :" +c);
                        
                    }
                    String apellidom = element4.getElementsByTagName("apellido_materno").item(0).getTextContent();
                    cE=especiales.getSpecialCharacterCount(apellidom);
                    if(cE){
                        System.out.println("Error en campo apellido_materno  linea :" +c);
                        
                    }
                    String fechaNac = element4.getElementsByTagName("fecha_nacimiento").item(0).getTextContent();
                    cE=especiales.getSpecialCharacterCount(fechaNac);
                    if(cE){
                        System.out.println("Error en campo fecha_nacimiento  linea :" +c);
                        
                    }
                    String paisNacN = element4.getElementsByTagName("pais_nacionalidad").item(0).getTextContent();
                    cE=especiales.getSpecialCharacterCount(paisNacN);
                    if(cE){
                        System.out.println("Error en campo pais_nacionalidad  linea :" +c);
                        
                    }
                    String acteco = element4.getElementsByTagName("actividad_economica").item(0).getTextContent();
                    cE=especiales.getSpecialCharacterCount(acteco);
                    if(cE){
                        System.out.println("Error en campo actividad_economica  linea :" +c);
                        
                    }
                    String ciudadP = element4.getElementsByTagName("ciudad_poblacion").item(0).getTextContent();
                    cE=especiales.getSpecialCharacterCount(ciudadP);
                    if(cE){
                        System.out.println("Error en campo ciudad_poblacion  linea :" +c);
                        
                    }
                    String colonia = element4.getElementsByTagName("colonia").item(0).getTextContent();
                    cE=especiales.getSpecialCharacterCount(colonia);
                    if(cE){
                        System.out.println("Error en campo colonia  linea :" +c);
                        
                    }
                    String domUni = element4.getElementsByTagName("domicilio_unificado").item(0).getTextContent();
                    cE=especiales.getSpecialCharacterCount(domUni);
                    if(cE){
                        System.out.println("Error en campo domicilio_unificado  linea :" +c);
                        
                    }
                    

                }

            }
        } catch (SAXException | IOException e) {
            e.printStackTrace();
        }

    }
}
