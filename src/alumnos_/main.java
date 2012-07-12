/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package alumnos_;

import DAO.AlumnoDAO;
import DAO.CarreraDAO;
import javax.swing.JOptionPane;

/**
 *
 * @author Memoeslink
 */
public class main {
    
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Alumno llamadaAlumno = new Alumno(1, "Guillermo", "Almaguer", "Meléndez", "9139981", "26/01/2012", "", "ISEI");
        //llamadaAlumno.getLlamadaCarrera().setClave("A100");
        //llamadaAlumno.getLlamadaCarrera().setNombre("ISEI");
        JOptionPane.showMessageDialog(null, "Nombre: " +llamadaAlumno.getNombre() + " " + llamadaAlumno.getApe_pat() + " " + llamadaAlumno.getApe_mat() + "\nCarrera: " + llamadaAlumno.getClave());
        CarreraDAO carreraDAOLlamada = new CarreraDAO();
        AlumnoDAO alumnoDAOLlamada = new AlumnoDAO();
        Carrera carreraLlamada = new Carrera("ISEI", "Sistemas");
        carreraDAOLlamada.insert(carreraLlamada);
        alumnoDAOLlamada.insert(llamadaAlumno);
        //Busca alumno por ID y pone el nombre
        alumnoDAOLlamada.select();
                
        //Busca carrera por clave y pone el nombre
        carreraDAOLlamada.select();
    }
}
