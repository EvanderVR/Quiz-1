/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controlador;

import Modelo.RegistroCalculadora;
import Vista.GUICalculadora;
import Vista.PanelDatosCalculadora;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.security.Guard;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 *
 * @author evander
 */
public class ManejadorCalcu implements ActionListener{

    private final PanelDatosCalculadora panelDatosCalculadora;
    private final GUICalculadora gUICalculadora;
    private final RegistroCalculadora registroCalculadora;
    
    public ManejadorCalcu(GUICalculadora gUICalculadora, PanelDatosCalculadora panelDatosCalculadora, RegistroCalculadora registroCalculadora) {
        
        this.panelDatosCalculadora=panelDatosCalculadora;
        this.gUICalculadora=gUICalculadora;
        this.registroCalculadora=registroCalculadora;
    }

    @Override
    public void actionPerformed(ActionEvent evento) {
       
    }

    
    
}




