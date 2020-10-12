/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package FlightControl.domain;

/**
 *
 * @author jeffreyquan
 */
public class Flight {
    private Airplane airplane;
    private String departureAirportID;
    private String targetAirportID;
 
    public Flight(Airplane airplane, String departureAirportID, String targetAirportID) {
        this.airplane = airplane;
        this.departureAirportID = departureAirportID;
        this.targetAirportID = targetAirportID;
    }
 
    public Airplane getAirplane() {
        return this.airplane;
    }
 
    public String getDepartureAirportID() {
        return this.departureAirportID;
    }
 
    public String getTargetAirportID() {
        return this.targetAirportID;
    }
 
    @Override
    public String toString() {
        return this.airplane.toString() + " (" + this.departureAirportID + "-" + this.targetAirportID + ")";
    }
}
