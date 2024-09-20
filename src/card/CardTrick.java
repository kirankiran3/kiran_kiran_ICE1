package card;

import java.util.Random;

/**
 * kiran kiran, Student ID : 991759742
 
 */
public class CardTrick {
    
    public static void main(String[] args) {
        Card[] magicHand = new Card[7];
        Random random = new Random();
        

        for (int i = 0; i < magicHand.length; i++) {
            Card c = new Card();
            c.setValue(random.nextInt(13) + 1); 
            c.setSuit(Card.SUITS[random.nextInt(4)]); 
            magicHand[i] = c; 
        }

        // Create a hard-coded lucky card
        Card luckyCard = new Card();
        luckyCard.setValue(2); 
        luckyCard.setSuit("Clubs"); 
        
      
        boolean found = false;
        for (Card card : magicHand) {
            if (card.equals(luckyCard)) {
                found = true;
                break;
            }
        }

        // Report the result for the lucky card
        if (found) {
            System.out.println("The lucky card is in the magic hand! You win!");
        } else {
            System.out.println("The lucky card is not in the magic hand. Better luck next time!");
        }
    }
}
