/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Vista;

import java.awt.Graphics2D;
import java.awt.Rectangle;

/**
 *
 * @author maria
 */
public class Pelota {
private static final int DIAMETER = 30;
    int x = 300, y = 0, velX = 1, velY = 1;
    private Tablero panelito;

    public Pelota (Tablero xp, int VelX, int VelY){
      this.panelito = xp;
      velX=VelX;
      velY=VelY;
    }

    public void moverBolita (){
      
      boolean cambiarDireccion = true;
      if (y + velY < 0 ) velY = panelito.velocidad;
      //borde derecho
      else if (x + velX > panelito.getWidth () - DIAMETER) this.panelito.gameOver();
      //borde superior
      else if (y + velY < 0 ) velY = panelito.velocidad;
      //borde inferior
      else if (y + velY > panelito.getHeight () - DIAMETER ) velY = - panelito.velocidad/*this.panelito.gameOver()*/;
      //deterctar la collision en la pelora
      //borde izquierdo
      else if (x + velX < 0 ) this.panelito.gameOver();
      
      else if (collision()) {
        velX = + panelito.velocidad;
         x = panelito.r.getTopY()+ DIAMETER;
         panelito.velocidad ++;
      }else if (collision2()) {
        velX = - panelito.velocidad;
         x = panelito.l.getTopY()- DIAMETER;
         panelito.velocidadj2 ++;
      } else {
        cambiarDireccion = false;
      }

      //if (cambiarDireccion) Sonido.BALL.play();

      x = x + velX;
      y = y + velY;

    }

    private boolean collision (){

      return panelito.r.getBounds().intersects(this.getBounds());
      
    }

    private boolean collision2 (){
        return panelito.l.getBounds().intersects(this.getBounds());
    }
    public void pintarBolita (Graphics2D g2){

      g2.fillOval(x,y,DIAMETER,DIAMETER);

    }

    public Rectangle getBounds (){

      return new Rectangle(x,y,DIAMETER,DIAMETER);
    }

}	
    

