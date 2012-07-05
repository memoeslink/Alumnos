/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package alumnos_;

/**
 *
 * @author Memoeslink
 */
public class Carrera implements Bean{
    private String clave;
    private String nombre;
    
    public Carrera(String clave, String nombre)
    {
        this.clave = clave;
        this.nombre = nombre;
    }

    public Carrera() {
        this.clave = "";
        this.nombre = "";
    }
    
    /**
     * @return the clave
     */
    public String getClave() {
        return clave;
    }

    /**
     * @param clave the clave to set
     */
    public void setClave(String clave) {
        this.clave = clave;
    }

    /**
     * @return the nombre
     */
    public String getNombre() {
        return nombre;
    }

    /**
     * @param nombre the nombre to set
     */
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
}
