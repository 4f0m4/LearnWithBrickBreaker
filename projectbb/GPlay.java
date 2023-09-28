/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package projectbb;

import javax.swing.JFrame;


import java.awt.Color;
import java.awt.event.KeyListener;
import javax.swing.JPanel;
import javax.swing.Timer;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.awt.Graphics2D;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.Rectangle;
import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;

import java.awt.Color;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Rectangle;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import javax.swing.JPanel;
import javax.swing.Timer;

public class GPlay extends JPanel implements KeyListener, ActionListener {

    private boolean play = false;
    private int score = 0;
    private int totalbricks = 21;
    private int c = 0;
    private Timer timer;
    private int delay = 8;
    private int playerX = 310;
    private int ballPosX = 122;
    private int ballPosY = 350;
    private int ballXDir = -1;
    private int ballYDir = -2;
    private GameMap map;
    public int sel;
     public boolean status=true;

    public GPlay() {
        map = new GameMap(3, 7);
        addKeyListener(this);
        setFocusable(true);
        setFocusTraversalKeysEnabled(false);
        timer = new Timer(delay, this);
        timer.start();
    }

    @Override
    public void paint(Graphics g) {
        g.setColor(Color.black);
        g.fillRect(1, 1, 692, 592);
        map.draw((Graphics2D) g);
        g.setColor(Color.blue);
        g.fillRect(0, 0, 3, 591);
        g.fillRect(0, 0, 692, 3);
        g.fillRect(691, 0, 3, 591);
        g.setColor(Color.yellow);//score color
        g.setFont(new Font("serif", Font.BOLD, 25));
        g.drawString("" + score, 590, 30);
        g.setColor(Color.white);//player color
        g.fillRect(playerX, 550, 100, 8);
        g.setColor(Color.green);//ball color
        g.fillOval(ballPosX, ballPosY, 20, 20);
        if (ballPosY > 570) {
            play = false;
            ballXDir = 0;
            ballYDir = 0;
            g.setColor(Color.green);//ending text color
            g.setFont(new Font("serif", Font.BOLD, 35));
            g.drawString("Game Over Score=" + score, 190, 260);
            g.setFont(new Font("serif", Font.BOLD, 25));
            g.drawString("Press enter to restart ", 200, 300);
            g.setFont(new Font("serif", Font.BOLD, 25));
           // g.drawString("Press up or down arrow to go to the topics ", 140, 330);
            
        }
        if (totalbricks == 0) {
            play = false;
            ballYDir = -2;
            ballXDir = -1;
             g.setFont(new Font("serif", Font.BOLD, 35));
            g.drawString("Game Over Score=" + score, 190, 260);
            g.setFont(new Font("serif", Font.BOLD, 25));
            g.drawString("Press enter to restart ", 200, 300);
            g.setFont(new Font("serif", Font.BOLD, 25));
            g.drawString("Press up or down arrow to go to the topics ", 140, 330);
           // g.drawString("wait 5s to go to the chapter again! ", 190, 370);
          
            
        }
        g.dispose();
        
        
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        timer.start();
        if (play) {
            if (new Rectangle(ballPosX, ballPosY, 20, 20).intersects(new Rectangle(playerX, 550, 100, 8))) {
                ballYDir = -ballYDir;
            }
            A:
            for (int i = 0; i < map.map.length; i++) {
                for (int j = 0; j < map.map[0].length; j++) {
                    if (map.map[i][j] > 0) {
                        int brickX = j * map.brickWidth + 150;
                        int brickY = i * map.brickWidth + 50;
                        int bricksWidth = map.brickWidth;
                        int bricksHeight = map.brickHeight;
                        Rectangle rect = new Rectangle(brickX, brickY, bricksWidth, bricksHeight);
                        Rectangle ballrect = new Rectangle(ballPosX, ballPosY, 20, 20);
                        Rectangle brickrect = rect;
                        if (ballrect.intersects(brickrect)) {
                            map.setBrickValue(0, i, j);
                            totalbricks--;
                            c++;

                            if (ballPosX + 19 <= brickrect.x || ballPosX + 1 >= brickrect.x + bricksWidth) {
                                ballXDir = -ballXDir;
                            } 
                            else {
                                ballYDir = -ballYDir;
                            }
                           
                               
                            

                            if (c >= 3 && c % 3 == 0) {
                                 repaint();
                                 Callq b = new Callq();
                                 // b.qset=c/3-1;
                                 int index = (c/3)-1;
                                 // b.cho=sel;                                                        
                                  int f = b.call(sel,index);                              
                                  if (f == 1) 
                                    score += 5; 
                                //  System.out.println(c);
                           }

                                break A;
                            
                        }
                    }
                }
            }
            ballPosX += ballXDir;
            ballPosY += ballYDir;
            if (ballPosX < 0) {
                ballXDir = -ballXDir;
            }
            if (ballPosY < 0) {
                ballYDir = -ballYDir;
            }
            if (ballPosX > 670) {
                ballXDir = -ballXDir;
            }

        }
        repaint();
        
    }

    @Override
    public void keyPressed(KeyEvent e) {
        if (e.getKeyCode() == KeyEvent.VK_RIGHT) {
            if (playerX >= 600) {
                playerX = 600;
            } else {
                moveRight();
            }
        }
        if (e.getKeyCode() == KeyEvent.VK_LEFT) {
            if (playerX < 10) {
                playerX = 10;
            } else {
                moveLeft();
            }
        }
        if (e.getKeyCode() == KeyEvent.VK_ENTER) {
            if (!play) {
                ballPosX = 122;
                ballPosY = 350;
                ballXDir = -1;
                ballYDir = -2;
                score = 0;
                playerX = 310;
                totalbricks = 21;
                c=0;
                map = new GameMap(3, 7);
                repaint();

            }
        }
        if(e.getKeyCode() == KeyEvent.VK_DOWN){
//            GameMain gm =new GameMain();
            //gm.close(1000);
            //gm.game(1000);
            //gm.getgame().setVisible(false);
            status=false;
            Chapter ch = new Chapter();
            ch.main2();
    }
         if(e.getKeyCode() == KeyEvent.VK_UP){
            status=false;
            Chapter ch = new Chapter();
            ch.main2();
    }
    }

    public void moveRight() {
        play = true;
        playerX += 20;
    }

    public void moveLeft() {
        play = true;
        playerX -= 20;
    }

    @Override
    public void keyTyped(KeyEvent e) {
        

    }

    @Override
    public void keyReleased(KeyEvent e) {

    }
    // public  void call(){
    //  Question q = new Question();
    //                        int f = q.qu();
    //                    if (f == 1) {
    //                             score += 5;
    //                    }

    //  }
}

