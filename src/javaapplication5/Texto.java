/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package javaapplication5;

/**
 *
 * @author eimartinezj
 */

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;

public class Texto {
    
    public  void Escribir(String ruta,String contenido){
    
        try {
//            String ruta="/ruta/filename.txt";
//            String contenido="file asdasd";
            File file =new File(ruta);
            if(!file.exists()){
            file.createNewFile();
            }
            FileWriter fw=new FileWriter(file.getAbsoluteFile(),true);
            BufferedWriter bw=new BufferedWriter(fw);
            bw.write(contenido);
            bw.newLine();
            bw.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    
}
