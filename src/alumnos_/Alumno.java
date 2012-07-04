/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package alumnos_;

/**
 *
 * @author Memoeslink
 */
public class Alumno extends Persona{
    String carrera;
    private int matricula;
    private  Carrera llamadaCarrera;

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
    
    public String getCarrera()
    {
        return carrera;
    }
    
    public void setCarrera(String carrera)
    {
        this.carrera = carrera;
    }
    
    public Alumno()
    {
        carrera = "";
        matricula = 0;
    }
    
    public Alumno(int matricula, String nombre, String ape_pat, String ape_mat, String fecha_nac, long tel, String dir)
    {
        llamadaCarrera = new Carrera(0, "");
        this.matricula = matricula;
        setNombre(nombre);
        setApe_pat(ape_pat);
        setApe_mat(ape_mat);
        setTelefono(telefono);
        setDir(dir);
    }

    /**
     * @return the llamadaCarrera
     */
    public Carrera getLlamadaCarrera() {
        return llamadaCarrera;
    }
}
