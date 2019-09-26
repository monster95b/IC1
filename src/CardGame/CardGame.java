/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package CardGame;

/**
 *
 * @author vineet
 */
public class CardGame {
    public static final String[] SUITS = {"clubs","hearts","diamonds","spades"};
 private String suits; // spades,dimonds,clubs,hearts
    private int value;
    
    /**
     * @return the suits
     */
    public String getSuits() {
        return suits;
    }

    /**
     * @param suits the suits to set
     */
    public void setSuits(String suits) {
        this.suits = suits;
    }

    /**
     * @return the value
     */
    public int getValue() {
        return value;
    }

    /**
     * @param value the value to set
     */
    public void setValue(int value) {
        this.value = value;
    }
   

        
public int ranSuit()
{
int value = (int)(Math.random()*4)+0;
return value;
}

public int ranValue()
{
int value = (int)(Math.random() * 13) +1;
return value;
}

}