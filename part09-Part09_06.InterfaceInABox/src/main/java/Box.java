
import java.util.ArrayList;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author jeffreyquan
 */
public class Box implements Packable {
    
    private double maxCapacity;
    private ArrayList<Packable> items;
    
    public Box(double maxCapacity) { 
        this.maxCapacity = maxCapacity;
        this.items = new ArrayList<>();
    }
    
    public void add(Packable item) {
        double remaining = this.maxCapacity - this.weight();
        if (item.weight() < remaining) {
            this.items.add(item);
        }
    }
    
    public double weight() {
        double total = 0.0;
        for (Packable item : items) {
            total += item.weight();
        }
        
        return total;
    }
    
    public String toString() {
        return "Box: " + this.items.size() + " items, total weight " + this.weight() + " kg";
    }
}
