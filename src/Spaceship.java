import java.util.ArrayList;

import processing.core.*;

public class Spaceship {

    private PApplet parent;
    private int pilotColor;
    private int bodyColor;
    private int centerX;
    private int centerY;
    private int direction;
    private int pilotSize;
    private int bodyWidth;
    private int bodyHeight;
    private int speed;
    


    public Spaceship(PApplet p, int cX, int cY){
        direction = 1;
        parent = p;
        centerX = cX;
        centerY = cY;
        pilotColor = randomColor();
        bodyColor = randomColor();
        pilotSize = 40;
        bodyWidth = 100;
        bodyHeight = 40;
        speed = 5;
    }

    private int randomColor(){
        return parent.color(parent.random(255), parent.random(255), parent.random(255));
    }

    public void moveX(){
        centerX += speed * direction;
        if(centerX + bodyWidth/2 >= parent.width || centerX <= 0){
            direction *= -1;
        }
    }

    public Bomb createBomb(){
        Bomb temp = new Bomb(parent, centerX, centerY);
        return temp;
    }


    public void display(){
        
        
       
        parent.fill(bodyColor);
        parent.ellipse(centerX, centerY + bodyHeight/2, bodyWidth, bodyHeight);

        parent.fill(pilotColor);
        parent.ellipse(centerX, centerY, pilotSize, pilotSize);

    }




    
}
