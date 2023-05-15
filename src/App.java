import processing.core.*;
import java.util.*;

public class App extends PApplet {
    // Spaceship s;
    ArrayList<Bomb> bombs;
    ArrayList<Spaceship> ships;
    public static void main(String[] args)  {
        PApplet.main("App");
    }

    public void settings(){
        size(800, 600);
    }

    public void setup(){
        bombs = new ArrayList<>();
        ships = new ArrayList<>();
        // s = new Spaceship(this, 100, 100);
    }

    public void draw(){
        background(190);
        // s.display();
        // s.moveX();
        if(random(100) < 20){
            for(Spaceship s : ships){
                bombs.add(s.createBomb());
            }
            
        }

        for(Spaceship s : ships){
            s.moveX();
            s.display();
        }
        

        for(Bomb b : bombs){
            b.display();
            b.explode();
            
        }
    }

    public void mousePressed(){
        Spaceship temp = new Spaceship(this, mouseX, mouseY);
        ships.add(temp);

    }



}
