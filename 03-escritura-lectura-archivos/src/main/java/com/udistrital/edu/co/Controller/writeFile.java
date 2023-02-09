package com.udistrital.edu.co.Controller;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Estudiantes
 */
public class writeFile {
    
     public boolean writeFile(String fileName, String textToWrite) throws IOException{

    File file;
    file = new File(fileName);
    
         try {
             FileWriter writer = new FileWriter(file);
             BufferedWriter bufferedWriter = new BufferedWriter(writer);
             PrintWriter wr = new PrintWriter(bufferedWriter);  
             wr.write(textToWrite);
             
             wr.close();
             bufferedWriter.close();

         } catch (Exception e) {
             System.out.println("No se pudo escribir en el archivo");
         }
    
     return true;
         
     }
}
