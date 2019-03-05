package elevens;

//(c) A+ Computer Science
//www.apluscompsci.com
//Name -

import java.util.List;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class Deck
{

	public static final int NUMCARDS = 52;
	public static String[] SUITS = "CLUBS HEARTS DIAMONDS SPADES".split(" ");
	
	private List<Card> cards;
	private int top;

   //make a Deck constructor
   	//refer cards to new ArrayList
   	//set top to the top of the deck 51
   	public Deck()
        {
            cards = new ArrayList<Card>();
            top = -1;
            for(int i=0; i<SUITS.length; i++)
            {
                for(int j=1; j<=13; j++)
                {
                    cards.add(new Card(SUITS[i], j));
                }
            }
        }
   	//loop through all suits
   		//loop through all faces 1 to 13
   			//add a new TwentyOneCard to the deck

        
   
   //make a dealCard() method that returns the top card
        public Card dealCard()
        {
            top++;
            return cards.get(top);
        }
   //write a shuffle() method
   	//use Colletions.shuffle
   	//reset the top card 
        
        public void shuffle()
        {
            Collections.shuffle(cards);
            top=-1;
        }
}