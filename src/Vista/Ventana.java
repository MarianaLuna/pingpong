/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Vista;

import java.awt.Color;
import java.awt.event.*;
import javax.swing.JFrame;
import java.awt.Dimension;
import javax.swing.JButton;
import javax.swing.JOptionPane;

/**
 *
 * @author maria
 */
public class Ventana extends JFrame implements ActionListener{
static Pelota pelota;	
Tablero pa;
JButton jb1;
JButton jb2;
JButton jb3;
JButton jb4;
static int bandera=0;
int vel;
String j1;
String j2;
Modelo.Jugador Jugador;
  public Ventana (){
      this.setSize (900,600);
      
      pa = new Tablero();
      pa.setBackground(Color.WHITE);
      this.add(pa);
      j1 = JOptionPane.showInputDialog("Introduzca Jugador 1:");
      j2 = JOptionPane.showInputDialog("Introduzca Jugador 2:");
      String stringVel = JOptionPane.showInputDialog("Introduzca la velocidad:");
      vel = Integer.parseInt(stringVel);
      jb1 = new JButton("Iniciar");
      jb1.setBounds(50, 20, 100, 30);
      jb2 = new JButton("Crea Jugador");
      jb2.setBounds(50, 20, 150, 30);
      jb3 = new JButton("Elimina Jugador");
      jb3.setBounds(50, 20, 200, 30);
      jb4 = new JButton("Historial de Partidas");
      jb4.setBounds(50, 20, 250, 30);
      pa.add(jb1); 
      pa.add(jb2); 
      pa.add(jb3); 
      pa.add(jb4); 
      pa.setNombres(j1, j2);
      this.setVisible(true);
      this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
      jb1.addActionListener(this);
      
      
      while(true){
        pa.moverPelota();
        pa.repaint();
        pa.updateUI();   
        try{
        Thread.sleep(10);
            }catch (InterruptedException e){
            System.out.println(e);
        }
      }

  }

    @Override
    public void actionPerformed(ActionEvent e) {
      if (e.getSource()==jb1) {
        bandera = 1;
      pelota = new Pelota(pa, vel, vel);
      
      jb1.setVisible(false);
      pa.updateUI();      
      }
      
      if (e.getSource()==jb2) {
            Modelo.Jugador Jugador = new Modelo.Jugador();
            Jugador.setNickname(j1);
            Jugador.setScore(3);
            
            Control.controlJugador.insertarJugador(Jugador);
      }
      if (e.getSource()==jb3) {
             
      }
      if (e.getSource()==jb4) {
            
      }
    }
}