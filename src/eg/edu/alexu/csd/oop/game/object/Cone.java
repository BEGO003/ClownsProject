/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package eg.edu.alexu.csd.oop.game.object;
import java.awt.*;
import java.awt.geom.Ellipse2D;
import java.awt.image.BufferedImage;
import java.util.ArrayList;

import eg.edu.alexu.csd.oop.game.GameObject;
import java.io.IOException;
import java.lang.System.Logger;
import java.lang.System.Logger.Level;
import javax.imageio.ImageIO;

/**
 *
 * @author Jana Gh
 */
public class Cone extends Shape  {
     //   private int x;
    //private int y;
    //boolean visible;
    //public static final int MAX_MSTATE =3;
    //private ArrayList<BufferedImage> images;
    //private BufferedImage[] spriteImages;
    //public static final int diameter = 15;
    // private ArrayList<BufferedImage> images;

    public Cone(int x, int y, Color color,int type, String path) {
       super(x, y, 3,path);
     //   this.images = new ArrayList<>();

     //   this.visible = true;
        //this.images = new ArrayList<BufferedImage>();
      //  this.spriteImages= new BufferedImage[MAX_MSTATE];
      //  try {
      //      spriteImages[0]=ImageIO.read(getClass().getClassLoader().getResourceAsStream(path));
      //      spriteImages[1]=ImageIO.read(getClass().getClassLoader().getResourceAsStream(path));
      //      spriteImages[2]=ImageIO.read(getClass().getClassLoader().getResourceAsStream(path));
      //  } catch (IOException ex) {
     //       Logger.getLogger(Circle.class.getName()).log(Level.SEVERE, null, ex);
      //  }
     //   BufferedImage coneImage = new BufferedImage(diameter, diameter, BufferedImage.TYPE_INT_ARGB);
      //  Graphics2D g2 = coneImage.createGraphics();
     //   g2.setColor(color);
     //   g2.setRenderingHint(RenderingHints.KEY_ANTIALIASING, RenderingHints.VALUE_ANTIALIAS_ON);

        
     //  Ellipse2D.Double circle = new Ellipse2D.Double(0, diameter / 3, diameter, diameter / 3);
      //  g2.fill(circle);

        
       // int[] xPoints = {diameter / 2, 0, diameter}; 
      //  int[] yPoints = {0, diameter / 3, diameter / 3}; 
      //  int nPoints = 3; 
      //  g2.fillPolygon(xPoints, yPoints, nPoints);

      //  g2.dispose();

      //  images.add(coneImage);
    }
    
}

    