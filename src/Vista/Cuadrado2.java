/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Vista;

/**
 *
 * @author maria
 */

import java.awt.Graphics2D;
import java.awt.Rectangle;
import java.awt.event.KeyEvent;

public class Cuadrado2{
    private static final int x = 874;
    private static final int WIDTH = 10;
    private static final int HEIGHT = 120;

    private Tablero panelito;
    int y=250, velY= 5; 

    public Cuadrado2 (Tablero p){
      this.panelito = p;
    }
    // cuando se deja de presionar se para la Raqueta
    public void keyReleased (KeyEvent e){
              velY = 0;
    }

    public void keyPressed (KeyEvent e){

      if (e.getKeyCode() == KeyEvent.VK_UP) velY = - panelito.velocidad;
      if (e.getKeyCode() == KeyEvent.VK_DOWN) velY = panelito.velocidad;

    }

    // cuidar los bordes
    public void moverRaqueta() {
        if (y + velY > 0 && y+ velY < this.panelito.getHeight()-120) y = y + velY;
    }

    public void pintarRaqueta(Graphics2D g2){

      g2.fillRect(x,y,10,120);

    }

    public Rectangle getBounds (){
      return new Rectangle (x, y, WIDTH, HEIGHT);
    }

    public int getTopY(){

      return x;
    }

}