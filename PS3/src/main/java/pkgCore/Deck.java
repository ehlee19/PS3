package pkgCore;

import java.util.ArrayList;
import java.util.Collections;


import pkgEnum.eRank;
import pkgEnum.eSuit;
import pkgException.DeckException;

public class Deck {

	private ArrayList<Card> cardsInDeck = new ArrayList<Card>();

	public Deck() {
		for (eSuit eSuit : eSuit.values()) {
			for (eRank eRank : eRank.values()) {
				cardsInDeck.add(new Card(eSuit, eRank));
			}
		}
		Collections.shuffle(cardsInDeck);
	}

	public Card Draw() throws DeckException {
		if (this.cardsInDeck.size() == 0) {
			
			throw new DeckException(this);
		}
		return cardsInDeck.remove(0);
	}
		
	public Card Draw(eSuit eSuit) {
		for (Card card: this.cardsInDeck) {
			
			if (card.geteSuit() == eSuit) {
				cardsInDeck.remove(card); 
				
				return card;
				}
			}
		
	return null;
	}
	
	public Card Draw(eRank eRank) {
		
		for (Card card: this.cardsInDeck) {
			if (card.geteRank() == eRank) {
				cardsInDeck.remove(card); 
				
				return card;
				}
			}
		
	return null;
	}
	
	public int eSuitleft(eSuit eSuit) {
		int a = 0;
		
		for (Card card: this.cardsInDeck) {
			
			if (card.geteSuit() == eSuit) {
				
				a++;
				}
			}
		
		return a;	
		}
		
	public int eRankleft(eRank eRank) {
		int b = 0;
		
		for (Card c: this.cardsInDeck) {
			if (c.geteRank() == eRank) {
				
				b++;
				}
			}
		
		return b;	
		}
		
	public int Cardleft(Card cardone) {
	for (Card cardtwo: cardsInDeck) {
		if (cardtwo == cardone)
			return 1; 
		}
	return 0;
	}

}