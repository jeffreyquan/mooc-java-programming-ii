/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author jeffreyquan
 */
public class Student extends Person {
    
    private int studyCredits;
    
    public Student(String name, String address) {
        super(name, address);
    }
    
    public void study() {
        this.studyCredits++;
    }
    
    public int credits() {
        return this.studyCredits;
    }
    
    public String toString() {
        return super.toString() + "\n  Study credits " + this.credits();
    }
    
}
