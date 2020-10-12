
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
public class ChangeHistory {
    
    private ArrayList<Double> history;

    public ChangeHistory() {
        this.history = new ArrayList<>();
    }
    
    public void add(double status) {
        this.history.add(status);
    }
    
    public void clear() {
        this.history.clear();
    }
    
    public String toString() {
        return this.history.toString();
    }
    
    public double maxValue() {
        if (this.history.isEmpty()) {
            return 0;
        }
        
        double maxValue = this.history.get(0);
        
        for (Double value : this.history) {
            if (maxValue < value) {
                maxValue = value;
            }
        }
        
        return maxValue;    
    }
    
    public double minValue() {
        if (this.history.isEmpty()) {
            return 0;
        }
        
        double minValue = this.history.get(0);
        
        for (int i = 1; i < this.history.size(); i++) {
            double currentValue = this.history.get(i);
            if (currentValue < minValue) {
                minValue = currentValue;
            }
        }
        
        return minValue;   
    }
    
    public double average() {
        if (this.history.isEmpty()) {
            return 0;
        }
        
        double sum = 0.0;
         for (int i = 0; i < this.history.size(); i++) {
            sum += this.history.get(i);
        }
         
        return sum / this.history.size();
    }
    
}
