/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package eg.edu.alexu.csd.oop.game.object;

///package GameObjects.Shapes;

//import GameObjects.GameObject;

import java.awt.*;
import java.awt.image.BufferedImage;
import java.util.ArrayList;
/**
 *
 * @author Jana Gh
 */
public class Square extends Shape{

private int x;
    private int y;

    boolean visible;
    public static final int MAX_MSTATE =3;
    //private ArrayList<BufferedImage> images;
    private BufferedImage[] spriteImages;
    
    public Square(int x, int y, String path) {
        super();
        this.x = x;
        this.y = y;

        this.visible = true;
        //this.images = new ArrayList<BufferedImage>();
        this.spriteImages= new BufferedImage[MAX_MSTATE];
        try {
            spriteImages[0]=ImageIO.read(getClass().getClassLoader().getResourceAsStream(path));
            spriteImages[1]=ImageIO.read(getClass().getClassLoader().getResourceAsStream(path));
            spriteImages[2]=ImageIO.read(getClass().getClassLoader().getResourceAsStream(path));
        } catch (IOException ex) {
            Logger.getLogger(Circle.class.getName()).log(Level.SEVERE, null, ex);
        }
       
    }
    }

 

 


}