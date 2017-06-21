public class Card {
	public final String suit; 
	public final String rank;
	public final int highCardPoints;
	
	public Card(String rank, String suit, Deck d) {
		//Make sure cards can only be made by a deck
		this.suit = suit.toUpperCase();
		this.rank = rank.toUpperCase();
		
		if(this.rank.equals("A")) highCardPoints = 4;
		else if(this.rank.equals("K")) highCardPoints = 3;
		else if(this.rank.equals("Q")) highCardPoints = 2; /* Hard coded highCardPoints calculation. Not sure if slickness needed here? */
		else if(this.rank.equals("J")) highCardPoints = 1;
		else highCardPoints = 0;
	}

	public String toString(){
		return(rank + " of " + suit);
	}
	
	public boolean equals(Object that){
		if (that instanceof Card ){
			if(this.rank.equals(((Card) that).rank)  && this.suit.equals(((Card) that).suit)){
				return true;
			}
		}
		
		return false;
	}
	
	public int hashcode(){
		return rank.hashCode()*suit.hashCode();
	}
	
}
