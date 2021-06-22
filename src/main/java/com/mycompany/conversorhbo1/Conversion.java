/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.conversorhbo1;

/**
 *
 * @author Usuario
 */
public class Conversion {
    
    public String intToHexadecimal(int n){
      return Integer.toHexString(n).toUpperCase();
      
    }
    
    public String intToOct(int n){
        return Integer.toOctalString(n);
        
    }
    
    public String intToBin(int n){
        return Integer.toBinaryString(n);
        
    }
    
}
