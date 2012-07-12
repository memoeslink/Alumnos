/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package alumnos_;

/**
 *
 * @author Memoeslink
 */
public class Alumno extends Persona implements Bean{
    private int matricula;
    //private  Carrera llamadaCarrera;
    private String clave;

    /**
     * @return the matricula
     */
    public int getMatricula() {
        return matricula;
    }

    /**
     * @param matricula the matricula to set
     */
    public void setMatricula(int matricula) {
        this.matricula = matricula;
    }
    
    public Alumno()
    {
        this.matricula = 0;
        this.nombre = "";
        this.ape_pat = "";
        this.ape_mat = "";
        this.telefono = "";
        this.fecha_nac = "";
        this.dir = "";
        this.clave = "";
    }
    
    public Alumno(int matricula, String nombre, String ape_pat, String ape_mat, String tel, String fecha_nac, String dir, String clave)
    {
        //llamadaCarrera = new Carrera("", "");
        this.matricula = matricula;
        setNombre(nombre);
        setApe_pat(ape_pat);
        setApe_mat(ape_mat);
        this.telefono = tel;
        this.fecha_nac = fecha_nac;
        this.dir = dir;
        this.clave = clave;
        //llamadaCarrera.setClave(clave);
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
}
