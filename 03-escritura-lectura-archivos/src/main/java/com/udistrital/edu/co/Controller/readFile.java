/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.udistrital.edu.co.Controller;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;

/**
 *
 * @author Estudiantes
 */
public class readFile {
    
    public boolean readFile(String fileName) throws IOException{
      
    File archivo = null;
    FileReader fr = null;
    BufferedReader br = null;
        
    try {
     archivo = new File (fileName);
     fr = new FileReader (archivo);
     br = new BufferedReader(fr);

     // Lectura del fichero
     String linea;
     while((linea=br.readLine())!=null)
        System.out.println(linea);
    } catch (Exception e) {
        System.out.println("Ocurrio un problema al leer el archivo");
    }
      
    fr.close();
    
    return true;
    
    }
}
