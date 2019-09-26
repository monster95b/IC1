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
public class CardTrick {
    public static void main(String [] args)
    {
    CardGame[] magichand = new CardGame[7];//array of object
    for(int i=0; i<magichand.length; i++){
     
    CardGame c1 = new CardGame();
    c1.setValue(c1.ranValue());
    c1.setSuits(CardGame.SUITS[c1.ranSuit()]);
    
     magichand[i] = c1;
    
    
    }
    for(int i=0; i<magichand.length; i ++ )
    {
        System.out.println(magichand[i].getSuits() + " " + magichand[i].getValue());
        
    }
    }
}

