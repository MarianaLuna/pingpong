/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Modelo;

/**
 *
 * @author maria
 */
public class Jugador {
    private int idJugador;
    private String nickname;
    private int score;

    public Jugador() {
    }

    public Jugador(int idJugador, String nickname, int score) {
        this.idJugador = idJugador;
        this.nickname = nickname;
        this.score = score;
    }

    public int getIdJugador() {
        return idJugador;
    }

    public void setIdJugador(int idJugador) {
        this.idJugador = idJugador;
    }

    public String getNickname() {
        return nickname;
    }

    public void setNickname(String nickname) {
        this.nickname = nickname;
    }

    public int getScore() {
        return score;
    }

    public void setScore(int score) {
        this.score = score;
    }
    
    
}
