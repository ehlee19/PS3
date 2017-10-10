package pkgCore;

import static org.junit.Assert.*;

import org.junit.Test;

import pkgEnum.eRank;
import pkgEnum.eSuit;
import pkgException.DeckException;

public class DeckTest {

	@Test
	(expected = DeckException.class)
	public void TestEmptyDeck() throws DeckException{
		
		Deck d = new Deck();
		for (int a = 0; a <= 53; a++) {
			d.Draw();
		}
		
	}
	
	@Test
	public void TestDrawSuit() {
		
		Deck d = new Deck();
		Card card = d.Draw(eSuit.CLUBS);
		assertTrue(card.geteSuit() == eSuit.CLUBS);
		
	}
	
	@Test
	public void TestDrawRank() {
		
		Deck d = new Deck();
		Card card = d.Draw(eRank.SEVEN);
		assertTrue(card.geteRank() == eRank.SEVEN);
	}
	
	public void TestDeckRankCount() {
		
		Deck d = new Deck();
		assertTrue(d.eRankleft(eRank.JACK) == 4);
	}
	
	public void TestDeckSuitCount() {
		
		Deck d = new Deck();
		assertTrue(d.eSuitleft(eSuit.SPADES) == 12);
	}

}
