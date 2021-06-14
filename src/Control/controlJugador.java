/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Control;

import Modelo.Jugador;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author maria
 */
public class controlJugador {
    
    static public void insertarJugador(Jugador Jugador){
        try {
            Modelo.SingleConnection.getInstance().setAutoCommit(false);
            String sql = "Insert into datos_jugador (nickname, score) values (?,?)";
            PreparedStatement preparedStatement = Modelo.SingleConnection.getInstance().prepareStatement(sql);
            preparedStatement.setString(1, Jugador.getNickname());
            preparedStatement.setInt(2, Jugador.getScore());
            
            preparedStatement.execute();
            Modelo.SingleConnection.getInstance().commit(); 
        } catch (SQLException ex) {
            Logger.getLogger(controlJugador.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    public void eliminarJugador(Jugador Jugador){
        
    }
    
    public void actualizarJugador(Jugador Jugador){
        
    }
    public Jugador BuscarJugador(String Username){
        return null;
        
    }
}
