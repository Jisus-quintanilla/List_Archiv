/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.progra2.tra7;

import java.io.*;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 *
 * @author Usuario
 */
public class ClsPersona1 implements ClsPersona{
    
    private static Scanner teclado = new Scanner(System.in);
    
    static List<ClsPersona1> LecturaArchivo(){
        List<ClsPersona1> Persona= new ArrayList();
        
        File Archivo = new File("C:\\Users\\Usuario\\OneDrive\\Escritorio\\Trabajos de U\\cuarto ciclo\\Programación 2\\pruebas\\VendedorPersona.txt");
        try{
            BufferedReader entrada = new BufferedReader(new FileReader(Archivo));
            String lectura; 
            lectura = entrada.readLine();
            int NoLinea = 1;
           
            while ( lectura != null){
                
                System.out.println(NoLinea+" Vendedor:  "+lectura);
                NoLinea++;
                lectura = entrada.readLine();
                
            }
            entrada.close();
        }catch(FileNotFoundException ex){
            System.out.println("El archivo no existe");
        }catch(IOException ex){
            System.out.println("Hay problemas de apertura");
        }
        
       return Persona;
    }

    static void Escribir(){
        String Info;
        File Archivo = new File("C:\\Users\\Usuario\\OneDrive\\Escritorio\\Trabajos de U\\cuarto ciclo\\Programación 2\\pruebas\\VendedorPersona.txt");
        System.out.println("Ingresa el nombre del nuevo vendedor:");
        Info = teclado.nextLine();
        try{
            PrintWriter salida = new PrintWriter(new FileWriter(Archivo,true));
            String contenido = Info;
            salida.println(contenido);
            salida.close();
        }catch(FileNotFoundException ex){
            System.out.println("El archivo no existe");
        }catch(Exception e){
            System.out.println("Hubo problemas");
        }
    }
    
    @Override
    public String getNombre(String nombre) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void setNombre(String nombre) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void llenar_informacion() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void Cargar_información(String nombreArchivo) {
     
    }

    @Override
    public void guardar_información(String archivo) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
    public static void main(String[] args){
        Escribir();
        List<ClsPersona1> da = ClsPersona1.LecturaArchivo();
        System.out.println(da);

        

    }
}
