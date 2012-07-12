/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package DAO;

import alumnos_.Alumno;
import alumnos_.Bean;
import com.mysql.jdbc.Statement;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Memoeslink
 */
public class AlumnoDAO implements OperacionesDAO{

    @Override
    public ArrayList select() {
        int a = 1;
        Scanner scantool = new Scanner(System.in);
        System.out.println("Matrícula de alumno: ");
        try
        {
            a = Integer.parseInt(scantool.nextLine());
        }
        catch(NumberFormatException error)
        {
            System.out.println("\n Error: " + error.getMessage());
            a = 0;
        }
        
        ArrayList mi_lista = new ArrayList();
        Alumno alumnoCall = new Alumno();
        Connection conexion = DAOFactory.getConexion();

        try {
            Statement llamada = (Statement) conexion.createStatement();
            ResultSet query = llamada.executeQuery(SQL.findAlumno);
            int b;
            while(query.next())
            {
                b = query.getInt("Matricula");
                if(a==b)
                {
                    System.err.println("Nombre: " + query.getString("Nombre") + " " + query.getString("Ape_pat") + " " + query.getString("Ape_mat"));
                }
                mi_lista.add(new Alumno(query.getInt("Matricula"), query.getString("Nombre"), query.getString("Ape_pat"), query.getString("Ape_mat"), query.getString("Telefono"), query.getString("Fecha_nac"), query.getString("Direccion"), query.getString("Clave")));
            }
        } catch (SQLException ex) {
            System.out.println(ex);
        }
        
        return mi_lista;
    }

    @Override
    public int insert(Bean bean) {
        Alumno alumno = (Alumno) bean;
        Connection conexion = DAOFactory.getConexion();
        PreparedStatement ps2 = null;
        try {
            ps2 = (PreparedStatement) conexion.prepareCall(SQL.insertarAlumno);
            ps2.setInt(1, alumno.getMatricula());
            ps2.setString(2, alumno.getNombre());
            ps2.setString(3, alumno.getApe_pat());
            ps2.setString(4, alumno.getApe_mat());
            ps2.setString(5, alumno.getTelefono());
            ps2.setString(6, alumno.getFecha_nac());
            ps2.setString(7, alumno.getDir());
            ps2.setString(8, alumno.getClave());
            ps2.executeUpdate();
        } catch (SQLException ex) {
            Logger.getLogger(AlumnoDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
        return 1;
    }

    @Override
    public boolean delete(int id) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public boolean update(Bean bean) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public Bean find(int id) {
        throw new UnsupportedOperationException("Not supported yet.");
    }
    
}
