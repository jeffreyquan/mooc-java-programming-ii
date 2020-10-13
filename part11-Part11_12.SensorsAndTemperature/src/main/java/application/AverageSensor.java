/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package application;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author jeffreyquan
 */
public class AverageSensor implements Sensor {
    
    private List<Sensor> sensors;
    private List<Integer> readings;
    
    public AverageSensor() {
        this.sensors = new ArrayList<>();
        this.readings = new ArrayList<>();
    }
    
    
    public boolean isOn() {
        for (Sensor sensor : sensors) {
            if (sensor.isOn()) {
                return true;
            }
        }
        
        return false;
    }
    
    public void setOn() {
        for (Sensor sensor : sensors) {
            sensor.setOn();
        }
    }
    
    public void setOff() {
        for (Sensor sensor : sensors) {
            sensor.setOff();
        }
    }
    
    public int read() {
        if (this.sensors.size() == 0) {
            throw new IllegalStateException("There are no sensors");
        }
        
        if (!this.isOn()) {
            throw new IllegalStateException("Sensor is off");
        }
        
        int sum =  this.sensors.stream().mapToInt(x -> x.read()).sum();
        int reading = (int) sum / this.sensors.size();
        this.readings.add(reading);
        
        return reading;
    }
    
    
    public void addSensor(Sensor toAdd) {
        this.sensors.add(toAdd);
    }
    
    public List<Integer> readings() {
        return this.readings;
    }    
}
