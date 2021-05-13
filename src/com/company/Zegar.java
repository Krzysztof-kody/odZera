package com.company;

public class Zegar extends Thread{

    public void run(){

        while(true){
            G.x = (int)(Math.random()*300);
            G.y= (int)(Math.random()*300);
            G.panel.repaint();
            try {
                Thread.sleep(900);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }

    }
}
