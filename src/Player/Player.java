package Player;

//A class to represent a holdem player
public class Player implements IPlayer{

  private String name;
  private int stack;
  private boolean isPlaying;
  private int card1;
  private int card2;

  //A player has a name, a stack of chips, a boolean value to represent their playing status in
  //the current hand, and 2 cards represented as integers.
  //A player is initialized with 2 null cards, and is then dealt cards at the beginning of the hand
  public Player(String name, int stack) {
    this.name = name;
    this.stack = stack;
    this.isPlaying = true;
    this.card1 = 0;
    this.card2 = 0;
  }

  //adds chips to player's stack
  public void win(int chips) {
    this.stack += chips;
  }

  @Override
  public void receiveCards(int card1, int card2) {
    this.card1 = card1;
    this.card2 = card2;
  }

  @Override
  public void fold() {
    this.isPlaying = false;
  }

  @Override
  public void bet(int amt) {
    this.stack -= amt;
  }

  @Override
  public void check() {

  }

  @Override
  public String printState() {

    if (stack == 0) {
      return name + " is out of chips.";
    }

    StringBuilder sb = new StringBuilder();

    if (isPlaying == false) {
      sb.append(name).append(" has folded.");
    } else {
      sb.append(name).append("'s hand is ").append(card1).append(" and").append(card2);
    }

    sb.append(". Stack: ").append(stack).append("\n");
    return sb.toString();
  }
}
