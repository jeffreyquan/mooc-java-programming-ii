/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package application;

/**
 *
 * @author jeffreyquan
 */
public class StandardSensor implements Sensor {
    private int reading;
    
    public StandardSensor(int reading) {
        this.reading = reading;
    }
    
    public boolean isOn() {
        return true;
    }
    
    public int read() {
        return this.reading;
    }
    
    public void setOff() {
        return;
    }
    
    public void setOn() {
        return;
    }
}
