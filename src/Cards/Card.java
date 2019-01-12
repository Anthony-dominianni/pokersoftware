package Cards;

public class Card {

  private Rank rank;
  private Suit suit;

  Card(Rank rank, Suit suit) {
    this.rank = rank;
    this.suit = suit;
  }

  public int getValue(){
    return this.rank.getValue() * this.suit.getValue();
  }
}
