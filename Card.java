public class Card {
	public final String suit; 
	public final String rank;
	public final int hcp;
	
	public Card(String rank, String suit) {
		this.suit = suit.toUpperCase();
		this.rank = rank.toUpperCase();
		
		if(this.rank.equals("A")) hcp = 4;
		else if(this.rank.equals("K")) hcp = 3;
		else if(this.rank.equals("Q")) hcp = 2; /* Hard coded hcp calculation. Not sure if slickness needed here? */
		else if(this.rank.equals("J")) hcp = 1;
		else hcp = 0;
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
