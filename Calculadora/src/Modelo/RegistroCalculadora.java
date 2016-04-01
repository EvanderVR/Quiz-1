/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Modelo;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 *
 * @author evander
 */
public class RegistroCalculadora {
    
    private final static String suma = "(//d+)//+(//d+)=(//d+)";
    private final static String resta = "(//d+)//-(//d+)=(//d+)";
    private final static String mult = "(//d+)//*+(//d+)=(//d+)";
    private final static String div = "(//d+)//*(//d+)==(//d+)";
    
    public boolean validaSuma (String cadena){

        Pattern pattern = Pattern.compile(suma, Pattern.CASE_INSENSITIVE);
        Matcher matcher = pattern.matcher(cadena);
        return matcher.find();
    }
    
    public boolean validaResta (String cadena){

        Pattern pattern = Pattern.compile(resta, Pattern.CASE_INSENSITIVE);
        Matcher matcher = pattern.matcher(cadena);
        return matcher.find();
    }
    
    public boolean validaMult (String cadena){

        Pattern pattern = Pattern.compile(mult, Pattern.CASE_INSENSITIVE);
        Matcher matcher = pattern.matcher(cadena);
        return matcher.find();
    }
    
    public boolean validaDiv (String cadena){

        Pattern pattern = Pattern.compile(div, Pattern.CASE_INSENSITIVE);
        Matcher matcher = pattern.matcher(cadena);
        return matcher.find();
    }
    
}
