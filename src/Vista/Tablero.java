/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Vista;

import java.awt.Color;
import java.awt.Font;
import java.awt.Graphics;
import javax.swing.JPanel;
import java.awt.Graphics2D;
import java.awt.RenderingHints;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import javax.swing.JOptionPane;

/**
 *
 * @author maria
 */


public class Tablero extends JPanel{
    
    Cuadrado r = new Cuadrado (this);
    Cuadrado2 l = new Cuadrado2 (this);
    int velocidad = 1 ;
    int velocidadj2 = 1;
    
    String Jugador1=null;
    String Jugador2=null;
    
    //obtiene una cantidad de puntos
    private int getPuntos(){
        return velocidad - 1;
    }
    private int getPuntosJ2(){
        return velocidadj2 - 1;
    }

    public Tablero () {

      this.addKeyListener (new KeyListener () {

        public void keyTyped (KeyEvent e){}

        public void keyPressed (KeyEvent e) {
            r.keyPressed(e);
            l.keyPressed(e);
        }

        public void keyReleased (KeyEvent e) {
            r.keyReleased(e);
            l.keyReleased(e);
        }

      });
      
      this.setFocusable(true);
      //Sonido.BACK.loop();
    }

    public void moverPelota (){
        if (Ventana.bandera == 1){
            Ventana.pelota.moverBolita();
            r.moverRaqueta();
            l.moverRaqueta();
            
        }
    }
    
    public void setNombres(String j1, String j2){
        this.Jugador1 = j1;
        this.Jugador2 = j2;
    }
    
    public void paintComponent (Graphics g){
      super.paintComponent(g);
      Graphics2D g2 = (Graphics2D)g;
      g2.setColor(Color.BLUE);
      g2.setRenderingHint(RenderingHints.KEY_ANTIALIASING, RenderingHints.VALUE_ANTIALIAS_ON);
      if (Ventana.bandera == 1){
        Ventana.pelota.pintarBolita(g2);
        r.pintarRaqueta(g2);
        l.pintarRaqueta(g2);
      }
      //puntaje
      g2.setColor(Color.GRAY);
      g2.setFont(new Font("Verdana", Font.BOLD, 20));
      g2.drawString ( Jugador1 +" - " +String.valueOf(getPuntos()) ,10,30);
      g2.drawString ( Jugador2 +" - " +String.valueOf(getPuntosJ2()) ,720,30);
      
    }

    public void gameOver(){
      //Sonido.BACK.stop();
      //Sonido.GAMEOVER.play();
      JOptionPane.showMessageDialog (this,Jugador1+" tu puntaje es : " + getPuntos()+"\n"+Jugador2+" tu puntaje es : "+ getPuntosJ2() ," GAME-OVER ", JOptionPane.YES_NO_OPTION);
      System.exit(ABORT);
    }
}