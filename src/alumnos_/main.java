/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package alumnos_;

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
        Alumno llamadaAlumno = new Alumno(1305, "Guillermo", "Almaguer", "Meléndez", "26-01-2012", 9139981, "", "ISEI", "Sistemas");
        //llamadaAlumno.getLlamadaCarrera().setClave("A100");
        //llamadaAlumno.getLlamadaCarrera().setNombre("ISEI");
        JOptionPane.showMessageDialog(null, "Nombre: " +llamadaAlumno.getNombre() + " " + llamadaAlumno.getApe_pat() + " " + llamadaAlumno.getApe_mat() + "\nCarrera: " + llamadaAlumno.getLlamadaCarrera().getNombre() + "\nMatrícula: " + llamadaAlumno.getMatricula());
        CarreraDAO carreraDAOLlamada = new CarreraDAO();
        Carrera carreraLlamada = new Carrera("ISEI", "Sistemas");
        carreraDAOLlamada.insert(carreraLlamada);
    }
}
