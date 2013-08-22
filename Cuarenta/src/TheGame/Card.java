



package TheGame;

/**
 * Card is defined in a fairly self explanatory way:
 *  - Must have rank (ie. number)
 *  - Must have suit (ie. symbol)
 * 
 * Additionally, card contains a path to an image file. I'm not sure if this is
 * the best way to dispaly the image on screen, but it works.
 * 
 * @author Teemu Laakso
 */

public class Card {
    
    private Rank rank;
    private Suit suit;
    private String imagePath;
    
    public Card(Rank rank, Suit suit){
        this.suit = suit;
        this.rank = rank;
        this.imagePath = "/cs/fs/home/tolaakso/Desktop/Kurssit/KesaLabra2013/Cuarenta/cardImages/" + this + ".png";
    }
    
    public Rank getRank(){
        return this.rank;
    }
    
    public Suit getSuit(){
        return this.suit;
    }
    
    public String getImagePath(){
        return this.imagePath;
    }
    
    public boolean equals(Card card){
        if(this.rank.equals(card.getRank()) && this.suit.equals(card.getSuit()))
            return true;
        else
            return false;
    }

    public String toString(){
        return "" + this.getRank() + " of " + this.getSuit();
    }
    
}

