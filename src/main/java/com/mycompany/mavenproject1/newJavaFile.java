/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Other/File.java to edit this template
 */
package com.mycompany.mavenproject1;
import java.util.ArrayList;
/**
 *
 * @author stida
 */
public class newJavaFile {

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
         ArrayList palabras = new ArrayList();
        palabras.add("god of war");
        palabras.add("the last of us");
        palabras.add("call of duty");
        palabras.add("spiderman");
        palabras.add("huncharted");
        
        int a = (int) (Math.random()*5);
        
        System.out.println("tu juego es:"+palabras.get(a));
    }

   
}
