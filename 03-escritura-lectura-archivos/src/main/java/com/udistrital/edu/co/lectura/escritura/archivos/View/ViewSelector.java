/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.udistrital.edu.co.lectura.escritura.archivos.View;

import com.udistrital.edu.co.Controller.MainComponent;
import java.io.IOException;
import javax.swing.JFileChooser;

/**
 *
 * @author Estudiantes
 */
public class ViewSelector {
    
    public static void main(String[] args) throws IOException {
      JFileChooser file = new JFileChooser();
      file.setFileSelectionMode(JFileChooser.FILES_AND_DIRECTORIES);
      
      if (file.showOpenDialog(null) == JFileChooser.APPROVE_OPTION) {
         
          java.io.File f = file.getSelectedFile();
         
          MainComponent readAndWrite = new MainComponent();
          readAndWrite.gettingFile(f.getPath());
        
      }
   }
}
