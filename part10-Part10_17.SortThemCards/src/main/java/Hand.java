
import java.util.ArrayList;
import java.util.Collections;
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
public class Hand implements Comparable<Hand> {
    
    private List<Card> cards;
    
    public Hand() {
        this.cards = new ArrayList<>();
    }
    
    public void add(Card card) {
       this.cards.add(card);
    }
    
    public void print() {
        this.cards.stream().forEach(card -> System.out.println(card));
    }
    
    public void sort() {
        Collections.sort(cards);
    }
    
    public int sumOfValues() {
        return this.cards.stream().mapToInt(card -> card.getValue()).sum();
    }
    
    public int compareTo(Hand hand) {
        return this.sumOfValues() - hand.sumOfValues();
    }
    
    public void sortBySuit() {
        Collections.sort(this.cards, new BySuitInValueOrder());
    }
    
}
