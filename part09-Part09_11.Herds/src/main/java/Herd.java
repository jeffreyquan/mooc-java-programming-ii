
import java.util.ArrayList;
import java.util.List;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author jeffreyquan
 */
public class Herd implements Movable {
    
    private List<Movable> movables;
    
    public Herd() {
        this.movables = new ArrayList<>();
    }
    
    public void addToHerd(Movable movable) {
        this.movables.add(movable);
    }
    
    public void move(int dx, int dy) {
        for (Movable movable : movables) {
            movable.move(dx, dy);
        }
    }
    
    public String toString() {
        String positions = "";
        for (Movable movable : this.movables) {
            positions += movable.toString() + "\n";
        }
        
        return positions;
    }
}
