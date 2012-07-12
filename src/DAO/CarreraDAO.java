/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package DAO;

import alumnos_.Alumno;
import alumnos_.Bean;
import alumnos_.Carrera;
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
public class CarreraDAO implements OperacionesDAO{

    @Override
    public ArrayList select() {
        String a = "";
        Scanner scantool = new Scanner(System.in);
        System.out.println("Clave de carrera: ");
        a = scantool.nextLine();
        ArrayList mi_lista = new ArrayList();
        Carrera carreraCall = new Carrera();
        Connection conexion = DAOFactory.getConexion();

        try {
            Statement llamada = (Statement) conexion.createStatement();
            ResultSet query = llamada.executeQuery(SQL.findCarrera.concat(a + "'"));
            while(query.next())
            {
                System.err.println("Carrera: " + query.getString("Carrera"));
                mi_lista.add(new Carrera(query.getString("Clave"), query.getString("Carrera")));
            }
        } catch (SQLException ex) {
            System.out.println(ex);
            
        }
        return mi_lista;
    }

    @Override
    public int insert(Bean bean) {
        Carrera carrera = (Carrera) bean;
        Connection conexion = DAOFactory.getConexion();
        PreparedStatement ps = null;
        try {
            ps = (PreparedStatement) conexion.prepareCall(SQL.insertarCarrera);
            ps.setString(1, carrera.getClave());
            ps.setString(2, carrera.getNombre());
            ps.executeUpdate();
        } catch (SQLException ex) {
            Logger.getLogger(CarreraDAO.class.getName()).log(Level.SEVERE, null, ex);
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
