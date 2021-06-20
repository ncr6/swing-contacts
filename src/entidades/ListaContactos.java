/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package entidades;

import java.util.ArrayList;
import java.util.Collections;
import java.io.*;
/**
 *
 * @author deerfox@debian
 */
public class ListaContactos implements Serializable {
    private ArrayList<Contacto> lista;
    
    public ListaContactos() {
        lista = new ArrayList();
    }
    
    public boolean registrar(Contacto c) {
        lista.add(c);
        Collections.sort(lista);
        return true;
    }
    
}
