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
    public static final String filename = "contactos.data";
    
    public ListaContactos() {
        if (!leer()){
            lista = new ArrayList();
        }
    }
    
    public ArrayList<Contacto> getLista() {
        return lista;
    }

    public void setLista(ArrayList<Contacto> lista) {
        this.lista = lista;
    }
    
    public Contacto registrar(Contacto c) {
        lista.add(c);
        Collections.sort(lista);
        if (guardar()){
            return c;
        } else {
            return null;
        }
    }
    
    public boolean guardar() {
        try {
            Collections.sort(lista);        
            FileOutputStream fos = new FileOutputStream("contactos.data");
            ObjectOutputStream oos = new ObjectOutputStream(fos);
            oos.writeObject(lista);
            oos.flush();
            oos.close();
            return true; 
        } catch (IOException e) {
            e.printStackTrace();
            return false;
        }
    }
    
    private boolean leer() {
        File f = new File(filename);
        if (f.exists()){
            try {     
                ObjectInputStream ois = new ObjectInputStream(new FileInputStream("contactos.data"));         
                lista = (ArrayList<Contacto>)ois.readObject();
                ois.close();
                return true;
            } catch (IOException e) {
                System.out.println("Excepcion de E/S: " + e);
                return false;
            } catch (ClassNotFoundException e) {
                e.printStackTrace();
                return false;
            }
        } else {
            try {
                f.createNewFile();
            } catch (Exception e) {
                e.printStackTrace();
            } finally {
                return false;
            }
        }     
    }
    
    public ArrayList<Contacto> leerArr() {
        File f = new File(filename);
        ArrayList miLista = new ArrayList();
        if (f.exists()){
            try {     
                ObjectInputStream ois = new ObjectInputStream(new FileInputStream("contactos.data"));         
                miLista = (ArrayList<Contacto>)ois.readObject();
                ois.close();
            } catch (IOException e) {
                e.printStackTrace();
            } catch (ClassNotFoundException e) {
                e.printStackTrace();
            }
        } else {
            try {
                f.createNewFile();
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
        return miLista;
    }
}
