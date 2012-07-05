/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package DAO;

/**
 *
 * @author Memoeslink
 */
public class SQL {
    public static String insertarAlumno = "INSERT INTO alumnos(ID_Alumno, Matricula, Nombre, Ape_pat, Ape_mat, Telefono, Fecha_nac, ID_Carrera) VALUES(?, ?, ?, ?, ?, ?, ?, ?)";
    public static String insertarCarrera = "INSERT INTO carrera(ID_Carrera, Clave, Carrera) VALUES(?, ?, ?)";
    public static String findCarrera = "SELECT * FROM carrera WHERE ID_Carrera = ?";
}
