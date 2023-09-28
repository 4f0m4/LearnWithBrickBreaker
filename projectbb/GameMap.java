/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package projectbb;



import java.awt.Color;
import java.awt.Graphics2D;
import java.awt.BasicStroke;

import java.awt.BasicStroke;
import java.awt.Color;
import java.awt.Graphics2D;

public class GameMap {

    public int map[][];
    public int brickWidth;
    public int brickHeight;

    public GameMap(int row, int col) {
        map = new int[row][col];
        for (int map1[] : map) {
            for (int j = 0; j < map[0].length; j++) {
                map1[j] = 1;
            }
        }
        brickWidth = 340 / col;
        brickHeight = 140 / row;
    }

    public void draw(Graphics2D g) {
        for (int i = 0; i < map.length; i++) {
            for (int j = 0; j < map[0].length; j++) {
                if (map[i][j] > 0) {
                    g.setColor(Color.red);//brick color
                    g.fillRect(j * brickWidth + 150, i * brickHeight + 50, brickWidth, brickHeight);
                    g.setStroke(new BasicStroke(3));
                    g.setColor(Color.black);//stroke
                    g.drawRect(j * brickWidth + 150, i * brickHeight + 50, brickWidth, brickHeight);
                }
            }
        }
    }

    public void setBrickValue(int value, int row, int col) {
        map[row][col] = value;
    }
}

