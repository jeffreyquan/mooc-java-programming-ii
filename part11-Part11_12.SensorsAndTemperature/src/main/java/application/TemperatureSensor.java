/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package application;

import java.util.Random;

/**
 *
 * @author jeffreyquan
 */
public class TemperatureSensor implements Sensor {
    private boolean on;
    
    public TemperatureSensor() {
       this.on = false;
    }
    
    public boolean isOn() {
        return this.on;
    }
    
    public void setOn() {
        this.on = true;
    }
    
    public void setOff() {
        this.on = false;
    }
    
    public int read() {
        
        if (!isOn()) {
             throw new IllegalStateException("Sensor must be on");
        }
          
        return new Random().nextInt(61) - 30;
    }
}
