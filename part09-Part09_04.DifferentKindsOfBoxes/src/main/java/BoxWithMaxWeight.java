
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
public class BoxWithMaxWeight extends Box {
    
    private int capacity;
    private ArrayList<Item> items;
    
    public BoxWithMaxWeight(int capacity) {
        this.capacity = capacity;
        this.items = new ArrayList<>();
    }
    
    public void add(Item item) {
       if (item.getWeight() <= this.capacity - this.weightOfItems()) {
           this.items.add(item);
       }  
    }
    
    public boolean isInBox(Item item) {
        return items.contains(item);
    }
    
    private int weightOfItems() {
        int weight = 0;
        for (Item item : this.items) {
            weight = weight + item.getWeight();
        }
 
        return weight;
    }
    
}
