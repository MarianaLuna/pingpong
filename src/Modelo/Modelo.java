/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/*package Modelo;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Vector;
/**
 *
 * @author maria
 */
/*public class Modelo {
    
    public ResultSet getResultSetScrollable (int idJugador){
        ResultSet r = null;
        Connection c = null;
        
        c = SingleConnection.getInstance();
        
        System.out.print("entro al getResultSet");
        try{
            Statement s = c.createStatement(ResultSet.TYPE_SCROLL_INSENSITIVE, ResultSet.CONCUR_READ_ONLY);
            String query = "SELECT * FROM mydb.pingpong where idJugador="+idJugador;
            
            r = s.executeQuery(query);
        }catch(SQLException e){
            System.out.print(e);
        }
        return r;
    }
    
    public Vector getJugadores(){
        Vector jugadores = null;
        Connection c = null;
        
        c = SingleConnection.getInstance();
        
        jugadores = new Vector();
        
        //jugadores.add(new Jugador(-1,"")); 
    return jugadores;
    }
    
    
}
*/