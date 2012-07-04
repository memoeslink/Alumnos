/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package alumnos_;

/**
 *
 * @author Memoeslink
 */
public class Persona {
    String nombre, ape_pat, ape_mat, fecha_nac;
    long telefono;
    String dir;
    
    public long getTelefono()
    {
        return telefono;
    }
    
    public void setTelefono(long telefono)
    {
        this.telefono = telefono;
    }
    
    public String getDir()
    {
        return dir;
    }
    
    public void setDir(String dir)
    {
        this.dir = dir;
    }
    
    public String getNombre()
    {
        return nombre;
    }
    
    public void setNombre(String nombre)
    {
        this.nombre = nombre;
    }
    
    public String getApe_pat()
    {
        return ape_pat;
    }
    
    public void setApe_pat(String ape_pat)
    {
        this.ape_pat = ape_pat;
    }
    
    public String getApe_mat()
    {
        return ape_mat;
    }
    
    public void setApe_mat(String ape_mat)
    {
        this.ape_mat = ape_mat;
    }
    
    public String getFecha_nac()
    {
        return fecha_nac;
    }
    
    public void setFecha_nac(String fecha_nac)
    {
        this.fecha_nac = fecha_nac;
    }
    
    public Persona(String nombre, String ape_pat, String ape_mat, String fecha_nac, long telefono, String dir)
    {
        this.nombre = nombre;
        this.ape_pat = ape_pat;
        this.ape_mat = ape_mat;
        this.fecha_nac = fecha_nac;
        this.telefono = telefono;
        this.dir = dir;
    }
    
    public Persona()
    {
        this.nombre = "";
        this.ape_pat = "";
        this.ape_mat = "";
        this.fecha_nac = "";
        this.telefono = 0;
        this.dir = "";
    }
}
