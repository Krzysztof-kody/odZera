package com.company;

import javax.swing.*;
import java.awt.*;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

public class Panel extends JPanel implements MouseListener {

    public Panel(){
        addMouseListener(this);
    }

    @Override
    public void paintComponent(Graphics g){
        super.paintComponent(g);
        g.fillRect(G.x,G.y,100,100);
    }

    @Override
    public void mouseClicked(MouseEvent e) {
        if(e.getY()>G.y && e.getY() < G.y + 100)
            if(e.getX()>G.x && e.getX() < G.x + 100){
                System.out.println("trafiony");
            }

    }

    @Override
    public void mousePressed(MouseEvent e) {

    }

    @Override
    public void mouseReleased(MouseEvent e) {

    }

    @Override
    public void mouseEntered(MouseEvent e) {

    }

    @Override
    public void mouseExited(MouseEvent e) {

    }
}
