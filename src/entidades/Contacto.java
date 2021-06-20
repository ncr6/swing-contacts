package entidades;

import java.io.Serializable;

/**
 *
 * @author deerfox@debian
 */

public class Contacto implements Serializable, Comparable<Contacto> {

    private String apellido;
    private String nombre;
    private String fijo;
    private String celular;
    private String correo;
    
    public Contacto(){}
    
    public Contacto(String apellido, String nombre, String fijo,
                    String celular, String correo) {
        this.apellido = apellido;
        this.nombre = nombre;
        this.fijo = fijo;
        this.celular = celular;
        this.correo = correo;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getFijo() {
        return fijo;
    }

    public void setFijo(String fijo) {
        this.fijo = fijo;
    }

    public String getCelular() {
        return celular;
    }

    public void setCelular(String celular) {
        this.celular = celular;
    }

    public String getCorreo() {
        return correo;
    }

    public void setCorreo(String correo) {
        this.correo = correo;
    }
    
    @Override
    public int compareTo(Contacto otroContacto) {
        return this.getApellido().compareTo(otroContacto.getApellido());
    }
}
