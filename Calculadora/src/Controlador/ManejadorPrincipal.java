/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controlador;

import Modelo.RegistroCalculadora;
import Vista.GUICalculadora;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/**
 *
 * @author evander
 */
public class ManejadorPrincipal implements ActionListener{

    private RegistroCalculadora  registroCalculadora;
    
    public ManejadorPrincipal(RegistroCalculadora registroCalculadora) {
        
        this.registroCalculadora=registroCalculadora;
    }

    @Override
    public void actionPerformed(ActionEvent evento) {
        
        if(evento.getActionCommand().equals("Salir")){
            System.exit(0);
        }
        
        if(evento.getActionCommand().equals("Calculadora")){
            GUICalculadora gUICalculadora = new GUICalculadora();
            gUICalculadora.init(registroCalculadora);
        }
    }
    
}
