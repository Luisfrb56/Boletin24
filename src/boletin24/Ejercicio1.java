
package boletin24;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;


public class Ejercicio1 implements ActionListener{
    
    JFrame marco;
    JPanel panel;
    JButton bDebux,bLimpa;
    JTextField mostra;
    JLabel cir;
    boolean dibujar =false;
    public Ejercicio1() {
        
        marco=new JFrame("Ejercicio 3");
        panel=new JPanel();
        bDebux=new JButton("Debuxa");
        bLimpa=new JButton("Limpa");
        cir=new JLabel("Circulos: ");
        mostra=new JTextField(8);
        marco.setSize(800, 400);
        panel.add(bDebux);
        panel.add(bLimpa);
        panel.add(cir);
        panel.add(mostra);
        marco.add(panel);
        bDebux.addActionListener(this);
        bLimpa.addActionListener(this);
        marco.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        marco.setLocationRelativeTo(marco);
        marco.setVisible(true);
        
    }
    
    @Override
    public void actionPerformed(ActionEvent e) {
        Graphics g = panel.getGraphics();
        Object boton=e.getSource();
        if(boton==bDebux){
           g.setColor(Color.RED);
            int circulos=Integer.parseInt(mostra.getText());
            for(int i=0;i<circulos;i++){
                int x1= (int) (Math.random()*100)+60;
                int y1= (int) (Math.random()*100)+80;
                g.drawOval(x1, y1, 200, 200);
            }
        }else if(boton==bLimpa){
            panel.paint(g);
        }
        
        }
}
