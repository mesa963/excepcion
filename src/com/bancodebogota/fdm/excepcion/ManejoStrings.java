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
public class ManejoStrings {
    
   boolean checkPalindromeStringBuffer(String inputString) {
    StringBuffer inputStringReves = new StringBuffer();
//    String inputStringReves="";
    for (int i = inputString.length() - 1; i >= 0; i--) { 
            inputStringReves.append(inputString.charAt(i));
        }
    if (inputString.equals(inputStringReves.toString())) { 
              return true;
        }
    else
       {
        return false;
       }
    
}
   
    boolean checkPalindromeStringBuilder(String inputString) {
    StringBuilder inputStringReves = new StringBuilder();
//    String inputStringReves="";
    for (int i = inputString.length() - 1; i >= 0; i--) { 
            inputStringReves.append(inputString.charAt(i));
        }
    if (inputString.equals(inputStringReves.toString())) { 
              return true;
        }
    else
       {
        return false;
       }
    
    }   
    
    
    
    
}


