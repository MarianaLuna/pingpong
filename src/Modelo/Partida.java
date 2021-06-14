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
public class Partida {
    private int idPartida;
    private int jugador1;
    private int jugador2;
    private int marcadorj1;
    private int marcadorj2;

    public Partida() {
    }

    public Partida(int idPartida, int jugador1, int jugador2, int marcadorj1, int marcadorj2) {
        this.idPartida = idPartida;
        this.jugador1 = jugador1;
        this.jugador2 = jugador2;
        this.marcadorj1 = marcadorj1;
        this.marcadorj2 = marcadorj2;
    }

    public int getIdPartida() {
        return idPartida;
    }

    public void setIdPartida(int idPartida) {
        this.idPartida = idPartida;
    }

    public int getJugador1() {
        return jugador1;
    }

    public void setJugador1(int jugador1) {
        this.jugador1 = jugador1;
    }

    public int getJugador2() {
        return jugador2;
    }

    public void setJugador2(int jugador2) {
        this.jugador2 = jugador2;
    }

    public int getMarcadorj1() {
        return marcadorj1;
    }

    public void setMarcadorj1(int marcadorj1) {
        this.marcadorj1 = marcadorj1;
    }

    public int getMarcadorj2() {
        return marcadorj2;
    }

    public void setMarcadorj2(int marcadorj2) {
        this.marcadorj2 = marcadorj2;
    }
    
    
}
