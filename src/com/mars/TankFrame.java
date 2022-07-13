package com.mars;

import java.awt.*;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

public class TankFrame extends Frame {
    int x =200, y=300;

    public TankFrame(){
        setVisible(true);
        setSize(800,600);
       setResizable(true);
       setTitle("Tank war");
       //监听键盘事件
       addKeyListener(new MyKeylister());
       addWindowListener(new WindowAdapter() {
            @Override
            public void windowClosing(WindowEvent e) {
                System.exit(0);
            }
        });
    }

    @Override
    public void paint(Graphics g) {
        System.out.println("paint");
        g.fillRect(x,y,50,40);
        x +=10;
        y +=10;
       // g.draw3DRect();

    }
    class MyKeylister extends KeyAdapter{

        @Override
        public void keyPressed(KeyEvent e) {
            System.out.println("按下键盘");
        }

        @Override
        public void keyReleased(KeyEvent e) {
            System.out.println("释放键盘");
        }
    }
}
