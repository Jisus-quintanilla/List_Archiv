/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package com.progra2.tra7;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Usuario
 */
public interface ClsPersona {
  public String getNombre(String nombre);
     public void setNombre(String nombre);
     
     public void llenar_informacion();
     public void Cargar_información(String archivo);
     public void guardar_información(String archivo);  
    

}
