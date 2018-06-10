/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package co.com.Util;

/**
 *
 * @author hangutco
 */
public class UtilValidaciones {
    
    
   public static boolean isNumeric(String numero)
   {
        if (numero.matches("\\d*"))
        {    
            return true;
        } else{
             return false;
        }
   }
   
    public static boolean containValuesNoAlfanumeric(String numero)
   {
        if (numero.matches("^[\\w]+$"))
        {    
            return true;
        } else{
             return false;
        }
   }
    
}
