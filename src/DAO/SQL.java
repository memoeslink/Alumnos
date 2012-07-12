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
    public static String insertarAlumno = "INSERT INTO alumnos(Matricula, Nombre, Ape_pat, Ape_mat, Telefono, Fecha_nac, Direccion, Clave) VALUES(?, ?, ?, ?, ?, ?, ?, ?)";
    public static String insertarCarrera = "INSERT INTO carrera(Clave, Carrera) VALUES(?, ?)";
    public static String findCarrera = "SELECT * FROM carrera WHERE Clave = '";
    public static String findAlumno = "SELECT * FROM alumnos";
}
