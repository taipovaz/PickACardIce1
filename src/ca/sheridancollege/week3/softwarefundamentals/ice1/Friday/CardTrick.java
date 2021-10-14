
package ca.sheridancollege.week3.softwarefundamentals.ice1.Friday;

/**
 *
 * @author Ronak
 */
package pickacard;


import java.util.Random;
import java.util.Scanner;

public class CardTrick {
  
   public static void main(String[] args) {

       Card[] magicHand = new Card[7];
       Random ran = new Random();
       for(int i=0;i<magicHand.length;i++)
       {
           Card c = new Card();
          
           c.setValue(ran.nextInt(13)+1); // randomly generate a value between [1,13]
           c.setSuit(Card.SUITS[ran.nextInt(4)]); // randomly generate a number between [0,3] and get the String stores in SUITS array in that index
           magicHand[i] = c; // set ith card of magicHand to c
       }
      
       boolean found = false;
       // create a luckyCard
       Card luckyCard = new Card();
       luckyCard.setValue(9);
       luckyCard.setSuit(Card.SUITS[2]);
      
       // loop to determine if luckyCard is present in magicHand
       for(int i=0;i<magicHand.length;i++)
       {
           if(magicHand[i].getValue() == luckyCard.getValue() && magicHand[i].getSuit().equalsIgnoreCase(luckyCard.getSuit()))
           {
               found = true;
               break;
           }
       }
      
       // display the result based on the search
       if(found)
           System.out.println("Lucky card found in magicHand");
       else
           System.out.println("Lucky card not found in magicHand");
   }

}
