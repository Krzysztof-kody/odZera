package com.company;

import javax.swing.*;

public class G {
    public static JFrame okno = new JFrame("odZera");
    public static Panel panel = new Panel();
    public static Zegar zegar = new Zegar();
    public static int x;
    public static int y;

    public static void start(){
        okno.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        okno.setBounds(300,200, 600,600);
        okno.add(panel);
        zegar.start();
    }

}
