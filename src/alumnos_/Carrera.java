/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package alumnos_;

/**
 *
 * @author Memoeslink
 */
public class Carrera {
    private int clave;
    private String nombre;
    
    public Carrera(int clave, String nombre)
    {
        this.clave = clave;
        this.nombre = nombre;
    }
    
    /**
     * @return the clave
     */
    public int getClave() {
        return clave;
    }

    /**
     * @param clave the clave to set
     */
    public void setClave(int clave) {
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
