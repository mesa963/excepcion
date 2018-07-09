/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.bancodebogota.fdm.excepcion;

/**
 *
 * @author Jamm
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        ManejoStrings manejo = new ManejoStrings();
        boolean sBuffer = manejo.checkPalindromeStringBuffer("aaaa");
        System.out.println(sBuffer);
        boolean sBuilder = manejo.checkPalindromeStringBuilder("aaaa");
        System.out.println(sBuilder);
        Main m = new Main();
        m.recurso();
        
        m.divisionPorCeroUncheked();
        try{
            
         m.divisionPorCerocheked(3,0);
        }
        catch(DivisionPorCeroExcetion ex)
        {
          System.out.println(ex.toString());  
        }
    }
    
    
    public void recurso()
    {
        try(MiRecurso mr = new MiRecurso())
        {
          
        }
        catch(Exception ex)
        {
         System.out.println(ex.toString());  
        }
    }
    
    public void divisionPorCeroUncheked()
    {
        try{
        int s = 3/0;
                }
        catch(Exception ex)
        {
          System.out.println(ex.toString());  
        }
    }
    
    public void divisionPorCerocheked(int dividendo,int divisor )throws DivisionPorCeroExcetion
    {   
       if(divisor != 0)
       {
         int respuesta = dividendo/divisor; 
       }
       else
       {
           throw new DivisionPorCeroExcetion("Error division por cero");
       }
   
              }
    }
    
    
    


