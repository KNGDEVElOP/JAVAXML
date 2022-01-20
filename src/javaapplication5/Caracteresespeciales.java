/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package javaapplication5;

/**
 *
 * @author eimartinezj
 */

import  java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Caracteresespeciales {
    
    public boolean getSpecialCharacterCount (String s) {
     if (s == null || s.trim().isEmpty()) {
         System.out.println("Valor de cadena invalido");
         
     }
     Pattern p = Pattern.compile("[^A-Za-z0-9-., Ññ]");
     Matcher m = p.matcher(s);
    // boolean b = m.matches();
     boolean b = m.find();
     if (b == true){
        return true;
     }
     else{
        return false;
     
     }
     
     
 }
    
}
