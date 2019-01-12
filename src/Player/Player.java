package Player;

public class Player {

  private String name;
  private int stack;
  private boolean isPlaying;
  private int card1;
  private int card2;

  public Player(String name, int stack) {
    this.name = name;
    this.stack = stack;
  }

  public void win(int chips) {
    this.stack += chips;
  }


}
